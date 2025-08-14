import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sistema {
    String clienteNome;
    String jogoNome;

    int jogoGenero;
    int quantidadeCompra;
    int opcaoPagamento;

    double precoUnitario;

    boolean pagamentoAvista;

    //Pega data e hora atual,formata e armazena em String
    LocalDateTime dataCompra = LocalDateTime.now();
    DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String dataFormatada = dataCompra.format(dataFormato);


    public double calculoDesconto() {
        return ((precoUnitario * quantidadeCompra) * 0.90);
    }

    public double somaTotal() {
        return (precoUnitario * quantidadeCompra);
    }

    public String genero() {
        String genero = "";
        if (jogoGenero == 1) {
            genero = "Battle Royale";
        } else if (jogoGenero == 2) {
            genero = "RPG";
        } else if (jogoGenero == 3) {
            genero = "FPS";
        } else {
            genero = "Mundo Aberto";
        }
        return genero;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sistema s = new Sistema();

        System.out.println("Informe o nome do Cliente: ");
        s.clienteNome = sc.nextLine();

        System.out.println("Informe o nome do Jogo: ");
        s.jogoNome = sc.nextLine();

        System.out.println("""
                Informe o Gênero do Jogo:
                1- Battle Royale
                2- RPG
                3- FPS
                4- Mundo Aberto""");
        s.jogoGenero = sc.nextInt();

        System.out.println("Quantas Unidades: ");
        s.quantidadeCompra = sc.nextInt();

        System.out.println("Informe o valor do Jogo: R$");
        s.precoUnitario = sc.nextInt();

        System.out.println("""
                Opção Pagamento:
                1- A vista
                2- Crédito
                """);
        s.opcaoPagamento = sc.nextInt();

        System.out.println("==============VENDA REALIZADA==============");
        System.out.println("Compra processada em: " + s.dataFormatada);

        System.out.println("Cliente: " + s.clienteNome);
        System.out.println("Jogo: " + s.jogoNome);
        System.out.println("Gênero: " + s.genero());
        System.out.println("Quantidade: " + s.quantidadeCompra);
        System.out.println("Preço Unitário R$" + s.precoUnitario);

        System.out.println("===========================================");

        if (s.opcaoPagamento == 1) {
            s.pagamentoAvista = true;
            System.out.println("Total: R$" + s.somaTotal());

            double valorDesconto;
            valorDesconto = s.somaTotal() - s.calculoDesconto();
            System.out.println("Desc.: R$-" + valorDesconto);

            System.out.println("Total: R$" + s.calculoDesconto());


        } else {
            System.out.println("Total R$" + s.somaTotal());
        }


    }

}
