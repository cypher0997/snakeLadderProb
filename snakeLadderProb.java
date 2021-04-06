class snakeLadderProb{
	int startPosition;
	snakeLadderProb(int x){
	startPosition=x;
	}
	public static void main (String args[]){
		snakeLadderProb object = new snakeLadderProb(0);
		int show=object.startPosition;
		System.out.println("the startPosition is "+show);
	}
}