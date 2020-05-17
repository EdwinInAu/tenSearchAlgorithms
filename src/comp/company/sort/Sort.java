package comp.company.sort;


import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Sort implements Comparable<Sort>{
    private long time;
    protected int array[];
    public void sort(int array[]){
        if(array == null || array.length < 2) return;
        this.array = array;
        long begin = System.currentTimeMillis();
        s();
        time = System.currentTimeMillis() - begin;
    }



    // 从小到大
    public int compareTo(Sort sort){
        return (int)(time - sort.time);
    }

    protected abstract void s();

    protected int cmp(int a, int b){
        return array[a] - array[b];
    }
    protected void swap(int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public String toString(){
        String result = "time" + time + '\n';
        return result;
    }
}