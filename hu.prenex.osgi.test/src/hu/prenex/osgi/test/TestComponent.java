package hu.prenex.osgi.test;

import hu.prenex.osgi.example.aop.interfacing.LoggedMethod;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(immediate = true, service = { TestComponent.class })
public class TestComponent {

	@Activate
	public void activate() {
		System.out.println("Component activated!");
		System.out.println("5+3=" + this.testMethod(5, 3));
	}

	@Deactivate
	public void deactivate() {
		System.out.println("Component deactivated!");
	}

	@LoggedMethod
	public int testMethod(int a, int b) {
		return a + b;
	}

}
