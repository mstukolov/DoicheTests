package trash;

/**
 * Данный класс реализует двоичное дерево поиска  с методоы для работы с ним.
 * @author Stukolov Maxim
 * @since 01/01/2016
 * @version 12.0.4
 *
 */
public class BinaryMaxDepth {

    /**
     *
     * @param args
     * Точка входа в программу
     */
    public static void main(String[] args) {
        BSTree<Integer, Integer> treeSearch = new BSTree<Integer, Integer>();

        integral(1D, 2D);


        /*treeSearch.add(10,12);
        treeSearch.add(4,888);
        treeSearch.add(5,544);
        treeSearch.add(35,34);
        treeSearch.add(1,221);
        treeSearch.add(45,25);
        treeSearch.add(76,25);*/

        //int maxDepth = treeSearch.getMaxDepth();

    }

    public static void integral(double x0, double x1){
        double dx = 0.00000001, x = 0;
        double y, z = 0;

        while(x <= x1){
            x += x0 + dx;
            y = x;
            z += y*dx;
        }
        System.out.println("Интеграл равен: " + z);
    }
}

class BSTree<T1 extends Comparable<T1>, T2> {
    static class Node<T1, T2> {
        T1 key;
        T2 value;
        Node<T1, T2> left, right;

        Node(T1 key, T2 value) {
            this.key = key;
            this.value = value;
        }
    }
    private Node<T1, T2> root = null;
    public boolean containsKey(T1 k) {
        Node<T1, T2> x = root;
        while (x != null) {
            int cmp = k.compareTo(x.key);
            if (cmp == 0) {
                return true;
            }
            if (cmp < 0) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return false;
    }
    public T2 get(T1 k) {
        Node<T1, T2> x = root;
        while (x != null) {
            int cmp = k.compareTo(x.key);
            if (cmp == 0) {
                return x.value;
            }
            if (cmp < 0) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return null;
    }

    public void add(T1 k, T2 v) {
        Node<T1, T2> x = root, y = null;
        while (x != null) {
            int cmp = k.compareTo(x.key);
            if (cmp == 0) {
                x.value = v;
                return;
            } else {
                y = x;
                if (cmp < 0) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }
        }
        Node<T1, T2> newNode = new Node<T1, T2>(k, v);
        if (y == null) {
            root = newNode;
        } else {
            if (k.compareTo(y.key) < 0) {
                y.left = newNode;
            } else {
                y.right = newNode;
            }
        }
    }

    public int getMaxDepth(){
        int count = 0;
        Node<T1, T2> x = root.left, y = root.right;

        while (x != null || y != null) {

            int cmp = x.key.compareTo(y.key);
            if (cmp == 0) {
                break;
            }
            if(cmp > 0){
                //Идем по левому плечу дерева
                x = y.left;
                y = y.right;
            }else{
                //Идем по правому плечу дерева
                x = x.left;
                y = x.right;
            }

            if(x != null){
                count++;
            }

       }

        return count;
    }

    public void remove(T1 k) {
        Node<T1, T2> x = root, y = null;
        while (x != null) {
            int cmp = k.compareTo(x.key);
            if (cmp == 0) {
                break;
            } else {
                y = x;
                if (cmp < 0) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }
        }
        if (x == null) {
            return;
        }
        if (x.right == null) {
            if (y == null) {
                root = x.left;
            } else {
                if (x == y.left) {
                    y.left = x.left;
                } else {
                    y.right = x.left;
                }
            }
        } else {
            Node<T1, T2> leftMost = x.right;
            y = null;
            while (leftMost.left != null) {
                y = leftMost;
                leftMost = leftMost.left;
            }
            if (y != null) {
                y.left = leftMost.right;
            } else {
                x.right = leftMost.right;
            }
            x.key = leftMost.key;
            x.value = leftMost.value;
        }
    }
}
