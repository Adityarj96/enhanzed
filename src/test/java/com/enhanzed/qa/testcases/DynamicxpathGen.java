package com.enhanzed.qa.testcases;

public class DynamicxpathGen
{
	//button[contains(text(),"{0}")]
	//p[contains(text(),'4 Nuggets')]
	public  static String  createxpath(String xpathExp, Object...args)
	{
		for(int i=0;i<args.length;i++)
		{
			xpathExp=xpathExp.replace("{"+i+"}", (CharSequence) args[i]);
		}
		return xpathExp;
	}
	
	
	public static void main(String[] args)
	{
		String x1=createxpath("//button[contains(text(),'{0}')]","test");
		System.out.println(x1);
		
		
	}

}
