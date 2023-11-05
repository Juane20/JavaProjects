public class Humans {
    int age, money;
    long DNI;
    String firstName, lastName, country;
    public Humans(int a, int m, long D, String f, String l, String c){
        age = a;
        money = m;
        DNI = D;
        firstName = f;
        lastName = l;
        country = c;
    }
    static Humans humanMaker(int maxAge, int maxMoney){
        int ageRandomizer = (int) (Math.random() * (maxAge + 1));
        int moneyRandomizer = (int) (Math.random() * (maxMoney + 1));
        long dniRandomizer = (long) ((Math.random() * 90000000) + 10000000);
        String[] firstNameList = {"Elias", "Adam", "Nat", "Juan", "José", "Daniela", "Gonzalo", "Javier", "Leo"};
        String[] lastNameList = {"Cabrera", "Da Cruz", "Garcia", "Smith", "Doe", "Martinez", "Walker", "Bellingham", "Messi"};
        String[] countryList = {"Argentina", "England", "Spain", "USA", "Mexico", "Uruguay", "Chile", "France", "Ireland"};
        int firstNameRandomizer = (int) (Math.random() * 9);
        int lastNameRandomizer = (int) (Math.random() * 9);
        int countryRandomizer = (int) (Math.random() * 9);
        return new Humans(ageRandomizer, moneyRandomizer, dniRandomizer, firstNameList[firstNameRandomizer], lastNameList[lastNameRandomizer], countryList[countryRandomizer]);
    }

    public static void main(String[] args) {
        Humans randomizedHuman = humanMaker(40, 1000000);
        System.out.println(randomizedHuman.firstName + " " + randomizedHuman.lastName + " is " + randomizedHuman.age + " years old. " + "Has " + randomizedHuman.money + "$." + " DNI: " + randomizedHuman.DNI + ". And is from " + randomizedHuman.country);
    }
}
