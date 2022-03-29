package com.lti.user;
class FaceBook
{
	int userId;
	int no=0;	
	static int likes =0;
	
	static
	{
		System.out.println(" static block");
		System.out.println(likes);
	}	
	
	public FaceBook(int userId) {
		super();
		this.userId = userId;
	}
	public void countLikes()
	{
		no++;		
		System.out.println("no of likes" + no);
	}
	
	public static  void likes()
	{
		likes++;
		System.out.println(" likes " + likes);
	}
	
	
	@Override
	public String toString() {
		return "FaceBook [userId=" + userId + ", no=" + no + "]";
	}	
}
public class TestFacebook {	
	public static void main(String[] args) {		
		FaceBook user1= new FaceBook(101);
		user1.countLikes();		
		FaceBook.likes();
		
		FaceBook user2= new FaceBook(102);
		user2.countLikes();		
		FaceBook.likes();
		
		FaceBook user3= new FaceBook(103);
		user3.countLikes();	
		FaceBook.likes();
		//static variable ,static method , static class 
		
		Math.sqrt(16);
		
		//Math m= new Math();
		//m.sqrt();
		
		
		
		
	}

}
