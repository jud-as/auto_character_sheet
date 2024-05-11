import personagem.Personagem;
import personagem.atributo.Atributo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ficha {


    static Scanner input = new Scanner(System.in);
    static ArrayList<Personagem>arrayPersonagens;
    static ArrayList<Atributo>arrayAtributo;

    static Atributo inteligencia = new Atributo("Inteligencia", 0);
    static Atributo forca = new Atributo("Forca", 0);
    static Atributo vida = new Atributo("Vida", 1);

    static Controlador controlador = new Controlador(inteligencia, forca, vida);
    public static void main(String[] args) {
        arrayPersonagens = new ArrayList<Personagem>();
        arrayAtributo = new ArrayList<Atributo>();
        operacoes();
    }

    public static void operacoes() {

        System.out.println("------------------------------");
        System.out.println("----SELECIONE UMA OPERAÇÃO----\n");
        System.out.println("|    1 - Criar Personagem    |");
        System.out.println("|    2 - Listar Classes      |");
        System.out.println("|    3 - Listar Espécies     |");
        System.out.println("|    4 - Listar Poderes      |");
        System.out.println("|    5 - Listar Personagens  |");
        System.out.println("|    6 - Sair                |");

        int opc = input.nextInt();
        switch(opc) {
            case 1:
                criarPersonagem();
                System.exit(0);
            case 6:
                System.out.println("Encerrando programa.");
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
                operacoes();
                break;
        }
    }



    public static void criarPersonagem() {


        System.out.println("\nNome: ");
        String nome = input.next();
        System.out.println("\nEspécie: ");
        int opcEspecie = input.nextInt();
        System.out.println("\nClasse: ");
        int opcClasse = input.nextInt();
        System.out.println("\nPoder: ");
        int opcPoder = input.nextInt();


        Personagem personagem = new Personagem(
                nome,
                controlador.initEspecie(opcEspecie),
                controlador.initClass(opcClasse),
                controlador.initPoder(opcPoder),
                controlador.getInteligencia(),
                controlador.getForca(),
                controlador.getVida());
        System.out.println(personagem);
        arrayPersonagens.add(personagem);
        operacoes();
    }

    public static void listarPersonagens(){
        if(!arrayPersonagens.isEmpty()){
            for(Personagem personagem: arrayPersonagens){
                System.out.println(personagem);
            }
        }else {
            System.out.println("Não há registro de personagens.");
        }
        operacoes();
    }
}
