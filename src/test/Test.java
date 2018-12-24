package test;
import java.util.Scanner;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList<>();
        String line;
        Scanner scan = new Scanner(System.in);
        line = scan.nextLine();
        
        for(String retval : line.split(" ")){
            words.add(retval);
        }

        for (int i=words.size(); i>0 ;i--){
            for (int j=0; j<i-1; j++){
                if (words.get(j).length() > words.get(j+1).length()){
                    String tmp=words.get(j);
                    words.set(j,words.get(j+1));
                    words.set(j+1,tmp);
                }
            }
        }
        
        for (int i=0;i<words.size();i++){
            System.out.print(words.get(i)+" ");
        }
    }
    
}
