public class Beer extends Drink {
    private final String brewery;
    public Beer(String brewery) {
        this.brewery = brewery;
    }
    public String getBrewery() {
        return this.brewery;
    }
    public String toString() {
        return this.getClass().getName() + ": [brand = " + this.brewery + "]";
    }
}

