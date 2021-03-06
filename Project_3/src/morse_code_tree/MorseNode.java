package morse_code_tree;

public class MorseNode {
	// data fields
	public char label;
	public String mCode;
	public MorseNode left, right;

	// constructors
	public MorseNode() {} // default

	public MorseNode(char a, String newCode) {
		label = a;
		mCode = newCode;
	}

	public MorseNode(char a, String newCode, MorseNode leftChild, MorseNode rightChild) {
		label = a;
		mCode = newCode;
		left = leftChild;
		right = rightChild;
	}
}