package com.appsflyer.internal;

import a.kng0;
import a.r3d;
import a.sre0;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.BaseReferrerInitProvider;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerCreator;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1eSDK implements AFi1hSDK {
    @Override // com.appsflyer.internal.AFi1hSDK
    public final List<Referrer> AFKeystoreWrapper(ReferrerProp referrerProp) {
        referrerProp.getClass();
        Set<Pair<ReferrerCreator<Referrer>, Class<? extends BaseReferrerInitProvider>>> externalReferrers = Referrer.INSTANCE.getExternalReferrers();
        ArrayList arrayList = new ArrayList(r3d.q(externalReferrers, 10));
        Iterator<T> it = externalReferrers.iterator();
        while (it.hasNext()) {
            Referrer referrerCreate = ((ReferrerCreator) ((Pair) it.next()).f46059a).create(referrerProp);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, kng0.k("External Referrer object created: ", sre0.f32672a.b(referrerCreate.getClass()).J()), false, 4, null);
            arrayList.add(referrerCreate);
        }
        return arrayList;
    }
}
