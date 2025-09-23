package methodsUsedInNewVersion;

//Understanding of Enum
public enum S05_Day {
   Sunday, Monday, Tuesday, Wednesday, Thusday, Friday, Saturday
}


//Enum is Non-Primitive data type
//It is used to store the universal truths like
//Time - Days/Months
//WindowTypes - newTab / newWindow
//Keys - SPACE / TAB / SHIFT / UP ARROW

class Emample{
	public static void main(String[] args) {
		S05_Day today = S05_Day.Friday;
		//We can access the Enum value same as how we access the static elements of class
		//Syntax - EnumName.EnumValue;
		
		if(today==S05_Day.Friday) {
			System.out.println("Weekend is near");
		}
	}
}