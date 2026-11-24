package com.appsflyer.internal;

import a.e0g0;
import a.g0g0;
import a.j0g0;
import a.lun;
import a.q3d;
import a.t9f;
import a.xp20;
import com.appsflyer.sdk_base.util.JsonUtils;
import com.appsflyer.share.AFPurchaseDetails;
import com.appsflyer.share.AFPurchaseType;
import com.appsflyer.share.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001+BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\u00122\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0017\u001a\u00020\u00072\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0015¢\u0006\u0004\b\u0017\u0010\u0019J9\u0010\u001b\u001a\u000e\u0012\b\u0012\u0006*\u00020\u00070\u0007\u0018\u00010\u001a2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0005\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFe1lSDK;", "Lcom/appsflyer/internal/AFc1bSDK;", "p0", "Lcom/appsflyer/share/AFPurchaseDetails;", "p1", "", "", "p2", "Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;", "p3", "Lcom/appsflyer/internal/AFj1tSDK;", "p4", "<init>", "(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/share/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1tSDK;)V", "", "e", "()Z", "", "force", "()V", "", "", "registerClient", "(Ljava/util/Map;Ljava/lang/String;)V", "(Ljava/util/Map;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1pSDK;", "d", "(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;", "", "AFLogger", "(Ljava/lang/String;I)V", "v", "Lcom/appsflyer/internal/AFc1bSDK;", "unregisterClient", "Lcom/appsflyer/share/AFPurchaseDetails;", "afDebugLog", "Ljava/util/Map;", "afErrorLog", "Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;", "AFKeystoreWrapper", "AFLoggerLogLevel", "Lcom/appsflyer/internal/AFj1tSDK;", "AFa1ySDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFe1eSDK extends AFe1lSDK {

    /* JADX INFO: renamed from: AFLoggerLogLevel, reason: from kotlin metadata */
    private final AFj1tSDK d;

    /* JADX INFO: renamed from: afDebugLog, reason: from kotlin metadata */
    private final Map<String, String> AFLogger;

    /* JADX INFO: renamed from: afErrorLog, reason: from kotlin metadata */
    private final AppsFlyerInAppPurchaseValidationCallback AFKeystoreWrapper;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    private final AFPurchaseDetails registerClient;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final AFc1bSDK unregisterClient;

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] unregisterClient;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            unregisterClient = iArr;
        }
    }

    public static final class AFa1ySDK extends RuntimeException {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private AFe1eSDK(AFc1bSDK aFc1bSDK, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1tSDK aFj1tSDK) {
        aFc1bSDK.getClass();
        aFPurchaseDetails.getClass();
        aFj1tSDK.getClass();
        AFd1bSDK aFd1bSDK = AFd1bSDK.MANUAL_PURCHASE_VALIDATION;
        AFe1zSDK[] aFe1zSDKArr = {AFd1bSDK.RC_CDN, AFd1bSDK.FETCH_ADVERTISING_ID};
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        super(aFd1bSDK, aFe1zSDKArr, aFc1bSDK, null, lunVar);
        this.unregisterClient = aFc1bSDK;
        this.registerClient = aFPurchaseDetails;
        this.AFLogger = map;
        this.AFKeystoreWrapper = appsFlyerInAppPurchaseValidationCallback;
        this.d = aFj1tSDK;
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.CONVERSION;
        aFd1bSDK2.getClass();
        this.AFKeystoreWrapper.add(aFd1bSDK2);
    }

    private final void AFLogger(String p0, int p1) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFKeystoreWrapper;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(xp20.f(new Pair("error_code", Integer.valueOf(p1)), new Pair("error_message", p0)));
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final AFd1pSDK<String> d(Map<String, Object> p0, String p1) {
        p0.getClass();
        p1.getClass();
        int i = AFa1tSDK.unregisterClient[this.registerClient.getPurchaseType().ordinal()];
        if (i == 1) {
            return getD().AFLogger(p0, p1);
        }
        if (i == 2) {
            return getD().registerClient(p0, p1);
        }
        t9f.b();
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        Object g0g0Var;
        super.force();
        Throwable v = getV();
        if (v != null && !(v instanceof AFe1qSDK)) {
            if (v instanceof AFe1uSDK) {
                AFLogger("No dev key", -1);
            } else if (v instanceof AFa1ySDK) {
                AFLogger("One or more of provided arguments is empty", -1);
            } else {
                AFLogger("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFKeystoreWrapper;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(xp20.f(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                e0g0 e0g0Var = j0g0.b;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.AFKeystoreWrapper;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(JsonUtils.toMap(new JSONObject((String) responseNetwork.getBody())));
                    g0g0Var = Unit.f46060a;
                } else {
                    g0g0Var = null;
                }
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (j0g0.a(g0g0Var) != null) {
                AFLogger("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final void registerClient(Map<String, Object> p0, String p1) throws JSONException {
        Object map;
        p0.getClass();
        super.registerClient(p0, p1);
        List listJ = q3d.j(this.registerClient.getPurchaseToken(), this.registerClient.getProductId());
        if (listJ == null || !listJ.isEmpty()) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1ySDK();
                }
            }
        }
        p0.put("purchase_token", this.registerClient.getPurchaseToken());
        p0.put("product_id", this.registerClient.getProductId());
        p0.put("purchase_type", this.registerClient.getPurchaseType().getValue());
        Map<String, String> map2 = this.AFLogger;
        if (map2 != null && !map2.isEmpty()) {
            p0.put("purchase_additional_details", this.AFLogger);
        }
        String str = this.unregisterClient.setAndroidIdData().getSdkVersion;
        if (str == null || str.length() == 0) {
            map = lun.f20680a;
            map.getClass();
        } else {
            map = JsonUtils.toMap(new JSONObject(str));
        }
        p0.put("custom_data", map);
    }

    public /* synthetic */ AFe1eSDK(AFc1bSDK aFc1bSDK, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1tSDK aFj1tSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1bSDK, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i & 16) != 0 ? new AFj1oSDK() : aFj1tSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(AFc1bSDK aFc1bSDK, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFc1bSDK, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 16, null);
        aFc1bSDK.getClass();
        aFPurchaseDetails.getClass();
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final String registerClient(Map<String, Object> p0) {
        p0.getClass();
        return this.d.registerClient();
    }
}
