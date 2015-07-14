package hu.prenex.osgi.test;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(immediate = true, service = { TestComponent.class })
public class TestComponent {

	@Activate
	public void activate() {
		System.out.println("Component activated!");
	}

	@Deactivate
	public void deactivate() {
		System.out.println("Component deactivated!");
	}
}
