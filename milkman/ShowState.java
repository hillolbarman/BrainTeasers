public class ShowState 
{
	public void show(int can3,int can5)
	{
		System.out.println("   3       5   ");
		for(int i=5;i>=1;i--)
		{
			if(i>3)
			{
				if(can5<i)
				System.out.println("        |    |");
				else if(can5>=i)
				System.out.println("        |~~~~|");
			}
			else
			{
				if(can3<i && can5<i)
					System.out.println("|    |  |    |");
				else if(can3>=i && can5<i)
					System.out.println("|~~~~|  |    |");	
				else if(can3<i && can5>=i)
					System.out.println("|    |  |~~~~|");
				else if(can3>=i && can5>=i)
					System.out.println("|~~~~|  |~~~~|");
			}
		}
		System.out.println("\n");		
	}
	public void intro()
	{
		System.out.println("Welcome to the game..\nThere was a milkman. He had two measuring cans. One of 3ltrs and the other of 5ltrs.\nOnce he encontered a problem. A customer asked for exactly 4ltrs of milk that too he must give it in one go.\nHelp the milkman by measuring out 4ltrs of milk using the two available cans\n");
	}
}
