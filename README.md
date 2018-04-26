# Deque Interface (by Square: Ricky Lin, Simon Tsui, Kyle Tau)

Our Deque interface contains all the methods of the java api. We will use doubly linked nodes as the containers for Deque, because nodes have pointers to the nodes next to them. It has more depth than an ArrayList, which is just a list of elements next to each other, because you have easy references to the beginning and end of the collection. With ArrayLists, either enqueue or dequeue could be linear, or with the cloud method there would have to be a method deep copying the list. With nodes we do not need to do this. 

# To Do Plan:
0) ~~Create class QQKachoo to implement Deque interface.~~ 
1) ~~Implement size() method. ~~
2) ~~Implement all forms of add.~~
3) ~~Implement all forms of remove~~
4) ~~Implement all forms of get~~
5) ~~Implement element~~
6) ~~Implement contains() method.~~
7) ~~Override toString~~
8) ~~Check over implemented methods, make sure they are efficient.~~
9) ~~Exception handling~~
10) ~~Finish implementation.~~ 

# Summary of Development Plan: 
0) Picked out which methods in the API are essential that we should implement first and which ones are variants on the old methods and/or are not necessary that we could implement later on if we have time.  (Check)
1) Wrote out our rationale for picking our data structure and our to-do list.  (Check)
1) Created the Deque interface with all the methods commented out except for the current one that we're working on.
2) Created QQKachoo with the appropriate underlying container.  (Check)
3) Develop and test an uncommented method until we're sure it works. (Check)
4) Repeat step 3 for the next uncommented method, which should be the next most important method, until all methods are successfully implemented. 

# Changes: 
- Used white space better for style
- Added more comments 
- Fixed methods that were not working properly 
- Fixed readMe to be more clear 
- Gave better variable names 
- Added exception-handling 
