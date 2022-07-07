import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
      Map<String,Integer> competitorScores = new HashMap<>();
      for(int i= 0 ; i<competitions.size(); i++) {
        ArrayList<String> teams = competitions.get(i);
        int score = results.get(i);
        if(teams!=null && teams.size() == 2) {
          int result = 3;
          if(score == 0){
            if(competitorScores.get(teams.get(1))!=null){
              result+=competitorScores.get(teams.get(1));
            }
            competitorScores.put(teams.get(1), result);
          } else {
            if(competitorScores.get(teams.get(0))!=null){
              result+=competitorScores.get(teams.get(0));
            }
            competitorScores.put(teams.get(0), result);
          }
          } else {
           System.out.println("erroneous input");
          }
      }
    Iterator<Map.Entry<String, Integer>> itr = competitorScores.entrySet().iterator();
    Map.Entry<String, Integer> winnerTeam = null;
    while(itr.hasNext()){
      Map.Entry<String, Integer> currentTeam = itr.next();
      if(winnerTeam==null || currentTeam.getValue().compareTo(winnerTeam.getValue())>0){
        winnerTeam = currentTeam;
      }
    }
      
    return winnerTeam.getKey();
  }
}
