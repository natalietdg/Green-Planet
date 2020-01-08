import java.util.HashMap;
public class AnswerSequence {
	HashMap<String, Integer> sequence = new HashMap<String, Integer>();
	public AnswerSequence() {
		sequence.put("a", 0);
		sequence.put("b", 1);
		sequence.put("c", 2);
		sequence.put("d", 3);	
	}
	
	public HashMap<String, Integer> getSequence(){		
		return sequence;
	}	
}
