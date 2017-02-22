import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataSetReader {

	private int[] ar = new int[4];
	private int[][] pizza;
	private File f;
	
	public DataSetReader(String name){
		setFilename(name);
	}
	
	public void setFilename(String name){
		f = new File(name+".in");
		if(f.exists()){
			readfile(f);
		}else{
			System.out.println("File \""+name+".in\" does not exist");
		}
	}
	
	public void readfile(File f){
		
		if(f != null){
			BufferedReader br;
			
			try {
				
				br = new BufferedReader(new FileReader(f.getName()));
				
				int r = br.read();
				String number = "";
				
				for(int i = 0; i < 4 && r != -1; i++){
					
					if(r == 32){ // Leerzeichen am Anfang
						r = br.read();
					}
					
					while( r != 32 && r != 10){ // Leerzeichen oder Zeilenumbruch beenden Zahl
						number += (char)r;
						r = br.read();
					}
					
					if(!number.equals("")){ 
						ar[i] = Integer.parseInt(number);
						number = "";
					}
					
				}
							
				// erstes Array eingelesen
				
				pizza = new int[ar[0]][ar[1]];
				
				for(int i = 0; i < ar[0]; i++){
					for(int j = 0; j < ar[1]; j++){
						r = br.read();
						while(r != 77 && r != 84){
							r = br.read();
						}
						
						if(r == 84){
							pizza[i][j] = 2;
						}else if(r == 77){
							pizza[i][j] = 1;
						}
					}	
				}
				
				// zweites Array eingelesen
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("Please specify filename");
		}
		
	}
	
	public int[][] getPizza(){
		return pizza;
	}
	
	public int[] getArray(){
		return ar;
	}
		
}
