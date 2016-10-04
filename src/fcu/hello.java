package fcu;

public class hello {
	public static void main(String[] args){
		String lyrics="Let it go!Let it go!Cannot hold it back anymore";
		String lyrics1=lyrics.replaceAll("it", "her");
		String lyrics2=lyrics1.replace("Cannot", "Can't");
		System.out.println(lyrics2);
	}

}
