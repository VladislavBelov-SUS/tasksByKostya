public class MainLL {
    public static void main(String[] args) {
        MyLinkList ll = new MyLinkList();
        ll.addFirst(55, 1);
        ll.removeLast();
        ll.addFirst(45, 2);
        ll.addFirst(565, 3);
        ll.addFirst(550, 4);
        MyLink search = ll.searchById(2);
        System.out.println(search.id + " " + search.value);
        ll.addLast(78);
        ll.addAfterElementWithId(89, 4);
        ll.removeLast();
        ll.removeById(5);
        ll.show();
        ll.searchByValue(89);
    }
}
