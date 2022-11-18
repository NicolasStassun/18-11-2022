import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[4][4];

        for (int l=0; l<4;l++){

            for (int c=0; c<4;c++){
                System.out.println("Digite o valor da linha "+l+" e coluna "+c+" :");
                matriz[l][c]=sc.nextInt();
                if(matriz[l][c]<0){
                    matriz[l][c] = 0;
                }
            }
        }
        System.out.println("----------------------");
        for (int l = 0; l < 4; l++) {

            for (int c = 0; c < 4; c++) {
                System.out.printf(""+matriz[l][c]+" ");
            }
            System.out.printf("\n");
        }
        System.out.println("----------------------");

    }

}
