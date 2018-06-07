public class PascalTriangle {
    public static void main(String args[]) {
        int x = 6;
        int triangle[][] = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                triangle[i][j] = 0;
            }
        }
        for(int i = 0; i < x; i++) {
            triangle[i][0] = 1 ;
        }
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < x; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        for (int i = 0; i < x; i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(triangle[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
