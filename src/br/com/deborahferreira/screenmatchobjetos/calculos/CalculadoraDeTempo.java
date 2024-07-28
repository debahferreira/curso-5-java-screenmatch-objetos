package br.com.deborahferreira.screenmatchobjetos.calculos;

import br.com.deborahferreira.screenmatchobjetos.modelos.Filme;
import br.com.deborahferreira.screenmatchobjetos.modelos.Serie;
import br.com.deborahferreira.screenmatchobjetos.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    /*public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s) {
        tempoTotal += s.getDuracaoEmMinutos();
    }*/

    public void inclui(Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
