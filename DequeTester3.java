public class DequeTester3{

    public static void main (String[] args){
	QQKachoo<String> Q = new QQKachoo<String>();
	System.out.println("Adding a to front...");
	Q.addFirst("a");
	System.out.println("Adding z to back...");
	Q.addLast("z");
	System.out.println("Printing Q...");
	System.out.println(Q);
	System.out.println();
	System.out.println("Size: " + Q.size());
	System.out.println("First: " + Q.getFirst());
	System.out.println("Last: " + Q.getLast());
	System.out.println();
	System.out.println("Removing from front...");
	Q.removeFirst();
	System.out.println(Q);
	System.out.println("Removing from back...");
	Q.removeLast();
	System.out.println(Q);
    }
}
