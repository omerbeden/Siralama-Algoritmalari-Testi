package Sorting;

public class CombSort {
      public CombSort(){
        
    }
	
	public  void combSort(int dizi[]){
		int at=(int)(dizi.length/1.3);  //ATlama miktarını dizinin boyunu 1.3 e bölerek başladı
		
		while(at>=1){
			for(int i=0;i<dizi.length-at;i++){  //örnekğin dizinin boyutu 6 ,6/1.3=4 yani 2 kere bakacak.dizinin boyunu aşmasın diye çıkarma işlemi yapıldı
				
				if(dizi[i]>dizi[at+i]){
			            int tmp=dizi[i];
				    dizi[i]=dizi[at+i];
				    dizi[at+i]=tmp;
				}
			}
			at/=1.3;
		}
	}
}
