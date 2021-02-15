public class Complex {

    int x;
    int y;

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0, 0);

        temp.x = n1.x + n2.x;
        temp.y = n1.y + n2.y;

        return temp ;
    }

    public static Complex sub(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0, 0);

        temp.x = n1.x - n2.x;
        temp.y = n1.y - n2.y;

          return temp;
    }
/*public void display()
	{
		System.out.print(x+"+"+y+"i");
	}*/

    public static void main(String[] args) {
        Complex n1 = new Complex(3, 2);

        System.out.println("Complex 1: "+ n1.y + " + "+ n1.x + "i");
        //n1.display();
        Complex n2 = new Complex(4, 4);
        System.out.println("Complex 2: "+ n2.y + " - "+ n2.x + "i");
      
    }

    
}
