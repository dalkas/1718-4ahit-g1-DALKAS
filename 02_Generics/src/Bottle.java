public class Bottle<T> {
    private T content;
    public boolean isEmpty() {
        return (this.content == null);
    }
    public Bottle(T content){
        fill(content);
    }
    public void fill(T content) {
        if (isEmpty() == false) {
            throw new IllegalStateException();
        }
        this.content = content;
    }
    public T empty() {
        if (isEmpty() == true) {
            throw new IllegalStateException();
        }
        T content = this.content;
        this.content = null;
        return content;
    }
    public String toString() {
        return this.getClass().getName();
    }
}

