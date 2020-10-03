package edu.northeastern.lakshya;

import java.util.List;

public interface NestedInteger {
  NestedInteger();

  public NestedInteger(int value);

  public boolean isInteger();

  public Integer getInteger();

  public void setInteger(int value);
  public void add(NestedInteger ni);

  public List<NestedInteger> getList();
 }
