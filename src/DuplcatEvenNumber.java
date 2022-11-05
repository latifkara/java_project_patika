public class DuplcatEvenNumber {
    static boolean isFind(int[] arr, int value){
        for (int item: arr){
            if (item == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {1, 3, 5,23,12,  93, 3, 2, 45, 12};
        int[] repeatList = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if ((list[i] == list[j]) && (i != j)){
                    if (!isFind(repeatList, list[i])){
                        repeatList[index++] = list[i];

                    }
                    break;
                }
            }
        }

        for (int number: repeatList) {
            if (number != 0){
                System.out.println(number);
            }
        }
    }
}
