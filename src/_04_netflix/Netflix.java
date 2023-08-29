package _04_netflix;

public class Netflix {
public static void main(String[] args) {
	Movie movieone = new Movie("Beans", 12);
	Movie movietwo = new Movie("Beans 2: Return of the Beans", 10);
	Movie moviethree = new Movie("Beans 3: All for Beans", 7);
	Movie moviefour = new Movie("Beans 4, Beanocide", 14);
	Movie moviefive = new Movie("Beans 5: Long live the Beans", 20);
	moviefour.getTicketPrice();
	NetflixQueue que = new NetflixQueue();
	que.addMovie(movieone);
	que.addMovie(movietwo);
	que.addMovie(moviethree);
	que.addMovie(moviefour);
	que.addMovie(moviefive);
	que.printMovies();
	System.out.println("the best movie is " +que.getBestMovie());
	System.out.println("the second best movie is "+que.getMovie(1));
}
}
