package org.example;

public class PrestamoService {

    private EvaluadorCrediticio evaluador;

    public PrestamoService(EvaluadorCrediticio evaluador) {
        this.evaluador = evaluador;
    }

    public String registrar(String cliente) {



        int score = evaluador.obtenerScore(cliente);

        if (score < 600) {
            return "Score insuficiente";
        }

        return "Préstamo aprobado";
    }
}
