package oop;

public class MethodArgs {

        public static void main(String[] args) {
            MethodArgs test = new MethodArgs();
            test.show(12);
            // test.show("hell0");
            // test.show("hello","world");
            // test.show();

            test.show(new String[] { "AA", "BB", "CC" });
        }

        public void show(int i) {

        }

        public void show(String s){
        System.out.println("show(String)");
        }


        public void show(String... strs) {
            System.out.println("show(String ...strs)");


            for (int i = 0; i < strs.length; i++) {
                System.out.println(strs[i]);
            }
        }

        // 此方法与上一方法不可共存,与上一个方法 形参列表等价
        // public void show(String[] strs){ }

        public void show(int i, String... strs) {

        }
        //The variable argument type String of the method show must be the last parameter
// public void show(String... strs,int i) {
// }

}
