class Node {
    Node[] children = new Node[26];
    boolean eow = false;

    Node() {
        for(int i=0; i<26; i++) {
            children[i] = null;
        }
    }
}

class TrieDemo{
    public static void main(String[] args) {
        String words[] = {
            "the", "a", "there", "their", "any", "thee"
        };
    }
}