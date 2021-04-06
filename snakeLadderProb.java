class snakeLadderProb{
	int startPosition;
	int numberOccured;
	double empCheck;
	snakeLadderProb(int x){
	startPosition=x;
	}
	public int rollDice(){
		empCheck=Math.floor(Math.random()*(6-1+1)+1);
		numberOccured = (int)empCheck;
		return numberOccured;
	}
	public static void main (String args[]){
		snakeLadderProb object = new snakeLadderProb(0);
		int show=object.rollDice();
		System.out.println("the startPosition is "+show);
	}
}