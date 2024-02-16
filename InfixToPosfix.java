
public class InfixToPosfix {


    static int aritmetic(char c) { //marcador aritmetico para ver que tipo de funcion estamos trabajando, es util en el switch a la hora de convertir
        if (c == '^') 
            return 3;//regresa un elevado
        else if (c == '/' || c == '*') //regreasa multiplicador o divisor
            return 2;
        else if (c == '+' || c == '-') //regresa suma y resta
            return 1;
        else
            return 0; //marca que es un numero
    }
    static char associativity(char c) { //solucion encontrada en geeks for geeks a que el elevado no sabia a que numero pertenecia 
        if (c == '^')
            return 'R';
        return 'L'; 
    }
    public String infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < s.length(); i++) { //recorre el arreglo
            char c = s.charAt(i); //setea el dato en el que se encuentra para empezar las comparaciones
            
            //  Revisa que sea numerico.
            if (c >= '0' && c <= '9') {
                result.append(c); //lo añade al arreglo de posfix 
            }
            // 
            else if (c == '(') { //al verificar un abrir parentesis lo mete al stack
                pila.push(c);
            }
            // Si mira un ) saca los datos del stack hasta encontrar el ( y lo saca
            else if (c == ')') {
                while (!pila.empty() && pila.ver() != '(') {
                    result.append(pila.pop());
                }
                pila.pop(); // Pop '('
            }
            // Si detecta un operando
            else {
                //revisa que el valor sea un operando en caso de que encuentre un elevado lo manda a asociar para ver a que numero se refiere la asociación para posteriormente colocarlo.
                while (!pila.empty() && (aritmetic(s.charAt(i)) < aritmetic(pila.ver()) || aritmetic(s.charAt(i)) == aritmetic(pila.ver()) && associativity(s.charAt(i)) == 'L')) { 
                    result.append(pila.pop());
                }
                pila.push(c);
            }
        }
 
        // Pop all the remaining elements from the stack
        while (!pila.empty()) {
            result.append(pila.pop());
        }
        
        return(result.toString());
    }
 
}
