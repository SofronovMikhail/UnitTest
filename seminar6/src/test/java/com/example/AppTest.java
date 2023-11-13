package com.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void TestSizeList1() {
        List1 list1 = new List1();
        assertThat(list1.FindList(new int[0])).isEqualTo(0);
    }

    @Test
    public void TestSizeList2() {
        List2 list2 = new List2();
        assertThat(list2.FindList(new int[0])).isEqualTo(0);
    }

    @Test
    public void TestAddElementList2() {
        List2 list2 = new List2();
        assertThat(list2.FindList(new int[] { 5 })).isEqualTo(5);
    }

    @Test
    public void TestAddElementList1() {
        List1 list1 = new List1();
        assertThat(list1.FindList(new int[] { 5 })).isEqualTo(5);
    }

    @Test
    public void TestFindList1() {
        List1 list1 = new List1();
        assertThat(list1.FindList(new int[] { 1, 2, 3 })).isEqualTo(2);
    }

    @Test
    public void TestFindList2() {
        List2 list2 = new List2();
        assertThat(list2.FindList(new int[] { 1, 2, 3 })).isEqualTo(2);
    }

    @Test
    public void TestListComparison1() {
        App app = new App();
        List2 list2 = new List2();
        List1 list1 = new List1();
        assertThat(app.ListComparison(list1.FindList(new int[] { 4, 2, 3 }), list2.FindList(new int[] { 1, 2, 3, })))
                .isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    public void TestListComparison2() {
        App app = new App();
        List2 list2 = new List2();
        List1 list1 = new List1();
        assertThat(app.ListComparison(list1.FindList(new int[] { 1, 2, 3 }), list2.FindList(new int[] { 4, 2, 3, })))
                .isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    public void TestListComparison3() {
        App app = new App();
        List2 list2 = new List2();
        List1 list1 = new List1();
        assertThat(app.ListComparison(list1.FindList(new int[] { 1, 2, 3 }), list2.FindList(new int[] { 1, 2, 3, })))
                .isEqualTo("Средние значения равны");
    }
}
