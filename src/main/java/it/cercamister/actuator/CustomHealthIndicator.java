package it.cercamister.actuator;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		try {
			Set<String> downMessages = downMessages();
			
			if (downMessages.size()>0) {
				return Health
					   .down()
					   .withDetail("Ci sono trovate problemi sull'applicazione : ", downMessages.toString())
					   .build();
			}else {
				return Health.up().build();
			}
			
		}catch(Exception ex) {
			return Health.down(ex).build();
		}
	}
	
	private Set<String> downMessages() {
		// Metodo d'implementare per controllare cose anomale
		
		 return new HashSet<>();
	}
}
