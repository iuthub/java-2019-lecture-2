public class EstimatePI {

    public static double estimate(long numTrials) {
        long numHits = 0;
        for(long i=0;i<numTrials;i++){
            double x = Math.random();
            double y = Math.random();
            double dist = Math.sqrt(x*x+y*y);
            if (dist<1) numHits++;
        }
        return  4.0*numHits/numTrials;

    }

}
