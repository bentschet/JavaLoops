package loops.controller;

import java.util.Scanner;

public class LoopsController
{
	private String whichLoop;
	private Scanner keyboardInput;
	
	public void start()
	{
		forLoop1();
		forLoop2();
	}
	private void whileLoops()
	{
		int X = 10;
		while (X > 1);
		{
			X--;
			System.out.println("Count is: " + X);
		}
	}
	
	private void forLoop1()
	{
		System.out.println("This is For Loop 1");
		for (int Y = 0; Y<5; Y++ )
		{
			System.out.println("Count is: " + Y);
		}
	}
	private void forLoop2()
	{
		System.out.println("This is For Loop 2");
		for (int Z = 0; Z<10; Z+=5 )
		{
			System.out.println("Count is: " + Z);
		}
	}

}
