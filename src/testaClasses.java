import controladores.ControladorConta;
import model.Mensalidade;

public class testaClasses {

    public static void main(String[] args) {
        Mensalidade mensal = new Mensalidade();
        mensal.setValor(200);

        System.out.println("Valor Antes"+ mensal.getValor());

        ControladorConta contConta = new ControladorConta();
        contConta.calcularMensalidade(mensal);

        System.out.println("Valor Depois"+mensal.getValor());

        double valor = 200;
        System.out.println("Valor do primitivo Antes "+valor);
        contConta.calcularMensalidade(valor);
        System.out.println("Valor Depois "+valor);
    }

}
