package weslley.dev.maratonajava.introducao;

public class exercicioRepeticaoBreak {
    public static void main(String[] args) {
        double valorCarro = 40000;

        for(int parcela = 1; parcela<=valorCarro; parcela++){
            double valorParcela = valorCarro/parcela;
            if (valorParcela>=1000){
                System.out.println("O numero de parcelas é : " + parcela + " R$ " +valorParcela);
            }else {
                break;
            }
        }
    }
}
