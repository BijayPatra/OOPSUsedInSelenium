
//
package com.example.OOPSusedinSelenium;

public abstract class TestTemplate 
{
	public abstract void initialize();
	public abstract void exicute();
	public void run()
	{
		initialize();
		exicute();
	}
	public class Mytest extends TestTemplate
	{
		@Override
		public void initialize() 
		{
			System.out.println("This is initialization Test:");
		}
		@Override
		public void exicute() 
		{
			System.out.println("This is exicute Test:");
		}
	}
}
