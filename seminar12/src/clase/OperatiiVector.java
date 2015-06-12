package clase;

import java.util.ArrayList;

public class OperatiiVector {
	ArrayList<Integer> vector = new ArrayList<Integer>();;

	public OperatiiVector(ArrayList<Integer> vectorNou){
		if(vectorNou != null) {
			for(int i=0;i<vectorNou.size();i++)
			vector.add(vectorNou.get(i));
		}
		else
			vector = null;
	}
	
	public ArrayList<Integer> getVector() {
		return vector;
	}

	public void setVector(ArrayList<Integer> vector) {
		this.vector = vector;
	}

	//suma elementelor vectorului
	public int sumaElemente() {	
		if(vector == null){
			return 0;
		}
	  int result = 0;
	
	  for (int i = 0; i < vector.size(); i++) {
		  if(vector.get(i) == null)
			  return 0;
		  result += vector.get(i);
	  }
	  return result;
	}
	
	//numarul maxim si par din colectie
	public int maximPar() {
		if(vector == null)
			throw new NullPointerException();
	  int answer = Integer.MIN_VALUE;
	  for (int i = 0; i < vector.size(); i++) {
		  if(vector.get(i) == null)
			  throw new NullPointerException();
	      if (Math.abs(vector.get(i)) % 2 == 0 && vector.get(i) > answer) {
	    	  answer = vector.get(i);
	    }
	  }
	  return answer;
	}
	
	//mumarul minim din colectie
	public int arrayMinimum() {
		if(vector == null)
			throw new NullPointerException();
	  int indexOfMinimum = 0;
	  for (int i = 1; i < vector.size(); i++) {
		  if(vector.get(i) == null)
			  throw new NullPointerException();
	    if (vector.get(i) < vector.get(indexOfMinimum)) {
	      indexOfMinimum = i;
	    }
	  }
	  return vector.get(indexOfMinimum);
	}

}
