import personagem.Personagem;
import personagem.atributo.Atributo;
import personagem.atributo.Vida;
import personagem.classe.Classe;
import personagem.classe.Guerreiro;
import personagem.classe.Ladino;
import personagem.classe.Mago;

import java.util.ArrayList;
import java.util.Scanner;

public class Ficha {

    static Scanner input = new Scanner(System.in);
    static Controlador controlador = new Controlador();
    static ArrayList<Personagem>arrayPersonagens;


    public static void main(String[] args) {
        arrayPersonagens = new ArrayList<>();
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
                break;
            case 2:
                listarClasses();
                break;
            case 3:
                listarEspecies();
                break;
            case 4:
                listarPoderes();
                break;
            case 5:
                listarPersonagens();
                break;
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
        int especie = input.nextInt();
        System.out.println("\nClasse: ");
        int classe = input.nextInt();

        Personagem personagem = new Personagem(nome, controlador.initEspecie(especie),controlador.initClass(classe), )
    }

}
