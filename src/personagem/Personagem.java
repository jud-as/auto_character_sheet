package personagem;

public class Personagem {
    private String nome;
    private Especie especie;
    private Classe classe;
    private Poder poder;
    private Atributo atributo;


    public Personagem(String nome, Especie especie, Classe classe, Poder poder, Atributo atributo) {

        this.nome = nome;
        this.especie = especie;
        this.classe = classe;
        this.poder = poder;
        this.atributo = atributo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }


    public String toString() {
        return  "Personagem{" +
                "nome='" + nome + '\'' +
                ", especie=" + especie +
                ", classe=" + classe +
                ", poder=" + poder +
                ", atributo=" + atributo +
                '}';
    }
}

