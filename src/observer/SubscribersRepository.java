package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubscribersRepository {
	
	List<Subscriber> subscriberList = new ArrayList<>();
	
	public void addSubscriber(Subscriber subscriber) {
		subscriberList.add(subscriber);
	}
	
	public void removeSubscriber(Long id) {
		Subscriber subs = subscriberList.stream()
				 .filter(it -> it.getId().equals(id))
				 .findAny().orElse(null);
		if(subs != null) {
			subs.setActive(false);
		}
	}
	
	public List<Subscriber> findAll(){
		return subscriberList.stream()
				.filter(Subscriber :: isActive)
				.collect(Collectors.toList());
	}

}
