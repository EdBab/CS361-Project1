
public class SecureObject {
String name;
//int level; 
//int value;
	public SecureObject(String name){
	this.name = name;
	//this.level =level;
	//this.value = value;
	}
	
	public boolean equals(SecureObject check){
		if(this.name.equals(check.name) ){
			return true;
		}
		return false;
	}
	
}
