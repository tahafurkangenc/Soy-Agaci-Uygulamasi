
package prolab3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

class KuyrukNode {
  TreeNode data;
  KuyrukNode next;

  public KuyrukNode(TreeNode data) {
    this.data = data;
  }
}

class Kuyruk {
  KuyrukNode head;
  KuyrukNode tail;
  int size;

  public void enqueue(TreeNode data) {
    KuyrukNode newNode = new KuyrukNode(data);
    if (tail != null) {
      tail.next = newNode;
    }
    tail = newNode;
    if (head == null) {
      head = newNode;
    }
    size++;
  }

  public TreeNode dequeue() {
    if (head == null) {
      return null;//??
    }
    TreeNode data = head.data;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    size--;
    return data;
  }

  public int size() {
    return size;
  }
  
  public boolean isEmpty(){
      return head==null;
  }
          
}

class TreeNode
{
        public int id;	
        public String isim;
        public String Soyisim;
        public String Dogum_Tarihi;
        public String Esi;	
        public String Anne_Adi	;
        public String Baba_Adi;
        public String Kan_Grubu;
        public String Meslek;
        public String Medeni_Hali;
        public String Kizlik_Soyismi;
        public String Cinsiyet;
        TreeNode wife;

        ArrayList<TreeNode> children = new ArrayList<>();

        TreeNode(int id,
                String isim,
                String Soyisim,
                String Dogum_Tarihi,
                String Esi,
                String Anne_Adi,
                String Baba_Adi,
                String Kan_Grubu,
                String Meslek,
                String Medeni_Hali,
                String Kizlik_Soyismi,
                String Cinsiyet){
                this.id=id;
                this.isim=isim;
                this.Soyisim=Soyisim;
                this.Dogum_Tarihi=Dogum_Tarihi;
                this.Esi=Esi;
                this.Anne_Adi=Anne_Adi;
                this.Baba_Adi=Baba_Adi;
                this.Kan_Grubu=Kan_Grubu;
                this.Meslek=Meslek;
                this.Medeni_Hali=Medeni_Hali;
                this.Kizlik_Soyismi=Kizlik_Soyismi;
                this.Cinsiyet=Cinsiyet;
        }
        
        TreeNode(int id,
                String isim,
                String Soyisim,
                String Dogum_Tarihi,
                String Esi,
                String Anne_Adi,
                String Baba_Adi,
                String Kan_Grubu,
                String Meslek,
                String Medeni_Hali,
                String Kizlik_Soyismi,
                String Cinsiyet,
                TreeNode wifenode){
                this.id=id;
                this.isim=isim;
                this.Soyisim=Soyisim;
                this.Dogum_Tarihi=Dogum_Tarihi;
                this.Esi=Esi;
                this.Anne_Adi=Anne_Adi;
                this.Baba_Adi=Baba_Adi;
                this.Kan_Grubu=Kan_Grubu;
                this.Meslek=Meslek;
                this.Medeni_Hali=Medeni_Hali;
                this.Kizlik_Soyismi=Kizlik_Soyismi;
                this.Cinsiyet=Cinsiyet;
                this.wife=wifenode;
        }
        
        TreeNode(TreeNode Node){
                this.id=Node.id;
                this.isim=Node.isim;
                this.Soyisim=Node.Soyisim;
                this.Dogum_Tarihi=Node.Dogum_Tarihi;
                this.Esi=Node.Esi;
                this.Anne_Adi=Node.Anne_Adi;
                this.Baba_Adi=Node.Baba_Adi;
                this.Kan_Grubu=Node.Kan_Grubu;
                this.Meslek=Node.Meslek;
                this.Medeni_Hali=Node.Medeni_Hali;
                this.Kizlik_Soyismi=Node.Kizlik_Soyismi;
                this.Cinsiyet=Node.Cinsiyet;
        }
        
