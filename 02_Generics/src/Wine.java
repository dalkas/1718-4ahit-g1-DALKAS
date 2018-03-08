public class Wine extends Drink {
    private final String region;
    public Wine(String region) {
        this.region = region;
    }
    public String getRegion() {
        return this.region;
    }
    public String toString() {
        return this.getClass().getName();
    }
}
