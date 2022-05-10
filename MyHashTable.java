package com.company;

public class MyHashTable<K, V> {
    private static class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";
        }
    }

        private int length = 0;
        private float loadFactor = 0.75F;
        private HashNode<K, V>[] chainArray;
        private int M = 11;
        private int size;

    private int getBucketIndex(Integer key){
        return key % M;
    }

    public Object get(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null !!!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = chainArray[bucketIndex];
        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }

        return null;
    }


    public MyHashTable() {
            chainArray = new HashNode[M];
        }

        public MyHashTable(int initialCapacity) {
            M = (int) (loadFactor * initialCapacity);
            chainArray = new HashNode[M];
        }

        private int hash(K key) {
            return (key.hashCode() & 0x7fffffff) % M;
        }

        public void put(K key, V value) {
            HashNode<K,V> newNode = new HashNode<>(key,value);
            int index = hash(key);
            if (chainArray[index] == null){
                chainArray[index] = newNode;
            }else{
                newNode.next = chainArray[index];
                chainArray[index] = newNode;
            }

            length++;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        public Object remove(K key) {
            int bucketIndex = getBucketIndex((Integer) key);
            HashNode head = chainArray[bucketIndex];
            HashNode previous = null;

            while(head != null){
                if(head.key.equals(key)){
                    break;
                }
                previous = head;
                head = head.next;
            }
            if(head == null){
                return null;
            }
            size--;
            if(previous != null){
                previous.next = head.next;
            } else {
                chainArray[bucketIndex] = head.next;
            }

            return head.value;
        }

        public boolean contains(V value) {
            for (int i = 0; i < M; i++) {
                HashNode<K, V> head = chainArray[i];
                while (head != null) {
                    if (head.value.equals(value)) {
                        return true;
                    }
                    else{
                        head = head.next;
                    }
                }
            }
            return false;
        }

    public K getKey(V value) {
        for (int i = 0; i < M; i++) {
            HashNode<K, V> head = chainArray[i];
            while (head != null) {
                if (head.value.equals(value)) {
                    return head.key;
                }
                head = head.next;
            }
        }
        return null;
    }

    }


