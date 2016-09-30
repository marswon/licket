package org.licket.demo.view;

import static org.licket.core.view.ComponentView.fromComponentContainerClass;
import org.licket.core.view.container.AbstractLicketContainer;
import org.licket.core.view.container.LicketComponentContainer;

public class ContactsAppRoot extends AbstractLicketContainer<Void> {

    public ContactsAppRoot(String id, LicketComponentContainer contactsPanel) {
        super(id, Void.class, fromComponentContainerClass(ContactsAppRoot.class));

        add(contactsPanel);
    }
}
