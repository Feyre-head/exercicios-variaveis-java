
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Hotel {

    //Classe interna representando hospede
    static class Hospede {

        private String guestName;  //nome hospede
        private String guestRoom; //número quarto
        private String dateOfArrival; //data de chegada
        private Double dailyRate;  //valor da diaria
        private int numberOfNights; //quantidade de dias
        private boolean isPaid;


        //Classe interna representando o hospede
        public Hospede(String guestName, String guestRoom, String dateOfArrival, double dailyRate, int numberOfNights, boolean isPaid) {
            this.guestName = guestName;
            this.guestRoom = guestRoom;
            this.dateOfArrival = dateOfArrival;
            this.dailyRate = dailyRate;
            this.numberOfNights = numberOfNights;
            this.isPaid = isPaid;
        }

        //Calcula valor
        public Double calculate() {
            if (this.numberOfNights > 7) {
                return (this.numberOfNights * this.dailyRate) * 0.85;
            }
            return this.numberOfNights * this.dailyRate;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria o leitor de entradas do teclado

        System.out.println("Enter Guest Name:");
        String guestName = sc.nextLine();

        System.out.println("Enter Room: ");
        String guestRoom = sc.nextLine();

        System.out.println("Enter CheckIn Date (dd/MM/yyyy):");
        String dateOfArrival = sc.nextLine();

        System.out.println("Daily Rate: ");
        double dailyRate = sc.nextDouble();

        System.out.println("Number of Nights: ");
        int numberOfNights = sc.nextInt();

        boolean isPaid = false;

        Hospede h = new Hospede (guestName, guestRoom, dateOfArrival, dailyRate, numberOfNights, isPaid);

        System.out.println("Hospede: " + h.guestName);
        System.out.println("Quarto:" + h.guestRoom);
        System.out.println("Data de Entrada: " + h.dateOfArrival);
        System.out.println("Estadia: " + h.numberOfNights + " diarias");
        System.out.println("Total: $ " + h.calculate());

    }

}
