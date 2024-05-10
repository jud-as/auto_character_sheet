package personagem.atributo;

public class Atributo{
    private String nome;
    private int valor;
    private int valorMaximo = 10;


    public Atributo(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }


    public String toString() {
        return  "Atributo{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", valorMaximo=" + valorMaximo +
                '}';
    }

    public void incremento(int incremento){
        if (incremento + this.getValor() <= this.getValorMaximo()){
            this.valor += incremento;
        }else{
            System.out.println("Valor máximo de atributo já atribuido.");
        }
    }

    public void decremento(int decremento){
        if (this.getValor() - decremento >= 0){
            this.valor -= decremento;
        }else{
            System.out.println("Valor mínimo de atributo já atribuido.");
        }
    }
}









