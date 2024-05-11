package personagem.especie;

import personagem.atributo.Atributo;

public class Especie {
    private String nome;
    private Atributo a;
    private Atributo b;
    private Atributo c;


    public Especie(String nome, Atributo a, Atributo b, Atributo c) {
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

    public void setA(Atributo a) {
        this.a = a;
    }

    public Atributo getB() {
        return b;
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
        return "Especie{" +
                "nome='" + nome + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
    public void setHumano(){
        this.getA().incremento(3);
        this.getB().incremento(2);
    }

    public void setElfo(){
        this.getA().incremento(3);
        this.getB().incremento(2);
    }

    public void setDragonborn(){
        this.getA().incremento(3);
        this.getB().incremento(2);
    }
}
