
public class TryCatchFinally
      {
    public static void main(String[] args) {
        String[] str = new String[5];
        try {
            String string = str[6];
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("\n" + "Exception has been caught");

        } finally {
            System.out.println("\n" + "finally has been executed");
        }
    }
      }