import java.io.*;
public class GetGoing extends Houses
{
	GetInput gi=new GetInput();
	ShowState st=new ShowState();
	GetGoing()
	{
		super(6,'M','C');
	}
	public void run() throws IOException
	{
		boolean to=true,loop=true;
		reset();
		st.intro();
		st.show(to);
		do
		{
			String temp=gi.get();				
			boat=temp.toCharArray();
			if(to)
				to(boat[0],boat[1]);				
			else
				from(boat[0],boat[1]);			
			to=!to;
			if(top11==-1&&top12==-1&&top21==2&&top22==2)
				loop=false;
			if(top12>top11&&top11!=-1||top22>top21&&top21!=-1)
			{
				String side=(top12>top11)?"left":"right";
				System.out.println("Oh you have failed..The number of '"+b+"'s is greater on "+side+" side..");
				st.show(to);
				if(gi.tryagain()==1)
				{
					reset();
					to=true;
				}
				else
					System.exit(0);
			}
			st.show(to);
		}
		while(loop);
		System.out.println("\nCongratulations..!! You have solved the puzzle..");
	}
	public void to(char boat0,char boat1)
	{
		if(boat0==a)			//case AA, AB
		{
			house11[top11--]=' '; 
			house21[++top21]=a; 
		}
		if(boat1==a)			//case AA, BA
		{
			house11[top11--]=' ';
			house21[++top21]=a;
		}
		if(boat0==b)			//case BA, BB
		{
			house12[top12--]=' ';
			house22[++top22]=b;
		}
		if(boat1==b)			//case AB, BB
		{
			house12[top12--]=' ';
			house22[++top22]=b;
		}
	}
	public void from(char boat0,char boat1)
	{
		if(boat0==a)			//case AA, AB, A
		{
			house21[top21--]=' ';
			house11[++top11]=a;
		}
		if(boat1==a)			//case AA, BA
		{
			house21[top21--]=' ';
			house11[++top11]=a;
		}
		if(boat0==b)			//case BA, BB, B
		{
			house22[top22--]=' ';
			house12[++top12]=b;
		}
		if(boat1==b)			//case AB, BB
		{
			house22[top22--]=' ';
			house12[++top12]=b;
		}
	}
}
