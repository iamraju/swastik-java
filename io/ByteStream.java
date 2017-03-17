import java.io.*;

public class ByteStream{
	public static void main(String[] args) throws IOException  {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			
			int content;
			while ((content = in.read()) != -1) {
				/*out.write(content);*/
				System.out.println((char) content);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}