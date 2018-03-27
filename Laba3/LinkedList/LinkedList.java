package Prometheus;
public class LinkedList {
    private Node tail;
    private Node head;
    private int size = 0;
    public LinkedList() {
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
    }
    public void add(Integer data) {
        //PUT YOUR CODE HERE
        Node newNode = new Node();
        newNode.setData(data);
        if (size == 0)
            head = newNode;
        else
            tail.setNext(newNode);

        tail = newNode;
        size++;
        //PUT YOUR CODE HERE
    }
    public Integer get(int index) {
        //PUT YOUR CODE HERE
        return findNodeByIndex(index).getData();
        //PUT YOUR CODE HERE
    }
    public boolean delete(int index) {
        //PUT YOUR CODE HERE
        if (findNodeByIndex(index) != null ) {

            if (index != 0)
                findNodeByIndex(index - 1).setNext(findNodeByIndex(index+1));
            else
                head = head.getNext();

            size--;
            return true;
        }
        return false;
        //PUT YOUR CODE HERE
    }

    public int size() {
        //PUT YOUR CODE HERE
        return size;
        //PUT YOUR CODE HERE
    }
    private Node findNodeByIndex(int index) {
        if (index < size && index >= 0) {
            Node curNode = head;
            int curIndex = 0;
            while (curIndex < index){
                if (curNode.getNext() != null) {
                    curNode = curNode.getNext();
                    curIndex++;
                }
            }
            return curNode;
        }
        else
            return null;
    }
}