        TreeNode(int id,
                String isim,
                String Soyisim,
                String Dogum_Tarihi,
                String Esi,
                String Anne_Adi,
                String Baba_Adi,
                String Kan_Grubu,
                String Meslek,
                String Medeni_Hali,
                String Kizlik_Soyismi,
                String Cinsiyet,
                List<TreeNode> child){
                this.id=id;
                this.isim=isim;
                this.Soyisim=Soyisim;
                this.Dogum_Tarihi=Dogum_Tarihi;
                this.Esi=Esi;
                this.Anne_Adi=Anne_Adi;
                this.Baba_Adi=Baba_Adi;
                this.Kan_Grubu=Kan_Grubu;
                this.Meslek=Meslek;
                this.Medeni_Hali=Medeni_Hali;
                this.Kizlik_Soyismi=Kizlik_Soyismi;
                this.Cinsiyet=Cinsiyet;
                children = (ArrayList<TreeNode>) child;
        }
        
                @Override
                public String toString()
                {
                    return  "id : "+id
                            +"\nisim : "+isim
                            +"\nSoyisim : "+Soyisim
                            +"\nDogum Tarihi : "+Dogum_Tarihi
                            +"\nEsi : "+Esi
                            +"\nAnne adi : "+Anne_Adi
                            +"\nBaba adi : "+Baba_Adi
                            +"\nKan Grubu : "+Kan_Grubu
                            +"\nMeslek : "+Meslek
                            +"\nMedeni Hali : "+Medeni_Hali
                            +"\nKizlik Soyismi : "+Kizlik_Soyismi
                            +"\nCinsiyet : "+Cinsiyet;
                }

        
}



public class Prolab3 {
    
    /*private static void printNAryTree(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int j=1;
        while(!queue.isEmpty()) {
            int len = queue.size();
            
            System.out.println("***"+"SATIR"+j+"***");
            j++;
            for(int i=0;i<len;i++) {
                TreeNode node = queue.poll();
                //assert node != null;
                System.out.print("sutun"+i+"***"+node + "\n");
                for (TreeNode item : node.children) {
                    queue.offer(item);
                }
            }
            System.out.println();
        }
    }*/
    
    private static int derinlikBul(TreeNode root){
        if(root == null) return 0;
        Kuyruk kuyruk= new Kuyruk();
        kuyruk.enqueue(root);
        //queue.offer(root);
        int j=1;
        while(!kuyruk.isEmpty()) {
            int len = kuyruk.size();
            
            //System.out.println("***"+"SATIR"+j+"***");
            j++;
            for(int i=0;i<len;i++) {
                TreeNode node = kuyruk.dequeue();
                //assert node != null;
                //System.out.print("sutun"+i+"***"+node + "\n");
                for (TreeNode item : node.children) {
                    kuyruk.enqueue(item);
                }
            }
            //System.out.println();
        }
        return j-1; 
    }
    
