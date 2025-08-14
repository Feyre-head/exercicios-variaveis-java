import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Sistema {
    String clienteNome;
    String jogoNome;
    String jogoGenero;
    int quantidadeCompra;
    int opcaoPagamento;

    boolean pagamentoAvista;

    //Pega data e hora atual,formata e armazena em String
    LocalDateTime dataCompra = LocalDateTime.now();
    DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String dataFormatada = dataCompra.format(dataFormato);


//    static class Venda{
//
//        double precoUnitario;
//        double valorTotal;  //Valor da compra
//        double valorDesconto;
//        double valorFinal; //Valor após o desconto
//
//        public double caclularTotal(){
//
//        }
//    }

    static void main(String[] args) {
        Sistema s = new Sistema();
        System.out.println(s.dataFormatada);


    }

}
