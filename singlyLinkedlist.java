import java.util.Date;

class Square {
    private double sideLength;
    private Date creationDateTime;

    // Parameterized constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.creationDateTime = new Date();
    }

    // Non-parameterized constructor
    public Square() {
        this.sideLength = 0.0;
        this.creationDateTime = new Date();
    }

    // Getter for sideLength
    public double getSideLength() {
        return sideLength;
    }

    // Setter for sideLength
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    // Getter for creationDateTime
    public Date getCreationDateTime() {
        return creationDateTime;
    }

    // Method to calculate and get the area of the square
    public double getArea() {
        return sideLength * sideLength;
    }

    // Override toString method to represent the Square as a string
    @Override
    public String toString() {
        return "Square [sideLength=" + sideLength + ", area=" + getArea() + ", creationDateTime=" + creationDateTime + "]";
    }
}

class Node {
    Square data;
    Node next;

    public Node(Square data) {
        this.data = data;
        this.next = null;
    }
}

class SquareLinkedList {
    private Node head;

    public SquareLinkedList() {
        this.head = null;
    }

    // Method to add a square to the linked list
    public void addSquare(Square square) {
        Node newNode = new Node(square);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display all squares in the linked list
    public void displaySquares() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SquareLinkedList squareList = new SquareLinkedList();

        Square square1 = new Square(5.0);
        Square square2 = new Square(7.0);

        squareList.addSquare(square1);
        squareList.addSquare(square2);

        System.out.println("Squares in the linked list:");
        squareList.displaySquares();
    }
}