    /*private static int derinlikBul2(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int j=1;
        while(!queue.isEmpty()) {
            int len = queue.size();
            
            //System.out.println("***"+"SATIR"+j+"***");
            j++;
            for(int i=0;i<len;i++) {
                TreeNode node = queue.poll();
                //assert node != null;
                //System.out.print("sutun"+i+"***"+node + "\n");
                for (TreeNode item : node.children) {
                    queue.offer(item);
                }
            }
            //System.out.println();
        }
        return j-1; 
    }*/
    
    
    public static void Ekle(TreeNode rootNode,TreeNode[] kisilerNode) {
        
        System.out.println("Ekle Fonksiyonuna girildi");
        for (int i=1;i<kisilerNode.length;i++)
        {
            System.out.println("BABA ARANIYOR-)"+i);
            if(kisilerNode[i].Cinsiyet.equals("Erkek") && kisilerNode[i].Medeni_Hali.equals("Evli"))
            {
                System.out.println("**BABA**"+kisilerNode[i]+"\n");
                for (int k=1;k<kisilerNode.length;k++)
                {
                    if(kisilerNode[i].Esi.equals(kisilerNode[k].isim+" "+kisilerNode[k].Soyisim))
                    {
                        kisilerNode[i].wife=kisilerNode[k];
                        System.out.println("**ANNE**("+kisilerNode[i].isim+" "+kisilerNode[i].Soyisim+" in esi)"+kisilerNode[i].wife+"\n");
                    }
                }
                
                for (int j=1;j<kisilerNode.length;j++)
                {
                    //&& kisilerNode[i].Esi.equals(kisilerNode[j].Anne_Adi +" "+kisilerNode[j].Soyisim)
                    if(kisilerNode[j].Baba_Adi.equals(kisilerNode[i].isim) && kisilerNode[i].Soyisim.equals(kisilerNode[j].Soyisim ) && kisilerNode[i].Esi.equals(kisilerNode[j].Anne_Adi+" "+kisilerNode[j].Soyisim))
                    {
                        kisilerNode[i].children.add(kisilerNode[j]);
                        System.out.println(kisilerNode[i].isim +" "+kisilerNode[i].Soyisim +" Cocuğu**"+kisilerNode[j]+"\n");
                    }
                    else if (kisilerNode[j].Baba_Adi.equals(kisilerNode[i].isim) && 
                            kisilerNode[j].Cinsiyet.equals("Kadın") &&
                            kisilerNode[j].Medeni_Hali.equals("Evli") &&
                            kisilerNode[j].Kizlik_Soyismi.equals(kisilerNode[i].Soyisim)&&
                            kisilerNode[i].Esi.equals(kisilerNode[j].Anne_Adi+" "+kisilerNode[j].Kizlik_Soyismi)) 
                    {
                        kisilerNode[i].children.add(kisilerNode[j]);
                        System.out.println(kisilerNode[i].isim +" "+kisilerNode[i].Soyisim +" Cocuğu**"+kisilerNode[j]+"\n");
                    }
                }
                
                if(kisilerNode[i].wife!=null)
                {
                    for(int s1=0;s1<kisilerNode[i].children.size();s1++)
                    {
                       kisilerNode[i].wife.children.add(kisilerNode[i].children.get(s1));
                    }
                }
                    
            }
                
        }
        
        
    }
    
    
    public static TreeNode rootBul(String rootsoyisim, TreeNode[] kisilerNode)
    {
        for (int i = kisilerNode.length-1; i > 0; i--) //kisilerNode i tersten doner (cocuk)
        {
            if(kisilerNode[i].Soyisim.equals(rootsoyisim))
            {
                while(true)
                {
                    int sayac=0;
                  for (int j = 1; j<kisilerNode.length ; j++) // (baba)
                   {
                    if(kisilerNode[j].Soyisim.equals(kisilerNode[i].Soyisim) && 
                       kisilerNode[i].Baba_Adi.equals(kisilerNode[j].isim)&&
                       kisilerNode[j].Esi.equals(kisilerNode[i].Anne_Adi + " " + kisilerNode[i].Soyisim))
                    {
                        i=j;
                        sayac=1;
                        break;
                    }
                   }
                   if(sayac==0)
                   {
                        //System.out.println("kisilerNode[i]:\n"+kisilerNode[i]);
                        return kisilerNode[i];
   
                   }
                }
                //break;
            }
            
            
        }
        return kisilerNode[0];
    }
    
    public static void soyagacinaEkle(TreeNode rootnode ,DefaultMutableTreeNode TreerootNode)
    {
        for (int i = 0; i < rootnode.children.size(); i++) 
        {
            if (rootnode.children.get(i).Medeni_Hali.equals("Evli"))
            {
                DefaultMutableTreeNode evlicocuknode = new DefaultMutableTreeNode(rootnode.children.get(i).isim + " " +rootnode.children.get(i).Soyisim + " & "+rootnode.children.get(i).Esi);
                TreerootNode.add(evlicocuknode);
                soyagacinaEkle(rootnode.children.get(i), evlicocuknode);
            }
            else
            {
                DefaultMutableTreeNode bekarcocuknode = new DefaultMutableTreeNode(rootnode.children.get(i).isim + " " + rootnode.children.get(i).Soyisim);
                TreerootNode.add(bekarcocuknode);
            }
            
        }
 
    }
    
