package liquibase.ext.ora.dropmaterializedview;

import liquibase.ext.ora.testing.BaseTestCase;
import org.junit.Before;
import org.junit.Test;

public class DropMaterializedViewDBTest extends BaseTestCase {

    @Test
    public void placeholder() {

    }

//    private IDataSet loadedDataSet;
//    private final String TABLE_NAME = "USER_MVIEWS";
//
//    @Before
//    public void setUp() throws Exception {
//        changeLogFile = "liquibase/ext/ora/dropmaterializedview/changelog.test.xml";
//        connectToDB();
//        cleanDB();
//    }
//
//    protected IDatabaseConnection getConnection() throws Exception {
//        return new DatabaseConnection(connection);
//    }
//
//    protected IDataSet getDataSet() throws Exception {
//        loadedDataSet = new FlatXmlDataSet(this.getClass().getClassLoader().getResourceAsStream(
//                "liquibase/ext/ora/dropmaterializedview/input.xml"));
//        return loadedDataSet;
//    }
//
//    @Test
//    public void testCompare() throws Exception {
//        if (connection == null) {
//            return;
//        }
//        QueryDataSet actualDataSet = new QueryDataSet(getConnection());
//
//        liquiBase.update((String) null);
//        actualDataSet.addTable(TABLE_NAME, "SELECT * from " + TABLE_NAME);
//        loadedDataSet = getDataSet();
//
//        Assertion.assertEquals(loadedDataSet, actualDataSet);
//    }

}