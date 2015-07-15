package hu.prenex.osgi.example.aop.aspects;

import hu.prenex.osgi.example.aop.interfacing.LoggedMethod;

import hu.prenex.osgi.example.aop.PointCutLogger;

/**
 * This aspect logs on every enter/exit that 
 * happens on methods that are annotated by {@link LoggedMethod}
 * 
 * @author prenex
 */
public aspect AnnotatedMethodLoggerAspect {
	//Insert code before execution of every method that have the @LoggedMethod on it
  before() : (execution(* *.*(..)) || execution(*.new(..)))&& @annotation(LoggedMethod) {
  	PointCutLogger.enter(thisJoinPoint);
  }

	//Insert code after execution of every method that have the @LoggedMethod on it
  after() : (execution(* *.*(..)) || execution(*.new(..)))&& @annotation(LoggedMethod) {
  	PointCutLogger.exit(thisJoinPoint);
  }
}
