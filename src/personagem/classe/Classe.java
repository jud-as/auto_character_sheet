package personagem.classe;

import personagem.atributo.Atributo;

public class Classe {

    private String nome;
    private Atributo a;
    private Atributo b;
    private Atributo c;


    public Classe(String nome, Atributo a, Atributo b, Atributo c) {
        this.nome = nome;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atributo getA() {
        return a;
    }
    public Atributo getB() {
        return b;
    }

    public void setA(Atributo a) {
        this.a = a;
    }
    public void setB(Atributo b) {
        this.b = b;
    }

    public Atributo getC() {
        return c;
    }

    public void setC(Atributo c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "nome='" + nome + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }

    public void setMago(){
        this.a.incremento(3);
        this.b.incremento(2);
    }

    public void setGuerreiro(){
        this.a.incremento(3);
        this.b.incremento(2);
    }

    public void setLadino(){
        this.a.incremento(3);
        this.b.incremento(2);;
    }

}


