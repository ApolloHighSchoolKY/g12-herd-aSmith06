//� A+ Computer Science
// www.apluscompsci.com

//ArrayList of User-defined Classes

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class HerdRunner
{
	public static void main ( String[] args )
	{
		Herd bunch = new Herd();
		bunch.add(73);
		bunch.add(75);
		bunch.add(76);
		bunch.add(900);
		bunch.add(10);
		bunch.add(55);
		bunch.add(1100);
		System.out.println(bunch);
		System.out.println(bunch.countBigOnes());

		Creature dog = new Creature(25);
		Creature horse = new Creature(900);
		out.println(dog);
		out.println(horse);
		out.println(dog.isBig());
		out.println(horse.isBig());
		out.println(dog.equals(horse));
		out.println(horse.compareTo(dog));
  }
}