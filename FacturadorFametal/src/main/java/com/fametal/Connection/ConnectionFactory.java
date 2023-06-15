
package com.fametal.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author Arian
 */
public class ConnectionFactory {
    private DataSource dataSource;
    
    public ConnectionFactory() {
        var comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://aws.connect.psdb.cloud/megafirst?sslMode=VERIFY_IDENTITY");
        comboPooledDataSource.setUser("wnn4m2ro7ftqluxbc8wf");
        comboPooledDataSource.setPassword("pscale_pw_AiWSS8OATdIMhnLSnsnWcOgMEPRKyq6AWmsdGt8xF74");
        comboPooledDataSource.setMaxPoolSize(10);
        
        this.dataSource = comboPooledDataSource;
    }

    public Connection recuperaConexion() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
