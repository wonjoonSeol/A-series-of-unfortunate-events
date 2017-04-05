package assessment;

import java.util.Collections;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * <h1>PPA assignment 11 </h1> <br>
 * Computer Science <br>
 * Year 1 
 * <p>
 * This class represents a characteristics of a person
 * 
 * @author Anton Pashov(k1631446), Wonjoon Seol (k1631098)
 */
public class Banker extends Person {					// Banker inherits from the Person class
		
	private TreeMap<Person, Integer> list;			// Use treemap because the relatives are sorted alphabetically
	/**
	 * Constructor Banker constructs with name and friendliness, just the same as a Person, but also with a list of relatives
	 * 
	 * @param name String variable, holding the name of the person
	 * @param friendliness int variable, holding the person's friendliness
	 */
	public Banker(String name, int friendliness){
		super(name, friendliness);
		list = new TreeMap<Person, Integer>();
	}
	
	/**
	 * This method select relatives based on its distance 
	 * 
	 * @return Person returns the closest relative from the list
	 */
	public Person selectRelative(){
		
		int min = Collections.min(list.values());
		return findKey(min);
	}
	
	/**
	 * This method overrides default toString method in class Object
	 * {@inheritDoc}
	 * 
	 * @return returns the String representation of the object, that can be directly printed
	 */
	@Override
	public String toString(){
		String string = "The list of relatives: ";
		for (Entry<Person, Integer> entry : list.entrySet()) {
			string += "name : " + entry.getKey().getName() + ", distance : " + entry.getValue() + "; ";
		}
		
		return super.toString() + "\n" + string;
		
	}
	
	/**
	 * This method adds supplied person and value to treemap
	 * @param person	relative
	 * @param value 	friendliness value of a person
	 */
	public void addList(Person person, int value){
		list.put(person, value);
	}
	
	/**
	 * The private method findKey finds the key from the value supplied.
	 * 
	 * @param value	friendliness value of the relative to be found
	 * @return		Person matching the friendliness value
	 */
	private Person findKey(int value){
		for (Person person : list.keySet()){
			if (list.get(person) == value){
				return person;
			}
		}
		return null;
	}

	/**
	 * This method removes a person from the list
	 * @param person	person to remove from the list
	 * @return 			boolean value to show whether the operation is successful
	 */
	public boolean removePersonFromList(Person person){
		if (list.containsKey(person)){			
			list.remove(person);
			return true;
		}
		return false;
	}
	
	/**
	 * This method checks whether the list is empty
	 * @return	boolean value to show whether the list is empty
	 */
	public boolean isListEmpty(){
		return list.isEmpty();
	}

}
