class Hillstations {
    void famousfor() {
        System.out.println("Hillstation is famous for its beauty.");
    }

    void famousfood() {
        System.out.println("Hillstation has local special food.");
    }
}

// Subclass 1
class Manali extends Hillstations {
    void famousfor() {
        System.out.println("Manali is famous for snow and mountains.");
    }

    void famousfood() {
        System.out.println("Manali is famous for Siddu.");
    }
}

// Subclass 2
class Ooty extends Hillstations {
    void famousfor() {
        System.out.println("Ooty is famous for tea gardens.");
    }

    void famousfood() {
        System.out.println("Ooty is famous for chocolates.");
    }
}

// Subclass 3
class Darjeeling extends Hillstations {
    void famousfor() {
        System.out.println("Darjeeling is famous for tea and hills.");
    }

    void famousfood() {
        System.out.println("Darjeeling is famous for momos.");
    }
}

public class Main {
    public static void main(String[] args) {

        Hillstations h;

        h = new Manali();
        h.famousfor();
        h.famousfood();

        h = new Ooty();
        h.famousfor();
        h.famousfood();

        h = new Darjeeling();
        h.famousfor();
        h.famousfood();
    }
}