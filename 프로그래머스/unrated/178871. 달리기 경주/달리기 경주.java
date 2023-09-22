import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<Integer, String> ranking_players = new HashMap<Integer, String>();
		Map<String, Integer> players_ranking = new HashMap<String, Integer>();
		
		for(int i=1; i<=players.length; i++) {
			ranking_players.put(i, players[i-1]);
			players_ranking.put(players[i-1], i);
		}
		
		for(int i=0; i<callings.length; i++) {
			int ranking_key = players_ranking.get(callings[i]);
			String back = ranking_players.get(ranking_key);
			String front = ranking_players.get(ranking_key-1);
			ranking_players.put(ranking_key, front);
			ranking_players.put(ranking_key-1, back);
			players_ranking.put(front, ranking_key);
			players_ranking.put(back, ranking_key-1);
		}
		
		for(int i=0; i<players.length; i++) {
			players[i] = ranking_players.get(i+1);
		}
		
		return players;
    }
}