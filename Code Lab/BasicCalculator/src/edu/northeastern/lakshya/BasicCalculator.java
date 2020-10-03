public class BasicCalculator {
  public int calculate(String s) {
    Stack<Integer> stack = new Stack<Integer>();
    int result = 0;
    int number = 0;
    int sign = 1; //1 or -1 to indicate positive negative sign
    for(int i = 0; i < s.length(); i++){
      char c = s.charAt(i);
      if(Character.isDigit(c)){
        number = 10 * number + (int)(c - '0');
      }
      else if(c == '+'){
        result += sign * number;
        number = 0;
        sign = 1;
      }
      else if(c == '-'){
        result += sign * number; //result = result + (-1) * number
        number = 0;
        sign = -1;
      }
      else if(c == '('){
        stack.push(result);
        stack.push(sign);
        sign = 1;
        result = 0;
      }
      else if(c == ')'){ // pop the stack everytime ')' is encountered
        result += sign * number;
        number = 0;
        result *= stack.pop();
        result += stack.pop();
      }
    }
    if(number != 0) {
      result += sign * number;
    }
    return result;
  }
}