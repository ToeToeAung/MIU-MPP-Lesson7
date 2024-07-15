package lesson7;

public interface StringList {
		
	String[] strArray();
	int size();
	void incrementSize();
	
	/** Adds a string to the end of the list */
	//public void add(String s);
	default public void add(String s){
		//sint size;
	//	strArray[size] = s;
		//size++;
	}
	
	/** Gets the i_th string in the list */
	//public String get(int i){}
	default public void get(int i){

	}

	default public void duplicate(){
		String[] originalArray= strArray();
		String[] newArray= new String[originalArray.length];

	 	System.arraycopy(originalArray,0,newArray,0,size());

	}


	
}
