import java.util.ArrayList;
//import java.util.Queue;

public class day23 {
    public static class Queue {
        private ArrayList<Integer> items;

        Queue() {
            this.items = new ArrayList<>();
        }

        public void enqueue(int element) {
            this.items.add(element);
        }

        public int dequeue() {
            if (this.items.isEmpty()) {
                return -1;
            }
            return this.items.remove(0);
        }

        public boolean isEmpty() {
            return this.items.isEmpty();
        }

        public int size() {
            return this.items.size();
        }

    }
    public static void main(String[] args) {
        
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}
