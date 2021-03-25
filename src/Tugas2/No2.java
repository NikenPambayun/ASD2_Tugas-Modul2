package Tugas2;
public class No2 {
      public static void main(String[] args) {
        int[][] X = {
            {2, 6},
            {7, 2},
            {10, 8}
        };
        int[][] Y = {
            {8, 3},
            {4, 1},
            {7, 5}
        };
        
        if((X.length == Y.length) && (X[0].length == Y[0].length)) {
            int[][] Z = new int[X.length][X[0].length];
            for(int i=0; i<X.length; i++) {
                for(int j=0; j<Y[0].length; j++) {
                    Z[i][j] = X[i][j] - Y[i][j];
                }
            }
            
            for(int[] z : Z) {
                for(int n : z) {
                    System.out.print(n+" ");
                }
                System.out.println();
            }
            System.out.println(Z[1][1]);
        }
        else {
            System.out.println("Matriks tidak ada");
        }
               System.out.println();
        System.out.println("RR. Niken Pambayun Dyah Setyawati");
    }
}
