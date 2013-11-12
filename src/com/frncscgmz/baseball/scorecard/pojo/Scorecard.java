package com.frncscgmz.baseball.scorecard.pojo;

import java.util.Date;

public class Scorecard {
   private int idScorecard;
   private String teamVisitor;
   private String teamHome;
   private String ballpark;
   private Date gameDate;

   public Scorecard(int idScorecard, String teamVisitor,
         String teamHome) {
      this.idScorecard = idScorecard;
      this.teamVisitor = teamVisitor;
      this.teamHome    = teamHome;
   }

   /**
    * Get idScorecard.
    *
    * @return idScorecard as int.
    */
   public int getIdScorecard() {
      return idScorecard;
   }

   /**
    * Set idScorecard.
    *
    * @param idScorecard the value to set.
    */
   public void setIdScorecard(int idScorecard) {
      this.idScorecard = idScorecard;
   }

   /**
    * Get teamVisitor.
    *
    * @return teamVisitor as String.
    */
   public String getTeamVisitor() {
      return teamVisitor;
   }

   /**
    * Set teamVisitor.
    *
    * @param teamVisitor the value to set.
    */
   public void setTeamVisitor(String teamVisitor) {
      this.teamVisitor = teamVisitor;
   }

   /**
    * Get teamHome.
    *
    * @return teamHome as String.
    */
   public String getTeamHome() {
      return teamHome;
   }

   /**
    * Set teamHome.
    *
    * @param teamHome the value to set.
    */
   public void setTeamHome(String teamHome) {
      this.teamHome = teamHome;
   }

   /**
    * Get ballpark.
    *
    * @return ballpark as String.
    */
   public String getBallpark() {
      return ballpark;
   }

   /**
    * Set ballpark.
    *
    * @param ballpark the value to set.
    */
   public void setBallpark(String ballpark) {
      this.ballpark = ballpark;
   }

   /**
    * Get gameDate.
    *
    * @return gameDate as Date.
    */
   public Date getGameDate() {
      return gameDate;
   }

   /**
    * Set gameDate.
    *
    * @param gameDate the value to set.
    */
   public void setGameDate(Date gameDate) {
      this.gameDate = gameDate;
   }
}
