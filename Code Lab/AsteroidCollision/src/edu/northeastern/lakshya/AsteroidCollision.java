public class AsteroidCollision  {
  public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> stack = new Stack<>();

    for(int e : asteroids) {
      if(stack.isEmpty()){
        stack.push(e);
      }
      else {
        boolean push = true;
        while(!stack.isEmpty() && e < 0 && stack.peek() > 0) {
          if(Math.abs(stack.peek()) > Math.abs(e)) {
            push = false;
            break;
          } else if(Math.abs(stack.peek()) == Math.abs(e)) {
            push = false;
            stack.pop();
            break;
          } else {
            stack.pop();
          }
        }
        if(push) {
          stack.push(e);
        }
      }
    }

    int[] remaining = new int[stack.size()];
    for(int i = stack.size()-1; i >= 0; i--) {
      remaining[i] = stack.pop();
    }
    return remaining;
  }
}