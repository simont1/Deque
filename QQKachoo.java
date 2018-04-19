public class QQKachoo<Card> implements Deque<Card>{
    DLLNode<Card> _head, _tail;
    int _size;
    public QQKachoo(){
	_head = new DLLNode<Card>(null, null, null);
	_tail = new DLLNode<Card>(null, null, null);
	_size = 0;
    }
    public boolean add(Card e){
	addLast(e);
	return true;
    }
    public void addFirst(Card e){
	if(_size == 0){
	    _head = new DLLNode<Card>(e, null, null);
	    _tail = _head;
	}
	else{
	    DLLNode<Card> temp = new DLLNode<Card>(e, null, _head);
	    _head = temp;
	}
	_size++;
    }
    public void addLast(Card e){
	if(_size == 0){
	    _head = new DLLNode<Card>(e, null, null);
	    _tail = _head;
	}
	else{
	    DLLNode<Card> temp = new DLLNode<Card>(e, _tail, null);
	    _tail = temp;
	}
	_size++;
    }
    public String toString(){
    	String retstr = "";
	DLLNode a = _head;
     	while(a.getNext() != null){
     	    retstr+=a.getCargo();
	    a = a.getNext(); //Doesnt print last statement
	}
	return retstr;
    }


    public static void main(String[] args){
	QQKachoo<String> basic = new QQKachoo<String>();
	basic.add("I");
	basic.addFirst("have");
	System.out.println(basic);
    }
}
