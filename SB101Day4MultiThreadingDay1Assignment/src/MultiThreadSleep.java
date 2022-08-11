
public class MultiThreadSleep {

	
	public static void main(String[] args) {
		
		Thread th= new Thread(new Runnable() {
		  @Override
		  public void run() {
		      
			  for(int i = 1; i <= 10; i++) {
		          System.out.println(i);
		          
		          if(i == 5){
		              try {
		                  Thread.sleep(6000);
		              } 
		              
		              catch (InterruptedException e) {
		                  throw new RuntimeException(e);
		              }
		          }
		      }
		  }
		  
		});
		
		th.start();
	}

}



//Q3)Create a thread which prints 1 to 10.After
//printing 5, there should be a delay of 5000
//milliseconds before printing 6




