import java.util.Scanner;

    public class Ex1 {

        static Scanner sc=new Scanner(System.in);

        public static void main(String[]args) {

            int escolha=1,c,l;



            for(;escolha>0;escolha=escolha) {



                System.out.println("(1) – Somar  \n"

                        + "(2) – Subtrair\n"

                        + "(3) – Multiplicar\n"

                        + "(0) - Sair\n"

                        + " Escolha uma opção: ");

                escolha=sc.nextInt();
                if(escolha==0){
                    System.out.println("Programa encerrado");
                }



                System.out.println("Quantas colunas vão ter as matrizes: ");

                c=sc.nextInt();

                System.out.println("Quantas linhas vão ter as matrizes: ");

                l=sc.nextInt();



                int[][] matrizA=new int[l][c];

                int[][] matrizB=new int[l][c];

                int[][] matrizSoma=new int[l][c];

                int[][] matrizSub=new int[l][c];

                int[][] matrizMul=new int[l][c];







                for(int i=0;i<l;i++) {

                    for(int j=0;j<l;j++) {

                        System.out.println("matriz A");

                        System.out.println("Qual item vai nessa posição linha "+(i+1)+", e na coluna "+(j+1)+" é: ");

                        matrizA[i][j]=sc.nextInt();

                    }

                }

                for(int i=0;i<l;i++) {

                    for(int j=0;j<l;j++) {

                        System.out.println("matriz B");

                        System.out.println("Qual item vai nessa posição linha "+(i+1)+", e na coluna "+(j+1)+" é: ");

                        matrizB[i][j]=sc.nextInt();

                    }

                }

                if(escolha==1) {

                    for(int i=0;i<l;i++) {

                        for(int j=0;j<c;j++) {

                            matrizSoma[i][j]=matrizA[i][j]+matrizB[i][j];

                        }

                    }



                    System.out.println("Resultado soma: ");

                    for(int i=0;i<l;i++) {

                        for(int j=0;j<c;j++) {

                            System.out.println("O resultado nessa posição, linha "+(i+1)+", e na coluna "+(j+1)+" é: "+    matrizSoma[i][j]);

                        }

                    }



                }else if(escolha==2) {



                    for(int i=0;i<l;i++) {

                        for(int j=0;j<c;j++) {

                            matrizSub[i][j]=matrizA[i][j]-matrizB[i][j];

                        }

                    }



                    System.out.println("Resultado subtração: ");

                    for(int i=0;i<l;i++) {

                        for(int j=0;j<c;j++) {

                            System.out.println("O resultado nessa posição, linha "+(i+1)+", e na coluna "+(j+1)+" é: "+    matrizSub[i][j]);

                        }

                    }

                }else if(escolha==3) {



                    for(int i=0;i<l;i++) {

                        for(int j=0;j<c;j++) {

                            matrizMul[i][j]=matrizA[i][j]*matrizB[i][j];

                        }

                    }



                    System.out.println("Resultado Multiplicação: ");

                    for(int i=0;i<l;i++) {

                        for(int j=0;j<c;j++) {

                            System.out.println("O resultado nessa posição, linha "+(i+1)+", e na coluna "+(j+1)+" é: "+    matrizMul[i][j]);

                        }

                    }



                }



            }



        }

    }

