
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import com.spring.kalai.topic.UserTes;



class Runnertes {
	public static void main(String args[]) {
		org.junit.runner.Result r=JUnitCore.runClasses(UserTes.class);
		
		for(Failure f: r.getFailures()) {
			System.out.println(f.toString());
		}
		
		System.out.println(r.wasSuccessful());
			
		
	}
	

}
