package assessment;

/**
 * <h1>PPA assignment 11 </h1> <br>
 * Computer Science <br>
 * Year 1 
 * <p>
 * This class represents a banker, a type of person
 * 
 * @author Anton Pashov(k1631446), Wonjoon Seol (k1631098)
 */
public class Person implements Comparable<Person>{
	private String name;
	private int friendliness;

	/**
	 * Constructor Person constructs with String name and friendliness value when initialised
	 * 
	 * @param name String variable, holding the name of the person
	 * @param friendliness int variable, holding the person's friendliness
	 */
	public Person(String name, int friendliness){
		this.name = name;
		this.friendliness = friendliness;
	}
	
	/**
	 * This method overrides the default toString method from class object 
	 * {@inheritDoc}
	 * @return String returns the String representation of the object, that can be directly printed
	 */	
	@Override
	public String toString(){
		return "name: " + name + ", friendliness: " + friendliness;
	}
	
	/**
	 * The method CompareTo overrides the default compareTo method from interface Comparable
	 * This method compares two names and return -1, 0, 1, if the current object is less than, equal to, greater than the supplied object alphabetically
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * 
	 * {@inheritDoc}
	 * 
	 * @return int returns integer in the range [-1;1], indicating the result of the comparing
	 */
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}	
	
	/**
	 * The method getFriendliness returns friendliness
	 * 
	 * @return int returns the friendliness of the person
	 */
	public int getFriendliness(){
		return friendliness;
	}
	
	/**
	 * This method getName returns name
	 * 
	 * @return String returns the person's name
	 */
	public String getName(){
		return name;
	}
}
