package com.company;
import java.util.*;
import com.company.*;
import comp.company.sort.BubbleSort;
import comp.company.sort.HeapSort;
import comp.company.sort.SelectionSort;
import comp.company.sort.Sort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // bubble sort
        int array[] = {5,1,10,0,30,4,28,2};
        testSorts(array, new BubbleSort(), new SelectionSort(), new HeapSort());

    }

    protected static void testSorts(int array[], Sort... sorts){
        for(Sort sort: sorts){
            sort.sort(array);
        }
        Arrays.sort(sorts);

        for(Sort sort: sorts){
            System.out.println(sort);
        }
    }
}
