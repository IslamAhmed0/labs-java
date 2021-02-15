
import java.util.StringTokenizer;

public class IPCutter {
	
public static void main (String args []) {



if(args.length  > 0) {

 String ip = args[0];

/*   limt  
   String[] output = phone.split("-", 2);*/

        String[] output = ip.split("\\.");
        System.out.println(output.length);       // 3

        for (String s : output) {
            System.out.println(s);
        }


            System.out.println("-------------------");
  StringTokenizer st = new StringTokenizer(ip,"\\.");
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }


            System.out.println("-------------------");
        for(int i=0; i<=ip.length();i++){


         int space = ip.indexOf(".");
			
			String s = ip.substring(0,space == -1 ? ip.length() : space);


			//String s = ip.substring(0, ip.length());
			

				System.out.println(s);
			ip = ip.substring(space+1 , ip.length());




        }
 
	


}






















else
{
		System.out.println("enter ip");

}

			

			
	}		

}
