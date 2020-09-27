package niggurath.calculadora.operaciones;

public class Operacion {

    public double sumar(double primero, double segundo) {
        double resultado = (primero + segundo);
        return resultado;
    }

    public double multiplicar(double primero, double segundo) {
        double resultado = (primero * segundo);
        return resultado;
    }

    public double obtenerMayor(double primero, double segundo) {
        if (primero > segundo) {
            return primero;
        } else if (primero < segundo) {
            return segundo;
        } else {
            return primero;
        }
    }

    public double obtenerPotencia(double primero, double segundo) {
        double resultado = Math.pow(primero, segundo);
        return resultado;
    }

    public String convertirABinario(double primero, double segundo) {
        int primerNumero = (int) Math.round(primero);
        int segundoNumero = (int) Math.round(segundo);

        String resultadoUno = Integer.toBinaryString(primerNumero);
        String resultadoDos = Integer.toBinaryString(segundoNumero);

        String cadena = "El primer número en binario es " + resultadoUno + "\n el segundo Número en binario es " + resultadoDos;

        return cadena;
    }

}
