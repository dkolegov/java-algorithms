package info.kolegov.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	static class WordNode{
	    String word;
	    int numSteps;
	 
	    public WordNode(String word, int numSteps){
	        this.word = word;
	        this.numSteps = numSteps;
	    }
	}

	/** based of  breath-first search. See class info.kolegov.graph.BreadthFirstSearch
	 * 
	 * @param beginWord
	 * @param endWord
	 * @param wordDict
	 * @return
	 */
    public static int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        Queue<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(beginWord, 1));
 
        wordDict.add(endWord);
         while(!queue.isEmpty()){
            WordNode top = queue.remove();
            String word = top.word;
 
            if(word.equals(endWord)){
                return top.numSteps;
            }
            List<String> nextWords = constructNextWords(word, wordDict);
            for (String nextWord : nextWords) {
            	queue.add(new WordNode(nextWord, top.numSteps+1));
                wordDict.remove(nextWord);
            }
        }
 
        return 0;
    }

    private static List<String> constructNextWords(String word, Set<String> wordDict) {
    	List<String> result = new ArrayList<>();
    	char[] arr = word.toCharArray();
        for(int i=0; i<arr.length; i++){
            for(char c='a'; c<='z'; c++){
                char temp = arr[i];
                if(arr[i]!=c){
                    arr[i]=c;
                }

                String newWord = new String(arr);
                if(wordDict.contains(newWord)){
                    result.add(newWord);
                }
                arr[i]=temp;
            }
        }
        return result;
    }
}