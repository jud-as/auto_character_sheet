package personagem.especie;

import personagem.atributo.Atributo;

public class Especie {
    private String nome;
    private Atributo atributosIniciais;


    public Especie(String nome, Atributo atributosIniciais) {
        this.nome = nome;
        this.atributosIniciais = atributosIniciais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atributo getAtributosIniciais() {
        return atributosIniciais;
    }

    public void setAtributosIniciais(Atributo atributosIniciais) {
        this.atributosIniciais = atributosIniciais;
    }


    public String toString() {
        return  "Especie{" +
                "nome='" + nome + '\'' +
                ", atributosIniciais=" + atributosIniciais +
                '}';
    }

    public void defAtributos(){
        if(this.atributosIniciais.getValor() + 1 < this.atributosIniciais.getValorMaximo()){
            this.atributosIniciais.incremento(1);
        }else{
            System.out.println("Valor máximo de atributo já atribuído.");
        }
    }


}
