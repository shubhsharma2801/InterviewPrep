package TreeGraphs;

import java.util.*;

public class Trie {
	static class TrieNode{
		Map<Character,TrieNode> children;
		Boolean isEndOfWord;
		
		public TrieNode() {
			children = new HashMap<Character,TrieNode>();
			isEndOfWord = false;
		}
	}
	private TrieNode root;
	
	public Trie() {
		// TODO Auto-generated constructor stub
		root = new TrieNode();
	}
	public void insert(String word) {
		TrieNode current = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null) {
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;
		}
		current.isEndOfWord =true;
	}
	public boolean search(String word) {
		TrieNode current = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(current.children.containsKey(ch)) {
				current = current.children.get(ch);
			}else {
				return false;
			}
		}
		
		return current.isEndOfWord;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
