package personagem.atributo;

public class Vida extends Atributo{


    private int hpMax = (this.getValor()+1)*10;
    private int hp = hpMax;
    public Vida(String nome, int valor) {
        super(nome, valor);
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void recuperarVida(int qnt){
        if(this.getHp() > 0 && this.getHp() + qnt <= hpMax){
            hp += qnt;
            System.out.println(qnt +"\n Pontos de HP recuperados.");
        }else{
            System.out.println("\nNão foi possível recuperar HP.");
        }
    }

    public void perderVida(int qnt){
        if(this.getHp() > 0){
            this.hp -= qnt;
            if (this.hp < 0){
                this.hp = 0;
            }
            System.out.println(qnt + " \nPontos de HP perdidos.");
        }else{
            System.out.println("\nPersonagem já está inconsciente.");
        }
    }

}
