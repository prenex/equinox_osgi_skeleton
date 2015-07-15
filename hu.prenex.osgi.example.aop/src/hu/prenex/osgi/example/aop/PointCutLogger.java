package hu.prenex.osgi.example.aop;

import org.aspectj.lang.JoinPoint;

/**
 * This is a POJO that has some static helper methods for logging out
 * information about a pointcut. This is used on enter and exit. In my opinion
 * the best approach is to make AspectJ pointcut bodies only contain the least
 * direct java code that is possible and let them delegate the work to static
 * methods like these.
 *
 * @author prenex
 */
public class PointCutLogger {

	public static void enter(JoinPoint thisJoinPoint) {
		// The join point can be used to get information
		// about where our pointcut happened (method name etc.)
		System.err.println("ENTER: " + thisJoinPoint);
	}

	public static void exit(JoinPoint thisJoinPoint) {
		// The join point can be used to get information
		// about where our pointcut happened (method name etc.)
		System.err.println("EXIT: " + thisJoinPoint);
	}
}
