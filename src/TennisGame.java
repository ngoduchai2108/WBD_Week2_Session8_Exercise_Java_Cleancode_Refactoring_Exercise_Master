class TennisGame {

    static String getScore(String nameOfFirstPlayer, String nameOfSecondPlayer, int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        StringBuilder howToCallOfScore = new StringBuilder();
        int scoreUesCall = 0;
        if (scoreOfFirstPlayer==scoreOfSecondPlayer)
        {
            scoreUesCall = scoreOfFirstPlayer;
            howToCallOfScore = getHowToCallOfScore(scoreUesCall);
        }
        else if (scoreOfFirstPlayer>=4 || scoreOfSecondPlayer>=4)
        {
            int theNumberOfScoresFirstPlayerIsGreaterThanSecondPlayer = scoreOfFirstPlayer-scoreOfSecondPlayer;
            if (theNumberOfScoresFirstPlayerIsGreaterThanSecondPlayer==1) howToCallOfScore = new StringBuilder("Advantage firstPlayer");
            else if (theNumberOfScoresFirstPlayerIsGreaterThanSecondPlayer ==-1) howToCallOfScore = new StringBuilder("Advantage secondPlayer");
            else if (theNumberOfScoresFirstPlayerIsGreaterThanSecondPlayer>=2) howToCallOfScore = new StringBuilder("Win for firstPlayer");
            else howToCallOfScore = new StringBuilder("Win for secondPlayer");
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) scoreUesCall = scoreOfFirstPlayer;
                else { howToCallOfScore.append("-"); scoreUesCall = scoreOfSecondPlayer;}
                switch(scoreUesCall)
                {
                    case 0:
                        howToCallOfScore.append("Love");
                        break;
                    case 1:
                        howToCallOfScore.append("Fifteen");
                        break;
                    case 2:
                        howToCallOfScore.append("Thirty");
                        break;
                    case 3:
                        howToCallOfScore.append("Forty");
                        break;
                }
            }
        }
        return howToCallOfScore.toString();
    }

    private static StringBuilder getHowToCallOfScore(int scoreUesCall) {
        StringBuilder howToCallOfScore;
        switch (scoreUesCall)
        {
            case 0:
                howToCallOfScore = new StringBuilder("Love-All");
                break;
            case 1:
                howToCallOfScore = new StringBuilder("Fifteen-All");
                break;
            case 2:
                howToCallOfScore = new StringBuilder("Thirty-All");
                break;
            case 3:
                howToCallOfScore = new StringBuilder("Forty-All");
                break;
            default:
                howToCallOfScore = new StringBuilder("Deuce");
                break;

        }
        return howToCallOfScore;
    }
}
