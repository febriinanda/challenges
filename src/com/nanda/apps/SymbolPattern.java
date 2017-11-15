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

    void pattern4(){
        /*
        o x x
         o x
          o x
           o
            o
             o
            x o
             x o
            x x o
         */
        StringBuilder res = new StringBuilder();
        int n = this.getInput();
        for(int i = 0; i < (n*2)-1; i++){
            if(i < n){
                int k = 1;
                for (int j = 0; j <= n - 1; j++){
                    if (j >= i){
                        if (k % 2 == 1){
                            if(k == 1){
                                res.append("o");
                            }else{
                                res.append("x");
                            }
                        }else{
                            res.append(" ");
                        }
                        k++;

                        if(j == n - 1){
                            res.append("\n");
                        }
                    }else{
                        res.append(" ");
                    }
                }
            }else{
                int k = i - n;
                for(int j = 0; j <= i; j++){
                    if (j < n - 1){
                        res.append(" ");
                    }else{
                        if (k % 2 == 0){
                            res.append(" ");
                        }else{
                            if (j == i){
                                res.append("o");
                                res.append("\n");
                            }else{
                                res.append("x");
                            }
                        }
                        k++;
                    }
                }
            }
        }
        this.setPattern(res.toString());
    }

    void pattern5(){
        /*
        o x x
         o x
          o x
           o
            o
         */
        StringBuilder res = new StringBuilder();
        int n = this.getInput();
        for(int i = 0;i < n; i++){
            int k = 0;
            for (int j = 0; j < n;j++){
                if (j > i - 1){
                    if (k % 2 == 0){
                        if (k == 0){
                            res.append("o");
                        }else{
                            res.append("x");
                        }
                    }else{
                        res.append(" ");
                    }
                    k++;

                    if (j == n - 1){
                        res.append("\n");
                    }
                }
                else{
                    res.append(" ");
                }

            }
        }
        this.setPattern(res.toString());
    }

    void pattern6(){
        /*
        o
         o
        x o
         x o
        x x o
         */

        StringBuilder res = new StringBuilder();
        int n = this.getInput();
        for (int i=0; i < n; i++){
            int k = n - i;
            for(int j=0; j < i + 1; j++){
                if (k % 2 == 1){
                    if (j == i){
                        res.append("o");
                        res.append("\n");
                    }else{
                        res.append("x");
                    }
                }else{
                    res.append(" ");
                }
                k++;
            }
        }
        this.setPattern(res.toString());
    }

    void pattern7(){
        /*
        xxxxx

        xxxxx

        ooooo
         */
        StringBuilder res = new StringBuilder();
        int n = this.getInput();
        for(int i = 0; i < n; i++){
            int k = 0;
            while(k < n){
                if (i % 2 == 0){
                    if (i == n - 1){
                        res.append("o");
                    }else{
                        res.append("x");
                    }
                }else{
                    res.append(" ");
                }
                k++;

                if (k == n){
                    res.append("\n");
                }
            }
        }
        this.setPattern(res.toString());
    }

    void pattern8(){
        /*
        x x ox
         x ox
        x ox x
         ox x
        ox x o
         */
        StringBuilder res = new StringBuilder();
        int n = this.getInput();
        for(int i = 0; i < n; i++ ){
            int k = i;
            for (int j = 0; j <= n; j++ ){
                if (k % 2 == 0){
                    if (k == n - 1){
                        res.append("o");
                        k = -1;
                    }else{
                        res.append("x");
                    }

                }else{
                    res.append(" ");
                }
                k++;
                if (j == n){
                    res.append("\n");
                }
            }
        }
        this.setPattern(res.toString());
    }

    void pattern9(){
        /*
        x x o
         x x o
          x x o
           x x o
            x x o
         */
        StringBuilder res = new StringBuilder();
        int n = this.getInput();
        for (int i = 0; i < n; i++){
            int x = 0;
            int k = 0;

            while (x < i){
                res.append(" ");
                x++;
            }

            while (k < n){
                if (k % 2 == 0){
                    if (k == n - 1){
                        res.append("o");
                        res.append("\n");
                    }else{
                        res.append("x");
                    }
                }else{
                    res.append(" ");
                }
                k++;
            }
        }
        this.setPattern(res.toString());
    }
}
