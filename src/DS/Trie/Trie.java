package DS.Trie;

public class Trie {
    private static TrieNode root;

    public static void main(String[] args) {

        root = new TrieNode();

        insert("sagar");
        insert("gowda");
        insert("mohan");
        insert("mohn");

        boolean isFound = searchWord("mohn");

        if (isFound){
            System.out.println("Found");
        }else {
            System.out.println("not Found");
        }

    }

    private static boolean searchWord(String word) {
        TrieNode current_node = root;
        if (word != null && word.length() > 0) {

            word = word.toLowerCase();

            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (current_node.getNode()[index] == null){
                    return false;
                }
                current_node = current_node.getNode()[index];
            }

        } else {
            throw new IllegalArgumentException("null word");
        }

        return (current_node != null && current_node.isWord());
    }


    private static void insert(String word) {

        if (word != null && word.length() > 0) {

            TrieNode currentNode = root;

            word = word.toLowerCase();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = c - 'a';

                if (currentNode.getNode()[index] == null) {
                    TrieNode node = new TrieNode();
                    currentNode.getNode()[index] = node;
                    currentNode = node;
                } else {
                    currentNode = currentNode.getNode()[index];
                }
            }

            currentNode.setWord(true);

        } else {
            throw new IllegalArgumentException("null word");
        }
    }
}
