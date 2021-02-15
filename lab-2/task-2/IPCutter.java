
import java.util.StringTokenizer;

public class IPCutter {
	



public static void main (String args []) {

    //check arhs
	if(args.length  > 0) {

         //
		String ip = args[0];

		String arr [] = ip.split("\\.");

		//System.out.println("length is : "+arr.length);
        for (String identifier : arr)
           {
               if(!identifier.equals("")){
				System.out.println(identifier);
             }

           }
		System.out.println("/////////////////////////////////////// ip two");
/*
		System.out.println("/////////////////////////////////////// ip two");
         int p=ip.indexOf(".");
          String s = ip.substring(0,posiotion == -1 ? ip.length() : posiotion );
            if(!s.equals(""))
				System.out.println(s);

			if(posiotion == -1) 
				break;

			ip = ip.substring(posiotion+1 , ip.length());*/


while (ip.length() > 0) {
			
			int posiotion = ip.indexOf(".");
			
			

			String s = ip.substring(0,posiotion == -1 ? ip.length() : posiotion );
			
			if(!s.equals(""))
				System.out.println(s);

			if(posiotion == -1) 
				break;

			ip = ip.substring(posiotion+1 , ip.length());
		}

          }

//args valid
else{
				System.out.println("ip error");
}
		
}

}
