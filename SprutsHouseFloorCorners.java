import java.util.Arrays;

public class SprutsHouseFloorCorners implements Area {

	private String[] itemTypes; 
	private int countOfElements = 0;
	
	private void checkAndAddToArray(Item item) {
		
		if (countOfElements == 0) {
			itemTypes = new String[1];
			itemTypes[0] = item.getTypeName();
			countOfElements = countOfElements + 1;
			return;
		}
		
		String[] newArray = new String[countOfElements + 1];
		
		for (int i = 0; i < itemTypes.length; i++ ) {
			
			newArray[i] = itemTypes[i];
			
			if (item.getTypeName().equalsIgnoreCase(itemTypes[i])) {
				return;
			}
			
		}
		
		newArray[countOfElements] = item.getTypeName();
		itemTypes = newArray;
		
		countOfElements = countOfElements + 1;
	}
	
	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		checkAndAddToArray(item);
	}

	@Override
	public void removeItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStatus(MessageManager messageManager) {
		// TODO Auto-generated method stub
		messageManager.print("There are mountains of garbage:");
		//messageManager.print(itemTypes.length);
		//messageManager.print(countOfElements);
		for (int i = 0; i < itemTypes.length; i++) {
			messageManager.print(itemTypes[i]);
		}
	}

	@Override
	public String toString() {
		return "SprutsHouseFloorCorners [itemTypes=" + Arrays.toString(itemTypes) + ", countOfElements="
				+ countOfElements + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countOfElements;
		result = prime * result + Arrays.hashCode(itemTypes);
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
		SprutsHouseFloorCorners other = (SprutsHouseFloorCorners) obj;
		if (countOfElements != other.countOfElements)
			return false;
		if (!Arrays.equals(itemTypes, other.itemTypes))
			return false;
		return true;
	}
	
	


}
