public class Calculator
{
    public static void main(String[] args) {
        Calculator.solve("3 4 * 6 2 - 4 6 + -");
    }

    public static void solve(String input) {
        java.util.Stack<Integer> ops = new java.util.Stack<Integer>();
        for (String x : input.split(" ")) {
            if (x.matches("[-]?[0-9]+")) {
                ops.push(Integer.parseInt(x));
            } else {
                int b = ops.pop(), a = ops.pop();
                if ("+".equals(x)) ops.push(a + b);
                if ("-".equals(x)) ops.push(a - b);
                if ("*".equals(x)) ops.push(a * b);
            }
        }
        System.out.println(ops.pop());
    }
}