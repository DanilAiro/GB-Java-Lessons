package Lesson4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Program {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(1);
    ll.add(2);
    ll.add(3);

    Queue<Integer> queue = new LinkedList<>(); // очередь, первый вошёл - первый вышел
    queue.add(4);
    queue.remove(); // удаляет элемент по очереди, а не по индексу

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(123);
    pq.add(3);
    pq.add(13);
    pq.add(1);
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());

    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(1);
    deque.addLast(2);
    deque.removeFirst();
    deque.removeLast();
    deque.offerFirst(1);
    deque.offerLast(2);
    deque.pollFirst();
    deque.pollLast();
    // deque.getFirst();
    // deque.getLast();
    deque.peekFirst();
    deque.peekLast();
    // System.out.println(deque);
    
    var exp = "1 2 3 * +".split(" ");
    int res = 0;

    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < exp.length; i++) {
      if (isDigit(exp[i])) {
        st.push(Integer.parseInt(exp[i]));
      } else {
        switch (exp[i]) {
          case "+":
            res = st.pop() + st.pop();
            st.push(res);
            break;
            
          case "-":
            res = -st.pop() + st.pop();
            st.push(res);
            break;
            
          case "*":
            res = st.pop() * st.pop();
            st.push(res);
            break;
            
          case "/":
            res = 1 / st.pop() * st.pop();
            st.push(res);
            break;

          default:
            break;
        }
      }
    }
    System.out.printf("%d\n", st.pop());
  }

  static boolean isDigit(String i) {
    try {
      Integer.parseInt(i);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
