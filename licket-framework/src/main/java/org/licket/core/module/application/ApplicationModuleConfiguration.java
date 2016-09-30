package org.licket.core.module.application;

import org.licket.core.view.hippo.ngclass.AngularClass;
import org.licket.core.view.hippo.ngmodule.AngularModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author activey
 */
@Configuration
public class ApplicationModuleConfiguration {

    @Bean(name = "applicationModule")
    public AngularModule applicationModule(@Autowired @Qualifier("communicationService") AngularClass communicationService) {
        return new ApplicationModule(communicationService);
    }

    @Bean(name = "communicationService")
    public AngularClass communicationService() {
        return new LicketRemoteCommunication();
    }
}
