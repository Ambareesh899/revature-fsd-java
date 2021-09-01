
public class AverageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] scores= {48,55,92,78,64};
		float[] scores=new float[5];
		scores[0]=48;
		scores[1]=55;
		scores[2]=92;
		scores[3]=78;
		scores[4]=64;
//		scores[4]=1000;
		float average=(scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/scores.length;
		System.out.println(average);
	}
}
