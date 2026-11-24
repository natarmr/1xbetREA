package com.appsflyer.xiaomi_referrer;

import a.buw;
import com.appsflyer.sdk_base.referrer.BaseReferrerInitProvider;
import com.appsflyer.sdk_base.referrer.ReferrerCreator;

/* JADX INFO: loaded from: classes.dex */
public final class XiaomiReferrerInitProvider extends BaseReferrerInitProvider {
    @Override // com.appsflyer.sdk_base.referrer.BaseReferrerInitProvider
    public ReferrerCreator<XiaomiReferrer> getCreator() {
        return new buw((byte) 2);
    }
}
