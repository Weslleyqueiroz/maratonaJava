package weslley.dev.maratonajava.introducao;

public class arrayPt03aula07 {
    public static void main(String[] args) {
        //forma de iniciar um array porem colocando linha por linha
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5, 6};

        //outra forma de inicializar um array mas mais "otimizado"

//         for (int i = 0; i<numeros2.length; i++){
//             System.out.println(i);
//    }
         //outra forma de "ver" o tamanho do array
        //esse for não procura pelo índice!!
        for(int num:numeros2){
            System.out.println(num);
        }

    }
}
