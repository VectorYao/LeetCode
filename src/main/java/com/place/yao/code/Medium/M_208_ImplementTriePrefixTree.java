package com.place.yao.code.Medium;

/**
 * @Description 字典树（https://leetcode.com/problems/implement-trie-prefix-tree/）
 * @Author vectoryao
 * @Date 2022/3/1
 **/
public class M_208_ImplementTriePrefixTree {
    class Trie {
        private class Node {
            private boolean isWord;
            private Node[] next = new Node[26];
        }

        Node root = new Node();
        public Trie() {

        }

        public void insert(String word) {
            Node cur = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (cur.next[c - 'a'] == null) {
                    cur.next[c - 'a'] = new Node();
                }
                cur = cur.next[c - 'a'];
            }
            cur.isWord = true;
        }

        public boolean search(String word) {
            Node cur = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (cur.next[c - 'a'] == null) {
                    return false;
                }
                cur = cur.next[c - 'a'];
            }
            return cur.isWord;
        }

        public boolean startsWith(String prefix) {
            Node cur = root;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                if (cur.next[c - 'a'] == null) {
                    return false;
                }
                cur = cur.next[c - 'a'];
            }
            return true;
        }
    }

    public static void main(String[] args) {
        M_208_ImplementTriePrefixTree m208 = new M_208_ImplementTriePrefixTree();
        Trie trie = m208.new Trie();

        trie.insert("apple");
        System.out.println(trie.search("apple"));// return True
        System.out.println(trie.search("app"));   // return False
        System.out.println(trie.startsWith("app")); // return True
        trie.insert("app");
        System.out.println(trie.search("app"));     // return True
    }

}
