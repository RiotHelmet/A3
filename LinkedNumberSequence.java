// LinkedNumberSequence.java

/****************************************************************

LinkedNumberSequence represents a sequence of real numbers.
Such a sequence is defined by the interface NumberSequence.
The class uses linked nodes to store the numbers in the sequence.

Author
Fadil Galjic

****************************************************************/

public class LinkedNumberSequence implements NumberSequence
{
	private class Node
	{
		public double number;
		public Node next;

		public Node (double number)
		{
			this.number = number;
			next = null;
		}
	}

	// the first node in the node-sequence
    private Node first;

    // create the sequence
    public LinkedNumberSequence (double[] numbers)
    {
		if (numbers.length < 2)
		    throw new IllegalArgumentException("not a sequence");

        first = new Node(numbers[0]);
        Node n = first;
		for (int i = 1; i < numbers.length; i++)
		{
			n.next = new Node(numbers[i]);
			n = n.next;
		}
	}

    // toString returns the character string representing this
    // sequence
	public String toString ()
	{
		String s = "";
		Node n = first;
		while (n.next != null)
		{
		    s = s + n.number + ", ";
		    n = n.next;
		}
		s = s + n.number;

		return s;
	}

    // add code here
 
    public double upperBound() {

		double max = Double.NEGATIVE_INFINITY;

		for (Node currentNode = first; currentNode != null; currentNode = currentNode.next) {
			max = (currentNode.number > max ? currentNode.number : max );
		}

        return max;
	}

	public double[] asArray() {
		int length = length();

		Node currentNode = first;

		double[] array = new double[length];

		for (int i = 0; i < length; i++) {
			array[i] = currentNode.number;
			currentNode = currentNode.next;
		}

		return array;
	}

	public int positionOf(double number) {

		int i = 0;

		for (Node currentNode = first; currentNode != null; currentNode = currentNode.next, i++) {
			if(currentNode.number == number) {
				return i;
			}
		}

        return -1;
	}

	public boolean contains(double number) {

		for (Node currentNode = first; currentNode != null; currentNode = currentNode.next) {

			if(currentNode.number == number) return true;
        }

        return false;
	}

	public int length() {

        int i = 0;
		for (Node currentNode = first; currentNode != null; currentNode = currentNode.next, i++);

        return i;
	}

	public boolean isDecreasing() {
		
		for (Node currentNode = first; currentNode != null; currentNode = currentNode.next) {
			if(currentNode.next.number < currentNode.number) return false;
        }

        return true;
	}

	public boolean isIncreasing() {

		for (Node currentNode = first; currentNode != null; currentNode = currentNode.next) {

			if(currentNode.next.number > currentNode.number) return false;
        }

        return true;
	}

	public void removeAt(int position) throws IndexOutOfBoundsException, IllegalStateException{

		int len = length();

		if(position >= len) {
			throw new IndexOutOfBoundsException();
		}
		if(len == 2) {
			throw new IllegalStateException();
		}

		Node currentNode = first;

		for (int i = 0; i < position - 1; i++, currentNode = currentNode.next);

		currentNode.next = currentNode.next.next;

	}

	public void insert(int position, double number) throws IndexOutOfBoundsException {

		if(position >= length()) {
			throw new IndexOutOfBoundsException();
		}

		Node currentNode = first;

		for (int i = 0; i < position - 1; i++, currentNode = currentNode.next);

		Node nextNode = currentNode.next;

		currentNode.next = new Node(number);
		currentNode.next.next = nextNode;

	}

	public double numberAt(int position) throws IndexOutOfBoundsException{

		if(position >= length()) {
			throw new IndexOutOfBoundsException();
		}

		int i = 0;

		for (Node currentNode = first; currentNode != null; currentNode = currentNode.next, i++) {
			
			if(i == position) {
				return currentNode.number;
			}
		}

        return 0;
	}

	public double lowerBound() {

		double min = Double.POSITIVE_INFINITY;

		for (Node currentNode = first; currentNode != null; currentNode = currentNode.next) {

			min = (currentNode.number < min ? currentNode.number : min );
			
        }

        return min;
	}

	public void add(double number) {
		Node currentNode = first;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
		currentNode.next = new Node(number);
	}
    
}