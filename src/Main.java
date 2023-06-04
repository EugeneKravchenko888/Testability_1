public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500

        System.out.println();
        System.out.println("Сумма билета: "+price +"рублей");
        System.out.println("Премиальные мили составили: ");
        System.out.println("-"+miles +"  миль");
        System.out.println("____________________________");
    }
}
