import java.sql.*;


public class TestSQL {
	public static void main(String[] args) {
		try {
			String url = "jdbs:odbs:TEST";
			Class.forName("sun.jdbs.odbs.JdbcOdbcDriver");
			Connection cn = DriverManager.getConnection(url);
			Statement st = cn.createStatement();
			String sqlQuiry = "SELECT * FROM Users";
			ResultSet rs = st.executeQuery(sqlQuiry);
			int maxCols = rs.getMetaData().getColumnCount();

			for(int i = 1; i <= maxCols;i++) {
				if(i > 1) System.out.print(", ");
					System.out.print(rs.getMetaData().getColumnLabel(i));

			}

			System.out.println("?--------------------------------------------------------?");
			while(rs.next()) {
				for(int i = 1; i <= maxCols; i++) {
					System.out.print(rs.getString(i) + ", ");
				}
				System.out.println();
			}

			st.close(); 
			cn.close();
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}
}