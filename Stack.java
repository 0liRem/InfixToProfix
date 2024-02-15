public class Stack <T>{
    private node<T> lastNode;
    private node<T> firstNode;


// PUSH. Inserta a la pila un nuevo valor en la última posición del STACK.
public void push(T value) {
    if (lastNode == null){
        lastNode = new node<T>(value);
        firstNode = lastNode;
    }else{
        node<T> current = new node<T>(value);
        current.setnext(firstNode);
        firstNode = current;
    }
}

// POP. Obtiene el siguiente valor en la pila y regresa un espacio.
public T pop() {
    if (firstNode != null) {
        T value = firstNode.getvalue();
        firstNode = firstNode.getNext();
        return value;
    }
    throw new RuntimeException("Stack underflow");
}


}
