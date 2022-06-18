public class MyLinkList {
    MyLink first;
    MyLink last;


    public void addFirst(double value, int id) {
        first = new MyLink(id, value, first);
    }

    public void removeFirst() {
        first = first.next;
    }

    public void addLast(double value) {
        if (first == null) {
            first = last = MyLink.addFirst(value);
            return;
        }
        MyLink current = first;
        while (current.next != null) {
            current = current.next;
        }
        MyLink.addNext(current, value);
    }

    public void removeLast() {
        MyLink current = first;
        MyLink previous = null;
        if (first == null) {
            return;
        }
        if (first.next == null) {
            removeFirst();
            return;
        }
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        last = previous;
    }

    public void addAfterElementWithId(double value, int id) {
        MyLink current = searchById(id);
        MyLink.addNext(current, value);
    }


    public void removeById(int id) {
        MyLink current = first;
        MyLink previous = null;
        while (current != null) {
            if (current.id == id) {
                if (current == first) {
                    first = first.next;
                } else {
                    previous.next = current.next;
                }
            }
            previous = current;
            current = current.next;
        }
    }

    public void show() {
        MyLink current = first;
        while (current != null) {
            System.out.println(current.id + " " + current.value);
            current = current.next;
        }
    }

    public MyLink searchById(int id) {
        MyLink current = first;
        while (current != null) {
            if (current.id == id) {
                break;
            }
            current = current.next;
        }
        return current;
    }

    public MyLink searchByValue(double value) {
        MyLink current = first;
        while (current != null) {
            if (current.value == value) {
                break;
            }
            current = current.next;
        }
        return current;
    }
}
