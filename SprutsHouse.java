
public class SprutsHouse extends House {
	
	public SprutsHouse(Human owner, Area area, MessageManager messageManager) {
		super(owner, area, messageManager);
	}

	@Override
	public void passDay() {
		messageManager.print(owner.getName() + " has a breakfask");
		getOwner().eat(getArea());
		
		messageManager.print(owner.getName() + " has a lunch");
		getOwner().eat(getArea());
		
		messageManager.print(owner.getName() + " has a dinner");
		getOwner().eat(getArea());
		
		
		
		area.printStatus(messageManager);
		messageManager.print(owner.getName() + " tries to wash the dishes...");
		owner.washTheDishes(area);
		messageManager.print(owner.getName() + " tries to clean up...");
		owner.cleanUp(area);
		
	}

	@Override
	public String toString() {
		return "SprutsHouse [owner=" + owner + ", area=" + area + ", messageManager=" + messageManager + "]";
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
