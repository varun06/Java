public class PhraseOMatic{
	public static void main(String[] args) {
		//make three sets of words to choose from
		String[] wordListOne = {"24/7","multi-tier","30,000 foot","B-to-B"};
		String[] wordListTwo = {"empowered","sticky","Oriented","centric"};
		String[] wordListThree = {"process","tipping point","solution","architecture"};

		//find out how many words are in each list

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		//generate three random numbers

		int rand1 = (int)(Math.random()*oneLength);
		int rand2 = (int)(Math.random()*twoLength);
		int rand3 = (int)(Math.random()*threeLength);

		String phrase = wordListOne[rand1]+" " + wordListTwo[rand2] +" " + wordListThree[rand3];

		//print the phrase

		System.out.println("What we need is a " + phrase);

	}
}