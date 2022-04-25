package ujjawal.app;

public class UjjawalLib {
    /**
     * MAIN ENTRY POINT
     * @param args Command line arguments
     */
    public static void main(String args[])
    {
        UjjawalLib obj = new UjjawalLib();
        int sum = obj.addNum(3,4);
        System.out.println("sum = " + sum);
    }

    public int addNum(int a, int b)
    {
        return a + b;
    }
}
