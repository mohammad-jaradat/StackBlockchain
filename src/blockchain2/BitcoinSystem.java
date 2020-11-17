package blockchain2;


import java.util.*;
public class BitcoinSystem {

    Queue<String> linesQueue;
    Stack stack;
    String studentName;
    String studentId;
    
    
      //TODO-0 initialze the constructore
    public BitcoinSystem(String studentName,String studentId){
      this.linesQueue = new LinkedList<String>();
      this.stack =new Stack(30);
      this.studentName=studentName;
      this.studentId=studentId;
    }
    
        
    
    /*** TODO-1 implement the read from file, read all lines within the file attached (the file is in the task in eclass) and add all lines to the queue already defined in this class with name linesQueue   ***/
    public  Queue<String> readBlocksFile(){
       return null;
    }

    
    /*** TODO-3 now iterate in all lines within the LinesQueue already defined in this class and do the tokenizer in each line with | operator then add the result number to the stack
     for example of the string is 546|65765|87768 then the stack will have three integers [546, 65765,87768 ]
     ***/
    public void addToStack(){
        ;
    }

    
    /*** TODO-4 now pop the stack from its items and sum all integers within mentioned stack
     ***/
    public void SumAllStackNumbers(){
        int sum=0;
        
        ///add the needed lines here
        
        Utiltiy.printInfo(this.studentName,this.studentId,sum);
    }
     
}
