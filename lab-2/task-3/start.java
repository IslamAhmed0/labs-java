

public class start {

  public static void main(String[] args) {
    int rows =args.length;
	float x = Float.parseFloat(rows);
    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }

    



  }
}

