import java.util.HashMap;



public class ReferenceMonitor {
	ObjectManager x = new ObjectManager();
	
	HashMap<String,Integer>objects;//has level
	public void createObject(String name, Integer level){
		//SecureObject yes = new SecureObject(name);
		this.objects.put(name, level);
		this.x.createObject(name, 0);
	}
	public int checkRead(int level, String name){
		if(level >= this.objects.get(name) ){
			return this.x.executeRead(name);
		}
		return 0;
	}
	
	public boolean checkWrite(int level, String name,int value){
		if(level <= this.objects.get(name) ){
			this.x.executeWrite(name,value);
			return true;
		}
		return false;
	}
	class ObjectManager{
		HashMap<String,Integer> objects;//has value
		public void createObject(String add, int value){
			this.objects.put(add,value);
			
		}
		public int executeRead(String read){
			
				return this.objects.get(read);
			
		}
		public void executeWrite(String write, int value){
			this.objects.put(write,value);
		}
	}

}

