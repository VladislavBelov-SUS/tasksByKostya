public class MyLink {
    public static final int FIRST_ID = 0;

    int id;
    double value;
    MyLink next;

    public MyLink() {
    }

    public MyLink(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public MyLink(int id, double value, MyLink next) {
        this.id = id;
        this.value = value;
        this.next = next;
    }

    public int getId() {
        return id;
    }

    public static MyLink addFirst(double value) {
        return new MyLink(FIRST_ID, value);
    }

    public static void addNext(MyLink current, double value) {
        MyLink currentNext = null;
        if(current.next != null) {
            currentNext = current.next;
        }
        int newId = current.getId() + 1;
        current.next = new MyLink(newId, value, currentNext);
    }
}
