# Deque Interface (by Square: Ricky Lin, Simon Tsui, Kyle Tau)

Our Deque interface contains all the methods of the java api. We will use doubly linked nodes as the containers for Deque, because nodes have pointers to the nodes next to them. It has more depth than an arraylist, which is just a list of elements next to each other. With arraylists, either enqueue or dequeue could be linear, or with the cloud method there would have to be a method deep copying the list. With nodes we do not need to do this. 

# To Do Plan:
0) Create class QQKachoo to implement Deque interface.
1) Implement size() method.
2) Implement all forms of add, remove, and get (and element() in place of get()).
3) Implement contains() method.
3.5) Check over implemented methods, make sure they are efficient.
4) Implement iterator-based methods.
5) Finish implementation. 

# Summary of Development Plan: 
0) Picked out which methods in the API are essential that we should implement first and which ones are variants on the old methods and/or are not necessary that we could implement later on if we have time.
1) Wrote out our rationale for picking our data structure and our to-do list
1) Created the Deque interface with all the methods commented out except for the current one that we're working on.
2) Created QQKachoo with the appropriate underlying container.
3) Develop and test an uncommented method until we're sure it works.
4) Repeat step 3 for the next uncommented method, which should be the next most important method, until all methods are successfully implemented. 
