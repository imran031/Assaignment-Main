package Practice_Assignment_Phase1;

public class ThreadCreation {
	

	public static class ThreadDemo implements Runnable {
	    public static int myCount = 0;
	    public ThreadDemo(){
	         
	    }
	    public void run() {
	        while(ThreadDemo.myCount <=6){
	            try{
	                System.out.println("Expl Thread: "+(++ThreadDemo.myCount));
	                Thread.sleep(1000);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 

       public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Starting of Main Thread...");
			System.out.println("Starting of Main Thread...");
			ThreadDemo mrt = new ThreadDemo();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(ThreadDemo.myCount <=6){
	            try{
	                System.out.println("Main Thread: "+(++ThreadDemo.myCount));
	                Thread.sleep(1000);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	 mrt = new ThreadDemo();
	        Thread t1 = new Thread(mrt);
	        t1.start();
	        while(ThreadDemo.myCount <= 2){
	            try{
	                System.out.println("Main Thread: "+(++ThreadDemo.myCount));
	                Thread.sleep(1000);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");


       }
	}
}




