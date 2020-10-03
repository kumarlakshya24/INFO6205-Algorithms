import edu.northeastern.lakshya.NestedInteger;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class MiniParser {
  public NestedInteger deserialize(String s) {
    if(s == null) {
      return null;
    }
    if(s.charAt(0) != '[') {
      return new NestedInteger(Integer.parseInt(s));
    }
    NestedInteger parent = new NestedInteger();
    deserializeSubstring(parent, s.toCharArray(), 1);
    return parent.getList().get(0);
  }

  public int deserializeSubstring(NestedInteger parent, char[] charArray, int start) {
    int end = start;
    NestedInteger current = new NestedInteger();
    parent.getList().add(current);
    char before = ' ';
    int val = 0;
    boolean neg = false;
    while(end < charArray.length) {
      if(charArray[end] == '[') {
        end = deserializeSubstring(current, charArray, end+1);
      } else if(isInteger(charArray[end])){
        val = val * 10 + (charArray[end] - 48);
      } else {
        if(isInteger(before)) current.getList().add(new NestedInteger(!neg? val:-val));
        if(charArray[end] == ']') return end;
        val = 0;
        neg = charArray[end] == '-';
      }
      before = charArray[end++];
    }
    return end;
  }

  private boolean isInteger(char c) {
    return c >= 48 && c <= 57;
  }
}