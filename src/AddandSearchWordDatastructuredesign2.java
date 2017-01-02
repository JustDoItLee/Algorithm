import java.util.HashMap;
import java.util.Map;

/**
 * @author 李智
 * @date 2017/1/2
 * <p>
 * Design a data structure that supports the following two operations:
 * void addWord(word)
 * bool search(word)
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 * For example:
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 * You should be familiar with how a Trie works. If not, please work on this problem: Implement Trie (Prefix Tree) first.
 * <p>
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary wordDictionary = new WordDictionary();
 * wordDictionary.addWord("word");
 * wordDictionary.search("pattern");
 */

//hashMap实现
public class AddandSearchWordDatastructuredesign2 {
    private static class TrieNode {
        public boolean isWord;
        public Map<Character, TrieNode> children;

        public TrieNode() {
            this.children = new HashMap<>();
            this.isWord = false;
        }
    }

    private TrieNode root = new TrieNode();

    // 在数据结构中添加一个单词
    public void addWord(String word) {
        TrieNode current = root;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if (current.children.containsKey(c)) {
                current = current.children.get(c);
            } else {
                TrieNode node = new TrieNode();
                current.children.put(c, node);
                current = node;
            }
        }
        current.isWord = true;
    }

    // 如果单词在数据结构中则返回. 单词可以包含点字符 '.'去代表任何一个字母.
    public boolean search(String word) {
        return search(word, root);
    }

    private boolean search(String word, TrieNode node) {
        if (word == null || (word.isEmpty())) {
            return node.isWord;
        }
        char c = word.charAt(0);
        if (c != '.') {
            if (!node.children.containsKey(c)) {
                return false;
            } else {
                return search(word.substring(1), node.children.get(c));
            }
        } else {
            for (TrieNode child : node.children.values()) {
                if (search(word.substring(1), child)) {
                    return true;
                }
            }
            return false;
        }
    }
}