import java.util.LinkedList;
import java.util.List;

import java.util.LinkedList;

class MyStack<T> {

    private LinkedList<T> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(T item) {
        // 放在尾端
        stack.addLast(item);
    }

    public T pop() {
        if (stack.isEmpty()) return null;
        // 取尾端（真正的 Stack 行為）
        return stack.removeLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}


public class StackExample{
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        //do some test if needed
    }
}



//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------