    public static void soyagaciBas(TreeNode[] kisilerNode)
    {
        JFrame frame = new JFrame("Soy Ağacı");
        
        String soyagacininismi = JOptionPane.showInputDialog(frame,"Oluşturulacak soy ağacının ismi (veya kişinin adı ve soy adı)");
        if(soyagacininismi.contains(" "))
        {
            String[] tmp = soyagacininismi.split(" ");
            soyagacininismi=tmp[tmp.length-1];
            for(int i=0;i<kisilerNode.length;i++)
            {
              if(kisilerNode[i].isim.equals(tmp[0])&& kisilerNode[i].Soyisim.equals(soyagacininismi))
              {
                JLabel derinlikLabel= new JLabel("Ağaç Derinliği:"+derinlikBul(rootBul(soyagacininismi, kisilerNode))+" Girilen kişiden sonra gelen nesil sayisi :"+ (derinlikBul(kisilerNode[i])-1));
                derinlikLabel.setBounds(10, 760, 700, 30);
                frame.add(derinlikLabel);
                break;
              }
            }
            
        }
        else
        {
            JLabel derinlikLabel= new JLabel("Ağaç Derinliği:"+derinlikBul(rootBul(soyagacininismi, kisilerNode)));
            derinlikLabel.setBounds(10, 760, 700, 30);
            frame.add(derinlikLabel);
        }
       
        TreeNode rootnode = rootBul(soyagacininismi, kisilerNode);
        DefaultMutableTreeNode Treerootnode = new DefaultMutableTreeNode(rootnode.isim +" "+rootnode.Soyisim+" & "+rootnode.Esi); 
        soyagacinaEkle(rootnode, Treerootnode);
        
        JTree Soyagaci = new JTree(Treerootnode);
        
        Soyagaci.setBounds(50, 40,700, 700);
        
        frame.add(Soyagaci);
        frame.setSize(800,900);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
        
    }
    
    public static void KanGrubuBul(TreeNode[]kisilerNode)
    {
        JFrame kanframe = new JFrame("Kan Grubu");
        
        String kangrubu = JOptionPane.showInputDialog("Kan Grubu girin");
        kangrubu=kangrubu.toUpperCase();
        System.out.println("\nKan Grubu "+kangrubu+" olanlar");
        int y=5;
        for(int s3=1;s3<kisilerNode.length;s3++)
        {
            if(kisilerNode[s3].Kan_Grubu.equals(kangrubu+"(-)") || kisilerNode[s3].Kan_Grubu.equals(kangrubu+"(+)") )
            {
                JLabel kanlabel= new JLabel("ID: "+Integer.toString(kisilerNode[s3].id)+"  isim: "+kisilerNode[s3].isim+"  Soyisim: "+kisilerNode[s3].Soyisim);
                kanlabel.setBounds(5, y, 490, 15);
                kanframe.add(kanlabel);
                y=y+20;
                System.out.println("\n"+kisilerNode[s3]+"\n");
                
            }
        }
        
        kanframe.setSize(500,800);
        kanframe.setLayout(null);
        kanframe.setVisible(true);
        
        
    }
    
    
    
    public static int yasBul(TreeNode kisi)
    {
        
        String dob = kisi.Dogum_Tarihi.replace('.', '/'); // doğum tarihi
        LocalDate today = LocalDate.now(); // bugünün tarihi
         LocalDate birthday = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy")); // doğum tarihini LocalDate objesi olarak alıyoruz

       // Yaşı bulmak için bugünün tarihi ve doğum tarihi arasındaki periyodu alıyoruz
         Period period = Period.between(birthday, today);

          int age = period.getYears(); // yaşı alıyoruz
          return age;
    }
    
