package webApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Umair
 **/

@Data
@Entity
public class Shift {

	private @Id @GeneratedValue long Id;
	private @Column(nullable = false) String shifts;

	private Shift() {
	}

	public Shift(String shifts) {
		this.shifts = shifts; 
	}
}