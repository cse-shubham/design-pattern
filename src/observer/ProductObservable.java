package observer;

import java.util.List;

public class ProductObservable {
	
	private SubscribersRepository subscribersRepository = new SubscribersRepository();
	
    public void addSubscriber(Subscriber subscriber) {
    	subscribersRepository.addSubscriber(subscriber);
    }
    
    public void removeSubscriber(Long id) {
    	subscribersRepository.removeSubscriber(id);
    }
    
    public void update() {
    	// calls for all values from db and send data to the API
    	List<Subscriber> list = subscribersRepository.findAll();
    	for(Subscriber s : list) {
    		//common update method to the API
    	}
    }
}
