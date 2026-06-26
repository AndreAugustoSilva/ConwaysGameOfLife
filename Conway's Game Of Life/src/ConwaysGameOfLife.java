public class ConwaysGameOfLife {
    public static void main(String[] args) throws Exception {
        boolean tudoVazio = true;
        int contagemCasasVivasAdjacentes = 0;
        // int tamanhoTabuleiro = 20;
        // int[][] tabuleiro = new int[tamanhoTabuleiro][tamanhoTabuleiro];
        int[][] tabuleiro = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        // for(int contL = 0; contL < tabuleiro.length; contL++) {
        //     for(int contC = 0; contC < tabuleiro.length; contC++) {
        //         if(Math.random() >= 0.5) {
        //             tabuleiro[contL][contC] = 1;
        //         } else {
        //             tabuleiro[contL][contC] = 0;
        //         }
        //     }
        // }

        do {
            for(int contL = 0; contL < tabuleiro.length; contL++) {
                for(int contC = 0; contC < tabuleiro.length; contC++) {
                    contagemCasasVivasAdjacentes = 0;

                    if(contC - 1 >= 0 && contL - 1 >= 0 && (tabuleiro[contL-1][contC-1] == 1 || tabuleiro[contL-1][contC-1] == 3)) {
                        contagemCasasVivasAdjacentes++;
                    }
                    if(contC - 1 >= 0 && (tabuleiro[contL][contC-1] == 1 || tabuleiro[contL][contC-1] == 3)) {
                        contagemCasasVivasAdjacentes++;
                    }
                    if(contC - 1 >= 0 && contL + 1 < tabuleiro.length && (tabuleiro[contL+1][contC-1] == 1 || tabuleiro[contL+1][contC-1] == 3)) {
                        contagemCasasVivasAdjacentes++;
                    }
                    if(contL + 1 < tabuleiro.length && (tabuleiro[contL+1][contC] == 1 || tabuleiro[contL+1][contC] == 3)) {
                        contagemCasasVivasAdjacentes++;
                    }
                    if(contL + 1 < tabuleiro.length && contC + 1 < tabuleiro.length && (tabuleiro[contL+1][contC+1] == 1 || tabuleiro[contL+1][contC+1] == 3)) {
                        contagemCasasVivasAdjacentes++;
                    }
                    if(contC + 1 < tabuleiro.length && (tabuleiro[contL][contC+1] == 1 || tabuleiro[contL][contC+1] == 3)) {
                        contagemCasasVivasAdjacentes++;
                    }
                    if(contL - 1 >= 0 && contC + 1 < tabuleiro.length && (tabuleiro[contL-1][contC+1] == 1 || tabuleiro[contL-1][contC+1] == 3)) {
                        contagemCasasVivasAdjacentes++;
                    }
                    if(contL - 1 >= 0 && (tabuleiro[contL-1][contC] == 1 || tabuleiro[contL-1][contC] == 3)) {
                        contagemCasasVivasAdjacentes++;
                    }

                    if(tabuleiro[contL][contC] == 0) {
                        if(contagemCasasVivasAdjacentes == 3) {
                            tabuleiro[contL][contC] = 2;
                        }
                    } else {
                         if(contagemCasasVivasAdjacentes < 2 || contagemCasasVivasAdjacentes > 3) {
                            tabuleiro[contL][contC] = 3;
                         }
                    }
                }
            }

            tudoVazio = true;
            for(int contL = 0; contL < tabuleiro.length; contL++) {
                for(int contC = 0; contC < tabuleiro.length; contC++) {
                    if(tabuleiro[contL][contC] == 3) {
                        tabuleiro[contL][contC] = 0;
                    }
                    if(tabuleiro[contL][contC] == 2) {
                        tabuleiro[contL][contC] = 1;
                    }
                    if(tabuleiro[contL][contC] == 1) {
                        tudoVazio = false;
                    }
                }
            }

            System.out.println("\033[H");
            for(int contL = 0; contL < tabuleiro.length; contL++) {
                for(int contC = 0; contC < tabuleiro.length; contC++) {
                    String posText = (tabuleiro[contL][contC] == 1 ? "#" : ".");
                    System.out.print(posText + " ");
                }
                System.out.println("");
            }

            Thread.sleep(100);

        } while (tudoVazio == false);
    }
}
