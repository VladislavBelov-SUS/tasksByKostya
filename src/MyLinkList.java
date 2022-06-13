public class MyLinkList {
    MyLink first;
    MyLink last;


    public void addFirst(double value, int id) {
        MyLink myLink = new MyLink();
        myLink.value = value;
        myLink.id = id;
        myLink.next = first;
        first = myLink;
    }

    public void removeFirst() {
        first = first.next;
    }

    public void addLast(double value) {
        MyLink newLink = new MyLink();
        MyLink current = first;
        newLink.value = value;
        if (first == null) {
            first = last = newLink;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = newLink;
    }

    public void removeLast() {
        MyLink current = first;
        MyLink previous = null;
        if (first == null) {
            return;
        }
        if (first.next == null) {
            removeFirst();
        }
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        last = previous;
    }

    public void addById(double value, int id) {
        MyLink newLink = new MyLink();
        newLink.id = id;
        newLink.value = value;
        MyLink current = first;
        MyLink previous = null;
        while (current != null) {
            if (current.id == id) {
                if (current == first) {
                    first = first.next;
                } else {
                    previous = current;
                }
            }
            current = newLink;
            current.next = newLink.next;
        }
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
