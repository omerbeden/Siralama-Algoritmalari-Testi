
package test;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import Sorting.*;
import File.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;


public class Panel extends JPanel{
   
      String dosyayolu;
      long time1bb;
      long time2bb;
      long time3bb;
      
       long time1cb;
      long time2cb;
      long time3cb;
      
       long time1c;
      long time2c;
      long time3c;
      
       long time1i;
      long time2i;
      long time3i;
      
       long time1m;
      long time2m;
      long time3m;
      
       long time1q;
      long time2q;
      long time3q;
      
       long time1r;
      long time2r;
      long time3r;
      
       long time1s;
      long time2s;
      long time3s;
     
     
   
    public static void main(String args[]){
        Panel panel=new Panel();
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setTitle("Sıralama Algoritmaları Testi");
        
    }    

    public Panel() {
      initComponents(); 
    }
    private javax.swing.JButton bubble;
    private javax.swing.JButton comb;
    private javax.swing.JButton counting;
    private javax.swing.JButton insertion;
    private javax.swing.JButton merge;
    private javax.swing.JButton quick;
    private javax.swing.JButton radix;
    private javax.swing.JButton selection;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;

    private void initComponents() {

        bubble = new javax.swing.JButton();
        comb = new javax.swing.JButton();
        counting = new javax.swing.JButton();
        insertion = new javax.swing.JButton();
        merge = new javax.swing.JButton();
        quick = new javax.swing.JButton();
        radix = new javax.swing.JButton();
        selection = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        bubble.setText("Bubble Sort");
        bubble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BubbleSort bubble=new BubbleSort();
                DosyaIslemleri rd=new DosyaIslemleri();
                rd.fileRead(dosyayolu);
                int dizi[]=new int[DosyaIslemleri.list.size()];
                
		for(int i=0;i<dizi.length;i++){
			dizi[i]=DosyaIslemleri.list.get(i);
                }
                 time1bb = System.nanoTime(); 
                bubble.bubbleSort(dizi);
                 time2bb = System.nanoTime(); 
                 time3bb = time2bb-time1bb;
                jTable1.getModel().setValueAt(time3bb*(Math.pow(10, -9)), 0, 0);
                
            }
        });

        comb.setText("Comb Sort");
        comb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
              
                 CombSort comb=new CombSort();
                DosyaIslemleri rd=new DosyaIslemleri();
                rd.fileRead(dosyayolu);
                int dizi[]=new int[DosyaIslemleri.list.size()];
                
		for(int i=0;i<dizi.length;i++){
			dizi[i]=DosyaIslemleri.list.get(i);
                }
                time1cb = System.nanoTime(); 
                comb.combSort(dizi);
                  time2cb = System.nanoTime(); 
                  time3cb = time2cb-time1cb;
                jTable1.getModel().setValueAt(time3cb*(Math.pow(10, -9)), 0, 1);
            
            }
        });

        counting.setText("Counting Sort");
        counting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CountingSort counting=new CountingSort();
                DosyaIslemleri rd=new DosyaIslemleri();
                rd.fileRead(dosyayolu);
                int dizi[]=new int[DosyaIslemleri.list.size()];
                
		for(int i=0;i<dizi.length;i++){
			dizi[i]=DosyaIslemleri.list.get(i);
                }
                 time1c = System.nanoTime(); 
                counting.countingSort(dizi);
                 time2c = System.nanoTime(); 
                 time3c = time2c-time1c;
                jTable1.getModel().setValueAt(time3c*(Math.pow(10, -9)), 0, 2);
                
            }
        });

        insertion.setText("Insertion Sort");
        insertion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                InsertionSort insertion=new InsertionSort();
                DosyaIslemleri rd=new DosyaIslemleri();
                rd.fileRead(dosyayolu);
                int dizi[]=new int[DosyaIslemleri.list.size()];
                
		for(int i=0;i<dizi.length;i++){
			dizi[i]=DosyaIslemleri.list.get(i);
                }
                 time1i = System.nanoTime(); 
                insertion.insertionSort(dizi);
                 time2i = System.nanoTime(); 
                 time3i = time2i-time1i;
                jTable1.getModel().setValueAt(time3i*(Math.pow(10, -9)), 0, 3);
                
            }
        });

        merge.setText("Merge Sort");
        merge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                MergeSort merge=new MergeSort();
                DosyaIslemleri rd=new DosyaIslemleri();
                rd.fileRead(dosyayolu);
                int dizi[]=new int[DosyaIslemleri.list.size()];
                
		for(int i=0;i<dizi.length;i++){
			dizi[i]=DosyaIslemleri.list.get(i);
                }
                 time1m = System.nanoTime(); 
                merge.mergeSort(dizi, 0, dizi.length-1);
                 time2m = System.nanoTime(); 
                 time3m = time2m-time1m;
                 System.out.println(time3m);
                jTable1.getModel().setValueAt(time3m*(Math.pow(10, -9)), 0, 4);
                
            }
        });

        quick.setText("Quick Sort");
        quick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                 QuickSort quick=new QuickSort();
                DosyaIslemleri rd=new DosyaIslemleri();
                rd.fileRead(dosyayolu);
                int dizi[]=new int[DosyaIslemleri.list.size()];
                
		for(int i=0;i<dizi.length;i++){
			dizi[i]=DosyaIslemleri.list.get(i);
                }
                time1q = System.nanoTime(); 
                quick.sirala(dizi, 0, dizi.length-1);
                time2q = System.nanoTime(); 
                time3q = time2q-time1q;
                jTable1.getModel().setValueAt(time3q*(Math.pow(10, -9)), 0, 5);
                
            }
        });

        radix.setText("Radix Sort");
        radix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                RadixSort radix=new RadixSort();
                DosyaIslemleri rd=new DosyaIslemleri();
                rd.fileRead(dosyayolu);
                int dizi[]=new int[DosyaIslemleri.list.size()];
                
		for(int i=0;i<dizi.length;i++){
			dizi[i]=DosyaIslemleri.list.get(i);
                }
                time1r = System.nanoTime(); 
                radix.radixSort(dizi, dizi.length);
                time2r = System.nanoTime(); 
                time3r = time2r-time1r;
                jTable1.getModel().setValueAt(time3r*(Math.pow(10, -9)), 0, 6);
                
            }
        });

        selection.setText("Selection Sort");
        selection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                 SelectionSort selection=new SelectionSort();
                DosyaIslemleri rd=new DosyaIslemleri();
                rd.fileRead(dosyayolu);
                int dizi[]=new int[DosyaIslemleri.list.size()];
                
		for(int i=0;i<dizi.length;i++){
			dizi[i]=DosyaIslemleri.list.get(i);
                }
                time1s = System.nanoTime(); 
                selection.selectionSort(dizi);
                time2s = System.nanoTime(); 
                time3s = time2s-time1s;
                jTable1.getModel().setValueAt(time3s*(Math.pow(10, -9)), 0, 7);
          
            }
        });

        jTextField1.setText(null);
        jTextField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                dosyayolu="C:/Users/Ömer/Desktop/"+jTextField1.getText()+".txt";
                JOptionPane.showMessageDialog(null, dosyayolu);
                
        DosyaIslemleri d=new DosyaIslemleri();
        QuickSort qs=new QuickSort();
        d.fileRead(dosyayolu);
        int dizi1[]=new int[DosyaIslemleri.list.size()];
        
        for(int i=0;i<dizi1.length;i++){
            dizi1[i]=DosyaIslemleri.list.get(i);
        }
        qs.sirala(dizi1, 0, dizi1.length-1);
        
        d.dosyaOlustur();
        d.dosyayaYaz(dizi1);
       
                
            }
        });
              jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Bubble", "Comb", "Counting", "Insertion", "Merge", "Quick", "Radix", "Selection"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };	

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bubble))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radix, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quick)
                            .addComponent(merge)
                            .addComponent(insertion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(counting, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comb, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(selection))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radix)
                .addGap(18, 18, 18)
                .addComponent(quick)
                .addGap(18, 18, 18)
                .addComponent(merge)
                .addGap(13, 13, 13)
                .addComponent(insertion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(counting)
                .addGap(18, 18, 18)
                .addComponent(comb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bubble)
                .addGap(147, 147, 147))
        );
    }
}