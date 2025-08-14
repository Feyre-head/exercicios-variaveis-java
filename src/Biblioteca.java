import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Biblioteca {

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeLeitor;
        String tituloLivro;
        String nomeAutor;

        LocalDate dataRetirada = LocalDate.now();
        LocalDate dataDevolucao = dataRetirada.plusDays(7);
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataRetiradaFormatada = dataRetirada.format(formatoData);
        String dataDevolucaoFormatada = dataDevolucao.format(formatoData);

        int livroDevolvidoInput;
        boolean livroDevolvido;

        int diasAtraso;
        double multaPorDia;  //Valor fixo R$ 2.50
        double valorMulta;

        System.out.println("Nome do Leitor: ");
        nomeLeitor = sc.nextLine();

        System.out.println("Nome do Titulo: ");
        tituloLivro = sc.nextLine();

        System.out.println("Nome do Autor: ");
        nomeAutor = sc.nextLine();

        System.out.println("""
                O livro foi devolvido?
                1- Sim
                2- Não
                """);
        livroDevolvidoInput = sc.nextInt();

        if (livroDevolvidoInput == 2) {
            livroDevolvido = false;
            System.out.println("Quantos dias de atraso?");
            diasAtraso = sc.nextInt();

        } else {
            livroDevolvido = true;
            diasAtraso = 0;
        }

        valorMulta = diasAtraso * 2.50;

        System.out.println("============Recibo Empréstimo============");
        System.out.println("Leitor: " + nomeLeitor);
        System.out.println("Livro: " + tituloLivro);
        System.out.println("Autor: " + nomeAutor);
        System.out.println("Livro Disponivel: " + livroDevolvido);
        System.out.println("==========================================");
        System.out.println("Valor da Multa: R$" + valorMulta);
        System.out.println("==========================================");
        System.out.println("Data Retirada: " + dataRetiradaFormatada);
        System.out.println("Data para Devolução: " + dataDevolucaoFormatada);

    }
}

