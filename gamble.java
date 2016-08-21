public class gamble{
	public static void main(String[]args){
		int stake,goal,T,bets,wins;
		stake =Integer.parseInt(args[0]);
		goal =Integer.parseInt(args[1]);
		T = Integer.parseInt(args[2]);
		bets=0;
		wins=0;
		int i=0;
			while(i<T){
				int cash=stake;
				for(cash=stake;cash>0&& cash<goal;){
				bets ++;
				if(Math.random()<0.5)cash++;
				else cash--;
				}
				if(cash==goal)wins++;
				i++;
			}
			System.out.println(100*wins/T+"% wins");
			System.out.println("avg # bets: "+bets/T);

	}
}