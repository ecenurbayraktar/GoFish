package gofish;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class main {	
	
	public static int getFirstElement(SingleLinkedList list) {
		int number=0;
		Node N=list.head;
		number=(Integer)N.getData();
		return number;
	}
	

	public static boolean ifBook(SingleLinkedList list) {
			int count=1;
			Node N=list.head;
			boolean flag=false;
			while(N.getLink()!=null) {
				if(N.getData()==N.getLink().getData()) {
					count++;
					if(count==4) {
						flag=true;
					}
				}
				else {
					count=1;
				}
				N=N.getLink();
			}
			return flag;
	}
	
	public static int bookNumber(SingleLinkedList list) {
			int count=1;
			int number=0;
			Node N=list.head;
			while(N.getLink()!=null) {
				if(N.getData()==N.getLink().getData()) {
					count++;
					if(count==4)
						number=(Integer)N.getData();
				}
				else
					count=1;
				N=N.getLink();
				
			}
			return number;
	}
	public static int howMany(int n,SingleLinkedList list) {
		int count=0;
		Node N=list.head;
		while(N!=null) {
			if((Integer)N.getData()==n) {
				count++;
			}
			N=N.getLink();
		}
		return count;
		
	}
	public static int getRandomIntforPc(SingleLinkedList list,int n) {
			Node N=list.head;
			for(int i=0;i<n;i++) {
				N=N.getLink();
			}
			return (Integer)N.getData();
	}
	
	
	public static void main(String[] args) throws IOException {
		Random random=new Random();
		
		
		SingleLinkedList sll1=new SingleLinkedList();
		SingleLinkedList sll2=new SingleLinkedList();
		SingleLinkedList sll3=new SingleLinkedList();
		DoubleLinkedList dll1=new DoubleLinkedList();
		DoubleLinkedList dll2=new DoubleLinkedList();
		
		int bookhuman=0;
		int bookpc=0;
		
		int c1=4;
		int c2=4;
		int c3=4;
		int c4=4;
		int c5=4;
		int c6=4;
		
		
		
		
		
		
		
		while(sll1.size()<7) {
			
			int n=random.nextInt(6)+1;
			if(n==1) {
				if(c1!=0) {
					sll1.sortedAdd(1);
					c1--;
					
				}
				
			
			}
			else if(n==2) {
					if(c2!=0) {
						sll1.sortedAdd(2);
						c2--;
						
					}
			}
			else if(n==3) {
				if(c3!=0) {
					sll1.sortedAdd(3);
					c3--;
					
				}
			}
			else if(n==4) {
				if(c4!=0) {
					sll1.sortedAdd(4);
					c4--;
					
				}
			}
				
			else if(n==5) {
				if(c5!=0) {
					sll1.sortedAdd(5);
					c5--;
					
				}
			}
				
			else {
				if(c6!=0) {
					sll1.sortedAdd(6);
					c6--;
					
				}
			}
				
		}
		
		
		//computer kartları
		while(sll2.size()<7) {
			int n=random.nextInt(6)+1;
			if(n==1) {
				if(c1!=0) {
					sll2.sortedAdd(1);
					c1--;
				}
				
			
			}
			else if(n==2) {
					if(c2!=0) {
						sll2.sortedAdd(2);
						c2--;
					}
			}
			else if(n==3) {
				if(c3!=0) {
					sll2.sortedAdd(3);
					c3--;
				}
			}
			else if(n==4) {
				if(c4!=0) {
					sll2.sortedAdd(4);
					c4--;
				}
			}
				
			else if(n==5) {
				if(c5!=0) {
					sll2.sortedAdd(5);
					c5--;
				}
			}
				
			else {
				if(c6!=0) {
					sll2.sortedAdd(6);
					c6--;
				}
			}
				
		}
		//table
		while(sll3.size()<10) {
			int n=random.nextInt(6)+1;
			if(n==1) {
				if(c1!=0) {
					sll3.unSortedAdd(1);
					c1--;
				}
				
			
			}
			else if(n==2) {
					if(c2!=0) {
						sll3.unSortedAdd(2);
						c2--;
					}
			}
			else if(n==3) {
				if(c3!=0) {
					sll3.unSortedAdd(3);
					c3--;
				}
			}
			else if(n==4) {
				if(c4!=0) {
					sll3.unSortedAdd(4);
					c4--;
				}
			}
				
			else if(n==5) {
				if(c5!=0) {
					sll3.unSortedAdd(5);
					c5--;
				}
			}
				
			else {
				if(c6!=0) {
					sll3.sortedAdd(6);
					c6--;
				}
			}
				
		}
		
		
		
		
		
		int turn=1;
		//ilk dağıtımda book var mı diye kontrol
		if(ifBook(sll1)&&ifBook(sll2)) {
			bookhuman++;
			bookpc++;
			int bookedh=bookNumber(sll1);
			
			
			System.out.println("Turn: "+turn+"                                   Table");
			System.out.print("You:      ");
			sll1.display();
			System.out.print("     Book="+bookhuman+"       ");
			sll3.display();
			System.out.println();
			System.out.print("Computer: ");
			sll2.display();
			System.out.print("     Book="+bookpc+"                                        ");
			System.out.println();
			System.out.println();
			for(int i=0;i<4;i++) {
				System.out.print(bookedh+" ");
			}
			System.out.print("              ");
			int bookedpc=bookNumber(sll2);
			for(int i=0;i<4;i++) {
				System.out.print(bookpc+" ");
			}
			System.out.println();
			sll1.delete(bookedh);
			sll2.delete(bookedpc);
			
			System.out.println("Turn: "+turn+"                                   Table");
			System.out.print("You:      ");
			sll1.display();
			System.out.print("     Book="+bookhuman+"       ");
			sll3.display();
			System.out.println();
			System.out.print("Computer: ");
			sll2.display();
			System.out.print("     Book="+bookpc+"                                        ");
			System.out.println();
			System.out.println();
			
		}
		else if(ifBook(sll1)&&(!ifBook(sll2))) {
			bookhuman++;
			int bookedh=bookNumber(sll1);
			
			
			System.out.println("Turn: "+turn+"                                   Table");
			System.out.print("You:      ");
			sll1.display();
			System.out.print("     Book="+bookhuman+"       ");
			sll3.display();
			System.out.println();
			System.out.print("Computer: ");
			sll2.display();
			System.out.print("     Book="+bookpc+"                                        ");
			System.out.println();
			System.out.println();
			for(int i=0;i<4;i++) {
				System.out.print(bookedh+" ");
			}
			System.out.println();
			sll1.delete(bookedh);
			
			System.out.println("Turn: "+turn+"                                   Table");
			System.out.print("You:      ");
			sll1.display();
			System.out.print("     Book="+bookhuman+"       ");
			sll3.display();
			System.out.println();
			System.out.print("Computer: ");
			sll2.display();
			System.out.print("     Book="+bookpc+"                                        ");
			System.out.println();
			System.out.println();
			
			
			
		}
		else if(ifBook(sll2)&&(!ifBook(sll1))) {
			bookpc++;
			int bookedpc=bookNumber(sll2);
			
			
			System.out.println("Turn: "+turn+"                                   Table");
			System.out.print("You:      ");
			sll1.display();
			System.out.print("     Book="+bookhuman+"       ");
			sll3.display();
			System.out.println();
			System.out.print("Computer: ");
			sll2.display();
			System.out.print("     Book="+bookpc+"                                        ");
			System.out.println();
			System.out.println();
			for(int i=0;i<4;i++) {
				System.out.print(bookedpc+" ");
			}
			System.out.println();
			sll2.delete(bookedpc);
			
			System.out.println("Turn: "+turn+"                                   Table");
			System.out.print("You:      ");
			sll1.display();
			System.out.print("     Book="+bookhuman+"       ");
			sll3.display();
			System.out.println();
			System.out.print("Computer: ");
			sll2.display();
			System.out.print("     Book="+bookpc+"                                        ");
			System.out.println();
			System.out.println();
			
			
			
		}
		else {
			System.out.println("Turn: "+turn+"                                   Table");
			System.out.print("You:      ");
			sll1.display();
			System.out.print("     Book="+bookhuman+"       ");
			sll3.display();
			System.out.println();
			System.out.print("Computer: ");
			sll2.display();
			System.out.print("     Book="+bookpc+"                                        ");
			System.out.println();
			System.out.println();
		}
		
		
		
		
		
		
		
			

		
		
		Scanner scn=new Scanner(System.in);
		
	
		
		int firstcard;
		while(!sll1.isEmpty() && !sll2.isEmpty()) {
			if((!sll1.isEmpty())&&(!sll2.isEmpty())) {
				System.out.print("You ask: ");
				int newcard=scn.nextInt();
				if(!sll1.search(newcard)) {//kartın elimizde olup olmadığını kontrol ediyor
					System.out.println("You do not have this card.");
				}
				else {
					if(sll2.search(newcard)) {//kart bilgisayarın elinde mi diye kontrol ediyor
						for(int i=0;i<howMany(newcard,sll2);i++) {
							sll1.sortedAdd(newcard);
						}
						if(howMany(newcard,sll1)==4) {//book var mı diye kontrol
							System.out.println();
							for(int i=0;i<4;i++) {
								System.out.print(newcard+" ");
							}
							System.out.println();
								sll1.delete(newcard);
								sll2.delete(newcard);
							bookhuman++;
							turn++;
							System.out.println("Turn: "+turn+"                                   Table");
							System.out.print("You:      ");
							sll1.display();
							System.out.print("     Book="+bookhuman+"       ");
							sll3.display();
							System.out.println();
							System.out.print("Computer: ");
							sll2.display();
							System.out.print("     Book="+bookpc+"                                        ");
							System.out.println();
							System.out.println();
						}
						else {//book yoksa
							sll2.delete(newcard);
							turn++;
							System.out.println("Turn: "+turn+"                                   Table");
							System.out.print("You:      ");
							sll1.display();
							System.out.print("     Book="+bookhuman+"       ");
							sll3.display();
							System.out.println();
							System.out.print("Computer: ");
							sll2.display();
							System.out.print("     Book="+bookpc+"                                        ");
							System.out.println();
							System.out.println();
						}
					}
					else {
						//tabledan aldığın sayı book mu diye kontrol
						firstcard=getFirstElement(sll3);
						sll1.sortedAdd(firstcard);
						sll3.deleteFirstElement(firstcard);
						if(howMany(firstcard,sll1)==4) {
							System.out.println();
							for(int i=0;i<4;i++) {
								System.out.print(firstcard+" ");
							}
							System.out.println();
							sll1.delete(firstcard);
							
							bookhuman++;
							turn++;
							System.out.println("Turn: "+turn+"                                   Table");
							System.out.print("You:      ");
							sll1.display();
							System.out.print("     Book="+bookhuman+"       ");
							sll3.display();
							System.out.println();
							System.out.print("Computer: ");
							sll2.display();
							System.out.print("     Book="+bookpc+"                                        ");
							System.out.println();
							System.out.println();
							System.out.println("Computer says: Go fish!");
						}
						else {//book değilse
							turn++;
							System.out.println("Turn: "+turn+"                                   Table");
							System.out.print("You:      ");
							sll1.display();
							System.out.print("     Book="+bookhuman+"       ");
							sll3.display();
							System.out.println();
							System.out.print("Computer: ");
							sll2.display();
							System.out.print("     Book="+bookpc+"                                        ");
							System.out.println();
							System.out.println();
							System.out.println("Computer says: Go fish!");
							
						}
						while(!sll1.isEmpty() && !sll2.isEmpty()) {//sıra computerda olduğunda
							int n=random.nextInt(sll2.size());
							int randomcard=getRandomIntforPc(sll2,n);
							System.out.println("Computer asks= "+randomcard);
							if(sll1.search(randomcard)) {
								for(int i=0;i<howMany(randomcard,sll1);i++) {
									sll2.sortedAdd(randomcard);
								}
								if(howMany(randomcard,sll2)==4) {//book var mı diye kontrol
									System.out.println();
									for(int i=0;i<4;i++) {
										System.out.print(randomcard+" ");
									}
									System.out.println();
									sll1.delete(randomcard);
									sll2.delete(randomcard);
									bookpc++;
									turn++;
									System.out.println("Turn: "+turn+"                                   Table");
									System.out.print("You:      ");
									sll1.display();
									System.out.print("     Book="+bookhuman+"       ");
									sll3.display();
									System.out.println();
									System.out.print("Computer: ");
									sll2.display();
									System.out.print("     Book="+bookpc+"                                        ");
									System.out.println();
									System.out.println();
								}
								else {//book değilse
									sll1.delete(randomcard);
									turn++;
									System.out.println("Turn: "+turn+"                                   Table");
									System.out.print("You:      ");
									sll1.display();
									System.out.print("     Book="+bookhuman+"       ");
									sll3.display();
									System.out.println();
									System.out.print("Computer: ");
									sll2.display();
									System.out.print("     Book="+bookpc+"                                        ");
									System.out.println();
									System.out.println();
								}
							}
							else {
								//pcnin tabledan alması
								firstcard=getFirstElement(sll3);
								sll2.sortedAdd(firstcard);
								sll3.deleteFirstElement(firstcard);
								if(howMany(firstcard,sll2)==4) {//book varsa ve tabledan alınmışsa
									System.out.println();
									for(int i=0;i<4;i++) {
										System.out.print(firstcard+" ");
									}
									System.out.println();
									sll2.delete(firstcard);
									
									bookpc++;
									turn++;
									System.out.println("Turn: "+turn+"                                   Table");
									System.out.print("You:      ");
									sll1.display();
									System.out.print("     Book="+bookhuman+"       ");
									sll3.display();
									System.out.println();
									System.out.print("Computer: ");
									sll2.display();
									System.out.print("     Book="+bookpc+"                                        ");
									System.out.println();
									System.out.println();
									System.out.println("You say: Go fish!");
									break;//sıranın kullanıcıya geçmesi için
								}
								else {
									turn++;
									System.out.println("Turn: "+turn+"                                   Table");
									System.out.print("You:      ");
									sll1.display();
									System.out.print("     Book="+bookhuman+"       ");
									sll3.display();
									System.out.println();
									System.out.print("Computer: ");
									sll2.display();
									System.out.print("     Book="+bookpc+"                                        ");
									System.out.println();
									System.out.println();
									System.out.println("You say: Go fish!");
									break;
								}
							}
							
						}
					}
				}
			}
			
			
		}
		
		
		
		//highscoretable path burada
		File Score=new File("D:\\highscore.txt");
		Scanner s=new Scanner(System.in);
		boolean flag;
		if(sll1.isEmpty()) {
			System.out.println("You won!");
			flag=true;
			
			
			
		}
		else {
			System.out.println("Computer won!");
			flag=false;
		}
		
		
		
		if(flag) {
			System.out.print("Enter your name:  ");
			String name=s.nextLine();
			
			FileWriter f=new FileWriter("D:\\highscore.txt",true);
			f.write(name+" "+turn+"\n");
			f.close();
		}
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
