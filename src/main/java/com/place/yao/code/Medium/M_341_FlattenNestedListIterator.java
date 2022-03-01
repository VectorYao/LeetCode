package com.place.yao.code.Medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @Author vectoryao
 * @Date 2022/3/1
 **/
public class M_341_FlattenNestedListIterator {


    // This is the interface that allows for creating nested lists.
    // You should not implement it, or speculate about its implementation
    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

    public class NestedIterator implements Iterator<Integer> {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        public NestedIterator(List<NestedInteger> nestedList) {
            // 预处理，扁平化嵌套list
            for (NestedInteger nestedInteger : nestedList) {
                help(nestedInteger);
            }
        }

        private void help(NestedInteger nestedList) {
            if (nestedList.isInteger()) {
                list.add(nestedList.getInteger());
            } else {
                List<NestedInteger> nestedIntegers = nestedList.getList();
                for (NestedInteger nestedInteger : nestedIntegers) {
                    help(nestedInteger);
                }
            }
        }

        @Override
        public Integer next() {
            return list.get(index++);
        }

        @Override
        public boolean hasNext() {
            return index < list.size();
        }
    }
}
