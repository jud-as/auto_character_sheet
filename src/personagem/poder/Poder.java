package personagem.poder;

public class Poder {
    private String nome;
    private String tipo;
    private int modificador;


    public Poder(String nome, String tipo, int modificador) {
        this.nome = nome;
        this.tipo = tipo;
        this.modificador = modificador;
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

    public int getModificador() {
        return modificador;
    }

    public void setModificador(int modificador) {
        this.modificador = modificador;
    }


    public String toString() {
        return  "Poder{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", modificador=" + modificador +
                '}';
    }
}
