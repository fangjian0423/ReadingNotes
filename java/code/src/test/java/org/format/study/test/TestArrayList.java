package com.zhiyi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {


    @Test
    public void testNoParamConstructor() {
        // 不带参数的构造函数第一次add之后，会分配10个长度给内部elementData数组属性
        // 接下来每次add，会都判断数组长度是否不够，不够的话 新的长度 = max(当前数组长度 + 当前数组长度 / 2, 当前数组长度 + 1)
        // 比如，实例化之后。第一次add，数组长度分配了10个空间，当添加第11个的时候，数组长度不够，这也时候会分配15个(11 + 11 / 2)和11个的较大值，然后分配了11个。
        // 然后elementData有15个空间，当添加第16个的时候，分配22(15 + 15 / 2)个。 以此类推， 22个不够的时候分配33个，33个不够的时候分配49个。
        ArrayList list = new ArrayList();

        int count = 164;
        for (int i = 1; i <= count; i++) {
            list.add(i);
        }
        System.out.println("done");
    }

    @Test
    public void testKnowSize() {
        // 带长度的原理。 只不过一开始不会分配10个空间，而是参数穿进来的空间大小。
        // 比如传入0, 0个空间，第一次add, 选择0(0 + 0 / 2)和1(0+1)的较大值，取1,分配1个空间
        // 再次添加的时候，选择1(1+1/2)和2(1+1)的较大值，取2,分配2个空间
        // 再次添加的时候，选择3(2+2/2)和3(2+1)的较大值，取3,分配3个空间
        // 再次添加的时候，选择4(3+3/2)和4(3+1)的较大值，取4,分配4个空间
        // 再次添加的时候，选择6(4+4/2)和5(4+1)的较大值，取6,分配6个空间  以此类推...
        ArrayList list = new ArrayList(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("done");
    }

    @Test
    public void testValidAdd() {
        // 虽然list内部的elementData长度为5,但是有效长度为0。 所以add的时候不会增加长度。
        ArrayList list = new ArrayList(5);
        list.add("1");
    }

    @Test
    public void testRemove() {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("1");
        list.add("3");
        list.remove(0);
        // remove方法只会删除第一个匹配的元素，之后的元素下标都向前移。 所以"1"的下标值从2变成了1，且只有1个"1"元素
        System.out.println(list.indexOf("1")); // 输出 1
    }


}
