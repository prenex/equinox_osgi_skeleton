package hu.prenex.osgi.example.aop.interfacing;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * When a method is annotated with this and aspect weaving is enabled, every
 * enter/exit will be logged out!
 *
 * @author prenex
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LoggedMethod {
}
