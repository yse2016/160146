import java.io.*;

public class ShowTextFile{
	public static void main(String[] args) {

		// 0. データを準備する
		String fileName = args[0];
		FileReader inFile;

		try{

			// 1. ファイルを開く
			inFile = new FileReader( fileName );
			System.out.println("file open...done.");

			// 無限ループ( 2. 読み込みは "while"文 の中で行っている )
			int data = 0;
			while( ( data = inFile.read() ) != -1 ){

				// 3. 出力する
				System.out.print( (char)data );
			}

			// 4. 閉じる
			inFile.close();

		} catch( IOException e ){
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}
}