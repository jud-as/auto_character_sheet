package personagem.poder;

public class PalavrasCurativas extends Poder{

    int cura = 4+getModificador();
    public PalavrasCurativas(String nome, String tipo, int modificador) {
        super(nome, tipo, modificador);
    }

    public int getCura(){
        return cura;
    }
}
