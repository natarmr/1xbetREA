package com.appsflyer.internal;

import a.a8z;
import a.maz;
import a.ohs0;
import a.q3d;
import a.t9f;
import android.gov.nist.core.Separators;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0015\u0010\u0011\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u000f\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFd1jSDK;", "", "Lcom/appsflyer/internal/AFc1iSDK;", "p0", "Lcom/appsflyer/internal/AFc1kSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1kSDK;)V", "i", "Lcom/appsflyer/internal/AFc1iSDK;", "registerClient", "v", "Lcom/appsflyer/internal/AFc1kSDK;", "d", "", "w", "La/a8z;", "unregisterClient", "AFKeystoreWrapper", "", "()Z", "()Ljava/lang/String;", "AFLogger", "AFa1tSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFd1jSDK {
    public static AFd1gSDK d;

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public final a8z w;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final AFc1iSDK registerClient;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final AFc1kSDK d;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final a8z unregisterClient;

    /* JADX INFO: renamed from: AFa1tSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String AFLogger = "https://%scdn-%ssettings.%s/android/v2/%s/settings";
    public static String unregisterClient = "https://%scdn-%stestsettings.%s/android/v2/%s/settings";
    public static List<String> registerClient = q3d.j("googleplay", "playstore", "googleplaystore");

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFd1dSDK.values().length];
            try {
                iArr[AFd1dSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFd1dSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFd1dSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFKeystoreWrapper = iArr;
        }
    }

    public AFd1jSDK(AFc1iSDK aFc1iSDK, AFc1kSDK aFc1kSDK) {
        aFc1iSDK.getClass();
        aFc1kSDK.getClass();
        this.registerClient = aFc1iSDK;
        this.d = aFc1kSDK;
        final byte b = 0;
        this.unregisterClient = maz.b(new Function0(this) { // from class: com.appsflyer.internal.n
            public final /* synthetic */ AFd1jSDK b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                AFd1jSDK aFd1jSDK = this.b;
                switch (b2) {
                    case 0:
                        return AFd1jSDK.d(aFd1jSDK);
                    default:
                        return AFd1jSDK.AFKeystoreWrapper(aFd1jSDK);
                }
            }
        });
        final byte b2 = 1;
        this.w = maz.b(new Function0(this) { // from class: com.appsflyer.internal.n
            public final /* synthetic */ AFd1jSDK b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                AFd1jSDK aFd1jSDK = this.b;
                switch (b3) {
                    case 0:
                        return AFd1jSDK.d(aFd1jSDK);
                    default:
                        return AFd1jSDK.AFKeystoreWrapper(aFd1jSDK);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AFKeystoreWrapper(AFd1jSDK aFd1jSDK) throws NoSuchAlgorithmException {
        String packageName = aFd1jSDK.registerClient.d.d.getPackageName();
        packageName.getClass();
        String strN = ohs0.n(packageName, (String) aFd1jSDK.unregisterClient.getValue());
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = strN.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        strEncodeToString.getClass();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = strEncodeToString.toLowerCase(locale);
        lowerCase.getClass();
        return new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6).concat(Separators.DOT);
    }

    public static final void AFLogger(AFd1gSDK aFd1gSDK) {
        Companion.unregisterClient(aFd1gSDK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(AFd1jSDK aFd1jSDK) {
        AFc1kSDK aFc1kSDK = aFd1jSDK.d;
        String strAFLogger = aFd1jSDK.registerClient.AFLogger("CHANNEL");
        if (strAFLogger != null && strAFLogger.equals("")) {
            strAFLogger = null;
        }
        String strD = AFa1tSDK.d(aFc1kSDK, strAFLogger);
        if (strD != null && !StringsKt.W(strD)) {
            String string = StringsKt.u0(strD).toString();
            List<String> list = registerClient;
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = string.toLowerCase(locale);
            lowerCase.getClass();
            if (list.contains(lowerCase)) {
                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, String.format(Locale.US, "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1)), false, 4, null);
                strD = "";
            } else {
                strD = "-".concat(string);
            }
        }
        return StringsKt.u0(strD != null ? strD : "").toString();
    }

    public final String registerClient() {
        int i = AFa1ySDK.AFKeystoreWrapper[(d == null ? AFd1dSDK.DEFAULT : AFd1dSDK.API).ordinal()];
        if (i == 1) {
            return (String) this.w.getValue();
        }
        if (i == 2) {
            AFd1gSDK aFd1gSDK = d;
            String str = aFd1gSDK != null ? aFd1gSDK.registerClient : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        t9f.b();
        return null;
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1jSDK$AFa1tSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\b\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;", "", "<init>", "()V", "", "AFLogger", "Ljava/lang/String;", "AFKeystoreWrapper", "unregisterClient", "registerClient", "", "Ljava/util/List;", "Lcom/appsflyer/internal/AFd1gSDK;", "d", "Lcom/appsflyer/internal/AFd1gSDK;", "(Lcom/appsflyer/internal/AFd1gSDK;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void unregisterClient(AFd1gSDK aFd1gSDK) {
            AFd1jSDK.d = aFd1gSDK;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static boolean AFKeystoreWrapper() {
        return d == null;
    }

    public final String d() {
        AFd1dSDK aFd1dSDK;
        if (d == null) {
            aFd1dSDK = AFd1dSDK.DEFAULT;
        } else {
            aFd1dSDK = AFd1dSDK.API;
        }
        int i = AFa1ySDK.AFKeystoreWrapper[aFd1dSDK.ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i == 2) {
            AFd1gSDK aFd1gSDK = d;
            String str = aFd1gSDK != null ? aFd1gSDK.AFLogger : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        t9f.b();
        return null;
    }
}
