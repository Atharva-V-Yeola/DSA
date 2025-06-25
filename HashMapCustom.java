// import java.util.*;

// public class HashMapCustom<K, V> {
//     private class MapNode {
//         K key;
//         V value;
//         MapNode next;

//         MapNode(K key, V value) {
//             this.key = key;
//             this.value = value;
//             this.next = null;
//         }
//     }

//     private List<MapNode> buckets;
//     private int size;
//     private int capacity;
//     private final float loadFactor;

//     public HashMapCustom(int initialCapacity, float loadFactor) {
//         this.capacity = initialCapacity;
//         this.loadFactor = loadFactor;
//         this.buckets = new ArrayList<>(Collections.nCopies(capacity, null));
//         this.size = 0;
//     }

//     public HashMapCustom() {
//         this(10, 0.75f);
//     }

//     private int getBucketIndex(K key) {
//         int hashCode = key.hashCode();
//         return Math.abs(hashCode) % capacity;
//     }

//     public int getSize() {
//         return size;
//     }

//     public V get(K key) {
//         int bucketIndex = getBucketIndex(key);
//         MapNode head = buckets.get(bucketIndex);

//         while (head != null) {
//             if (head.key.equals(key)) return head.value;
//             head = head.next;
//         }
//         return null; // Key not found
//     }

//     public void put(K key, V value) {
//         int bucketIndex = getBucketIndex(key);
//         MapNode head = buckets.get(bucketIndex);

//         // Key exists — update
//         MapNode temp = head;
//         while (temp != null) {
//             if (temp.key.equals(key)) {
//                 temp.value = value;
//                 return;
//             }
//             temp = temp.next;
//         }

//         // New key — insert at head
//         MapNode newNode = new MapNode(key, value);
//         newNode.next = head;
//         buckets.set(bucketIndex, newNode);
//         size++;

//         // Resize if load factor exceeded
//         double loadFactor = (size*1.0)/buckets.size();
//         if(loadFactor>=0.75){
//             rehash();
//         }
//     }

//     private void rehash() {
//         List<MapNode> oldBuckets = buckets;
//         capacity *= 2;
//         size = 0;
//         buckets = new ArrayList<>(Collections.nCopies(capacity, null));

//         for (MapNode headNode : oldBuckets) {
//             while (headNode != null) {
//                 put(headNode.key, headNode.value); // re-insert
//                 headNode = headNode.next;
//             }
//         }
//     }
//     public void remove(K key){
//         int bucketIndex = getBucketIndex(key);
//         MapNode<K,V> head = buckets.get(bucketIndex);
//         if(head == null){
//             return;
//         }
//         MapNode<K,V> temp = head;
//         MapNode<K,V> prev = null;
//         while (temp!=null) {
//             if(temp.key.equals(key)){
//                 if(prev == null){
//                     buckets.set(bucketIndex, head.next);
//                 }
//                 else prev.next= temp.next;

//                 size--;
//                 return;
//             }
//             prev = temp;
//             temp = temp.next;
//         }
//     }
//     // Test method
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         HashMapCustom<Integer, String> map = new HashMapCustom<>();

//         int n = sc.nextInt(); // number of entries
//         for (int i = 0; i < n; i++) {
//             int key = sc.nextInt();
//             String value = sc.next();
//             map.put(key, value);
//         }

//         System.out.println("Size: " + map.getSize());

//         int searchKey = sc.nextInt();
//         String result = map.get(searchKey);
//         if (result != null)
//             System.out.println("Value at key " + searchKey + ": " + result);
//         else
//             System.out.println("Key " + searchKey + " not found.");

//         sc.close();
//     }
// }
import java.util.*;

public class HashMapCustom<K, V> {

    private class MapNode {
        K key;
        V value;
        MapNode next;

        MapNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private List<MapNode> buckets;
    private int size;
    private int capacity;
    private final float loadFactor;

    public HashMapCustom(int initialCapacity, float loadFactor) {
        this.capacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.buckets = new ArrayList<>(Collections.nCopies(capacity, null));
        this.size = 0;
    }

    public HashMapCustom() {
        this(10, 0.75f);
    }

    private int getBucketIndex(K key) {
        int hashCode = key == null ? 0 : key.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    public int getSize() {
        return size;
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode head = buckets.get(bucketIndex);

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode head = buckets.get(bucketIndex);

        for (MapNode temp = head; temp != null; temp = temp.next) {
            if (Objects.equals(temp.key, key)) {
                temp.value = value;
                return;
            }
        }

        // New key
        MapNode newNode = new MapNode(key, value);
        newNode.next = head;
        buckets.set(bucketIndex, newNode);
        size++;

        if ((float) size / capacity >= loadFactor) {
            rehash();
        }
    }

    private void rehash() {
        List<MapNode> oldBuckets = buckets;
        capacity *= 2;
        size = 0;
        buckets = new ArrayList<>(Collections.nCopies(capacity, null));

        for (MapNode headNode : oldBuckets) {
            while (headNode != null) {
                put(headNode.key, headNode.value);
                headNode = headNode.next;
            }
        }
    }

    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode head = buckets.get(bucketIndex);
        MapNode prev = null;
        MapNode current = head;

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                if (prev == null) {
                    buckets.set(bucketIndex, current.next);
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // Test method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMapCustom<Integer, String> map = new HashMapCustom<>();

        int n = sc.nextInt(); // number of entries
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String value = sc.next();
            map.put(key, value);
        }

        System.out.println("Size: " + map.getSize());

        int searchKey = sc.nextInt();
        String result = map.get(searchKey);
        if (result != null)
            System.out.println("Value at key " + searchKey + ": " + result);
        else
            System.out.println("Key " + searchKey + " not found.");

        sc.close();
    }
}
