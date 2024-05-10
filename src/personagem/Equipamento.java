package personagem;

import personagem.atributo.Atributo;

public class Equipamento {

    private String nome;
    private String tipo;
    private Atributo modificador;


    public Equipamento(String nome, String tipo, Atributo modificador) {
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

    public Atributo getModificador() {
        return modificador;
    }

    public void setModificador(Atributo modificador) {
        this.modificador = modificador;
    }


    public String toString() {
        return  "Equipamento{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", modificador=" + modificador +
                '}';
    }
}
