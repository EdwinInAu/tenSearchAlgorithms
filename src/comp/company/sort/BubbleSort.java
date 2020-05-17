package comp.company.sort;

public class BubbleSort extends Sort {
    protected void s() {
        for (int end = array.length; end > 0; end--) {
            boolean sorted = true;
            for (int i = 1; i < end; i++) {
                if (cmp(i,i-1) < 0) {
                    swap(i-1,i);
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }
}
