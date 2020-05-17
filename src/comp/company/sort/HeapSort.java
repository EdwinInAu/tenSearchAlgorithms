package comp.company.sort;

public class HeapSort extends Sort{
    protected void s(){
        int size = array.length;
        // 先把 数组变成堆的顺序
        for(int i = (size >> 1) - 1; i >= 0; i--){
            heapify(i, size);
        }
        while(size > 1){
            swap(0,--size);
            heapify(0,size);
        }
    }

    protected void heapify(int index, int size){
        int tmp = array[index];
        for(int child = index * 2 + 1; child < size; child = child * 2 + 1){
            if(child + 1 < size && array[child] < array[child+1]){
                child++;
            }
            if(tmp < array[child]){
                array[index] = array[child];
                index = child;
            }else break;
        }
        array[index] = tmp;
    }
}
