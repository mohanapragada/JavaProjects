package com.css.javatraining.basic;
interface content{
	void c();
}

interface content1 extends content{
	void c1();
}
 class Interface implements content1{
	public void c(){
		System.out.println("Hello");
	}
	public void c1()
	{
		System.out.println("WellCome!");
	}
	public static void main(String[] args)
	{
		Interface obj = new Interface();
		obj.c();
		obj.c1();
	}
	
	

}
