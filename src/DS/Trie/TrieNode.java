package DS.Trie;

public class TrieNode {
    private int INT = 26;
    private TrieNode[] node;
    private boolean isWord;

    public TrieNode() {
        this.node = new TrieNode[INT];
        this.isWord = false;
    }


    public TrieNode[] getNode() {
        return this.node;
    }

    public void setNode(TrieNode[] node) {
        this.node = node;
    }

    public boolean isWord() {
        return this.isWord;
    }

    public void setWord(boolean word) {
        this.isWord = word;
    }
}
