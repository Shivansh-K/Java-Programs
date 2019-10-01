class backwardsearch
{
	public static void main(String args[])
	{
		String s=new String("Malayalam");
		int i=0;
		while(true)
		{
			i=s.indexOf('a',i);
			if(i==-1){break;}
			System.out.println(i);
			i=i+1;
		}
	}
}