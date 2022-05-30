public class Main {

    public static void main(String[] args) {
        System.out.println("Enter array length: ");


        MyArray array = new MyArray();
        array.filling();
        array.inputArrayElement();
        array.eraseArrayElement();
        array.searchArrayIndex();
        array.searchArrayElement();


    }
}
/*     for(int i=index;i<arr.length;i++){
        newArr[i+1]=arr[i];
        }
        for(int i:newArr){
        System.out.println(i);
        }*/