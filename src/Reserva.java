import java.util.Scanner;

public class Reserva {

    String guestName;
    String guestRoom;
    String checkInDate;
    int amountOfDays;
    double dailyRate;
    boolean isPaid;

    public double total(){return dailyRate * amountOfDays;}
    public double totalWithDiscount(){return total() * 0.85;}
    public double discountValue() {return total() - totalWithDiscount();}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Reserva reserva = new Reserva();

        System.out.println("Enter Guest name:");
        reserva.guestName =  sc.nextLine();

        System.out.println("Enter Room: ");
        reserva.guestRoom = sc.nextLine();

        System.out.println("Check in Date (dd/MM/yyyy)");
        reserva.checkInDate = sc.nextLine();

        System.out.println("Enter Amount of Days: ");
        reserva.amountOfDays = sc.nextInt();

        System.out.println("Enter Daily Rate");
        reserva.dailyRate = sc.nextDouble();


        System.out.println("Hóspede: " + reserva.guestName);        //nome
        System.out.println("Quarto: " + reserva.guestRoom);       //quarto
        System.out.println("Data de Entrada: " + reserva.checkInDate);    //data entrou
        System.out.println("Quantidade de dias: " + reserva.amountOfDays);  //qtd dias
        System.out.println("Valor da Diária: R$" + reserva.dailyRate);    //valor diária
        System.out.println("Pago: " + reserva.isPaid);      //está pago

        if(reserva.amountOfDays > 7){
            System.out.println("Total R$: " + reserva.total());
            System.out.println("Desconto R$: -" + reserva.discountValue());
            System.out.println("Total a pagar R$" + reserva.totalWithDiscount());
        }else{
            System.out.println("O Total foi de R$" + reserva.total());
            System.out.println("Sem desconto aplicado");
        }

        sc.close();



    }
}
