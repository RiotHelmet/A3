// ArrayNumberSequence.java

/****************************************************************

ArrayNumberSequence represents a sequence of real numbers.
Such a sequence is defined by the interface NumberSequence.
The class uses an array to store the numbers in the sequence.

Author
Fadil Galjic

****************************************************************/

public class ArrayNumberSequence implements NumberSequence
{
	// numbers in the sequence
    private double[] numbers;

    // create the sequence
    public ArrayNumberSequence (double[] numbers)
    {
		if (numbers.length < 2)
		    throw new IllegalArgumentException("not a sequence");

		this.numbers = new double[numbers.length];
		for (int i = 0; i < numbers.length; i++)
		    this.numbers[i] = numbers[i];
	}

    // toString returns the character string representing this
    // sequence
	public String toString ()
	{
		String s = "";
		for (int i = 0; i < numbers.length - 1; i++)
		    s = s + numbers[i] + ", ";
		s = s + numbers[numbers.length - 1];

		return s;
	}

	public double upperBound() {
		double max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			max = (max > numbers[i]) ? max : numbers[i];
		}
		return max;
	}

	public double[] asArray() {
		return numbers;
	}

	public int positionOf(double number) {
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == number) return i;
		}
		return -1;
	}

	public boolean contains(double number) {
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == number) return true;
		}
		return false;
	}

	public int length() {
		return numbers.length;
	}

	public boolean isDecreasing() {
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] > numbers[i - 1]) return false;
		}
		return true;
	}

	public boolean isIncreasing() {
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] < numbers[i - 1]) return false;
		}
		return true;
	}

	public void removeAt(int position) throws IndexOutOfBoundsException, IllegalStateException{
		if(position >= numbers.length) throw new IndexOutOfBoundsException();
		if(numbers.length <= 2) throw new IllegalStateException();

		double[] newList = new double[numbers.length - 1];

		for (int i = 0; i < numbers.length; i++) {
			newList[i + ((i <= position) ? 0 : -1)] = numbers[i];
		}

		numbers = newList;
	}

	public void insert(int position, double number) throws IndexOutOfBoundsException {

		if(position >= numbers.length) throw new IndexOutOfBoundsException();

		double[] newList = new double[numbers.length + 1];

		for (int i = 0; i < numbers.length; i++) {
			newList[i + ((i < position) ? 0 : 1)] = numbers[i];
		}

		newList[position] = number;
		numbers = newList;
	}

	public double numberAt(int position) throws IndexOutOfBoundsException{

		if(position >= numbers.length) throw new IndexOutOfBoundsException();

		return numbers[position];
	}

	public double lowerBound() {
		double min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			min = (min < numbers[i]) ? min : numbers[i];
		}
		return min;
	}

	public void add(double number) {

		double[] newList = new double[numbers.length + 1];

		for (int i = 0; i < numbers.length; i++) {
			newList[i] = numbers[i];
		}

		newList[numbers.length] = number;
		numbers = newList;
	}

}