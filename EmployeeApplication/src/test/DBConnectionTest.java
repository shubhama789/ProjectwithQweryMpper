package test;

import java.sql.Connection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.cg.employee.exception.EmployeeException;
import com.cg.employee.service.EmployeeServiceImpl;
import com.cg.employee.util.DBConnection;

public class DBConnectionTest {

	
		static EmployeeServiceImpl emptest;
		static Connection dbCon;

		@BeforeAll
		public static void beforeClass() {
			emptest = new EmployeeServiceImpl();
			dbCon = null;
		}

		@BeforeEach
		public void beforeEachTest() {
			System.out.println("----Starting DBConnection Test Case----\n");
		}

		
		@Test
		public void test() throws EmployeeException {
			Connection dbCon = DBConnection.getConnection();
			Assert.assertNotNull(dbCon);
		}

		@After
		public void afterEachTest() {
			System.out.println("----End of DBConnection Test Case----\n");
		}

		@AfterClass
		public static void destroy() {
			System.out.println("\t----End of Tests----");
			daotest = null;
			dbCon = null;
		}

	}


