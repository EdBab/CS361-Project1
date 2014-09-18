import java.util.HashMap;


public class ReferenceMonitor {
	ObjectManager x = new ObjectManager();
	HashMap<String,Integer>object;//has level
	public void createObject(String name, Integer level){
		this.object.put(name, level);
		this.x.createObject(name, 0);
	}
	public int checkRead(int level, String name){
		if(level >= this.object.get(name) ){
			return this.x.read(name);
		}
		return 0;
	}
	
	public boolean checkWrite(int level, String name,int value){
		if(level <= this.object.get(name) ){
			this.x.write(name,value);
			return true;
		}
		return false;
	}
	class ObjectManager{
		HashMap<String,Integer>object;//has value
		public void createObject(String name, Integer value){
			this.object.put(name, value);
			
		}
		public int read(String name){
			return this.object.get(name);
		}
		public void write(String name, int value){
			this.object.put(name, value);
		}
	}

}

