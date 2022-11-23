package movieDatabase.sqlRelated;

import java.util.Scanner;

import movieDatabase.databaseRelated.DatabaseConnection;

public class Queries {

	public static void movieByYearandGenre() {
		int year;
		String genre;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the year you would like to search for between 1874-2028: ");
		year = scan.nextInt();
		String s = "select distinct genres from moviestsv where start_year = " + year + " and genres not like '%,%';";
		DatabaseConnection.getInstance().stringGetter(s);

		System.out.println("Please enter the genre you would like to search for from above: ");
		genre = scan.next();
		String s2 = "select original_title from moviestsv where genres ilike '%" + genre + "%' and start_year = " + year
				+ ";";
		DatabaseConnection.getInstance().stringGetter(s2);

	}

	public static void movieByGenreBetweenYears() {

		Scanner scan = new Scanner(System.in);

		String s = "select distinct genres from moviestsv where genres not like '%,%';";
		DatabaseConnection.getInstance().stringGetter(s);
		System.out.println("Which genre you would like to search for ?");
		String genre = scan.next();

		System.out.println("Please enter two years consecutively for search parameters");

		int year = scan.nextInt();
		int year2 = scan.nextInt();

		String c = "select distinct original_title, start_year from moviestsv  where start_year BETWEEN " + year
				+ " AND " + year2 + " and genres ilike " + "'%" + genre + "%' order by start_year";
		DatabaseConnection.getInstance().stringGetter(c);

	}

	public static void ratingDisplayer() {
		System.out.println("Please enter the original movie title for highest and lowest ratings to show");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		String g1 = "select distinct ratings.rating from ratings inner join movies on movies.movie_id = ratings.movie_id where title ilike "
				+ "'%" + s + "%'" + "order by rating desc limit 1";
		String g2 = "select distinct ratings.rating from ratings inner join movies on movies.movie_id = ratings.movie_id where title ilike "
				+ "'%" + s + "%'" + "order by rating asc limit 1";

		System.out.println("Highest rating is: ");
		DatabaseConnection.getInstance().stringGetter(g1);
		System.out.println("Lowest rating is: ");
		DatabaseConnection.getInstance().stringGetter(g2);

	}

	public static void actorInfo() {
		System.out.println("Please enter the actor/actress name ");
		Scanner scan = new Scanner(System.in);
		String z = scan.next();

		String str = "select distinct original_title, primary_name, start_year, birth_year, death_year, primary_profession from names inner join moviestsv on moviestsv.tconst= names.known_for_titles where primary_name ilike '"
				+ z + "' order by primary_name ;";
		DatabaseConnection.getInstance().stringGetter(str);

	}

}