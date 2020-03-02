public class Fifth {
    /**
    * 
    * @param args
    * @throws Exception
    */
    public static void main(String[] args) throws Exception {
        int[] mass = {12, 43, 12, -65, 778, 123, 32, 76};
        int max = mass[0];
        for (int i = 1; i < mass.length; i++){
            if (mass[i] > max){
                max = mass[i];
            };
        };
        System.out.println(max);
        
        int[][] matrix = new int[3][3];
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j] = (int)Math.round(Math.random()*10);
                System.out.print(matrix[i][j]);
            };
            System.out.println("");
        };

        System.out.println("");

        int[][] transpon = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                transpon[i][j] = matrix[j][i];
                System.out.print(transpon[i][j]);
            };
            System.out.println("");
        };

    }
}