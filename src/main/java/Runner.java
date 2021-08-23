public class Runner {

    public static void main(String[] args) {
        Planet planet = new Planet("Earth", 90000);
        String name = planet.getName();
        Integer size = planet.getSize();
        System.out.println(name);
        System.out.println(size);
        planet.setName("Mars");
        String message = planet.explode();
        System.out.println(message);
    }
}
