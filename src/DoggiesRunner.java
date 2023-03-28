//(c) A+ Computer Science
// www.apluscompsci.com

//List of references - DogRunner

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class DoggiesRunner
{
	//make a method to find the oldest Dog
	//this method should return a reference
	//to the Dog taht is the oldest
	
	public static Dog findOldest( List<Dog> list )
	{
		Dog oldest = list.get(0);
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).getAge() > oldest.getAge() )
				oldest = list.get(i);

		return oldest;
	}
	
	
	public static void main(String args[])
	{
		List<Dog> ray;
		ray = new ArrayList<Dog>();
		
		ray.add( new Dog( "fred", 11) );
		ray.add( new Dog( "ann", 21) );
		ray.add( new Dog("baxter",2));
		ray.add( new Dog("coal", 1));
		ray.add(new Dog("tianbo",15));
		ray.add(new Dog("lily",6));
		//add more Dogs to the list

		System.out.println( ray );
		
		//write a for each loop to print out all of the Dogs
		for(Dog d:ray)
			out.println(d);

		//call the method to find the oldest Dog
		//print the oldest Dog
		
		System.out.println( "oldest dog == " + findOldest( ray ) );
		
	}
}