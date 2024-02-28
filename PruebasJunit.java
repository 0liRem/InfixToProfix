import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PruebasJunit {

    
    Operations operador = new Operations();
    @Test
    public void testSumar() {
        double resultado = operador.sumar(3.0, 2.0);
        assertEquals(5.0, resultado, 0.1);
    }

    @Test
    public void testRestar() {
        
        double resultado = operador.restar(5.0, 2.0);
        assertEquals(3.0, resultado, 0.1);
    }

    @Test
    public void testMultiplicar() {
       
        double resultado = operador.multiplicar(4.0, 2.5);
        assertEquals(10.0, resultado, 0.1);
    }

    @Test
    public void testDividir() {
        
        double resultado = operador.dividir(8.0, 2.0);
        assertEquals(4.0, resultado, 0.1);
    }
}