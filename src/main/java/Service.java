public class Service {

    private final Integer cost;
    private final Person person = new Person("Adam", 54);

    public Service(Integer cost) {
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Service{" +
                "cost=" + cost +
                ", person=" + person.getName() + " | " + person.getAge() +
                '}';
    }
}

