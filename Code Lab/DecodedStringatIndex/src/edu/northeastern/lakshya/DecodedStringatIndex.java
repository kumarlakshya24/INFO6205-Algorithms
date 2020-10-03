public class DecodedStringatIndex {
    public String decodeAtIndex(String S, int K) {
    int size = 0;
    for(int i = 0; i < S.length(); i++) {
      char character = S.charAt(i);
      if(Character.isDigit(character)) {
        size = size * Integer.parseInt(""+character);
      }
      else {
        size++;
      }
    }

    for(int i = S.length() - 1; i >=0; i--) {
      char character = S.charAt(i);
      K = K % size;

      if(K == 0 && Character.isDigit(character) == false) {
        return ""+character;
      }

      if(Character.isDigit(character)) {
        size = size/Integer.parseInt(""+character);
      }
      else {
        size--;
      }
    }
    return "";
  }
}
