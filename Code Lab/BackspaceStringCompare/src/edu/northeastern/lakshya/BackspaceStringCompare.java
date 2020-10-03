public class BackspaceStringCompare {
  public boolean backspaceCompare(String S, String T) {
    ArrayList<Character> sList = new ArrayList<>();
    ArrayList<Character> tList = new ArrayList<>();
    for(int i = 0; i < S.length(); i ++){
      if(S.charAt(i) == '#' && sList.size() == 0)
        continue;
      else if(S.charAt(i) == '#')
        sList.remove(sList.size()-1);
      else
        sList.add(S.charAt(i));
    }
    for(int i = 0; i < T.length(); i ++){
      if(T.charAt(i) == '#' && tList.size() == 0)
        continue;
      else if(T.charAt(i) == '#')
        tList.remove(tList.size()-1);
      else
        tList.add(T.charAt(i));
    }

    boolean result = sList.equals(tList);
    return result;
  }
}