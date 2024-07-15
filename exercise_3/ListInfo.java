package lesson7.exercise_3;

import java.util.ArrayList;
import java.util.List;

public class ListInfo {
	List<String> list = new ArrayList<>();
	MyStringList strList = new MyStringList();

	public static void main(String[] args) {
		ListInfo li = new ListInfo();
		li.process();
		for(String string: li.list) {
			System.out.println(string);
		}
		System.out.println("List is");
	}
	
	public void process() {
		list.add("A");
		list.add("W");
		list.add("K");
		list.add("C");
	}





}
