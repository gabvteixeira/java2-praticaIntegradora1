package exercicios;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("lkdmas", "Gabriel", 20);
        Pessoa p3 = new Pessoa("lfgsdfgsd", "Jose", 23, 80F, (float) 1.80);

        System.out.println("INFO: Se este cálculo\n" +
                "retornar um valor menor que 20, a função deve retornar -1, se retornar um número entre 20 e\n" +
                "25, o método deve retornar 0, por fim, se retornar um número maior que 25 deve retornar 1.");
        System.out.println("Qual é o IMC do José? R: " + p3.calcularIMC());
        System.out.println("José é maior de idade? R: " + p3.ehMaiorIdade());
        System.out.println("=====IMPRIMINDO TODAS AS INFORMACOES DE JOSÉ:======");
        System.out.println(p3);
    }
}
