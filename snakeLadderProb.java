class snakeLadderProb{
	int diceRollCount,currentPosition,numberOccured,ladder_or_snake,stable=0;
	double empCheck;
	snakeLadderProb(int x){
	currentPosition=x;
	diceRollCount=x;
	}
	public int rollDice(){
		while(true)
		{
			diceRollCount++;
			empCheck=Math.floor(Math.random()*(6-1+1)+1);
			numberOccured = (int)empCheck;
			double get=(int)Math.floor(Math.random()*10)%2;
			ladder_or_snake=(int)get;
			System.out.println("the ladder_or_snake is "+ladder_or_snake);
			System.out.println("the currentPosition is "+currentPosition);
			if (ladder_or_snake == 0 && currentPosition < 100)
			{
				stable=currentPosition;
				currentPosition = currentPosition+numberOccured;
				if(currentPosition > 100)
				{
					currentPosition=stable;
				}
			}
			else if(ladder_or_snake == 1 && currentPosition == 0 )
			{
				currentPosition=0;
			}
			else if(ladder_or_snake == 1 && currentPosition < 0.0)
			{
				currentPosition=0;
			}
			else if(ladder_or_snake == 1)
			{
				currentPosition=currentPosition-numberOccured;
				if(currentPosition < 0.0)
				{
					currentPosition=0;
				}
			}
			if(currentPosition == 100)
			{
				break;
			}
		}
		return currentPosition;
	}
	
	public static void main (String args[]){
		snakeLadderProb object = new snakeLadderProb(0);
		int show=object.rollDice();
		System.out.println("the updates currentPosition is "+show);
		System.out.println("the total number of time dice rolled is "+object.diceRollCount);
	}
}