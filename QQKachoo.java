//Square - Ricky Lin, Kyle Tau, Simon Tsui
//APCS2 pd02
//Lab 02

public class QQKachoo<Card> implements Deque<Card>{

    DLLNode<Card> _head, _tail;  //pointer to head and tail
    int _size;  //size of deque

    public QQKachoo() {  //constructor initializes head tail and size
	     _head = new DLLNode<Card>(null, null, null);
	     _tail = new DLLNode<Card>(null, null, null);
	     _size = 0;
    }

    public int size() {  //return size
	     return _size;
    }

    public boolean add(Card e) {  //add to the end
	      addLast(e);
	      return true;
    }

    public void addFirst(Card e) {  //add to the front
	     if ( _size == 0 ) {
	        _head = new DLLNode<Card>(e, null, null);
	        _tail = _head;
	     }

	     else {
	        DLLNode<Card> temp = new DLLNode<Card>(e, null, _head);
	        _head = temp;
	     }
	     _size++;
    }


    public void addLast(Card e) {  //add to end
	     if ( _size == 0 ) {
	        _head = new DLLNode<Card>(e, null, null);
	        _tail = _head;
	     }

	     else {
	        DLLNode<Card> temp = new DLLNode<Card>(e, _tail, null);
	        _tail = temp;
	     }
	     _size++;
    }

    public Card element() {  //return first element
	     return _head.getCargo();
    }

    public Card getFirst() {  //return 1st element
	     return element();
    }

    public Card getLast() {  //return last element
	     return _tail.getCargo();
    }

    public Card remove() {  //removes and returns first element
	     Card temp = _head.getCargo();
	     _head = _head.getNext();
	     return temp;
    }

    public Card removeFirst() {  //removes and returns first element
	     return remove();
    }

    public Card removeLast() {  //removes and returns last element
	     Card temp = _tail.getCargo();
	     _tail = _tail.getPrev();
	     return temp;
    }

    public boolean contains(Card e) {  //checks if deque has card e
	     DLLNode temp = _head;

       for ( int i = 0; i < _size; i++ ) {

          if ( temp.getCargo().equals(e) ) {
		          return true;
          }

          temp = temp.getNext();
	     }
	     return false;
    }

    public String toString() {  //overwrite toString method
    	String retstr = "";
	    DLLNode temp = _head;

      while( temp != null ) {
     	  retstr += temp.getCargo() + ", ";
	      temp = temp.getNext();
	    }

      if ( retStr.length() > 1 ) {
    		retStr = retStr.substring( 0, retStr.length() - 2 );
      }

	    return retstr;
    }


    public static void main(String[] args){

	     QQKachoo<String> basic = new QQKachoo<String>();
	     basic.add("I");
	     basic.addFirst("have");
       basic.addLast("done");
       System.out.println(basic.contains("have")); //expect true
	     System.out.println(basic);  //expect have I done
       while(!basic.isEmpty()){
         System.out.println(basic.getLast())
     	   System.out.println(basic.removeLast());
     	}

      basic.add("I");
      basic.addFirst("have");
      basic.addLast("done");
      System.out.println(basic.contains("false")); //expect false
      while(!basic.isEmpty()){
        System.out.println(basic.getFirst());
        System.out.println(basic.removeFirst());
     }
   }
}
