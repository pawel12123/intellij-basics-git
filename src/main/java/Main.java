public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, Amigos");
        Person person = new Person("Pawel", 23);
        System.out.println(person.getName());
        Service service = new Service(529);
        String out = service.toString();
        System.out.println(out);
    }
}
