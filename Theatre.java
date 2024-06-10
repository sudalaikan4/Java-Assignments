package assidnment0;

public class Theatre {
	
	String movieName;
	int movie_time;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theatre movie1 = new Theatre();
		Theatre movie2 = new Theatre();
		
		movie1.movieName = "Jailer";
		movie2.movieName = "leo";
		movie1.movie_time = 630;
		movie2.movie_time = 7;
		
		movie1.watch_movie();
		movie2.watch_movie();
		
		
	}
	  public void watch_movie()
	    {
	    System.out.println("Watching " + movieName);
	    System.out.println("Show Time is " +movie_time);
	    }

}

