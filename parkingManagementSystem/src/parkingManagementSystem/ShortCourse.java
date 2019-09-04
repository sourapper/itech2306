package parkingManagementSystem;

/**
 * @author hardev singh

 */
public class ShortCourse extends Course {

	public ShortCourse(String _name, int _numDaysRunning){
		super(_name, _numDaysRunning);
	}

	@Override
	public String toString() {
		return ("Short " + super.toString());
	}
}//end ShortCourse