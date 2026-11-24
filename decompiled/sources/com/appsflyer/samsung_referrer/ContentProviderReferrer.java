package com.appsflyer.samsung_referrer;

import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import com.appsflyer.sdk_base.util.ContentProviderFetcher;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ContentProviderReferrer extends Referrer {
    public ContentProviderReferrer(String str, String str2, ReferrerProp referrerProp) {
        super(str, str2, referrerProp);
    }

    public void start(ContentProviderFetcher<Map<String, Object>> contentProviderFetcher) {
        if (contentProviderFetcher.valid()) {
            contentProviderFetcher.start();
            start();
        }
    }
}
