package org.apache.dubbo.registry.integration;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName ReferenceSPIApp.java
 * @createTime 2022年03月31日 16:30:00
 */
public class ReferenceSPIApp {

    public static void main(String[] args) {
//        ScopeModel scopeModel = ScopeModelUtil.getOrDefault(null, org.apache.dubbo.rpc.Protocol.class);
//        org.apache.dubbo.rpc.Protocol extension = (org.apache.dubbo.rpc.Protocol)scopeModel.getExtensionLoader(org.apache.dubbo.rpc.Protocol.class).getExtension("extName");
//

        Protocol adaptiveExtension = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("registry");
        System.out.println(adaptiveExtension.getClass());
//        for (Protocol activateExtension : activateExtensions) {
//            System.out.println(activateExtension.getClass());
//        }

    }
}
