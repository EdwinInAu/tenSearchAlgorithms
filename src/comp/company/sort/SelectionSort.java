package comp.company.sort;

public class SelectionSort extends Sort{
    protected void s(){
        for(int end = array.length - 1; end > 0; end--){
            int index = 0;
            for(int i = 0; i <= end; i++){
                // 为了稳定性
                if(cmp(i,index) >= 0){
                    index = i;
                }
            }
            swap(index,end);
        }
    }
}
