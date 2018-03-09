import java.io.*;
public class Cans
{
	static int can3,can5;
	GetInput gi=new GetInput();
	ShowState ss=new ShowState();
	Cans()
	{
		can3=0;
		can5=0;
	}
	public void begin() throws IOException
	{
		ss.intro();
		ss.show(can3,can5);
		boolean loop=true;
		while(loop)
		{
			switch(gi.getChoice())
			{
				case 1: can3=3;
					break;
				case 2: can5=5;
					break;
				case 3: if(can5>2)
					{
						int temp=can3;
						can3=can3-(5-can5);
						can5=can5+(temp-can3);
						
					}					
					else
					{	
						can5=can5+can3;
						can3=0;
					}
					break;
				case 4: if(can3!=0)
					{
						int temp=can5;
						can5=can5-(3-can3);
						can3=can3+(temp-can5);
					}
					else if(can5<=3)
					{
						can3=can5;
						can5=0;
					}
					else
					{
						can3=3;
						can5=can5-3;
					}
					break;
				case 5: can3=0;
					break;
				case 6: can5=0;
					break;
			}
			ss.show(can3,can5);
			if(can3==0 && can5==4)
				loop=false;
		}
		System.out.println("Congratulations..!! The milkmant is dancing in rejoice..");
	}
}					
