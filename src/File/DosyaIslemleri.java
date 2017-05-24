package File;
//import Sorting.BubbleSort;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DosyaIslemleri {
	
	public static  ArrayList<Integer> list =new ArrayList<Integer>();
	
	
	public  void fileRead(String url){
		File file=new File(url);
		try {
			Scanner sc=new Scanner(file);
			while(sc.hasNext()){
				list.add(sc.nextInt());
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
        
        public void dosyaOlustur(){
            try {
                File file=new File("C:/Users/Ömer/Desktop/siralanmis.txt");
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(DosyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        public void dosyayaYaz(int dizi[]){
            File file=new File("C:/Users/Ömer/Desktop/siralanmis.txt");
            FileWriter fr = null;
            try {
                fr = new FileWriter(file);
            } catch (IOException ex) {
                Logger.getLogger(DosyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
           BufferedWriter bw=new  BufferedWriter (fr);
           
           for(int i=0;i<dizi.length;i++){
                try {
                    bw.write(dizi[i]+" ");
                } catch (IOException ex) {
                    Logger.getLogger(DosyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
            try {
                bw.flush();
                 bw.close();
            } catch (IOException ex) {
                Logger.getLogger(DosyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        
        
}
	

