import java.util.Scanner;
import java.util.Random;

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[6][6];
        int x=0;
        int encontrado=0;

        for (int l=0; l<6;l++){

            for (int c=0; c<6;c++){
                System.out.println("Digite o valor da linha "+l+" e coluna "+c+" :");
                matriz[l][c]=sc.nextInt();
            }
        }
        System.out.println("Informe o número que você deseja encontrar: ");
        x = sc.nextInt();
        for (int l=0; l<6;l++){

            for (int j=0; j<6;j++){
                if(matriz[l][j]==x){
                    System.out.println("----------------------------------");
                    System.out.println("Linha: "+l);
                    System.out.println("Coluna: "+j);
                    System.out.printf("----------------------------------");
                    encontrado++;
                }
            }
        }
        if(encontrado==0){
            System.out.println("Número não encontrado!");
        }

    }

}