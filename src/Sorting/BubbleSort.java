package Sorting;


public class BubbleSort {
  
    public BubbleSort(){
        
    }

	public  void bubbleSort(int dizi[]) {
           
		int tmp;
		for(int i=0;i<dizi.length;i++){
			
			boolean sirali=true;
			
			for(int j=dizi.length-1;j>0;j--){     //length 1 den başladığı için dizide 0 dan başladığı için 1 çıkarıldı
				if(dizi[j-1]>dizi[j]){ 
					sirali=false;
					tmp=dizi[j-1];
					dizi[j-1]=dizi[j];
					dizi[j]=tmp;
				}
			}
			if(sirali){
				break;
			}
		}
	}
}
