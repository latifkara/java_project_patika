public class DrawStar {

    public static void main(String[] args) {
        String[][] star = new String[6][4];

        for (int row = 0; row < star.length; row++){
            for (int col = 0; col < star[row].length; col++){
                if (row == 0 || row == 2 || row == 5){
                    star[row][col] = " * ";
                }
                else if (col == 0 || col == 3){
                    star[row][col] = " * ";
                }
                else {
                    star[row][col] = "   ";
                }
            }
        }
        star[(star.length - 1)/2][star[0].length-1] = "   ";
        for (String[] row:star) {
            for (String col: row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
