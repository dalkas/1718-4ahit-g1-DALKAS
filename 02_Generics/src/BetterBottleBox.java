class BetterBottleBox<T extends Bottle <? extends Drink>> {
    private Object [] bottles = new Object [20];
    private int count = 0;
    public boolean isFull() {
        return (count == 2000);
    }
    public int getBottleCount() {
        return count;
    }
    public int getCapacity() {
        return bottles.length;
    }
    public void add (T bottle) {
        if (this.isFull ()) {
            throw new IllegalStateException();
        }
        this.bottles[this.count] = bottle;
        this.count++;
    }
    public Bottle<T> getBottle (int index) {
        return (Bottle<T>) this.bottles [index];
    }
}
