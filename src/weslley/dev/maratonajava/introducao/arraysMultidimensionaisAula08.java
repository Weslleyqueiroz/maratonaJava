package weslley.dev.maratonajava.introducao;

public class arraysMultidimensionaisAula08 {
    public static void main(String[] args) {
        //multidimensional seria um array dentro de outro array
        //como por exemplo um array de mês e outro de dias referente a esses meses

        //isso é um array multidimensional:
        int[] [] dias = new int[3] [3];

        dias [0][0] = 31;
        dias [0][1] = 28;
        dias [0][2] = 31;

        dias [1][0] = 31;
        dias [1][1] = 28;
        dias [1][2] = 31;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
