package movieDatabase.menuRelated;

import java.util.Scanner;

import movieDatabase.databaseRelated.DataReads;
import movieDatabase.databaseRelated.DatabaseConnection;
import movieDatabase.sqlRelated.Queries;
import movieDatabase.sqlRelated.TableCreation;
import movieDatabase.stringStore.TableStrings;

public class Menu {

	public static void menu() {

		Boolean cont = true;
		Scanner scan = new Scanner(System.in);

		while (cont) {
			System.out.println(
					"\n#####################################################################################################");
			System.out.println(
					"################## Database Interface #################################################################");
			System.out.println(
					"#######################################################################################################");
			System.out.println(
					"################## Press 1 to Establish Connection  ###################################################");
			System.out.println(
					"################## Press 2 to Read Database Files #####################################################");
			System.out.println(
					"################## Press 3 to Create Necessary Tables #################################################");
			System.out.println(
					"################## Press 4 to Import Files to Designated Database #####################################");
			System.out.println(
					"################## Press 5 to Display Movies by Year and Genre ########################################");
			System.out.println(
					"################## Press 6 to Start a Search by Genre Between Specified Years #########################");
			System.out.println(
					"################## Press 7 to Display Highest and Lowest Ratings for an Actor/Actress #################");
			System.out.println(
					"################## Press 8 to Display an Actor/Actress's Known for Titles #############################");
			System.out.println(
					"################## Press 0 to Exit From Application  ##################################################");
			System.out.println(
					"#######################################################################################################");

			int choice = scan.nextInt();

			switch (choice) {
			case 1:

				DatabaseConnection.getInstance().connect();
				System.out.println("Connected to the database");
				break;

			case 2:

				DataReads.dataReaderLinksCsv();
				DataReads.dataReaderMoviesCsv();
				DataReads.dataReaderMoviesTsv();
				DataReads.dataReaderNamesTsv();
				DataReads.dataReaderRatingsCsv();
				DataReads.dataReaderTagsCsv();

				System.out.println(" ");
				System.out.println("Those are the datas ");
				break;

			case 3:

				TableCreation.createTable(TableStrings.moviesCsvString);
				TableCreation.createTable(TableStrings.ratingsCsvString);
				TableCreation.createTable(TableStrings.linksCsvString);
				TableCreation.createTable(TableStrings.tagsCsvString);
				TableCreation.createTable(TableStrings.moviesTsvString);
				TableCreation.createTable(TableStrings.namesTsvString);

				System.out.println(" ");
				System.out.println("movies, ratings, links, tags, moviestsv and namestsv tables has been created ");

				break;

			case 4:

				System.out.println("Please wait while the process continues. It may take a while ");

				TableCreation.createTable(TableStrings.linksCsvImport);
				System.out.println("links.csv has been imported to the links table of the database");

				TableCreation.createTable(TableStrings.tagsCsvImport);
				System.out.println("tags.csv has been imported to the tags table of the database");

				TableCreation.createTable(TableStrings.moviesCsvImport);
				System.out.println("movies.csv has been imported to the movie table of the database");

				TableCreation.createTable(TableStrings.ratingsCsvImport);
				System.out.println("ratings.csv has been imported to the ratings table of the database");

				System.out.println(
						"There are two files waiting to upload (They are bigger files). It may take longer! ");
				TableCreation.createTable(TableStrings.moviesTsvImport);
				System.out.println("movies.tsv has been imported to the moviestsv table of the database");

				TableCreation.createTable(TableStrings.namesTsvImport);
				System.out.println("names.tsv has been imported to the names table of the database");

				break;

			case 5:

				System.out.println("This may take a while");
				Queries.movieByYearandGenre();

				break;

			case 6:

				System.out.println("This may take a while");
				Queries.movieByGenreBetweenYears();

				break;

			case 7:

				System.out.println("This may take a while");
				Queries.ratingDisplayer();

				break;

			case 8:

				System.out.println("This may take a while");
				Queries.actorInfo();

				break;

			case 0:

				System.out.println("bye...");

				cont = false;

				break;

			default:

				System.out.println("Wrong entry. Try again");

				break;
			}
		}
	}
}
