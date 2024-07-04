public class Samsung implements Phone{

    public void buy(String person, String brand){
        System.out.println(person + "님이" + brand + "폰을 구매했습니다");
    }

    public void tunrOn(String person,  String brand){
        System.out.println(person + "님이" + brand + "폰을 켰습니다");
    }

    public void turnOnIng(){
        System.out.println("@@@ 폰 켜지는 중");
    }
}
