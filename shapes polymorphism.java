import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Shape {
    protected String name;
    protected double length;
    protected double width;
    protected double height;
    protected double base;

    public Shape() {
        this.name = "null";
        this.length = -1.0;
        this.width = -1.0;
        this.height = -1.0;
        this.base = -1.0;
    }

    public abstract void shapeData(List<String> store);

    public abstract void insert(String shapename, List<String> store, int index);

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}

class Triangle extends Shape {
    @Override
    public void shapeData(List<String> store) {
        System.out.println("Data Entered Successfully");
        System.out.println("Your Data is:");
        for (String shape : store) {
            System.out.println(shape);
        }
    }

    @Override
    public void insert(String shapename, List<String> store, int index) {
        if (index > 100) {
            System.out.println("Shapes Linkedlist is full. Cannot add more Shapes.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter Base: ");
        double base = scanner.nextDouble();

        String data = "name: " + shapename + ", height: " + height + ", base: " + base;
        store.add(data);

        shapeData(store);
    }
}

class Square extends Shape {
    @Override
    public void shapeData(List<String> store) {
        System.out.println("Data Entered Successfully");
        System.out.println("Your Data is:");
        for (String shape : store) {
            System.out.println(shape);
        }
    }

    @Override
    public void insert(String shapename, List<String> store, int index) {
        if (index > 100) {
            System.out.println("Shapes Linkedlist is full. Cannot add more Shapes.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = scanner.nextDouble();

        String data = "name: " + shapename + ", length: " + length;
        store.add(data);

        shapeData(store);
    }
}

class Rectangle extends Shape {
    @Override
    public void shapeData(List<String> store) {
        System.out.println("Data Entered Successfully");
        System.out.println("Your Data is:");
        for (String shape : store) {
            System.out.println(shape);
        }
    }

    @Override
    public void insert(String shapename, List<String> store, int index) {
        if (index > 100) {
            System.out.println("Shapes Linkedlist is full. Cannot add more Shapes.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter Width: ");
        double width = scanner.nextDouble();

        String data = "name: " + shapename + ", length: " + length + ", width: " + width;
        store.add(data);

        shapeData(store);
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> store = new ArrayList<>();
        int index = 0;
        Triangle triangleObj = new Triangle();
        Square squareObj = new Square();
        Rectangle rectangleObj = new Rectangle();

        for (int i = 0; i < 100; i++) {
            try {
                index++;
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter Shape Name: ");
                String shapename = scanner.nextLine().toLowerCase();

                if (shapename.equals("triangle")) {
                    triangleObj.insert(shapename, store, index);
                } else if (shapename.equals("square")) {
                    squareObj.insert(shapename, store, index);
                } else if (shapename.equals("rectangle")) {
                    rectangleObj.insert(shapename, store, index);
                } else {
                    System.out.println("Unknown Type Error");
                }
            } catch (Exception e) {
                System.out.println("Invalid Type Error");
            }
        }
    }
}
