package movieDatabase.stringStore;

public class TableStrings {

	public static String moviesCsvString = "CREATE TABLE IF NOT EXISTS public.movies\r\n" + "(\r\n"
			+ "movie_id integer NOT NULL,\r\n" + "title character varying,\r\n" + "genres character varying\r\n" + ");";

	public static String ratingsCsvString = "CREATE TABLE IF NOT EXISTS public.ratings\r\n" + "(\r\n"
			+ "\"user_id\" integer NOT NULL,\r\n" + "\"movie_id\" integer NOT NULL,\r\n"
			+ "\"rating\" double precision ,\r\n" + "\"timestamp\" integer\r\n" + ");";

	public static String tagsCsvString = "CREATE TABLE IF NOT EXISTS public.tags\r\n" + "(\r\n"
			+ "user_id integer NOT NULL,\r\n" + "movie_id integer ,\r\n" + "tag character varying ,\r\n"
			+ "timestamp integer\r\n" + ");";

	public static String linksCsvString = "CREATE TABLE IF NOT EXISTS public.links " + "(\r\n" + "movie_id integer,\r\n"
			+ "imdb_id integer,\r\n" + "tmdb_id integer \r\n" + ");";

	public static String moviesTsvString = "CREATE TABLE IF NOT EXISTS public.moviestsv\r\n" + "(\r\n"
			+ "tconst character varying NOT NULL,\r\n" + "title_type character varying,\r\n"
			+ "primary_title character varying,\r\n" + "original_title character varying,\r\n" + "isadult integer,\r\n"
			+ "start_year integer,\r\n" + "end_year integer,\r\n" + "runtime_minutes integer,\r\n"
			+ "genres character varying\r\n" + ");";

	public static String namesTsvString = "CREATE TABLE IF NOT EXISTS public.names\r\n" + "(\r\n"
			+ "nconst character varying NOT NULL,\r\n" + "primary_name character varying,\r\n"
			+ "birth_year integer ,\r\n" + "death_year integer,\r\n" + "primary_profession character varying,\r\n"
			+ "known_for_titles character varying\r\n" + ");";

	public static String moviesCsvImport = "copy movies (movie_id,title,genres) from 'C:\\Program Files\\PostgreSQL\\15\\bin\\movies.csv' DELIMITER ','";

	public static String ratingsCsvImport = "copy ratings (user_id,movie_id,rating,timestamp) from 'C:\\Program Files\\PostgreSQL\\15\\bin\\ratings.csv' DELIMITER ',' NULL AS '' ;";

	public static String tagsCsvImport = "copy tags (user_id,movie_id,tag,timestamp) from 'C:\\Program Files\\PostgreSQL\\15\\bin\\tags.csv' DELIMITER ','";

	public static String linksCsvImport = "copy links (movie_id,imdb_id,tmdb_id) from 'C:\\Program Files\\PostgreSQL\\15\\bin\\links.csv' DELIMITER ',' NULL AS '' ;";

	public static String moviesTsvImport = "copy moviestsv (tconst,title_type,primary_title,original_title,isadult,start_year,end_year,runtime_minutes,genres) from 'C:\\Program Files\\PostgreSQL\\15\\bin\\movies.tsv' ";

	public static String namesTsvImport = "copy names (nconst,primary_name,birth_year,death_year,primary_profession,known_for_titles) from 'C:\\Program Files\\PostgreSQL\\15\\bin\\names.tsv' ";
}