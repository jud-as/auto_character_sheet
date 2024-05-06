package personagem;

public class Poder {
    private String nome;
    private String tipo;
    private int dano;


    public Poder(String nome, String tipo, int dano) {
        this.nome = nome;
        this.tipo = tipo;
        this.dano = dano;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }


    public String toString() {
        return  "Poder{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", dano=" + dano +
                '}';
    }
}
