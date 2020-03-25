package TestNGSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestOrderRandomizer implements IMethodInterceptor {
  /*this method used for adhoc or monkey testing in order to see how order taking less optium time 
   * then hardcode same seed in the code
   * Collections.shuffle(methods, new Random(224237970696000L));
   */
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		long seed = System.nanoTime();
		System.out.println(String.format("Randomizing order of tests with seed: %s", seed));
		Collections.shuffle(methods, new Random(seed));
		return methods;

	}
/*
 * this method used only priority ==1 tC should be executed 	
 */
	
//	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
//		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
//		for (IMethodInstance method : methods) {
//		Test testMethod = method.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
//			if (testMethod.priority() == 1) 
//			{				result.add(method);
//			}
//		}
//		return result;
//	}

}
