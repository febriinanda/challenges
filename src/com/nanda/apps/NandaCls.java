package com.nanda.apps;

class NandaCls {
    private int n;
    private String pattern;

    NandaCls(int n) {
        this.n = n;
    }

    String getPattern(){
        return this.pattern;
    }

    private void setPattern(String pattern) {
        this.pattern = pattern;
    }

    void pattern1(){
        /*
        12345
         1234
          123
           12
            1
         */

        StringBuilder res = new StringBuilder();
        int n = this.n;
        for (int i = 0; i < n; i++){
            int k = 1;
            for(int j = 0; j <= n; j++){
                if(j<i){
                    res.append(" ");
                }
                else if(j == n){
                    res.append("\n");
                }
                else {
                    res.append(k++);
                }
            }
        }
        this.setPattern(res.toString());
    }

    void pattern2(){
        /*
            1
           121
          12321
         1234321
        123454321
         */

        StringBuilder res = new StringBuilder();
        int n = this.n;
        for(int i = 0; i < n; i++){
            int k=1;
            for (int j=0;j <= n + i; j++){
                if(j < n - i){
                    res.append(" ");
                }else if(j >= n - i){
                    if(j < n){
                        res.append(k++);
                    }else if(j >= n){
                        res.append(k--);
                    }

                    if(j == n + i){
                        res.append("\n");
                    }
                }
            }
        }
        this.setPattern(res.toString());
    }

    void pattern3(){
        /*
        123454321
         1234321
          12321
           121
            1
         */

        StringBuilder res = new StringBuilder();
        int n = this.n;
        for(int i = 0;i < n; i++ ){
            int k = 1;
            for (int j = 0; j <= (n*2) - (i+1); j++){
                if (j >= i){
                    if (j < (n - 1)){
                        res.append(k++);
                    }else{
                        if (j == (n*2) - (i+1)){
                            res.append("\n");
                        }else{
                            res.append(k--);
                        }
                    }
                }else{
                    res.append(" ");
                }
            }
        }
        this.setPattern(res.toString());
    }

    void pattern4(){
        /*
        54321
         5432
          543
           54
            5
            45
            345
            2345
            12345
         */
        StringBuilder res = new StringBuilder();
        int n = this.n;
        for (int i = 0; i < (n*2)-1; i++){
            int k = 5;
            if (i < n){
               for (int j = 0; j <= n; j++){
                   if (j == n){
                       res.append("\n");
                   }else{
                       if (j > i - 1){
                           res.append(k--);
                       }else{
                           res.append(" ");
                       }
                   }
               }
            }else{
                k = k - (i - k + 1);
                for (int j = 0; j <= (i + 1); j++){
                    if (j < n - 1){
                        res.append(" ");
                    }else{
                        if (j == i + 1){
                            res.append("\n");
                        }else{
                            res.append(k++);
                        }
                    }
                }

            }
        }
        this.setPattern(res.toString());
    }

    void pattern5(){
        /*
        54321
         5432
          543
           54
            5
         */
        StringBuilder res = new StringBuilder();
        int n = this.n;
        for (int i = 0; i < n; i++){
            int k = 5;
            for (int j = 0; j <= n; j++){
                if (j == n){
                    res.append("\n");
                }else{
                    if (j > i - 1){
                        res.append(k--);
                    }else{
                        res.append(" ");
                    }
                }
            }
        }
        this.setPattern(res.toString());
    }

    void pattern6(){
        /*
        5
        45
        345
        2345
        12345
         */

        StringBuilder res = new StringBuilder();
        int n = this.n;
        for (int i = 0;i < n; i++){
            int k = n - i;
            for (int j=0;j<=i+1;j++){
                if (j == i+1){
                    res.append("\n");
                }else{
                    res.append(k++);
                }
            }
        }
        this.setPattern(res.toString());
    }
}
