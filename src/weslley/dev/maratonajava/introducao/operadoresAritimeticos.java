package weslley.dev.maratonajava.introducao;

public class operadoresAritimeticos {
    public static void main(String[] args) {
        //+-/*

        int numero1= 10;
        int numero2= 20;
        double resultado = numero2/numero1;
        System.out.println(resultado);

        //% resto
        int resto = 20 % 2;
        System.out.println(resto);

        //<> menor,maior// <= >= //
        //!= DIFERENTE //

        boolean isDezMaiorQueVinte = 10>20;
        System.out.println("isDezMaiorQueVinte" + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10<20;
        System.out.println("isDezMenorQueVinte" + isDezMenorQueVinte);
        boolean isDezIgualQueVinte = 10==20;
        System.out.println("isDezIgualQueVinte" + isDezIgualQueVinte);
        boolean isDezDiferenteQueVinte = 10!=20;
        System.out.println("isDezDiferenteQueVinte" + isDezDiferenteQueVinte);

    }

}
