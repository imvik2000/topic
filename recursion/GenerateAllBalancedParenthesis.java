import java.util.ArrayList;
import java.util.List;
    public class GenerateAllBalancedParenthesis {

        public static void main(String[] args) {
          int n = 4;
          int open = n, closed = n;
          String op = "";
          List<String> output = new ArrayList<>();
          List<String> result = solve(open, closed, op, output);
          result.forEach(System.out::println);
        }
      
        public static List<String> solve(int open, int closed, String op, List<String> output) {
          // base condition
          if (open == 0 && closed == 0) {
            output.add(op);
            return output;
          }
      
          String op1;
          String op2;
      
          // opening parentheses choice is used until it becomes 0
          if (open != 0) {
            op1 = op;
            op1 += "(";
            solve(open - 1, closed, op1, output);
          }
          // when closed is greater than open, we have the closing parentheses choice in the output.
          if (closed > open) {
            op2 = op;
            op2 += ")";
            solve(open, closed - 1, op2, output);
          }
          return output;
        }
      }
