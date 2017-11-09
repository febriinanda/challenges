package com.nanda.apps;

class SymbolPattern extends MyPattern{
    SymbolPattern(int input) {
        super(input);
    }

    void pattern1(){
        /*
        x x x
         x x
          x x
           x
            x
         */

        StringBuilder res = new StringBuilder();
        int n = this.getInput();
        for (int i = 0;i < n; i++){
            int k = 1;
            for(int j = 0; j <= n; j++){
                if(j<i){
                    res.append(" ");
                }else{
                    if(j == n){
                        res.append("\n");
                    }else{
                        if (k % 2 == 0){
                            res.append(" ");
                        }else{
                            res.append("x");
                        }
                        k++;
                    }
                }
            }
        }
        this.setPattern(res.toString());
    }

    void pattern2(){
        /*
            x
           x x
          x x x
         x x x x
        x x o x x
         */

        StringBuilder res = new StringBuilder();
        int n = this.getInput();
        for (int i = 0;i < n; i++){
            int k = 1;
            for (int j = 0; j <= n + i; j++){
                if(j < n - i){
                    res.append(" ");
                }else{
                    if (k % 2 == 0){
                        res.append(" ");
                    }else{
                        if ((k == n) && (i == n - 1)){
                            res.append("o");
                        }else{
                            res.append("x");
                        }
                    }
                    k++;

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
        x x o x x
         x x x x
          x x x
           x x
            x
         */

        StringBuilder res = new StringBuilder();
        int n = this.getInput();
        for(int i = 0; i< n; i++){
            int k = 1;
            for(int j = 0;j <= ((n*2)-(i+1)); j++){
                if (j < i){
                    res.append(" ");
                }else{
                    if(k % 2 == 0){
                        res.append(" ");
                    }else{
                        if(k == n && i == 0){
                            res.append("o");
                        }else{
                            res.append("x");
                        }
                    }

                    k++;

                    if (j == (n*2)-(i+1)){
                        res.append("\n");
                    }
                }
            }
        }
        this.setPattern(res.toString());
    }
}
