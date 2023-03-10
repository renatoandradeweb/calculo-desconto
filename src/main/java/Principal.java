import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Renato Andrade da Fonseca", LocalDate.parse("15/04/1981", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        Venda venda = new Venda(1, LocalDate.now(), 100, cliente);

        venda.setProcessarDesconto(CalcularDesconto::descontoProgessivoVenda);

        System.out.println(venda.valorComDesconto());
    }
}
