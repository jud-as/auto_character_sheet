package personagem;

import personagem.atributo.Atributo;
import personagem.classe.Classe;
import personagem.especie.Especie;
import personagem.poder.Poder;

public class Personagem {
    private String nome;
    private Especie especie;
    private Classe classe;
    private Poder poder;
    private Atributo forca;
    private Atributo inteligencia;
    private Atributo vida;



    public Personagem(String nome, Especie especie, Classe classe, Poder poder, Atributo forca, Atributo inteligencia, Atributo vida) {

        this.nome = nome;
        this.especie = especie;
        this.classe = classe;
        this.poder = poder;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.vida = vida;

    }

    public Atributo getForca() {
        return forca;
    }

    public void setForca(Atributo forca) {
        this.forca = forca;
    }

    public Atributo getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Atributo inteligencia) {
        this.inteligencia = inteligencia;
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
    public Atributo getVida() {
        return vida;
    }

    public void setVida(Atributo vida) {
        this.vida = vida;
    }


    public String toString() {
        return  "\nPERSONAGEM: " +
                "\nNome: " + getNome() +
                "\nEspécie: " + getEspecie().getNome() +
                "\nClasse: " + getClasse().getNome() +
                "\nPoder: " +getPoder().getNome() +
                "\nATRIBUTOS: " +
                "\nHP: " + getVida().getValor()*10 + "/" + getVida().getValor()*10 +
                "\nInteligência: " + getForca().getValor() +
                "\nForça: " + getInteligencia().getValor();

    }
}
