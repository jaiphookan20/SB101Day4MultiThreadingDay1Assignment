
public class MultiThread {
	
	//Q1)Make a thread that will calculate a product of 1
//  to 10 and another thread (main thread ) will print
//  the calculated value of the first thread.
	
	public static void main(String[] args) {
		
		/* Thread 1 */
		Thread t1 = new Thread(new Runnable() {
		      @Override
		      	public void run() {
		    	  int product = 1;
		    	  for(int i = 1; i <= 10; i++) {
			          product *= i;
		    		  System.out.println(product);
		    	  }
		      }
		  });
		
		/* Thread 2 */
		Thread t2 = new Thread(new Runnable() {
		      @Override
		      public void run() {
		          t1.start();
		      }
		  });
		  t2.start();
		}


}





/* 
Q1)
Make a thread that will calculate a product of 1
to 10 and another thread (main thread ) will print
the calculated value of the first thread.

Q2) Explain the Thread Life Cycle in Java with your
own words.

Q3)

Create a thread which prints 1 to 10. 
After printing 5, there should be a delay of 5000 milliseconds before printing 6
 * */
 


