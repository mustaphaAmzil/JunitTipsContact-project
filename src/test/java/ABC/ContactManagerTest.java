package ABC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {
    @Test
    public void ShouldCreateConctact() {

        ContactManager contactManager = new ContactManager();

        contactManager.addContact("Jalal","kaka","0123456789");
        contactManager.addContact("Jalal1","kaka","0123456789");
       // System.out.println( (contactManager.getAllContacts().isEmpty()));
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());

        Assertions.assertEquals(2,contactManager.getAllContacts().size());



    }

}