import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Plain Text: ");
    String text=scan.nextLine();
    System.out.print("Enter the Key Value: ");
    String key=scan.nextLine();
    int e,k1;
    int d,k2;
    String enc=new String("");
    String dec=new String("");
    char[] alphabets={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    int j=0;
    for(int i=0;i<text.length();i++){
        if(j>=key.length()){
            j=0;
        }
        e=(text.charAt(i)+key.charAt(j)-130)%26;
        enc=enc+alphabets[e];
        j++;
       
    }
    int x=0;
    for(int i=0;i<enc.length();i++)
    {
        if(x>=key.length()){
            x=0;
        }
        d=(enc.charAt(i)-key.charAt(x)-130)%26;
        if(d<0){
            d=((enc.charAt(i)-key.charAt(x)-130)%26)+26;
        }
       
        
        
        dec=dec+alphabets[d];
        x++;
    }
    System.out.println(enc);
    System.out.println(dec);
	}
}
