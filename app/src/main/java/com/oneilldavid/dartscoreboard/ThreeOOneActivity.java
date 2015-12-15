package com.oneilldavid.dartscoreboard;

/**
 * Created by david on 14/12/2015.
 */
public class ThreeOOneActivity {

    private int cleg;
    private double cp1score,cp2score,cp1dartAvg,cp1throwAvg,cp2dartAvg,cp2throwAvg;
    private String ccheck1,ccheck2,ccheck3;
    double i,l = 0;
    double j,k = 0;

    public ThreeOOneActivity() {
        this(301, 301, 1, 0.00, 0.00, 0.00, 0.00, "-", "-", "-");
    }

    public ThreeOOneActivity(double s1,double s2,int l,double da1,double da2,double ta1,double ta2,String c1,String c2,String c3){
        this.cp1score = s1;
        this.cp2score = s2;
        this.cleg = l;
        this.cp1dartAvg = da1;
        this.cp2dartAvg = da2;
        this.cp1throwAvg = ta1;
        this.cp2throwAvg = ta2;
        this.ccheck1 = c1;
        this.ccheck2 = c2;
        this.ccheck3 = c3;
    }

    public int getFirstVals(){
        return (int)cp1score;
    }

    public int getReduceScore(int player,double score,int numThrow){
        if(player == 1){
            setP1DartAvg(score);
            cp1score = cp1score - score;
            ScoreActivity.num_throw --;
            if(numThrow == 1){
                setP1ThrowAvg();
                ScoreActivity.playerId = 2;
                ScoreActivity.num_throw = 3;
            }
            return (int)cp1score;
        } else {
            setP2DartAvg(score);
            cp2score = cp2score - score;
            ScoreActivity.num_throw --;
            if(numThrow == 1){
                setP2ThrowAvg();
                ScoreActivity.playerId = 1;
                ScoreActivity.num_throw = 3;
            }
            return (int)cp2score;
        }
    }

    public void setP1ThrowAvg() {
        cp1throwAvg = cp1dartAvg * 3;
    }
    public double getP1ThrowAvg() {
       return cp1throwAvg;
    }

    public void setP2ThrowAvg() {
        cp2throwAvg = cp2dartAvg * 3;
    }
    public double getP2ThrowAvg() {
        return cp2throwAvg;
    }

    public void setP1DartAvg(double score) {
        j += score;
        i++;
        cp1dartAvg = j/i;
    }
    public double getP1DartAvg(){
        return cp1dartAvg;
    }

    public void setP2DartAvg(double score) {
        k += score;
        l++;
        cp2dartAvg = k/l;
    }
    public double getP2DartAvg(){
        return cp2dartAvg;
    }

    public int getLeg() {
        return cleg;
    }

    public void setLeg(int cleg) {
        this.cleg = cleg;
    }


}
