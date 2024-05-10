package personagem.classe;

import personagem.atributo.Atributo;

public class Classe {

    private String nome;
    private Atributo atributosIniciais;


    public Classe(String nome, Atributo atributosIniciais) {
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
        return  "Classe{" +
                "nome='" + nome + '\'' +
                ", atributosIniciais=" + atributosIniciais +
                '}';
    }

    public void defAtributos(){
        if(this.atributosIniciais.getValor() + 2 < this.atributosIniciais.getValorMaximo()){
            this.atributosIniciais.incremento(2);
        }else{
            System.out.println("Valor máximo de atributo já atribuído.");
        }
    }
}


