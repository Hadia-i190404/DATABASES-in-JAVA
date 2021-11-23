import java.io.*;

public class FileDatabase extends StoreinDataBase {

	public void insertion(String str) throws IOException {
		File info=new File("Details.txt");
		FileWriter wfile=new FileWriter(info,true);
		wfile.write(str);
		wfile.close();
		System.out.println("Successful");
	}
}
