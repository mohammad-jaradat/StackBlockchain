
package blockchain2;

/**
 *
 * @author mjaradat
 */
public class Stack {
    
  //store elements of stack
  private int arrData[];
  
  // represent top of stack
  private int top;
  
 // total capacity of the stack
  private int capacity;

  // Creating a stack
  Stack(int size) {
    // initialize the array
    // initialize the stack variables
    arrData = new int[size];
    capacity = size;
    top = -1;
  }

  // push elements to the top of stack
  /*** TODO3-1  implement the push method, when new integer is added we need to check first if the stack is not full to insert this new element to our arrData  ***/
  public void push(int x) {
     return ;
  }

  // pop elements from top of stack
    /*** TODO3-2  implement the pop method, when we use pop method here we need to check first if the stack is not empty and remote the element from the top of the stack arrData and return it ***/
  public int pop() {

    return 0;
  }

  // return size of the stack
  public int getSize() {
    return top + 1;
  }

  // check if the stack is empty
  public Boolean isEmpty() {
    return top == -1;
  }

  // check if the stack is full
  public Boolean isFull() {
    return top == capacity - 1;
  }

  // display elements of stack
  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.print(arrData[i] + ", ");
    }
  }
}
