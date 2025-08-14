import java.time.LocalDate;
import java.util.Scanner;

public class Agendamento {

    String nomePaciente;
    int idadePaciente;

    String mostrarEspecialidade;
    int especialidadeDoutor;
    int convenio;
    double valorConsulta;
    double valorFinal;

    LocalDate dataConsulta = LocalDate.now();

    public String mostrarEspecialidade() {

        String retorno = "";

        if (especialidadeDoutor == 1) {
           retorno ="""
                    Clínico Geral
                    Doutor:João""";
        } else if (especialidadeDoutor == 2) {
            retorno ="""
                    Cardiologista
                    Doutor: Maciel
                    """;
        } else if (especialidadeDoutor == 3) {
            retorno ="""
                    Dermatologista
                    Doutora: Alana""";
        } else if (especialidadeDoutor == 4) {
            retorno ="""
                    Pediatria
                    Doutora: Rosangela""";
        } return retorno;

    }

    public double valorDesconto() {
        return  valorConsulta - valorFinal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agendamento a = new Agendamento();

        System.out.println("Informe o nome do Paciente: ");
        a.nomePaciente = sc.nextLine();

        System.out.println("Informe a idade do Paciente");
        a.idadePaciente = sc.nextInt();

        System.out.println("""
                Especialidade:
                
                1 - Clínico Geral
                2 - Cardiologista
                3 - Dermatologista
                4 - Pediatria
                """);
        a.especialidadeDoutor = sc.nextInt();

        System.out.println("""
                Informe se o paciente tem Convenio
                
                1 - Sim
                2 - Não
                """);
        a.convenio = sc.nextInt();

        boolean temConvenio = (a.convenio == 1);

        if (a.especialidadeDoutor == 1) {
            a.valorConsulta = 100;
        } else if (a.especialidadeDoutor == 2) {
            a.valorConsulta = 180;
        } else if (a.especialidadeDoutor == 3) {
            a.valorConsulta = 200;
        } else {
            a.valorConsulta = 150;
        }

        if (temConvenio) {
            a.valorFinal = a.valorConsulta * 0.80;
        } else {
            a.valorFinal = a.valorConsulta;
        }

        System.out.println("====Consulta Agendada====");
        System.out.println("Data: " + a.dataConsulta);
        System.out.println("Paciente: " + a.nomePaciente);
        System.out.println("Idade: " + a.idadePaciente);
        System.out.println(a.mostrarEspecialidade());
        System.out.println("Plano Convenio: " + temConvenio);
        System.out.println("Total R$" + a.valorConsulta);
        System.out.println("Desc.-R$" + a.valorDesconto());
        System.out.println("Total R$" + a.valorFinal);
    }


}
