
public class Die {
	private final int DEFAULT_NUM_FACES = 6;
	private int faceValue; // current value of the dice
	private int numFaces; // number of faces on the dice

    public Die() {
        numFaces = DEFAULT_NUM_FACES; 
        roll(); 

    } // end of Die() constructor

    public Die(final int faces) { //creates die with user defined number of faces and rolls die
        numFaces = faces;
        roll();

    }// end of Die(int) constructor

    public Die(int value, int faces) { //creates die with user defined number of faces value
        faceValue = value;
        numFaces = faces;

    } // end of Die(int, int) constructor

    public Die(final Die d1) { // exact copy of another Die
        this.faceValue = d1.faceValue;
        this.numFaces = d1.numFaces;

    } // end of Die(Die) constructor

    public int getFaceValue() {
        return faceValue;

    }// end of getFaceValue method

    public int getNumFaces() {
        return numFaces;

    } // end of getNumFaces method

    public void setFaceValue(final int value) {
		faceValue = value;
		
	}//end of setFaceValue method
	
	public void roll() {
		faceValue = (int) ((Math.random() * numFaces) + 1);
		
	}//end of roll method
	
	public String toString() {
		return(Integer.toString(faceValue));
		
	} //end of toString method
} //end of Die class
