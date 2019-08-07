public class Main {

    public static void main(String[] args) {
        System.out.println("Home Work");

        String name = "Tony Stark";
        int age = 44;
        long temperature = 40;

        if ((temperature > 30 || temperature < -20) && (age > 20 || age < 45)) {
            System.out.println(name + " не выходит гулять.");
        } else {
            System.out.println(name + " идет к своему другу в гости.");
        }


        if (age < 20 && (temperature > 0 || temperature < 28)) {
            System.out.println(name + " не выходит гулять.");
        } else {
            System.out.println(name + " идет к своему другу.");
        }


        if ((age > 45) && temperature > -10 || temperature < 25) {
            System.out.println(name + " не выходит гулять.");
        } else {
            System.out.println(name + " идет к своему другу.");
        }
    }
}
