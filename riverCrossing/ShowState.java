public class ShowState extends Houses
{
	public void show(boolean loop)
	{
		System.out.println("  |\t\t|  ");
		for(int i=0;i<house11.length;i++)
			System.out.println(house11[i]+" |\t\t| "+house21[i]);
		if(loop)	System.out.println("  |<=>\t\t|  ");
		else		System.out.println("  |\t     <=>|  ");
		for(int i=0;i<house21.length;i++)
			System.out.println(house12[i]+" |\t\t| "+house22[i]);
		System.out.println("  |\t\t|  ");
		System.out.println();
	}
	public void intro()
	{
		System.out.println("Welcome to the game..\nSolve the the puzzle by moving all the '"+a+"'s and the '"+b+"'s to the other side..\nRules: \n1. A maximum of two persons can travel at a given time.\n2. The number of '"+b+"'s SHOULD NOT exceed the number of '"+a+"'s on either side.\n\n"); 
	}
}
