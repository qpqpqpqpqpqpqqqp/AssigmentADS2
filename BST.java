package com.company;


public class BST<K extends Comparable<K>, V> {
    private static class Node<K extends Comparable<K>, V> {
        private K key;
        private V val;
        private Node left, right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }

        private Node<K, V> root;
        private int length;

        public void put(K key, V val) {
            Node<K, V> newNode = new Node<>(key, val);
            root = put(root, newNode);
        }

        private Node<K,V>put(Node<K,V> current, Node<K,V> node){
            if (current==null){
                    return node;
            }
            if(node.key.compareTo(current.key)>0)
                current.right=put(current.right, node);
            else if (node.key.compareTo(current.key)>0)
                current.right=put(current.right, node);
            else{length++;}
            return current;
        }

        public V get(K key) {
            for (int i = 0; i < length; i++) {
                Node<K, V> index = [i];
                if(key = )
            };
        }

        public void delete(K key) {

        }

        public Iterable<K> iterator() {
            return null;
        }
    }
}
