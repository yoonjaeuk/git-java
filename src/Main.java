//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone myiPhone = new iPhone();
        Phone mySamsung = new Samsung();

        String iPhoneperson = "잡스";
        String samsungperson = "재용";
        String iPhoneBrand = "애플";
        String samsungBrand = "삼송";

        myiPhone.buy(iPhoneperson, iPhoneBrand);
        myiPhone.tunrOn(samsungperson, iPhoneBrand);
        myiPhone.turnOnIng();

        System.out.println();

        mySamsung.buy(iPhoneperson, samsungBrand);
        mySamsung.tunrOn(samsungperson, samsungBrand);
        mySamsung.turnOnIng();

        }
    }
