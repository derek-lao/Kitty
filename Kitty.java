public class Kitty{
	private int age;
	private String name;

		public Kitty(int startAge, String startName){
			age=startAge;
			name=startName;
		}

		public int getAge(int age){
			return age;
		}

		public String getName(String name){
			return name;
		}

		public String toString(String name){
			return name;
		}

		public String changeName(String newName){
			name=newName;
			return name;
		}

		public int makeOlder(int newAge){
			age=newAge;
			return age;
		}

}
