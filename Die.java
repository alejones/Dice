
public class Die {
	private final int DEFAULT_NUM_FACES = 6;
	private int faceValue;
	private int numFaces;
	
	public Die() {
		numFaces = DEFAULT_NUM_FACES;
		faceValue = DEFAULT_NUM_FACES;
		
	} //end of Die() constructor
	
	public Die (int value) {
		faceValue = value;
		numFaces = DEFAULT_NUM_FACES;
		
	}// end of Die(int) constructor
	
	public Die(int value, int faces) {
		faceValue = value;
		numFaces = faces;
		
	} //end of Die(int, int) constructor
	
	public Die(Die d1) {
		this.faceValue = d1.faceValue;
		this.numFaces = d1.numFaces;		
		
	} //end of Die(Die) constructor
	
	public int getFaceValue() {
		return faceValue;
		
	}//end of getFaceValue method
	
	public int getNumFaces() {
		return numFaces;
		
	} //end of getNumFaces method
	
	public void setFaceValue(int value) {
		faceValue = value;
		
	}//end of setFaceValue method
	
	public void roll() {
		faceValue = (int) ((Math.random() * numFaces) + 1);
		
	}//end of roll method
	
	public String toString() {
		return(Integer.toString(faceValue));
		
	} //end of toString method
} //end of Die class
