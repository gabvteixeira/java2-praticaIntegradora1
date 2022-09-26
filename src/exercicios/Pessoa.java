package exercicios;

public class Pessoa {
    private String id;
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Pessoa() {
    }

    public Pessoa(String id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String id, String nome, int idade, float peso, float altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = (this.peso/Math.pow(this.altura,2));

        if(imc < 20){
            return -1;
        }

        if(20 <= imc && imc <= 25) {
            return 0;
        }

        return 1;
    }

    public boolean ehMaiorIdade(){
        return this.idade > 18;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nId: " + this.id + "\nAltura: " +
                this.altura + "\nPeso: " + this.peso + "\n";
    }
}
