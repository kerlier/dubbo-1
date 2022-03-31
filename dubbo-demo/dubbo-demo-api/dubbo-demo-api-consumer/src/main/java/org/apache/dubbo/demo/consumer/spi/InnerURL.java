package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.URL;

public class InnerURL {

    private URL url;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