    public static void ayniismiBul (TreeNode[] kisilerNode)
    {
        JFrame yasframe = new JFrame("Aynı İsme Sahip Kişiler");
        ArrayList<String> isimler = new ArrayList<String>();
        for (int i=1;i<kisilerNode.length;i++)
        {
            if(!(isimler.contains(kisilerNode[i].isim)))
            {
                isimler.add(kisilerNode[i].isim);
            }
        }
        int y=5;
        for (int i = 0; i < isimler.size(); i++) {
            /*System.out.println("isim:"+isimler.get(i)); 
            JLabel isimlabel = new JLabel("**"+isimler.get(i)+"**");
            isimlabel.setBounds(5, y, 490, 15);
                yasframe.add(isimlabel);
                y=y+15;*/
            for(int j=1;j<kisilerNode.length;j++)
            {
                boolean isimkontrol=false;
                if(kisilerNode[j].isim.equals(isimler.get(i)))
                {
                   for(int k=j+1;k<kisilerNode.length;k++) 
                   {
                       if(kisilerNode[j].isim.equals(kisilerNode[k].isim))
                       {               
                         System.out.println("ID: "+kisilerNode[k].id+" isim: "+kisilerNode[k].isim+" soyisim: "+kisilerNode[k].Soyisim +" Yas: "+ yasBul(kisilerNode[k]));
                         JLabel yaslabel2 = new JLabel("ID: "+Integer.toString(kisilerNode[k].id)+" isim: "+kisilerNode[k].isim+" soyisim: "+kisilerNode[k].Soyisim +" Yas: "+ yasBul(kisilerNode[k]));
                         yaslabel2.setBounds(5, y, 490, 15);
                         yasframe.add(yaslabel2);
                         y=y+15;
                         isimkontrol=true;
                       }
                   }
                   if(isimkontrol)
                   {
                       System.out.println("ID: "+kisilerNode[j].id+" isim: "+kisilerNode[j].isim+" soyisim: "+kisilerNode[j].Soyisim +" Yas: "+ yasBul(kisilerNode[j]));
                         JLabel yaslabel = new JLabel("ID: "+Integer.toString(kisilerNode[j].id)+" isim: "+kisilerNode[j].isim+" soyisim: "+kisilerNode[j].Soyisim +" Yas: "+ yasBul(kisilerNode[j]));
                         yaslabel.setBounds(5, y, 490, 15);
                         yasframe.add(yaslabel);
                         y=y+15;
                   }
                }
            }
        }
        
        yasframe.setSize(500,800);
        yasframe.setLayout(null);
        yasframe.setVisible(true);
        
        
        
    }
     public static int yg=5;
    public static void soymeslekbas(TreeNode RootNode, int kusak ,TreeNode[] kisilerNode , TreeNode[] meslekNodes,JFrame MeslekFrame)
    {
        boolean bitiskontrol=false;
        for(int i=0;i<RootNode.children.size();i++)
        {
            if(RootNode.children.get(i).Meslek.equals(RootNode.Meslek))
            {
                kusak++;
                System.out.println("KUSAK -) "+kusak+"\n"+RootNode.children.get(i));
                JLabel cocuklabel = new JLabel("KUSAK:"+kusak+" Meslek:"+RootNode.children.get(i).Meslek+" ID:"+RootNode.children.get(i).id+" İsim"+RootNode.children.get(i).isim+" Soyisim:"+RootNode.children.get(i).Soyisim);
                cocuklabel.setBounds(5, yg, 490, 15);                
                MeslekFrame.add(cocuklabel);
                yg=yg+20;
                //System.out.println("Y:"+yg);
                bitiskontrol=true;
                soymeslekbas(RootNode.children.get(i), kusak, kisilerNode, meslekNodes,MeslekFrame);
            }
        }
        if(!(bitiskontrol))
        {
            System.out.println("TOTALDE "+ kusak + " TANE KUSAK");
            JLabel sonlabel = new JLabel("TOTALDE "+ kusak + " TANE KUŞAK");
                sonlabel.setBounds(5, yg, 490, 15);                
                MeslekFrame.add(sonlabel);
                yg=yg+20;
        }
        
        
        
    }
   
