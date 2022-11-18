import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[4][4];

        for (int l=0; l<4;l++){

            for (int c=0; c<4;c++){
                System.out.println("Digite o valor da linha "+l+" e coluna "+c+" :");
                matriz[l][c]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            System.out.println(matriz[i][i]);
        }
        System.out.println("---================================================---");
        for (int l=0; l<4;l++){

            for (int c=0; c<4;c++){
                if(l!=c){
                    System.out.println(matriz[l][c]);
                }
                else if(l==c){
                    System.out.println("'-'");
                }
            }
        }
    }
}
