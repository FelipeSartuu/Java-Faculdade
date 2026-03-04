package Exercicio02;

public class Main {
    public static void main(String[] args) {
        SenhaAtendimento s1 = new SenhaAtendimento("Selmini");
        SenhaAtendimento s2 = new SenhaAtendimento("Felipe");
        SenhaAtendimento s3 = new SenhaAtendimento("Giovanni");

        System.out.println(s1.pegarDados());
        System.out.println(s2.pegarDados());
        System.out.println(s3.pegarDados());

        System.out.println("Proxima senha --> " + SenhaAtendimento.controle);
    }
}
