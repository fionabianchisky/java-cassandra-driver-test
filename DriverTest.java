import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;


public class DriverTest {
    public static void main(String args[])
    {
        System.out.println("Cassandra Java Connection");
        try (CqlSession session = CqlSession.builder().build()) {
            ResultSet rs = session.execute("select release_version from system.local");
            Row row = rs.one();
            System.out.println(row.getString("release_version"));
        }
    }

}
