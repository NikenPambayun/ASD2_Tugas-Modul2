package Tugas2;
public class No3 {
     public static void main(String[] args) {
        int[][] X = {
            {5, 6, 7},
            {2, 3, 2}
        };
        int[][] Y = {
            {8, 4},
            {2, 1},
            {6, 7}
        };
        
        if(X[0].length == Y.length) {
            int[][] Z = new int[X.length][Y[0].length];
            
            for(int i=0; i<X.length; i++) { 
                for(int j=0; j<Y[0].length; j++) {  
                    for(int k=0; k<X[0].length; k++) {  
                        Z[i][j] += X[i][k] * Y[k][j];  
                    }                                   
                }                                       
            }
            for(int[] z : Z) {
                for(int n : z) {
                    System.out.print(n+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Ukuran kolom A tidak sama dengan baris B");
        }
                System.out.println();
        System.out.println("RR. Niken Pambayun Dyah Setyawati");
    }
}
