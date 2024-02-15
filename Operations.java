public class Operations implements Icalculadora{

    //Métodos simples. Ocupan el POP del STACK para obtener 2 valores y operarlos según el operando seleccionado.
    
    /**
    * Funcion sumar realiza la suma de dos valores especificadas. Ejemplo :
    * 
    * @param valor - valor a mostrar ( double )
    * @param valor2 - valor a mostrar ( double )
    * 
    * @return retorna el valor sumado ( double ) ejemplo : valor + valor2 ( double
    */
    public double sumar(double valor, double valor2) {
        return (valor + valor2);
    }

    /**
    * Metodo restar retorna la resta de dos valores. Ejemplo :
    * 
    * @param valor - valor a restar ( realizado )
    * @param valor2 - valor a restar ( realizado )
    * 
    * @return devuelve la resta de dos valores ( realizado ) ejemplo :
    */
    public double restar(double valor, double valor2) {
        return (valor - valor2);
    }

    /**
    * Metodo que multiplica dos valores. Ejemplo : Devuelve la cantidad de resultados encontradas que pueda mostrar el numero de registros.
    * 
    * @param valor - Valor inicial que se quiere multiplicar.
    * @param valor2 - Valor inicial que se quiere multiplicar.
    * 
    * @return Devuelve la cantidad de resultados encontradas encontradas
    */
    public double multiplicar(double valor, double valor2) {
        return (valor * valor2);
    }

    /**
    * Funcao dividir da double e restituisce il numero della classe
    * 
    * @param valor - Direccion a ser divideado. Por defecto de manejar dos parametros.
    * @param valor2 - Direccion a ser divideado. Por defecto de manejar dos parametros
    */
    public double dividir(double valor, double valor2) {
        return (valor / valor2);
    }
    

}
