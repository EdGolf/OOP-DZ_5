//package Exercise_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsualModel usualModel = new UsualModel();
        View view = new ViewImpl(scanner, System.out);
        Presenter presenter = new Presenter(usualModel, view);
        presenter.execute();
    }
}