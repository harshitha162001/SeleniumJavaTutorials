package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadingCSV {
	@DataProvider(name = "TestData")
	public Object[][] provideCredentials() throws IOException {

		List<String[]> credentialsList = new ArrayList<>();
		String[] credentialsSplit = null;

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\haithal\\Documents\\TestData.csv"));
		String line;
		while ((line = reader.readLine()) != null) {
			credentialsSplit = line.split(",");
			credentialsList.add(credentialsSplit);// [[username, password]]
		}

		System.out.println(credentialsList.size());//1
		System.out.println(credentialsSplit.length);//2

		Object[][] credentialsArray = new Object[credentialsList.size()][credentialsSplit.length];
		for (int i = 0; i < credentialsList.size(); i++) {
			credentialsArray[i][0] = credentialsList.get(i)[0]; // Username
			credentialsArray[i][1] = credentialsList.get(i)[1]; // Password
		}

		return credentialsArray;
	}

}
