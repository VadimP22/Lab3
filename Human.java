
public abstract class Human {
	
	protected MessageManager messageManager;
	
	public Human(MessageManager messageManager) {
		this.messageManager = messageManager;
	}
	
	
	public abstract void eat(Area area);
	
	public abstract void cleanUp(Area area);
	
	public abstract void washTheDishes(Area area);
	
	public abstract String getName();


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((messageManager == null) ? 0 : messageManager.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (messageManager == null) {
			if (other.messageManager != null)
				return false;
		} else if (!messageManager.equals(other.messageManager))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Human [messageManager=" + messageManager + "]";
	}
	
}
