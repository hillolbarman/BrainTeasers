import java.io.*;
public class GetInput
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public String get() throws IOException
	{
		
		/*int n;
		char a,b;
		System.out.print("Enter the total number of individuals: ");
		n=Integer.parseInt(br.readLine());
		System.out.print("Enter first character of individual1: ");
		a=br.read();
		System.out.print("Enter first character of individual2: ");
		b=br.read();
		System.out.print("Who eats whom? enter 1 for");
		Houses h=new Houses(n,a,b);*/
		String g=br.readLine();
		if(g.length()>2)
		{
			System.out.println("Discarded..Re-enter");
			get();
		}
		if(g.length()==1)
		{
			g=g+' ';
		}
		return g;
	}
	public int tryagain() throws IOException
	{
		System.out.println("Try again? 1 for Yes: ");
		return Integer.parseInt(br.readLine());
	}
}
