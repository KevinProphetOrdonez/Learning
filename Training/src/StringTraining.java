
public class StringTraining {
	
	private String string = "123456";
	private String palindrone = "tacocat";
	
	public void ReverseString() {
		
		char[] charString = string.toCharArray();
		
		for(int i = 0; i < charString.length/2; i++) {
			
			char temp = charString[i];
			charString[i] = charString[charString.length - i - 1];
			charString[charString.length - i - 1] = temp;
			
				
			}
		string = new String(charString);
		System.out.println(string);
		}
	public boolean DetectPalindrone() {
		char[] charArray = palindrone.toCharArray();
		int head = 0;
		int tail =charArray.length - 1;
		
		while (tail > head) {
			if (charArray[head] != charArray[tail]){
				System.out.println("Not a Palidrone");
				return false;
			}
			++head;
			--tail;
		}
		System.out.println("Is a Palidrone");
		return true;
	}
	

}

