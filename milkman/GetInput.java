import java.io.*;
public class GetInput
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public int getChoice() throws IOException
	{
		System.out.println("Choose :\n1 for Filling can3 up.\n2 for Filling can5 up.\n3 for transferring can3 to can5.\n4 for transferring can5 to can3.\n5 for emptying can3.\n6 for emptying can5.");
		return Integer.parseInt(br.readLine());
	}
}
