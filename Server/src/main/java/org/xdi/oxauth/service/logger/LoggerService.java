package org.xdi.oxauth.service.logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.xdi.oxauth.model.configuration.AppConfiguration;
import org.xdi.oxauth.util.ServerUtil;

/**
 * Logger service
 *
 * @author Yuriy Movchan Date: 08/19/2018
 */
@ApplicationScoped
@Named
public class LoggerService extends org.xdi.service.logger.LoggerService {

    @Inject
    private AppConfiguration appConfiguration;

    @Override
    public boolean isDisableJdkLogger() {
        return ServerUtil.isTrue(appConfiguration.getDisableJdkLogger());
    }

    @Override
    public String getLoggingLevel() {
        return appConfiguration.getLoggingLevel();
    }

    @Override
    public String getExternalLoggerConfiguration() {
        return appConfiguration.getExternalLoggerConfiguration();
    }

}
