package personagem.poder;

public class Fireball extends Poder{

    int dano = 10+getModificador();
    public Fireball(String nome, String tipo, int modificador) {
        super(nome, tipo, modificador);
    }

    public int getDano(){
        return dano;
    }
}
