public class Matrix10 {
    public static void main(String[] args) {
        
        int[][] matx = new int[4][4];
        int maxRow = 0, maxCol = 0, count, mx = 0;

        for(int i = 0; i < 4; i++){
            count = 0;
            for(int j = 0; j < 4; j++){
                matx[i][j] = (int) Math.rint(Math.random());
                System.out.printf("%d ", matx[i][j]);
                count += matx[i][j];
            }
            System.out.println("");
            if(count > mx){
                mx = count;
                maxRow = i;
            }
        }

        System.out.println("\nThe largest row index is " + maxRow);

        mx = 0;

        for(int i = 0; i < 4; i++){
            count = 0;
            for(int j = 0; j < 4; j++){
                count += matx[j][i];
            }

            if(count > mx){
                mx = count;
                maxCol = i;
            }
        }
        System.out.println("The largest column index is " + maxCol);
    }
}
