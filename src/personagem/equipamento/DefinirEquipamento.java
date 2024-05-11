package personagem.equipamento;

public class DefinirEquipamento {
    public Equipamento initEquipamento(int opc) {
        Equipamento equipamentoEscolhido = null;

        switch (opc) {
            case 1:
                Equipamento espada = new Equipamento("Espada", "arma", "Uma arma cortante letal.");
                equipamentoEscolhido = espada;

                break;
            case 2:
                Equipamento adaga = new Equipamento("Adagas", "arma", "duas adagas mortais");
                equipamentoEscolhido = adaga;
                break;
            case 3:
                Equipamento cajado = new Equipamento("Cajado", "arma", "Um poderoso cajado magico.");
                equipamentoEscolhido = cajado;
                break;
            default:
                System.out.println("Equipamento não especificado.");
                break;
        }

        return equipamentoEscolhido;
    }
}
