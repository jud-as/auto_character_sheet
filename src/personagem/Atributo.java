package personagem;

public class Atributo{
    private String nome;
    private int valor;
    private final int valorMaximo = 20;


    public Atributo(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }


    public String toString() {
        return  "Atributo{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", valorMaximo=" + valorMaximo +
                '}';
    }
}







