import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemaTaxi {

    String nomePassageiro;
    String corridaDestino;

    int distanciaPercorrida;
    double valorKm = 3.00;

    LocalDateTime dataCorrida = LocalDateTime.now();
    DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String dataFormatada = dataFormato.format(dataCorrida);

    int opcaoPagamento;
    boolean pagamentoAplicativo;


    public double calculoTotal(){
        return (valorKm * distanciaPercorrida);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SistemaTaxi s = new SistemaTaxi();

        System.out.println("========Registrar Corrida========");
        System.out.println("VALOR POR KM:" + s.valorKm);
        System.out.println("Informe o nome do Passageiro: ");
        s.nomePassageiro = sc.nextLine();

        System.out.println("Endereço Destino: ");
        s.corridaDestino = sc.nextLine();

        System.out.println("Informe a Distância Percorrida: km");
        s.distanciaPercorrida = sc.nextInt();

        System.out.println("""
                Informe o pagamento
                1- Aplicativo
                2- Dinheiro
                """);
        s.opcaoPagamento = sc.nextInt();


        System.out.println("================Resumo Corrida================");
        System.out.println("Data da Corrida: "+ s.dataFormatada);
        System.out.println("Passageiro: " + s.nomePassageiro);
        System.out.println("Destino: " + s.corridaDestino);
        System.out.println("Distância Corrida: " + s.distanciaPercorrida + "km");
        System.out.println("Taxa aplicada: " + s.pagamentoAplicativo);

        System.out.println("==============================================");
        if (s.opcaoPagamento == 1){
            s.pagamentoAplicativo = true;
            double totalComTaxa = s.calculoTotal() + (s.calculoTotal() * 0.05);
            System.out.println("Total R$" + s.calculoTotal());

            double valorTaxa = totalComTaxa- s.calculoTotal();
            System.out.println("Taxa: +R$" + valorTaxa);
            System.out.println("---------------");
            System.out.println("Total  R$" + totalComTaxa);
        }
        else {
            System.out.println("Total: R$" + s.calculoTotal() );
        }








    }
}
