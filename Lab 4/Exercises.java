import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    public int data;
    public Node child;

    public Node(int data) {
        this.data = data;
        this.child = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void sumAdditionOfTwoElements() {
        Node current = head;
        Node nextElement = head.child;

        int i = 0;
        while(i != 5) {
            this.addElement(current.data + nextElement.data);
            Node temp = nextElement;
            current = temp;
            nextElement = nextElement.child;
            i++;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(" " + current.data + " -");
            current = current.child;
        }
        System.out.println("");
    }

    public boolean searchList(int data) {
        if(head == null) return false;

        Node currentElement = head;
        while(currentElement.child != null) {
            if(currentElement.data == data) return true;
            currentElement = currentElement.child;
        }

        return false;
    }

    public void updateElement(int data, int newData) {
        if(head == null) { System.err.print("Element is not on the list"); return; }
        Node currentElement = head;

        while(currentElement != null) {
            if(currentElement.data == data) {
                currentElement.data = newData;
                return;
            }
            currentElement = currentElement.child;
        }
    }

    public void removeElement(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.child;
            return;
        }

        Node currentElement = head;
        Node prevElement = null;
        while (currentElement != null) {
            if (currentElement.data == data) {
                prevElement.child = currentElement.child;
                return;
            }
            prevElement = currentElement;
            currentElement = currentElement.child;
        }

        System.err.println("Element is not on the list!");
    }


    public void addElement(int data) {
        if(head == null) {
            this.head = new Node(data);
        }
        else {
            Node currentElement = head;
            while(currentElement.child != null) currentElement = currentElement.child;
            currentElement.child = new Node(data);
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null) {
            next = current.child;
            current.child = prev;

            prev = current;
            current = next;
        }
        head = prev;
    }
}

public class Exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the index of chosen exercise: ");
            int index = input.nextInt();

            System.out.println("You chose Exercise " + index);
            switch (index) {
                case 1:
                    exerciseOne(input);
                    break;
                case 2:
                    exerciseTwo(input);
                    break;
                case 3:
                    exerciseThree(input);
                    break;
                case 4:
                    exerciseFour(input);
                    break;
                case 5:
                    exerciseFive(input);
                    break;
                case 6:
                    exerciseSix(input);
                    break;
                default:
                    System.err.println("Invalid exercise index!");
                    break;
            }
        }
    }

    public static void exerciseSix(Scanner input) {
        LinkedList linkedList = new LinkedList();
        for(int i=0; i<6; i++) {
            int inputValue = input.nextInt();
            linkedList.addElement(inputValue);
        }

        System.out.println("Linked List: ");
        linkedList.print();

        linkedList.sumAdditionOfTwoElements();

        System.out.println("Linked List after adding new elements: ");
        linkedList.print();
    }

    public static void exerciseFive(Scanner input) {
        LinkedList linkedList = new LinkedList();
        linkedList.addElement(20);
        linkedList.addElement(40);
        linkedList.addElement(60);
        linkedList.addElement(80);

        System.out.println("Linked List: ");
        linkedList.print();

        int element = input.nextInt();
        linkedList.updateElement(element, 100);

        System.out.println("Linked List after removing an element: ");
        linkedList.print();
    }

    public static void exerciseFour(Scanner input) {
        LinkedList linkedList = new LinkedList();
        linkedList.addElement(20);
        linkedList.addElement(40);
        linkedList.addElement(60);
        linkedList.addElement(80);

        int element = input.nextInt();

        boolean ifElement = linkedList.searchList(element);
        System.out.println(element + (ifElement ? " is in the list" : " is not in the list"));
    }

    public static void exerciseThree(Scanner input) {
        LinkedList linkedList = new LinkedList();
        linkedList.addElement(20);
        linkedList.addElement(40);
        linkedList.addElement(60);
        linkedList.addElement(80);

        System.out.println("Linked List: ");
        linkedList.print();

        linkedList.reverse();

        System.out.println("Reversed Linked List: ");
        linkedList.print();
    }

    public static void exerciseTwo(Scanner input) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.println("Enter 5 sorted integers for the first list: ");
        for (int i=0; i<5; i++) list1.add(input.nextInt());

        System.out.println("Enter 5 sorted integers for the second list: ");
        for (int i=0; i<5; i++) list2.add(input.nextInt());

        list1.addAll(list2);
        List<Integer> mergedSortedList = bubbleSort(list1);

        System.out.println("Sorted Merged Arrays: ");
        System.out.print(String.join("-", mergedSortedList.toString()));
        System.out.print("\n");
    }

    public static List<Integer> bubbleSort(List<Integer> list) {
        for(int i=0; i<list.size(); i++) {
            for(int j=0; j<list.size()-1; j++) {
                if(list.get(j) > list.get(j+1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return list;
    }

    public static void exerciseOne(Scanner input) {
        List<String> stringArray = new ArrayList<>();
        String currentInput = "";

        System.out.println("Enter the elements of stringArray, the last element should be 'stop': ");
        while(!currentInput.equals("stop")) {
            currentInput = input.next();
            if (!currentInput.equals("stop")) stringArray.add(currentInput);
        }
        printStringArray(stringArray);
    }

    public static void printStringArray(List<String> stringArray) {
        String line = String.join("-", stringArray);
        System.out.println(line);
    }
}
