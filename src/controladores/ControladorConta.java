package controladores;

import model.Mensalidade;

public class ControladorConta {

    public void calcularMensalidade(Mensalidade mensalidade){
        mensalidade.setValor(300);
    }

    public void calcularMensalidade(double valor){
        valor = 300;
    }
}
