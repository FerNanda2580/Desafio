import java.util.LinkedList;
import java.util.Queue;

public class counterBi {
     private Queue <String> queue = new LinkedList<>();


    public void getBinarios() {
        
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
    
    
    public void setBinarios(int n) {
        for (int i = 1; i <= n; i++) {

            queue.offer(Integer.toBinaryString(i));
        }
    }
    
}
