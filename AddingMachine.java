/*
 * Name: Sivanarayana Nagulapati
 * class ID: 1213080048
 * Assignment number: 2

*/



package cse360assign2;
/* creating a class AddingMachine
 * 
 * and declaring two private variables
 */

public class AddingMachine {
	
    private int total;// deaclaring a private variable total
	
	private String history;// decalring a private String history
	
	/*
	 * Creating a constructor and initializing 
	 * values to the variables declared
	 * 
	 */
	
	public AddingMachine() {
		total=0;// declaring total to zero
		history="0";// declaring history to null
		
	}
	/*
	 * creating a method add
	 * @param value adding this value to the total and history
	 */
	
    public void add(int value) {
        total += value;// adding total to total and value
        history += " + " + value; // Concatenating  history to value
    }
    /*
	 * creating a method subtract to subtract the value
	 * @param value adding this value to the total and history
	 */
    public void subtract(int value) {
        total -= value;// subtracting value from total
        history += " - " + value;// concatenating history to the value
    }
    /*
     * creating a method getTotal
     * to return the total value
     * 
     */
    public int getTotal(){
  
    	return total;
    	
    	
    }
    /*
     * crating method toSrtring to return the string value
     */
    public String toString () {
    
    	return history;
    	
    }
    /*
     * creating a method clear
     * and initializing total and history to zero
     */
    public void clear() {
    	total=0;
		history="0";
		
    	
 }
     

}