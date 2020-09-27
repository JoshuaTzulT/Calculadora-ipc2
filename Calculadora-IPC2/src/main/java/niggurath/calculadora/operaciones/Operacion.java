package niggurath.calculadora.operaciones;

public class Operacion {
    
    private double resultado;
    private String cadena;
    
           

    public  double sumar(double primero, double segundo) {
         resultado = (primero + segundo);
         return resultado;
              
    }

    public void multiplicar(double primero, double segundo) {
         resultado = (primero * segundo);
    }

    public void obtenerMayor(double primero, double segundo) {
        if (primero > segundo) {
            resultado= primero;
        } else if (primero < segundo) {
            resultado= segundo;
        } else {
            resultado= primero;
        }
    }

    public void obtenerPotencia(double primero, double segundo) {
        resultado = Math.pow(primero, segundo);
    }

    /**
     *
     * @param primero
     * @param segundo
     */
    public void convertirABinario(double primero, double segundo) {
        int primerNumero = (int) Math.round(primero);
        int segundoNumero = (int) Math.round(segundo);

        String resultadoUno = Integer.toBinaryString(primerNumero);
        String resultadoDos = Integer.toBinaryString(segundoNumero);

        cadena = "El primer número en binario es " + resultadoUno + "\n el segundo Número en binario es " + resultadoDos;

    }

   

}
