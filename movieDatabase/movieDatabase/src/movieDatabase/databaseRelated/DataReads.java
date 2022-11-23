package movieDatabase.databaseRelated;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReads {

	public static void dataReaderMoviesCsv() {
		BufferedReader bRead = null;

		try {

			bRead = new BufferedReader(new FileReader("C:\\Program Files\\PostgreSQL\\15\\bin\\movies.csv"));
			String endCheck = null;

			while ((endCheck = bRead.readLine()) != null) {
				System.out.println(endCheck);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bRead != null) {
					bRead.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void dataReaderRatingsCsv() {
		BufferedReader bRead = null;

		try {

			bRead = new BufferedReader(new FileReader("C:\\Program Files\\PostgreSQL\\15\\bin\\ratings.csv"));
			String endCheck = null;

			while ((endCheck = bRead.readLine()) != null) {
				System.out.println(endCheck);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bRead != null) {
					bRead.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void dataReaderLinksCsv() {
		BufferedReader bRead = null;

		try {

			bRead = new BufferedReader(new FileReader("C:\\Program Files\\PostgreSQL\\15\\bin\\links.csv"));
			String endCheck = null;

			while ((endCheck = bRead.readLine()) != null) {
				System.out.println(endCheck);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bRead != null) {
					bRead.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void dataReaderTagsCsv() {
		BufferedReader bRead = null;

		try {

			bRead = new BufferedReader(new FileReader("C:\\Program Files\\PostgreSQL\\15\\bin\\tags.csv"));
			String endCheck = null;

			while ((endCheck = bRead.readLine()) != null) {
				System.out.println(endCheck);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bRead != null) {
					bRead.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void dataReaderMoviesTsv() {
		BufferedReader bRead = null;

		try {

			bRead = new BufferedReader(new FileReader("C:\\Program Files\\PostgreSQL\\15\\bin\\movies.tsv"));
			String endCheck = null;

			while ((endCheck = bRead.readLine()) != null) {
				System.out.println(endCheck);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bRead != null) {
					bRead.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void dataReaderNamesTsv() {
		BufferedReader bRead = null;

		try {

			bRead = new BufferedReader(new FileReader("C:\\Program Files\\PostgreSQL\\15\\bin\\names.csv"));
			String endCheck = null;

			while ((endCheck = bRead.readLine()) != null) {
				System.out.println(endCheck);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bRead != null) {
					bRead.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
