import java.util.Random;
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        Random rn = new Random();
        int arr[][] = new int[5][5];
        ArrayList<Integer> indices = new ArrayList<Integer>();
        ArrayList<Integer> repetidos = new ArrayList<Integer>();
        ArrayList<Integer> repetidosC = new ArrayList<Integer>();
        int contador=0, contador2=0;

        for(int i=0; i<4; i++) {

            for(int j=0; j<4; j++) {
                contador=0;
                arr[i][j] = rn.nextInt(10);
                indices.add(arr[i][j]);
                for(int n=0; n<indices.size(); n++) {
                    if(indices.get(n)==arr[i][j]){
                        contador++;
                    }
                }
                if(contador>1) {
                    repetidos.add(arr[i][j]);
                }
            }
        }


        for(int i=0; i<repetidos.size(); i++) {
            for(int j=0; j<repetidos.size(); j++) {
                if(repetidos.get(j)==repetidos.get(i)) {
                    contador2++;
                }
                if(contador2>=2) {
                    repetidosC.add(repetidos.get(j));
                }
            }
        }
        for(int i=0; i<repetidosC.size(); i++) {
            for(int j=0; j<repetidosC.size(); j++) {
                if(repetidosC.get(i)==repetidosC.get(j)) {
                    repetidosC.remove(j);
                }
            }
        }

        for(int i=0; i<4; i++) {
            System.out.printf("\n");
            for(int j=0; j<4; j++) {
                System.out.print(arr[i][j] +" ");
            }
        }

        System.out.println("\n\nNúmeros que se repetem: " +repetidosC.toString());
    }}