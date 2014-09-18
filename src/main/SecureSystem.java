import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//import java.util.*;

public class SecureSystem {
	ReferenceMonitor yes = new ReferenceMonitor();
	ArrayList<Subject> subjects = new ArrayList<Subject>();
	
	public void createSubject(String name, Integer level){
		
		this.subjects.add(new Subject(name,level,0));
	}
	public void printState(){
		
	}
	
	public static void main(String []args) throws FileNotFoundException{
		File instructions = new File("instructionList");
		int x = SecurityLevel.HIGH;
		SecureSystem sys = new SecureSystem();
	    Scanner sc = new Scanner(instructions);
	  
	}

}
