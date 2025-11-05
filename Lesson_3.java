// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1–2) Массив из 5 товаров (автомобили)
        Product[] products = new Product[5];
        products[0] = new Product("Lada Granta", "10.05.2023", "AvtoVAZ", "Россия", 890000.00, true);
        products[1] = new Product("Toyota Camry", "15.02.2024", "Toyota Motor Corp.", "Япония", 3450000.00, false);
        products[2] = new Product("Hyundai Solaris", "22.07.2023", "Hyundai Motor Company", "Корея", 1550000.00, true);
        products[3] = new Product("Volkswagen Polo", "03.11.2022", "VAG", "Германия", 1650000.00, false);
        products[4] = new Product("Kia Rio", "18.09.2023", "Kia Motors", "Корея", 1490000.00, false);

        System.out.println(" Список автомобилей:");
        for (Product product : products) {
            product.printInfo();
        }

        // 3) Парк с внутренним классом Аттракцион
        Park park = new Park("Парк Пушкина");
        park.addAttraction("Карусель", "10:00", "21:00", 200.0);
        park.addAttraction("Тир", "11:00", "22:00", 300.0);
        park.addAttraction("Гидроцикл", "12:00", "20:00", 1200.0);

        System.out.println("\n Расписание парка:");
        park.printSchedule();
    }
}

/** 1) Класс товара (автомобиль). */
class Product {
    private final String name;
    private final String productionDate;
    private final String manufacturer;
    private final String country;
    private final double price;
    private final boolean booked;

    public Product(String name, String productionDate, String manufacturer, String country, double price, boolean booked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.booked = booked;
    }

    public void printInfo() {
        String status = booked ? "забронирован" : "в наличии";
        System.out.printf("%s (%s, %s) — %.2f ₽, %s%n",
                name, manufacturer, country, price, status);
    }
}

/** 3) Класс парк с внутренним классом аттракциона. */
class Park {
    private final String name;
    private final List<Attraction> attractions = new ArrayList<>();

    public Park(String name) {
        this.name = name;
    }

    public void addAttraction(String title, String openTime, String closeTime, double price) {
        attractions.add(new Attraction(title, openTime, closeTime, price));
    }

    public void printSchedule() {
        System.out.println(name + ":");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    /** Внутренний класс для хранения данных об аттракционах. */
    class Attraction {
        private final String title;
        private final String openTime;
        private final String closeTime;
        private final double price;

        public Attraction(String title, String openTime, String closeTime, double price) {
            this.title = title;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.price = price;
        }

        @Override
        public String toString() {
            return String.format("%s (%s–%s) — %.2f ₽", title, openTime, closeTime, price);
        }
    }
}
