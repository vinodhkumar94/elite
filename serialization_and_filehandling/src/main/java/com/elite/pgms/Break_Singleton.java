package com.elite.pgms;

public class Break_Singleton implements Cloneable {
	private static Break_Singleton obj;
	
	public Break_Singleton() {
		super();
	}

	public static Break_Singleton getInstance()
	{
		if (obj==null)
		{
			
			synchronized (Break_Singleton.class) {
				if (obj==null) {
					obj = new Break_Singleton();
				}
			}
		}
		
		return obj;
		
	}

//	@Override
//    protected Object clone() throws CloneNotSupportedException {
//       
//        throw new CloneNotSupportedException();
//  
//	}
	
	public static void main(String[] args)  
	{
			Break_Singleton br = Break_Singleton.getInstance();
			System.out.println(br);	
			
			try {
				System.out.println(br.clone());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
	}

	
}
 