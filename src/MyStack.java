public class MyStack implements StackArray {

    public MyStack() {
    }

    int[] array = new int[0];


    @Override
    public void push(int item) {
        int[] newArray = new int[array.length + 1];//[1,2,3] --- [0,0,0,0](4)
        newArray[array.length] = item;//[0,0,0,item]
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];//[1,0,0,item]---[1,2,0,item]---[1,2,3,item]
        }
        this.array = newArray;
        show();
    }

    public void show() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    @Override
    public int pop() {
        int last = array[array.length - 1];
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        this.array = newArray;
        show();

        return last;

    }

    @Override
    public boolean isEmpty() {
        return array.length==0;
    }
}

