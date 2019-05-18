package collectionTest;

public class student2 {
	
		private String name;
		int age;
		student2(String n,int age){
			this.name=n;
			this.age=age;
			
		}
		public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
		@Override
		public String toString() {
			return "student2 [name=" + name + ", age=" + age + "]";
		}
		@Override
		public int hashCode() {
			int result ;
			result = (this.name == null) ? 0 : name.hashCode();
			result+=this.age;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof student2))
				return false;
			student2 s=(student2)obj;
			if((this.name.equals(s.name))&&(this.age==s.age))
				return true;//若为false 则会出现两个Aane
			else
				return false;
			
		} 
	}

