class snakeLadderProb{
	int currentPosition;
	int numberOccured;
	double empCheck;
	int ladder_or_snake;
	snakeLadderProb(int x){
	currentPosition=x;
	}
	public int rollDice(){
		empCheck = Math.floor(Math.random() * (6 - 1 + 1) + 1);
		numberOccured = (int)empCheck;
		double get = Math.floor(Math.random() * 10) % 2;
		ladder_or_snake = (int)get;
		System.out.println("the ladder_or_snake is "+ladder_or_snake);
		System.out.println("the currentPosition is "+currentPosition);
		if (ladder_or_snake == 0){
			currentPosition = currentPosition+numberOccured;
		}
		else if(ladder_or_snake == 1 && currentPosition == 0)
		{
			currentPosition=0;
		}
		else if(ladder_or_snake == 1)
		{
			currentPosition=currentPosition-numberOccured;
		}
		return currentPosition;
	}
	public static void main (String args[]){
		snakeLadderProb object = new snakeLadderProb(0);
		int show=object.rollDice();
		System.out.println("the updates currentPosition is "+show);
	}
}