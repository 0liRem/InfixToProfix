import org.junit.Test;
import static org.junit.Assert.*;

public class PruebaStack {

    @Test
    public void testPushAndPop() {
        Stack<Integer> stack = new Stack<>();

        assertTrue(stack.empty());
        assertEquals(0, stack.size());

        stack.push(1);
        assertFalse(stack.empty());
        assertEquals(1, stack.size());
        assertEquals(Integer.valueOf(1), stack.ver());

        stack.push(2);
        assertEquals(2, stack.size());
        assertEquals(Integer.valueOf(2), stack.ver());

        int poppedValue = stack.pop();
        assertEquals(1, stack.size());
        assertEquals(Integer.valueOf(1), stack.ver());
        assertEquals(2, poppedValue);

        stack.pop();
        assertTrue(stack.empty());
        assertEquals(0, stack.size());
    }

    @Test(expected = RuntimeException.class)
    public void testPopEmptyStack() {
        Stack<String> stack = new Stack<>();
        stack.pop(); 
    }

    @Test(expected = RuntimeException.class)
    public void testVerEmptyStack() {
        Stack<Double> stack = new Stack<>();
        stack.ver(); 
    }
}