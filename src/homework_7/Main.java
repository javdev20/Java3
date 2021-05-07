package homework_7;

import homework_7.mytesting.TestsHandler;

public class Main {
    public static void main(String[] args) {

        ClassForTesting classForTesting = new ClassForTesting();
        TestsHandler.start(classForTesting.getClass());


        System.out.println();
        ClassExplorer.outClassInfo(String.class);
    }
}
