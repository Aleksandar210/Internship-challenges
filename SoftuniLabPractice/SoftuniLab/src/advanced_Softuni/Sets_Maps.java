package advanced_Softuni;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.sun.javafx.webkit.KeyCodeMap.Entry;

public class Sets_Maps {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//usernameUnique();
		//repetingNumbers();
		//periodicTable();
		//occurence();
	}
	
	//----------------------------------------------------------------------
	static void occurence() {
		
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		enterSymbols(map,scan.nextLine());
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" ->"+entry.getValue());
		}
	}
	
	@SuppressWarnings("deprecation")
	static void enterSymbols(Map<Character,Integer> map,String word) {
		char c;
		for(int i =0;i<word.length();i++) {
			c = word.charAt(i);
			if(!Character.isSpace(c)) {
				Optional<Integer> opt = Optional.ofNullable(map.get(c)) ;
				if(opt.isPresent()) {
					map.put(c,map.get(c)+1);
				}else {
					map.put(c, 1);
				}
			}
		}
	}
	//----------------------------------------------------------------------
	
	

	
	//----------------------------------------------------------------------
	static void periodicTable() {
		int numberElements = Integer.parseInt(scan.nextLine());
		Set<String> elems= new HashSet<String>(numberElements);
		while(numberElements>0) {
			
		String enterElements = scan.nextLine();
		String[] dataCollected = enterElements.split("\\s");
		
		if(elems.isEmpty()) {
			elems = Arrays.stream(dataCollected).collect(Collectors.toSet());
		}else {
			addToSetNoOvveride(elems,dataCollected);
		}
		
		numberElements--;
		
		}
		
		System.out.println(elems);
	}
	
	static void addToSetNoOvveride(Set<String> set, String[] arr) {
		for(String elem:arr) {
			set.add(elem);
		}
	}
	
	//----------------------------------------------------------------------
	
	
	
	
	//----------------------------------------------------------------------
	static void repeatingNumbers() {
		int setOne = Integer.parseInt(scan.nextLine());
		int setTwo = Integer.parseInt(scan.nextLine());
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		int sumCapacity =0;
		while(sumCapacity<setOne+setTwo) {
			int addNumber = Integer.parseInt(scan.nextLine());
			if(sumCapacity<setOne) {
				set1.add(addNumber);
			}else {
				set2.add(addNumber);
			}
		}
		
		Set<Integer> repeating = new HashSet<Integer>(set1);
		repeating.retainAll(set2);
		System.out.println(repeating);
	}
	//----------------------------------------------------------------------
	
	
	
	
	
	
	
	
	//----------------------------------------------------------------------
	static  void usernameUnique() {
		Set<String> usernames = new HashSet<String>();
		
		String enterUsername;
		int numberUsernames = Integer.parseInt(scan.nextLine());
	
		while(numberUsernames>0) {
			
			try {
				enterUsername = scan.nextLine();	
			}catch(NullPointerException exception){
				continue;
			}
			numberUsernames--;
			
		}
		
		
	}
	//----------------------------------------------------------------------
	
	

}
