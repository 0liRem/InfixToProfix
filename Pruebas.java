import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pruebas {


    @Test
    public void testRestar() {
        Operations prueba = new Operations();
  
        double valor1, valor2;
        valor1 = 60;
        valor2 = 30;

        assertEquals(30, prueba.restar(valor1, valor2)); 

        assertEquals(90, prueba.sumar(valor1, valor2)); 

        assertEquals(1800, prueba.multiplicar(valor1, valor2)); 
    }
}

