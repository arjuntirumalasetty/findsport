package com.findsport.DataAccessor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.findsport.DataObjects.Stadium;
import com.findsport.Main.StartService;
import com.findsport.mockObjects.MockObjectCreator;

/**
 * Created by Arjun on 12/27/2016.
 */
@PropertySource("classpath:query.properties")
public class StadiumDAO {
	
	@Value("$(insert_stadium_details)")
	private static String insert_stadium_details;

	public static boolean insertData(Stadium stadiumDataObject) {
		
		try {
			JdbcTemplate template = StartService.getJdbcTemplate();
			int status = template.update(insert_stadium_details, stadiumDataObject.getStadiumID(), stadiumDataObject.getStadiumName(),
					                                stadiumDataObject.getStadiumLongitude(), stadiumDataObject.getStadiumLatitude(),
					                                stadiumDataObject.getStadiumPhoneNo(), stadiumDataObject.getStadiumAddress());
			System.out.print("status : "+ status);
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
			
		}
		return true;	
	}
	
	public static void main (String[] args) {
		Stadium stadiumDataObject = MockObjectCreator.getMockStadiumObject();
		System.out.println(" success : " + insertData(stadiumDataObject));
		
	}
	
	
}
