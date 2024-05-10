package personagem.poder;

import personagem.atributo.Atributo;

public class Bless extends Poder{
    public Bless(String nome, String tipo, int modificador) {
        super(nome, tipo, modificador);
    }

    public void reforcoAtributo(Atributo atributo){
        int valorIncrementado = atributo.getValor() + getModificador();
        atributo.setValor(valorIncrementado);
    }
}
