
public class Spruts extends Human {
	
	
	
	public Spruts (MessageManager messageManager) {
		super(messageManager);
	}
	
	
	public String getName() {
		return "Spruts";
	}
	
	public void cleanUp(Area area) {
		messageManager.print("I'm Lazy");
	}
	
	public void washTheDishes(Area area) {
		messageManager.print("I'm Lazy");
	}
	
	public void eat(Area area) {
		
		
		String[] foodTypes = {"porridge", "stake", "coffee", "potato"};
		int randomInt = (int) (Math.random()*(4 - 1)); // 3 - это кол-во элементов в foodTypes
		
		messageManager.print("Spruts wants to eat/drink...");
		messageManager.print(foodTypes[randomInt]);
		
		
		switch (randomInt) {
			case (0):
				area.addItem(new Dishes("pan"));
				area.addItem(new Dishes("spoon"));
				break;
			case (1):
				area.addItem(new Dishes("fork"));
				area.addItem(new Dishes("knife"));

			case (3):
				area.addItem(new Dishes("cup"));
				area.addItem(new Dishes("spoon"));
				break;
			case (4):
				area.addItem(new Dishes("skillet"));
				area.addItem(new Dishes("spatula"));
				break;
		}
		
		
	}


	@Override
	public String toString() {
		return "Spruts [messageManager=" + messageManager + "]";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
