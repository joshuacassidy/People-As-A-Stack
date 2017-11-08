/**
 * Created by Josh on 08/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(new Person("Josh", 12, "333V"));
        stack.push(new Person("John", 12, "333V"));
        System.out.println(stack.size());
        System.out.println(stack.peek().getData().getName());
        System.out.println(stack.pop().getData().getName());
        System.out.println(stack.peek().getData().getName());
        System.out.println(stack.pop().getData().getName());
    }
}
