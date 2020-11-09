
public abstract class House {
	
	protected Human owner;
	protected Area area;
	protected MessageManager messageManager;
	
	
	public abstract void passDay();
	
	
	public House(Human owner, Area area, MessageManager messageManager) {
		this.owner = owner;
		this.area = area;
		this.messageManager = messageManager;
	}
	
	public Human getOwner() {
		return owner;
	}
	
	public Area getArea() {
		return area;
	}
	
	public MessageManager getMessageManager() {
		return messageManager;
	}


	@Override
	public String toString() {
		return "House [owner=" + owner + ", area=" + area + ", messageManager=" + messageManager + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((messageManager == null) ? 0 : messageManager.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		House other = (House) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (messageManager == null) {
			if (other.messageManager != null)
				return false;
		} else if (!messageManager.equals(other.messageManager))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}
}
