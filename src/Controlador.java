import personagem.Personagem;
import personagem.atributo.Atributo;
import personagem.atributo.Vida;
import personagem.classe.Classe;
import personagem.classe.Guerreiro;
import personagem.classe.Ladino;
import personagem.classe.Mago;
import personagem.especie.Especie;

import javax.swing.*;

public class Controlador {

    //Inicializando Atributos:
    Atributo inteligencia = new Atributo("Inteligência", 0);
    Atributo forca = new Atributo("Forca", 0);
    Atributo vida = new Vida("Vida", 0);


    public Classe initClass(int opc){

        Classe classeEscolhida = null;

        //Inicializando Classes Enumeradas:
        switch (opc){
            case 1:
                Classe mago = new Mago("Mago", inteligencia); mago.defAtributos();
                classeEscolhida = mago;
                break;
            case 2:
                Classe guerreiro = new Guerreiro("Guerreiro", vida); guerreiro.defAtributos();
                classeEscolhida = guerreiro;
                break;
            case 3:
                Classe ladino = new Ladino("Ladino", forca); ladino.defAtributos();
                classeEscolhida = ladino;
                break;
            default:
                System.out.println("Classe não Especificada.");
                break;
        }
        return classeEscolhida;
    }

    //Inicializando Espécies:
    public Especie initEspecie(int opc){

        Especie especieEscolhida = null;

        switch (opc){
            case 1:
                Especie humano = new Especie("Humano", vida); humano.defAtributos();
                especieEscolhida = humano;
                break;
            case 2:
                Especie elfo = new Especie("Elfo", inteligencia); elfo.defAtributos();
                especieEscolhida = elfo;
                break;
            case 3:
                Especie dragonborn = new Especie("Dragonborn", forca); dragonborn.defAtributos();
                especieEscolhida = dragonborn;
                break;
            default:
                System.out.println("Espécie não Especificada.");
                break;
        }


        return
    }

}
