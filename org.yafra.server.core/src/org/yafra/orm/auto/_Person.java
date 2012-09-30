package org.yafra.orm.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.yafra.orm.PersonLog;

/**
 * Class _Person was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Person extends CayenneDataObject {

    public static final String ADDRESS_PROPERTY = "address";
    public static final String COUNTRY_PROPERTY = "country";
    public static final String FIRSTNAME_PROPERTY = "firstname";
    public static final String GOOGLE_ID_PROPERTY = "googleId";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String TYPE_PROPERTY = "type";
    public static final String LOG_ARRAY_PROPERTY = "logArray";

    public static final String PK_PERSON_PK_COLUMN = "pkPerson";

    public void setAddress(String address) {
        writeProperty("address", address);
    }
    public String getAddress() {
        return (String)readProperty("address");
    }

    public void setCountry(String country) {
        writeProperty("country", country);
    }
    public String getCountry() {
        return (String)readProperty("country");
    }

    public void setFirstname(String firstname) {
        writeProperty("firstname", firstname);
    }
    public String getFirstname() {
        return (String)readProperty("firstname");
    }

    public void setGoogleId(String googleId) {
        writeProperty("googleId", googleId);
    }
    public String getGoogleId() {
        return (String)readProperty("googleId");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setType(String type) {
        writeProperty("type", type);
    }
    public String getType() {
        return (String)readProperty("type");
    }

    public void addToLogArray(PersonLog obj) {
        addToManyTarget("logArray", obj, true);
    }
    public void removeFromLogArray(PersonLog obj) {
        removeToManyTarget("logArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PersonLog> getLogArray() {
        return (List<PersonLog>)readProperty("logArray");
    }


}