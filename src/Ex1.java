import java.util.Scanner;

public class Ex1 {

    static Scanner ler=new Scanner(System.in); 

    public static void main(String[]args) {

        int escolha=1,c,l;

        

        for(;escolha>0;escolha=escolha) {

            

        System.out.println("(1) – Somar  \n"

                            + "(2) – Subtrair\n"

                            + "(3) – Multiplicar\n"

                            + "(0) - Sair 2 \n"

                            + " Escolha uma opção: ");

        escolha=ler.nextInt();

        

        System.out.println("Para as matrizes, quantas colunas tem: ");

        c=ler.nextInt();

        System.out.println("Para as matrizes, quantas linhas tem: ");

        l=ler.nextInt();

        

        int[][] matrizA=new int[l][c];

        int[][] matrizB=new int[l][c];

        int[][] matrizSoma=new int[l][c];

        int[][] matrizSub=new int[l][c];

        int[][] matrizMul=new int[l][c];

        

        

        

        for(int i=0;i<l;i++) {

            for(int j=0;j<l;j++) {

                System.out.println("matriz A");

                System.out.println("Qual item vai nessa posição linha "+(i+1)+", e na coluna "+(j+1)+" é: ");

                matrizA[i][j]=ler.nextInt();

            }

        }

        for(int i=0;i<l;i++) {

            for(int j=0;j<l;j++) {

                System.out.println("matriz B");

                System.out.println("Qual item vai nessa posição linha "+(i+1)+", e na coluna "+(j+1)+" é: ");

                matrizB[i][j]=ler.nextInt();

            }

        }

        if(escolha==1) {

            for(int i=0;i<l;i++) {

                for(int j=0;j<c;j++) {

                    matrizSoma[i][j]=matrizA[i][j]+matrizB[i][j];

                }

            }

            

            System.out.println("A soma ficaria assim: ");

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

            

            System.out.println("A subtração ficaria assim: ");

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

            

            System.out.println("A multiplicação ficaria assim: ");

            for(int i=0;i<l;i++) {

                for(int j=0;j<c;j++) {

                    System.out.println("O resultado nessa posição, linha "+(i+1)+", e na coluna "+(j+1)+" é: "+    matrizMul[i][j]);    

                }

            }

            

        } 

        

        }

        

    }

}
