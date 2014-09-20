import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//import java.util.*;

public class SecureSystem {
	ReferenceMonitor yes = new ReferenceMonitor();
	ArrayList<SecureSubject> subjects = new ArrayList<SecureSubject>();
	
	public void createSubject(String name, Integer level){
		
		this.subjects.add(new SecureSubject(name,level,0));
	}
	public ReferenceMonitor getReferenceMonitor(){
		return this.yes;
	}
	public void printState(){
		
	}
	
	public static void main(String []args) throws FileNotFoundException{
		File instructions = new File("instructionList");
		int x = SecurityLevel.HIGH;
		SecureSystem sys = new SecureSystem();
	    Scanner sc = new Scanner(instructions);
	    System.out.println(sc.next());
	    while(sc.hasNext()){
	    	String [] line = sc.next().split("\\s");
	    	if(line[0].equalsIgnoreCase("read")){
	    		
	    	}
	    	else if(line[0].equalsIgnoreCase("write")){
	    		
	    	}
	    	else
	    		continue;
	    }
	  
	}

}
