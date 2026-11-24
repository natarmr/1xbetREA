package a;

import com.appsflyer.huawei_referrer.HuaweiReferrer;
import com.appsflyer.samsung_referrer.SamsungReferrer;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerCreator;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import com.appsflyer.xiaomi_referrer.XiaomiReferrer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class buw implements ReferrerCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3255a;

    @Override // com.appsflyer.sdk_base.referrer.ReferrerCreator
    public final Referrer create(ReferrerProp referrerProp) {
        switch (this.f3255a) {
            case 0:
                return new HuaweiReferrer(referrerProp);
            case 1:
                return new SamsungReferrer(referrerProp);
            default:
                return new XiaomiReferrer(referrerProp);
        }
    }
}
