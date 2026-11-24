package com.appsflyer.samsung_referrer;

import a.buw;
import com.appsflyer.sdk_base.referrer.BaseReferrerInitProvider;
import com.appsflyer.sdk_base.referrer.ReferrerCreator;

/* JADX INFO: loaded from: classes.dex */
public final class SamsungReferrerInitProvider extends BaseReferrerInitProvider {
    @Override // com.appsflyer.sdk_base.referrer.BaseReferrerInitProvider
    public ReferrerCreator<SamsungReferrer> getCreator() {
        return new buw((byte) 1);
    }
}
