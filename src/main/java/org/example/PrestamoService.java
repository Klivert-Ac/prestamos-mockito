package org.example;

public class PrestamoService {

    private EvaluadorCrediticio evaluador;

    public PrestamoService(EvaluadorCrediticio evaluador) {
        this.evaluador = evaluador;
    }

    public String registrar(String cliente) {

        if (evaluador.tieneDeudas(cliente)) {
            return "Cliente con deudas pendientes";
        }

        int score = evaluador.obtenerScore(cliente);



        return "Préstamo aprobado";
    }
}
