package weslley.dev.maratonajava.introducao;

public class condiconalSwitchExercicioAula05 {
    public static void main(String[] args) {
        //dado os valores de 1 a 7, imprima se  é dia util ou final de semana
        //considere 1 como domingo

        //comentario weslley: está certo o exercicio mas poderia ter otimizado mais.
        byte dia = 1;

        switch (dia){
            case 1:
                System.out.println("Domingo, final de semana");
                break;
            case 2:
                System.out.println("Seg, dia util");
                break;
            case 3:
                System.out.println("Ter, dia util");
                break;
            case 4:
                System.out.println("Qua, dia util");
                break;
            case 5:
                System.out.println("Qui, dia util");
                break;
            case 6:
                System.out.println("Sex, dia util");
                break;
            case 7:
                System.out.println("Sab, final de semana");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
