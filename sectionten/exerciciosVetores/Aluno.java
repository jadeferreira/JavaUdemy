package exerciciosVetores;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public boolean verificarNota(){
        double media = (nota1 + nota2) / 2;
        if(media >= 6.0){
            return true;
        }else {
            return false;
        }

    }
}