    public static void aynimeslekleriBul(TreeNode[] kisilerNode)
    {
        JFrame MeslekFrame = new JFrame("Aynı Meslekleri Bul");
        
        ArrayList<String> mesleklerArrayList = new ArrayList<String>();
        ArrayList<String> soyadlariArrayList = new ArrayList<String>();
        for (int i = 1; i < kisilerNode.length; i++) {
            if(!(mesleklerArrayList.contains(kisilerNode[i].Meslek)) && !(kisilerNode[i].Meslek.equals("")))
            {
                mesleklerArrayList.add(kisilerNode[i].Meslek);
            }
            
            if(!(soyadlariArrayList.contains(kisilerNode[i].Soyisim)))
            {
                soyadlariArrayList.add(kisilerNode[i].Soyisim);
            }
            
        }
        
        for (int tmp=0;tmp<soyadlariArrayList.size();tmp++)
        {System.out.println("SoyadlariArraylist->"+tmp+":"+soyadlariArrayList.get(tmp));}
        for (int tmp=0;tmp<mesleklerArrayList.size();tmp++)
        {System.out.println("mesleklerArrayList->"+tmp+":"+mesleklerArrayList.get(tmp));}
        
        
        for (int i = 0; i < mesleklerArrayList.size(); i++) {
           
            ArrayList<TreeNode> mesleklerNodesArrayList = new ArrayList<TreeNode>();
           
            System.out.println("meslek ArrayList Arraylist : "+ mesleklerArrayList.get(i));
            
            for(int j=1;j<kisilerNode.length;j++)
            {
                if(kisilerNode[j].Meslek.equals(mesleklerArrayList.get(i)))
                {
                    mesleklerNodesArrayList.add(kisilerNode[j]);
                }
            }
            TreeNode[] mesleklerNodes = new TreeNode[mesleklerNodesArrayList.size()+1];
            mesleklerNodes[0]=kisilerNode[0];
            for (int j = 1; j < mesleklerNodesArrayList.size()+1; j++) {
                mesleklerNodes[j]=mesleklerNodesArrayList.get(j-1);               
            }
            for (int j = 0; j < mesleklerNodes.length; j++) {
                //System.out.println("mesleklerNodes ->"+j+"\n"+mesleklerNodes[j]+"\n");                
            }
            
            for (int j = 0; j < soyadlariArrayList.size(); j++) {
                if(rootBul(soyadlariArrayList.get(j), mesleklerNodes).id !=0 )
                {
                    TreeNode MeslekRoot = rootBul(soyadlariArrayList.get(j), mesleklerNodes);
                    //System.out.println("MESLEKROOT ("+soyadlariArrayList.get(j)+" nin) Derinlik:"+derinlikBul(MeslekRoot)+"\n"+ MeslekRoot);
                    
                    for (int k=0;k<MeslekRoot.children.size();k++)
                    {
                        if(MeslekRoot.children.get(k).Meslek.equals(MeslekRoot.Meslek))
                        {
                            System.out.println("ATA KUSAK -)"+1+"\n"+MeslekRoot);
                            JLabel atalabel = new JLabel("ATAKUSAK Meslek: "+MeslekRoot.Meslek+" ID:"+MeslekRoot.id+" İsim:"+MeslekRoot.isim+" Soyisim:"+MeslekRoot.Soyisim);
                            atalabel.setBounds(5, yg, 490, 15);
                           // System.out.println("Y:"+yg);
                            MeslekFrame.add(atalabel);
                            yg=yg+20;
                            //System.out.println("Y:"+yg);
                            soymeslekbas(MeslekRoot, 1, kisilerNode, mesleklerNodes,MeslekFrame);
                            break;
                        }
                    }
                    
                    
                }
                
                
                /*if(derinlikBul(MeslekRoot)== 2 )
                {
                    System.out.println("DERINLIK 2");
                    System.out.println("**Baba Meslegi**\n"+MeslekRoot+"\n\n**Cocukların Meslegi***\n");
                    
                    for(int s1=0;s1<MeslekRoot.children.size();s1++)
                    {
                        if(MeslekRoot.Meslek.equals(MeslekRoot.children.get(s1).Meslek))
                        {
                            System.out.println("\n"+MeslekRoot.children.get(s1)+"\n");
                        }
                    }
                    
                }
                
                if(derinlikBul(MeslekRoot)== 3 )//eğer 3 nesilse
                {
                    System.out.println("DERINLIK 3");
                    System.out.println("**Dede Meslegi**\n"+MeslekRoot+"\n\n**Baba Meslegi***\n");
                    
                    for(int s1=0;s1<MeslekRoot.children.size();s1++) //babalar
                    {
                        if(MeslekRoot.Meslek.equals(MeslekRoot.children.get(s1).Meslek))
                        {
                            System.out.println("\n"+MeslekRoot.children.get(s1)+"\n");
                        }
                        System.out.println("\nTorun Mesleği\n");
                        for (int s2=0;s2<MeslekRoot.children.get(s1).children.size();s2++) // torunlar
                        {
                            if(MeslekRoot.children.get(s1).Meslek.equals(MeslekRoot.children.get(s1).children.get(s2).Meslek))
                            {
                                System.out.println("\n"+MeslekRoot.children.get(s1).children.get(s2));
                            }
                        }
                    }
                    
                }*/
                
            }
           MeslekFrame.setSize(500,800);
           MeslekFrame.setLayout(null);
           MeslekFrame.setVisible(true); 
        }
        
        
    }
    
