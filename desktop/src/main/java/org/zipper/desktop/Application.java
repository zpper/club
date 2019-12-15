package org.zipper.desktop;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author peng0806@foxmail.com <br>
 * Date: 2019/12/13.
 */
public class Application implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {

//        bundleContext.registerService("login", null, null);
        System.out.println("hwllowb");
//        Login login = new Login();
//        login.start(new Stage());
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {

    }
}
