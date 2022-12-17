import java.util.Random;

public class CalcularDesconto {
    public static double descontoDefinicaoVenda(Venda venda){

        double descontoD = 10;

        double desconto = descontoD / 100;

        double valorDescontar = venda.getValorTotal() * desconto;

        double valorDesconto = venda.getValorTotal() - valorDescontar;

        return valorDesconto;
    }

    public static double descontoProgessivoVenda(Venda venda){
        double prog = venda.getValorTotal() / 25;

        double descontoProg = prog > 20 ? 20 : prog;

        double desconto = descontoProg / 100;

        double valorDescontar = venda.getValorTotal() * desconto;

        double valorDesconto = venda.getValorTotal() - valorDescontar;

        return valorDesconto;
    }

    public static double descontoAniversárioVenda(Venda venda){

        return venda.getCliente().getDataNascimento() == venda.getData() ? (venda.getValorTotal() * 0.15) - venda.getValorTotal() : venda.getValorTotal();

    }
}
