public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -5, 3, 15, 12};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true; // da lap xong neu = true
        for (int j = 1; j < list.length && needNextPass; j++) {
            needNextPass = false;
            for (int i = 0; i < list.length - j; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
