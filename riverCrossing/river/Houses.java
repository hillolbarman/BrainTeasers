public class Houses
{
	static char[] house11,house12,house21,house22,boat;
	static char a,b;
	static int top11,top12,top21,top22,n;
	public Houses() {}
	public Houses(int n,char a,char b)
	{
		this.n=n;
		this.a=a;
		this.b=b;
		house11=new char[n/2];
		house12=new char[n/2];
		house21=new char[n/2];
		house22=new char[n/2];
		boat=new char[2];
	}
	public void reset()
	{
		top11=top12=(n/2)-1; 
		top21=top22=-1; 
		for(int i=0;i<house11.length;i++)
		{
			house11[i]=a;
			house12[i]=b;
			house21[i]=' ';
			house22[i]=' ';
		}
	}
}
