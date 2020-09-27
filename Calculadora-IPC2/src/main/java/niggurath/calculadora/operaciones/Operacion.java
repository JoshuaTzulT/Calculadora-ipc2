package niggurath.calculadora.operaciones;

public class Operacion {

    private double resultado;
    private String cadena;

    public double sumar(double primero, double segundo) {
        resultado = (primero + segundo);
        return resultado;

    }

    public double multiplicar(double primero, double segundo) {
        resultado = (primero * segundo);
        return resultado;
    }

    public double obtenerMayor(double primero, double segundo) {
        if (primero > segundo) {
            resultado = primero;
        } else if (primero < segundo) {
            resultado = segundo;
        } else {
            resultado = primero;
        }
        return resultado;
    }

    public double obtenerPotencia(double primero, double segundo) {
        resultado = Math.pow(primero, segundo);
        return resultado;
    }

    /**
     *
     * @param primero
     * @param segundo
     * @return
     */
    public String convertirABinario(double primero, double segundo) {
        int primerNumero = (int) Math.round(primero);
        int segundoNumero = (int) Math.round(segundo);

        String resultadoUno = Integer.toBinaryString(primerNumero);
        String resultadoDos = Integer.toBinaryString(segundoNumero);

        cadena = "El primer número en binario es " + resultadoUno + "\n el segundo Número en binario es " + resultadoDos;
        return cadena;
    }

}
