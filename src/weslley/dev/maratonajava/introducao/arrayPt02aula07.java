package weslley.dev.maratonajava.introducao;

public class arrayPt02aula07 {
    public static void main(String[] args) {
        //quando fazemos um array para os tipos, ele tem um padrão de inicialização:
        //byte, short, int, long, float e double = 0
        //já para o char '\u0000' ' '
        //boolean false
        //String null
        String[] nomes = new String[3];
        nomes [0] = "Weslley";
        nomes [1] = "Monkey D. Luffy";
        nomes [2] = "Ace";

        //o tamanha do array não pode mudar dinâmicamente!!!
        for (int i = 0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
