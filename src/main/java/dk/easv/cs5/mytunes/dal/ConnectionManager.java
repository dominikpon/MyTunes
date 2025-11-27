package dk.easv.cs5.mytunes.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;

public class ConnectionManager {
        private final SQLServerDataSource ds;

        public ConnectionManager()
        {
            ds = new SQLServerDataSource();
            ds.setServerName("ServerName");
            ds.setDatabaseName("DatabaseName");
            ds.setPortNumber(1433);
            ds.setUser("me");
            ds.setPassword("123456");
            ds.setTrustServerCertificate(true);
        }

        public Connection getConnection() throws SQLServerException
        {
            return ds.getConnection();
        }

    }
