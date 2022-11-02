import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {
	private Set<HealthcareServiceable> members = new HashSet<HealthcareServiceable>();
	
	public void service() {
		for (HealthcareServiceable temp : members)
            temp.service();
	}
	public double getPrice() {
		double sum = 0;
		for (HealthcareServiceable temp : members)
			sum += temp.getPrice();
		return sum;
	}
	
	public void addMember(HealthcareServiceable worker) {
		members.add(worker);
	}
	public void removeMember(HealthcareServiceable worker) {
		members.remove(worker);
	}
}