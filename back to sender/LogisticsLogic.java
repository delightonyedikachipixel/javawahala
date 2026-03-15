public class LogisticsLogic {

    public  int getRiderWage(int collectionrate) {

        if (collectionrate < 50) {
            return (collectionrate * 160) + 5000;
        }

        if (collectionrate >= 50 && collectionrate <= 59) {
            return (collectionrate * 200) + 5000;
        }

        if (collectionrate >= 60 && collectionrate <= 69) {
            return (collectionrate * 250) + 5000;
        }

        if (collectionrate >= 70) {
            return (collectionrate * 500) + 5000;
        }

        
        return 0;
    }
}

