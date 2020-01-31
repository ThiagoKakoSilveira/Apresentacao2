package imutable;

import java.util.Calendar;

public class Aula {
    private final Calendar inicio;
    private final Calendar fim;

    public Aula(Calendar inicio, Calendar fim){
        this.inicio = (Calendar) inicio.clone();
        this.fim = (Calendar) fim.clone();
    }

    public Calendar getInicio(){
        return (Calendar) inicio.clone();
    }

    public Calendar getFim(){
        return (Calendar) fim.clone();
    }
}
