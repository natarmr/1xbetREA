package com.appsflyer.share;

import a.a0o;
import a.c0o;
import kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.appsflyer.share.AppsFlyerAdNetworkEventType[], still in use, count: 1, list:
  (r0v1 com.appsflyer.share.AppsFlyerAdNetworkEventType[]) from 0x003a: CONSTRUCTOR (r0v1 com.appsflyer.share.AppsFlyerAdNetworkEventType[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:59) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;", "", "<init>", "(Ljava/lang/String;I)V", "BANNER", "INTERSTITIAL", "NATIVE", "REWARDED", "APP_OPEN"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppsFlyerAdNetworkEventType {
    BANNER,
    INTERSTITIAL,
    NATIVE,
    REWARDED,
    APP_OPEN;

    private static final /* synthetic */ a0o registerClient;

    static {
        registerClient = new c0o(appsFlyerAdNetworkEventTypeArr);
    }

    private AppsFlyerAdNetworkEventType() {
        super(str, i);
    }

    public static a0o getEntries() {
        return registerClient;
    }

    public static AppsFlyerAdNetworkEventType valueOf(String str) {
        return (AppsFlyerAdNetworkEventType) Enum.valueOf(AppsFlyerAdNetworkEventType.class, str);
    }

    public static AppsFlyerAdNetworkEventType[] values() {
        return (AppsFlyerAdNetworkEventType[]) AFLogger.clone();
    }
}
