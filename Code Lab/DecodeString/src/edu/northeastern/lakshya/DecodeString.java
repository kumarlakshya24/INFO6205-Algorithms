public class DecodeString {
  public String decodeString(String s) {
    StringBuilder word = new StringBuilder();
    int num = 0;
    for (int i=0; i<s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isLetter(c)) {
        word.append(c);
      } else if (Character.isDigit(c)) {
        num = num*10 + (c-'0');
      } else if (c=='[') {
        String decode = decodeString(s.substring(i+1, s.length()));
        i = endPos(i, s);
        for (int j=0; j<num; j++) word.append(decode);
        num = 0;
      } else if (c==']') {
        return word.toString();
      }
    }
    return word.toString();
  }

  public int endPos(int pos, String s) {
    int cnt = 0;
    for (int i=pos; i<s.length(); i++) {
      char c = s.charAt(i);
      if (c=='[') {
        cnt++;
      } else if (c==']') {
        cnt--;
      }
      if (cnt==0) return i;
    }
    return -1;
  }
}