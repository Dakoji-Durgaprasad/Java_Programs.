import java.io.*;
public class FileExample {

	public static void main(String[] args) throws Throwable {
		int k;
		String str="";
		File f1 = new File("C:\\Users\\DT051\\Pictures\\dhoni-quotes.jpg");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("C:\\Users\\DT051\\Pictures\\Saved Pictures\\dhoni-quotes.txt");
		
		while((str=br.readLine())!=null) {
			System.out.println(str +" : ");
		}
	}

}
