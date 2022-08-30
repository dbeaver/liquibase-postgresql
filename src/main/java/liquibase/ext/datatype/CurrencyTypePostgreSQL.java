package liquibase.ext.datatype;

import liquibase.database.Database;
import liquibase.database.core.PostgresDatabase;
import liquibase.datatype.DatabaseDataType;
import liquibase.datatype.core.CurrencyType;

public class CurrencyTypePostgreSQL extends CurrencyType {

    public CurrencyTypePostgreSQL() {
    }

    public int getPriority() {
        return 5;
    }

    public boolean supports(Database database) {
        return database instanceof PostgresDatabase;
    }

    @Override
    public DatabaseDataType toDatabaseDataType(Database database) {
        return new DatabaseDataType("MONEY");
    }
}
