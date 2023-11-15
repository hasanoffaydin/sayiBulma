// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,5,7,8,11,17};
        int axtarilan = 36;
        boolean cavab = false;
        for(int sayi : sayilar)
        {
            if(sayi == axtarilan)
            {
                cavab = true;
            }
        }
        if(cavab)
        {
            System.out.println("Reqem Massivde Var ;)");
        }
        else
        {
            System.out.println("Reqem Massivde Yoxdur ;)");
        }
    }
}