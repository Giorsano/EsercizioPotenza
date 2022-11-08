public class Main {

    public static void main(String[] args) {
        Potenza potenza1 = new Potenza(5, 2);




        System.out.println(potenza1);
        potenza1.cambioBase(10);
        System.out.println(potenza1);
        potenza1.cambioBase(20);
        System.out.println(potenza1);
    }
}
