
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



           for(int i=0; i<=args.length;i++){
			int place = ip.indexOf(".");
             }
           System.out.println(place);
			

			
	}		

	

          
//args valid
else{
				System.out.println("ip error");
}
		
}

}
