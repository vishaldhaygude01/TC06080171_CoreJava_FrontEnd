import java.lang.*; 
class NewThread extends Thread  
{ 
    NewThread(String threadname, ThreadGroup tgob) 
    { 
        super(tgob, threadname); 
        start(); 
    } 
public void run() 
    { 
  
        for (int i = 0; i < 1000; i++)  
        { 
            try 
            { 
                Thread.sleep(1000); 
            } 
            catch (InterruptedException ex)  
            { 
                System.out.println("Exception encounterted"); 
            } 
        } 
    } 
}  
public class ThreadGroupDemo  
{ 
    public static void main(String arg[]) 
    { 
       
        ThreadGroup gfg = new ThreadGroup("Parent"); 
        ThreadGroup gfg1 = new ThreadGroup(gfg ,"Child");
  
        NewThread t1 = new NewThread("one", gfg); 
        System.out.println("Starting one"); 
        NewThread t2 = new NewThread("two", gfg1); 
        System.out.println("Starting two");
        NewThread t3 = new NewThread("three", gfg); 
        System.out.println("Starting three"); 	
  
 
        System.out.println("number of active thread: "
                           + gfg.activeCount()); 
        System.out.println(gfg1.activeGroupCount());
        gfg.list();
    } 
} 