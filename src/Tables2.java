public class Tables2 {
    public static void main(String[] args) {
        int[][][] tables = {{{9}}};

        for (int i = 0; i < tables.length; i++) {
            for (int j = 0; j < tables[j].length; j++) {
                for (int k = 0; k < tables[i][j].length; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = ");
                    System.out.println(tables[i][j][k]);
                }
            }
        }
    }
}

