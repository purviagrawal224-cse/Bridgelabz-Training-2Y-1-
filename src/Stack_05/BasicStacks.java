public class BasicStacks {
        int[] arr = new int[5];
        int top = -1;

        // Push - element add karna
        void push(int value) {
            if (top == arr.length - 1) {
                System.out.println("Stack Overflow");
            } else {
                top++;
                arr[top] = value;
            }
        }

        // Pop - top element remove karna
        int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int value = arr[top];
                top--;
                return value;
            }
        }

        // Peek - top element dekhna, remove nahi karna
        int peek() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return -1;
            } else {
                return arr[top];
            }
        }

        // IsEmpty - check karna stack empty hai ya nahi
        boolean isEmpty() {
            return top == -1;
        }
    }

        public static void main(String[] args) {

            Stack s = new Stack();

            s.push(10);
            s.push(20);
            s.push(30);

            System.out.println("Top element: " + s.peek());

            System.out.println("Removed: " + s.pop());

            System.out.println("Top element: " + s.peek());

            System.out.println("Is Empty: " + s.isEmpty());
}
