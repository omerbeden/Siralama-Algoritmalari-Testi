package Sorting;

public class QuickSort {
      public QuickSort(){
        
    }
	
	private int ayir(int []dizi, int ai,int ui){   //ai alt indeks ui ust indeks
		int tmp;
		int pivot=dizi[ui];
		int i=ai-1;
		
		for(int j=ai;j<=ui-1;j++){
			if(dizi[j]<=pivot){
				i++;
				tmp=dizi[i];
				dizi[i]=dizi[j];
				dizi[j]=tmp;
				
			}
			
		} 	
		tmp=dizi[i+1];
		dizi[i+1]=dizi[ui];
		dizi[ui]=tmp;
		
		
		
		return i+1;
	}
	
	public void sirala(int []dizi,int ai,int ui){
		int p;
		if(ai<ui){
			
		 p=ayir(dizi,ai,ui);
		 System.out.println(p);
		 sirala(dizi, ai,p-1);
		 sirala(dizi, p+1, ui);
		 
		}
	}
}
		
	




