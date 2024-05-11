import personagem.atributo.Atributo;
import personagem.classe.Classe;
import personagem.especie.Especie;
import personagem.poder.Bless;
import personagem.poder.Fireball;
import personagem.poder.PalavrasCurativas;
import personagem.poder.Poder;

import java.util.concurrent.TimeUnit;

public class Controlador {

    //Inicializando Atributos:

    private Atributo inteligencia;
    private Atributo forca;
    private Atributo vida;
    public Controlador(Atributo inteligencia, Atributo forca, Atributo vida) {
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vida = vida;
    }


    public Atributo getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Atributo inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Atributo getForca() {
        return forca;
    }

    public void setForca(Atributo forca) {
        this.forca = forca;
    }

    public Atributo getVida() {
        return vida;
    }

    public void setVida(Atributo vida) {
        this.vida = vida;
    }


    public Classe initClass(int opc){
        Classe classeEscolhida = null;

        //Inicializando Classes Enumeradas:
        switch (opc){
            case 1:
                Classe mago = new Classe("Mago", this.getInteligencia(),this.getVida(), this.getForca());
                mago.setMago();
                classeEscolhida = mago;
                break;

            case 2:
                Classe guerreiro = new Classe("Guerreiro", this.getVida(), this.getForca(), this.getInteligencia() );
                guerreiro.setGuerreiro();
                classeEscolhida = guerreiro;
                break;

            case 3:
                Classe ladino = new Classe("Ladino", this.getForca(),this.getInteligencia(),this.getForca());
                ladino.setLadino();
                classeEscolhida = ladino;
                break;

            default:
                System.out.println("Classe não Especificada.");
                break;
        }

        return classeEscolhida;
    }

    //Inicializando Espécies:
    public Especie initEspecie(int opc) {

        Especie especieEscolhida = null;

        switch (opc){
            case 1:
                Especie humano = new Especie("Humano", this.getVida(),this.getInteligencia(), this.getForca());
                humano.setHumano();
                especieEscolhida = humano;

                break;
            case 2:
                Especie elfo = new Especie("Elfo", this.getInteligencia(), this.getVida(), this.getForca());
                elfo.setElfo();
                especieEscolhida = elfo;

                break;
            case 3:
                Especie dragonborn = new Especie("Dragonborn", this.getForca(),this.getVida(), this.getInteligencia());
                dragonborn.setDragonborn();
                especieEscolhida = dragonborn;

                break;
            default:
                System.out.println("Espécie não Especificada.");
                break;
        }
        assert especieEscolhida != null;
        return especieEscolhida;
    }


    public Poder initPoder(int opc) {
        Poder poderEscolhido = null;

        switch (opc){
            case 1:
                poderEscolhido = new Fireball("Fireball", "Dano", inteligencia.getValor());
                break;
            case 2:
                poderEscolhido = new PalavrasCurativas("Palavras Curativas", "Cura", inteligencia.getValor());
                break;
            case 3:
                poderEscolhido = new Bless("Bless","Suporte", inteligencia.getValor());
                break;
            default:
                System.out.println("Poder não Especificado.");
                break;
        }

        return poderEscolhido;
    }

}


