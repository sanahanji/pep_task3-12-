

import java.io.*;
import java.util.*;

public class Task3 {

	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static Scanner br = new Scanner(System.in);
    static{
        try {
            bw.write("Enter the area of in square feet : ");
            bw.flush();
            float area=br.nextFloat();
            bw.write("\nEnter \n 1.standard material \n 2.high quality material \n Enter the no. :  ");
            bw.flush();
            int ch1=br.nextInt();
            bw.write("\nEnter \n 1.simple house \n 2.automated house \n Enter the no. :  ");
            bw.flush();
            int ch2=br.nextInt();
            if(ch1==1 && ch2==1){
            	area=area*1200;
            	bw.write("\n Estimated cost for simple house with standard material is "+area+"INR");
            }else if(ch1==1 && ch2==2){
            	area=area*1500;
            	bw.write("\n Estimated cost for automated house with standard material is "+area+"INR");
            }else if(ch1==2 &&ch2==1){
            	area=area*1800;
            	bw.write("\n Estimated cost for simple house with high quality material is "+area+"INR");
            }else if(ch1==2 && ch2==2){
            	area=area*2500;
            	bw.write("\n Estimated cost for automated house with high quality material is "+area+"INR");
            }else
            	bw.write(" INVALID OPTION ");
            bw.close();
            br.close();
            
        } catch (IOException ex) {
        }
        System.exit(0);
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
