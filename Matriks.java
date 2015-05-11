package array5214057;
public class Matriks {
    void matriks() {
        int [][] matA = new int[3][3];
        int [][] matB = new int[3][3];
        int [][] matC = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matA[i][j] = (int) (Math.random() * 50);
                matB[i][j] = (int) (Math.random() * 50);
                matC[i][j] = matA[i][j] + matB[i][j];                
            }
        }
        System.out.println("Matriks A");
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.printf("%2d ",matA[k][l]);
            }
            System.out.println("");
        }
        System.out.println("Matriks B");
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.printf("%2d ",matB[m][n]);
            }
            System.out.println("");
        }
        System.out.println("Matriks C");
        for (int o = 0; o < 3; o++) {
            for (int p = 0; p < 3; p++) {
                System.out.printf("%3d ",matC[o][p]);
            }
            System.out.println("");
        }
    }
}
