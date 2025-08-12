import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Agendamento {

    String patientName; //NomePaciente
    String doctorName;  //Nome Doutor
    int doctorSpec;  //Especialidade
    int patientAge;    //Idade do paciente
    Date appointmentDate;   //Data da consulta
    int insurance;

    //Caso o paciente tenha convênio, o valor da consulta terá um desconto de 20%.
    //O valor base de cada consulta é definido pela especialidade.

    // Verifica especialidadde Doutor
    public int doctorSpec(){
        int appointmentValue;

        if (doctorSpec == 1) {
            appointmentValue = 150;
            System.out.println("Clínico Geral");

        } else if (doctorSpec == 2) {
            appointmentValue = 300;
            System.out.println("Cardiologista");

        } else if (doctorSpec == 3) {
            appointmentValue = 250;
            System.out.println("Dermatologista");

        } else {
            appointmentValue = 150;
            System.out.println("Pediatra");
        } return appointmentValue;
    }

    public boolean verifiInsurance(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agendamento a = new Agendamento();

        System.out.println("Informe o nome do Paciente: ");
        a.patientName = sc.nextLine();

        System.out.println("Informe a Idade do Paciente: ");
        a.patientAge = sc.nextInt();

        System.out.println("Informe o nome do Doutor");
        a.doctorName = sc.nextLine();

        System.out.println("""
                Informe a especialidade do Doutor: \
                1 - Clínico Geral
                2 - Cardiologia
                3 - Dermatologia
                4 - Pediatria
                """);
        a.doctorSpec = sc.nextInt();

        System.out.println("""
                Informe se o Paciente tem Convênio: \
                1 - Sim
                2 - Não
                """);
        a.insurance = sc.nextInt();

        System.out.println(a.doctorSpec());







    }
}