    public static void cocukolmayandugumsirala(TreeNode[] kisilerNode)
    {
       JFrame siralaFrame =new JFrame("Çocuğu olmayan düğümleri sırala");
        siralaFrame.setSize(1400,200);
        siralaFrame.setLayout(null);
        siralaFrame.setVisible(true);
        JLabel goruntu = new JLabel("Baslangıc");
        goruntu.setBounds(5, 5, 1500, 100);
        siralaFrame.add(goruntu);
        ArrayList<TreeNode> cocuguolmayanArrayList = new ArrayList<TreeNode>();
        for (int i = 1; i < kisilerNode.length; i++) {
            if(kisilerNode[i].Medeni_Hali.equals("Bekar"))
            {
                cocuguolmayanArrayList.add(kisilerNode[i]);
            }
            else if(kisilerNode[i].Medeni_Hali.equals("Evli"))
            {
                boolean iscocuksuz=true;
                for(int j=1;j<kisilerNode.length;j++)//cocuk
                {
                    if(kisilerNode[i].Cinsiyet.equals("Erkek") && 
                       kisilerNode[j].Baba_Adi.equals(kisilerNode[i].isim) &&
                       kisilerNode[i].Esi.equals(kisilerNode[j].Anne_Adi+" "+kisilerNode[j].Soyisim))
                    {
                        iscocuksuz=false;
                    }
                    
                    if(kisilerNode[i].Cinsiyet.equals("Kadın") && 
                       kisilerNode[j].Anne_Adi.equals(kisilerNode[i].isim) &&
                       kisilerNode[i].Esi.equals(kisilerNode[j].Baba_Adi+" "+kisilerNode[j].Soyisim))
                    {
                        iscocuksuz=false;
                    }
                    
                }
                if(iscocuksuz)
                {
                    cocuguolmayanArrayList.add(kisilerNode[i]);
                }
            }
        }
        TreeNode[] siralilar=new TreeNode[cocuguolmayanArrayList.size()];
        for(int i=0;i<cocuguolmayanArrayList.size();i++)
        {
           siralilar[i]=cocuguolmayanArrayList.get(i);
           TreeNode tmpNode;
           for (int j=0;j<i;j++)
           {
               for(int k=j+1; k<i+1; k++)
               {
                   String basilacak="";
                   if(yasBul(siralilar[k])<yasBul(siralilar[j]))
                   {
                       tmpNode=siralilar[j];
                       siralilar[j]=siralilar[k];
                       siralilar[k]=tmpNode;
                       for(int s=0;s<i+1;s++)
                       {
                           System.out.print("ID"+siralilar[s].id+" Yas:"+yasBul(siralilar[s])+"|");
                           basilacak=basilacak+"ID"+siralilar[s].id+" Yas:"+yasBul(siralilar[s])+"|"+"\n";
                       }
                         try
                         {
                           Thread.sleep(300);
                         }
                         catch(InterruptedException ex)
                         {
                          Thread.currentThread().interrupt();
                         }
                         goruntu.setText(basilacak);
                       System.out.println("");
                       
                   }
                   
               }
           }
            
        }
        
        
       
       
    }

    public static void main(String[] args) throws FileNotFoundException 
    {
        File inFile = new File("C:\\Users\\asus\\Desktop\\Testdosyalari\\deneme4.csv");
        Scanner inputFile = new Scanner(inFile);
        String str;
        String[] tokens;
        ArrayList<TreeNode> nodelistArray = new ArrayList<TreeNode>();
        
        int j=0;
        while (inputFile.hasNext()) 
        {
            str = inputFile.nextLine();         // read a line of text from the file 
            tokens = str.split(",");            // split the line using commas as delimiter
            int nodeid=Integer.parseInt(tokens[0]);
            nodelistArray.add(new TreeNode(Integer.parseInt(tokens[0]),tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7],tokens[8],tokens[9],tokens[10],tokens[11]));
            j++;
            System.out.print("satir "+j+"-] ");
            for (int i = 0; i < tokens.length; i++) {
                System.out.print(i+"-)"+tokens[i]+"\t");
            }
             System.out.println(" ");
             System.out.println("Sinif denemesi");      
        }
        
