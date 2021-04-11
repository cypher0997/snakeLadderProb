class snakeLadderProb{
	int diceRollCountPlayerOne=0,diceRollCountPlayerTwo=0,numberOccured,ladder_or_snake,stable=0,playerOne=0,playerTwo=0,turn=0;
	double numOccured;
	snakeLadderProb(int x){
	playerOne=x;
	playerTwo=x;
	diceRollCountPlayerOne=x;
	diceRollCountPlayerTwo=x;
	}
	public int rollDice()
	{
		while(true)
		{
			turn = (int)Math.floor(Math.random()*10)%2;
			if(turn == 0)
			{	
					System.out.println("rightnow control is in one");
					diceRollCountPlayerOne++;
					numOccured = Math.floor(Math.random()*(6-1+1)+1);
					numberOccured = (int)numOccured;
					double get = Math.floor(Math.random()*10)%2;
					ladder_or_snake=(int)get;
					System.out.println("the ladder_or_snake is "+ ladder_or_snake);
					System.out.println("the currentPosition is "+ playerTwo);
					if (ladder_or_snake == 0 && playerOne < 100)
					{
						stable=playerOne;
						playerOne = playerOne + numberOccured;
						if(playerOne > 100)
						{
							playerOne=stable;
						}
					}
					else if(ladder_or_snake == 1 && playerOne == 0 )
					{
						playerOne=0;
					}
					else if(ladder_or_snake == 1 && playerOne < 0.0)
					{
						playerOne=0;
					}
					else if(ladder_or_snake == 1)
					{
						playerOne = playerOne - numberOccured;
						if(playerOne < 0.0)
						{
							playerOne = 0;
						}
					}
			}
			if(playerOne == 100)
				{
					return playerOne;
				}
			if(turn == 1)
			{
					System.out.println("rightnow control is in two");
					diceRollCountPlayerTwo++;
					numOccured = Math.floor(Math.random()*(6-1+1)+1);
					numberOccured = (int)numOccured;
					double get = Math.floor(Math.random()*10)%2;
					ladder_or_snake=(int)get;
					System.out.println("the ladder_or_snake is "+ ladder_or_snake);
					System.out.println("the currentPosition is "+ playerTwo);
					if (ladder_or_snake == 0 && playerTwo < 100)
					{
						stable = playerTwo;
						playerTwo = playerTwo + numberOccured;
						if(playerTwo > 100)
						{
							playerTwo = stable;
						}
					}
					else if(ladder_or_snake == 1 && playerTwo == 0 )
					{
						playerTwo = 0;
					}
					else if(ladder_or_snake == 1 && playerTwo < 0.0)
					{
						playerTwo = 0;
					}
					else if(ladder_or_snake == 1)
					{
						playerTwo = playerTwo - numberOccured;
						if(playerTwo < 0.0)
						{
							playerTwo = 0;
						}
					}
			}
			if(playerTwo == 100)
			{
				return playerTwo;
			}
		if(playerOne == 100 || playerTwo == 100)
			break;
		}
		return 0;
	}

	
	public static void main (String args[]){
		snakeLadderProb object = new snakeLadderProb(0);
		object.rollDice();
		if(object.diceRollCountPlayerOne < object.diceRollCountPlayerTwo)
			System.out.println("playerOne wins");
		else
			System.out.println("playerTwo wins");
	}
}