        TreeNode[] nodelist = new TreeNode[nodelistArray.size()];
        for(int i=0;i<nodelistArray.size();i++)
        {
            nodelist[i]=nodelistArray.get(i);
        }
        
        int enbuyukid=0;
        for(int i = 0; i < nodelist.length; i++)
        {
            if(nodelist[i]!=null){
            if(nodelist[i].id > enbuyukid) {
                enbuyukid = nodelist[i].id;
            }
            }
        }
        System.out.println("En Buyuk ID = " + enbuyukid);
        
        TreeNode[] kisilerNode = new  TreeNode[enbuyukid+1];
        
        for(int i=0; i<nodelist.length;i++)
        {
            kisilerNode[nodelist[i].id]=nodelist[i];
        }

         for (int i = 0; i < kisilerNode.length; i++) {
            System.out.println("**** kisilerNode:"+i+" ****");
            System.out.println(kisilerNode[i]); 
        }
        System.out.println("kisilerNode.length"+kisilerNode.length);
        
        Ekle(kisilerNode[1], kisilerNode);
        

        //printNAryTree(kisilerNode[1]);
        System.out.println("\nEMİN\n"+kisilerNode[1]);
        for (int s1=0;s1<kisilerNode[1].children.size();s1++)
        {
            System.out.println("\nCOCUK"+s1+"\n\n"+kisilerNode[1].children.get(s1));
            for(int s2=0;s2<kisilerNode[1].children.get(s1).children.size();s2++)
            System.out.println("\nTORUN"+s2+"\n\n"+kisilerNode[1].children.get(s1).children.get(s2));
        }
        //printNAryTree(kisilerNode[14]);
        rootBul("Çelik", kisilerNode);
        //printNAryTree(rootBul("Kaya", kisilerNode));
        //System.out.println("KOD AGACI");
        cocukolmayandugumsirala(kisilerNode);
        JFrame Secimekrani = new JFrame("Seçim Ekranı");
        
        JButton soyagacibas = new JButton("Soy Ağacı Oluştur");
        soyagacibas.setBounds(25, 25, 400, 100);
        soyagacibas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                soyagaciBas(kisilerNode);
            }
            
        });
        Secimekrani.add(soyagacibas);
        
        JButton kangrububul = new JButton("Kan Grubu Bul");
        kangrububul.setBounds(25, 150, 400, 100);
        kangrububul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                KanGrubuBul(kisilerNode);
            }
            
        });
        Secimekrani.add(kangrububul);
        
        JButton ayniismibul = new JButton("Aynı İsmi Bul");
        ayniismibul.setBounds(25, 275, 400, 100);
        ayniismibul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ayniismiBul(kisilerNode);
            }
            
        });
        Secimekrani.add(ayniismibul);
        
        JButton aynimeslekleribul = new JButton("Aynı Meslekleri Bul");
        aynimeslekleribul.setBounds(25, 400, 400, 100);
        aynimeslekleribul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                yg=5;
                aynimeslekleriBul(kisilerNode);
            }
            
        });
        Secimekrani.add(aynimeslekleribul);
        
        JButton cocuklariolmayandugumsirala = new JButton("Çocukları Olmayan Düğümleri Sırala");
        cocuklariolmayandugumsirala.setBounds(25, 525, 400, 100);
        cocuklariolmayandugumsirala.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cocukolmayandugumsirala(kisilerNode);
            }
            
        });
        Secimekrani.add(cocuklariolmayandugumsirala);
        
        Secimekrani.setSize(500,750);
        Secimekrani.setLayout(null);
        Secimekrani.setVisible(true);
        
        for(int sayi=0;sayi<kisilerNode.length;sayi++)
        {
            if(kisilerNode[sayi].children.size()==0)
            {
                System.out.println("cocuk yok ID:"+kisilerNode[sayi].id);
            }
        }
 
        System.out.println("KOD BITTI");
        
    }

}//19 Aralik 23:21