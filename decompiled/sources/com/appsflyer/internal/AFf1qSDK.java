package com.appsflyer.internal;

import a.jf4;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.network.http.ResponseNetwork;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u000bJ\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\n\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0014\u0010\u0013\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/appsflyer/internal/AFf1qSDK;", "Lcom/appsflyer/internal/AFf1tSDK;", "", "p0", "Lcom/appsflyer/internal/AFc1bSDK;", "p1", "<init>", "(Ljava/lang/String;Lcom/appsflyer/internal/AFc1bSDK;)V", "Lcom/appsflyer/internal/AFh1pSDK;", "", "d", "(Lcom/appsflyer/internal/AFh1pSDK;)V", "force", "()V", "v", "", "e", "()Z", "registerClient", "unregisterClient", "AFKeystoreWrapper", "AFLogger", "Landroid/content/pm/PackageManager;", "z_", "(Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/pm/PackageManager;)V", "i", "Landroid/content/ContentResolver;", "A_", "(Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/ContentResolver;)V", "w", "getEntries", "B_", "(Landroid/content/pm/PackageManager;)Ljava/lang/String;", "Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1zSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", "AFLoggerLogLevel", "Lcom/appsflyer/internal/AFc1eSDK;", "AFa1tSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFf1qSDK extends AFf1tSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afDebugLog = 1;
    private static char[] afErrorLog;
    private static int afInfoLog;
    private static long afWarnLog;

    /* JADX INFO: renamed from: AFLoggerLogLevel, reason: from kotlin metadata */
    private final AFc1eSDK unregisterClient;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    private final String AFKeystoreWrapper;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final AFd1zSDK d;

    static {
        valueOf();
        INSTANCE = new Companion(null);
        int i = afInfoLog + 45;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1qSDK(String str, AFc1bSDK aFc1bSDK) {
        super(new AFg1uSDK(), aFc1bSDK, str);
        str.getClass();
        aFc1bSDK.getClass();
        this.AFKeystoreWrapper = str;
        AFd1zSDK aFd1zSDKValueOf = aFc1bSDK.valueOf();
        aFd1zSDKValueOf.getClass();
        this.d = aFd1zSDKValueOf;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        androidIdData.getClass();
        this.unregisterClient = androidIdData;
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFf1qSDK aFf1qSDK = (AFf1qSDK) objArr[0];
        int i = afInfoLog + 5;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            super.force();
            throw null;
        }
        super.force();
        ResponseNetwork responseNetwork = ((AFe1kSDK) aFf1qSDK).v;
        if (responseNetwork != null && responseNetwork.isSuccessful()) {
            int i2 = afDebugLog + 71;
            afInfoLog = i2 % 128;
            if (i2 % 2 != 0) {
                aFf1qSDK.getEntries();
                throw null;
            }
            aFf1qSDK.getEntries();
            afInfoLog = (afDebugLog + 15) % 128;
        }
        return null;
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFf1qSDK aFf1qSDK = (AFf1qSDK) objArr[0];
        PackageManager packageManager = (PackageManager) objArr[1];
        afInfoLog = (afDebugLog + 119) % 128;
        ApplicationInfo applicationInfo = aFf1qSDK.getI().r_().applicationInfo;
        if (applicationInfo == null) {
            int i = afDebugLog + 85;
            afInfoLog = i % 128;
            if (i % 2 != 0) {
                int i2 = 3 / 0;
            }
            return "";
        }
        String string = packageManager.getApplicationLabel(applicationInfo).toString();
        int i3 = afDebugLog + 57;
        afInfoLog = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
        return string;
    }

    private final void A_(AFh1pSDK p0, ContentResolver p1) {
        int i = (afInfoLog + 33) % 128;
        afDebugLog = i;
        if (this.unregisterClient.afInfoLog) {
            int i2 = i + 107;
            afInfoLog = i2 % 128;
            if (i2 % 2 != 0) {
                p0.AFKeystoreWrapper("deviceTrackingDisabled", "true");
                int i3 = 67 / 0;
            } else {
                p0.AFKeystoreWrapper("deviceTrackingDisabled", "true");
            }
        }
        AFb1lSDK aFb1lSDKH_ = AFb1iSDK.h_(p1);
        if (aFb1lSDKH_ != null) {
            p0.AFKeystoreWrapper("amazon_aid", aFb1lSDKH_.d);
            p0.AFKeystoreWrapper("amazon_aid_limit", String.valueOf(aFb1lSDKH_.AFLogger));
            afDebugLog = (afInfoLog + 93) % 128;
        }
    }

    private final String B_(PackageManager p0) {
        return (String) unregisterClient(new Object[]{this, p0}, -2090306498, 2090306499, System.identityHashCode(this));
    }

    private static void a(int i, char c, int i2, Object[] objArr) {
        int i3;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        long[] jArr = new long[i2];
        aFk1qSDK.unregisterClient = 0;
        while (true) {
            int i4 = aFk1qSDK.unregisterClient;
            if (i4 >= i2) {
                break;
            }
            $10 = ($11 + 25) % 128;
            jArr[i4] = (((long) ((char) (((long) afErrorLog[i + i4]) ^ 7057235384081779850L))) ^ (((long) i4) * (7057235384081779850L ^ afWarnLog))) ^ ((long) c);
            aFk1qSDK.unregisterClient = i4 + 1;
        }
        char[] cArr = new char[i2];
        aFk1qSDK.unregisterClient = 0;
        while (true) {
            int i5 = aFk1qSDK.unregisterClient;
            if (i5 >= i2) {
                break;
            }
            int i6 = $10 + 85;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[i5] = (char) jArr[i5];
                i3 = i5 >> 1;
            } else {
                cArr[i5] = (char) jArr[i5];
                i3 = i5 + 1;
            }
            aFk1qSDK.unregisterClient = i3;
        }
        String str = new String(cArr);
        int i7 = $10 + 27;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void force(AFh1pSDK p0) {
        afDebugLog = (afInfoLog + 9) % 128;
        try {
            p0.AFKeystoreWrapper("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a(Color.red(0), (char) (8240 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            p0.AFKeystoreWrapper(((String) objArr[0]).intern(), Build.BRAND);
            afInfoLog = (afDebugLog + 95) % 128;
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.UNINSTALL, "Exception while collecting device brand and model.", th, false, false, false, false, 120, null);
        }
    }

    private final void getEntries() {
        AFLogger aFLogger;
        LogTag logTag;
        int i;
        int i2 = afInfoLog + 111;
        afDebugLog = i2 % 128;
        if (i2 % 2 == 0) {
            getE().registerClient("sentRegisterRequestToAF", false);
            aFLogger = AFLogger.INSTANCE;
            logTag = LogTag.UNINSTALL;
            i = 5;
        } else {
            getE().registerClient("sentRegisterRequestToAF", true);
            aFLogger = AFLogger.INSTANCE;
            logTag = LogTag.UNINSTALL;
            i = 4;
        }
        AFLoggerBase.d$default(aFLogger, logTag, "[register] Successfully registered for Uninstall Tracking", false, i, null);
    }

    private final void i(AFh1pSDK p0) {
        afInfoLog = (afDebugLog + 105) % 128;
        AFg1rSDK w = getW();
        Map<String, Object> map = p0.d;
        map.getClass();
        w.AFLogger(map);
        p0.d.remove("ivc");
        String str = this.unregisterClient.valueOf;
        if (str == null) {
            afDebugLog = (afInfoLog + 39) % 128;
            return;
        }
        int i = afInfoLog + 3;
        afDebugLog = i % 128;
        if (i % 2 != 0) {
            p0.AFKeystoreWrapper("appUserId", str);
        } else {
            p0.AFKeystoreWrapper("appUserId", str);
            int i2 = 2 / 0;
        }
    }

    public static /* synthetic */ Object unregisterClient(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (~((~i2) | i4)) | i3;
        int i6 = ~(i | i2);
        int i7 = ((i2 | (~(i3 | i4))) * 376) + (((~(i | (~i3))) | i6) * (-376)) + ((i5 | i6) * 376) + (i2 * (-375)) + (i * (-375));
        if (i7 != 1) {
            return i7 != 2 ? AFKeystoreWrapper(objArr) : unregisterClient(objArr);
        }
        return AFLogger(objArr);
    }

    public static void valueOf() {
        afErrorLog = new char[]{11480, 49039, 2645, 38145, 25026};
        afWarnLog = -3112331823455625267L;
    }

    private final void w(AFh1pSDK p0) {
        afDebugLog = (afInfoLog + 93) % 128;
        AFf1fSDK unregisterClient = getUnregisterClient();
        p0.AFKeystoreWrapper("devkey", (String) AFf1fSDK.unregisterClient(new Object[]{unregisterClient}, -1660886869, 1660886871, System.identityHashCode(unregisterClient)));
        p0.AFKeystoreWrapper(CommonConstant.KEY_UID, AFb1jSDK.AFLogger(getI().AFKeystoreWrapper));
        p0.AFKeystoreWrapper("af_gcm_token", this.AFKeystoreWrapper);
        p0.AFKeystoreWrapper("launch_counter", String.valueOf(getI().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0)));
        p0.AFKeystoreWrapper("sdk", String.valueOf(Build.VERSION.SDK_INT));
        String strAFLogger = getI().AFLogger("CHANNEL");
        if (strAFLogger != null) {
            afDebugLog = (afInfoLog + 87) % 128;
            if (strAFLogger.equals("")) {
                int i = afDebugLog;
                int i2 = i + 55;
                afInfoLog = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                afInfoLog = (i + 49) % 128;
                strAFLogger = null;
            }
        }
        if (strAFLogger != null) {
            int i3 = afDebugLog + 15;
            afInfoLog = i3 % 128;
            if (i3 % 2 == 0) {
                p0.AFKeystoreWrapper("channel", strAFLogger);
            } else {
                p0.AFKeystoreWrapper("channel", strAFLogger);
                throw null;
            }
        }
    }

    private final void z_(AFh1pSDK p0, PackageManager p1) {
        try {
            p0.AFKeystoreWrapper("app_version_code", String.valueOf(getI().r_().versionCode));
            p0.AFKeystoreWrapper("app_version_name", getI().r_().versionName);
            p0.AFKeystoreWrapper("app_name", (String) unregisterClient(new Object[]{this, p1}, -2090306498, 2090306499, System.identityHashCode(this)));
            long j = getI().r_().firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            p0.AFKeystoreWrapper("installDate", simpleDateFormat.format(new Date(j)));
            int i = afInfoLog + 27;
            afDebugLog = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.UNINSTALL, "Exception while collecting application version info.", th, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void d(AFh1pSDK p0) {
        int i = afDebugLog + 21;
        afInfoLog = i % 128;
        if (i % 2 != 0) {
            p0.getClass();
            super.d(p0);
            Context context = this.d.d;
            throw null;
        }
        p0.getClass();
        super.d(p0);
        Context context2 = this.d.d;
        if (context2 == null) {
            jf4.n("Context is not provided, can't send register request");
            return;
        }
        PackageManager packageManager = context2.getPackageManager();
        packageManager.getClass();
        z_(p0, packageManager);
        i(p0);
        force(p0);
        ContentResolver contentResolver = context2.getContentResolver();
        contentResolver.getClass();
        A_(p0, contentResolver);
        w(p0);
        int i2 = afDebugLog + 83;
        afInfoLog = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void e(AFh1pSDK p0) {
        int i = afInfoLog + 67;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            p0.getClass();
            throw null;
        }
        p0.getClass();
        afInfoLog = (afDebugLog + 111) % 128;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void registerClient(AFh1pSDK p0) {
        afInfoLog = (afDebugLog + 9) % 128;
        p0.getClass();
        afDebugLog = (afInfoLog + 21) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if ((r0 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r4.AFKeystoreWrapper("advertiserId", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r4.AFKeystoreWrapper("advertiserId", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r3 = com.appsflyer.internal.AFf1qSDK.afDebugLog + 47;
        com.appsflyer.internal.AFf1qSDK.afInfoLog = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if ((r3 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r0 = com.appsflyer.internal.AFf1qSDK.afInfoLog + 25;
        com.appsflyer.internal.AFf1qSDK.afDebugLog = r0 % 128;
     */
    @Override // com.appsflyer.internal.AFf1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.appsflyer.internal.AFh1pSDK r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFf1qSDK.afDebugLog
            int r0 = r0 + 59
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1qSDK.afInfoLog = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1f
            r4.getClass()
            com.appsflyer.internal.AFc1iSDK r3 = r3.getI()
            java.lang.String r3 = r3.AFLogger()
            r0 = 84
            int r0 = r0 / 0
            if (r3 == 0) goto L42
            goto L2c
        L1f:
            r4.getClass()
            com.appsflyer.internal.AFc1iSDK r3 = r3.getI()
            java.lang.String r3 = r3.AFLogger()
            if (r3 == 0) goto L42
        L2c:
            int r0 = com.appsflyer.internal.AFf1qSDK.afInfoLog
            int r0 = r0 + 25
            int r2 = r0 % 128
            com.appsflyer.internal.AFf1qSDK.afDebugLog = r2
            int r0 = r0 % 2
            java.lang.String r2 = "advertiserId"
            if (r0 == 0) goto L3e
            r4.AFKeystoreWrapper(r2, r3)
            return
        L3e:
            r4.AFKeystoreWrapper(r2, r3)
            throw r1
        L42:
            int r3 = com.appsflyer.internal.AFf1qSDK.afDebugLog
            int r3 = r3 + 47
            int r4 = r3 % 128
            com.appsflyer.internal.AFf1qSDK.afInfoLog = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L4f
            return
        L4f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1qSDK.v(com.appsflyer.internal.AFh1pSDK):void");
    }

    @Override // com.appsflyer.internal.AFf1tSDK, com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        int i = afDebugLog + 107;
        int i2 = i % 128;
        afInfoLog = i2;
        boolean z = i % 2 != 0;
        afDebugLog = (i2 + 33) % 128;
        return z;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void unregisterClient(AFh1pSDK p0) {
        afInfoLog = (afDebugLog + 31) % 128;
        p0.getClass();
        int i = afInfoLog + 103;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
    }

    private static /* synthetic */ Object unregisterClient(Object[] objArr) {
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        int i = afDebugLog + 73;
        afInfoLog = i % 128;
        if (i % 2 != 0) {
            aFh1pSDK.getClass();
            throw null;
        }
        aFh1pSDK.getClass();
        int i2 = afInfoLog + 47;
        afDebugLog = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void AFKeystoreWrapper(AFh1pSDK p0) {
        unregisterClient(new Object[]{this, p0}, -1367939028, 1367939030, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void AFLogger(AFh1pSDK p0) {
        afInfoLog = (afDebugLog + 43) % 128;
        p0.getClass();
        afDebugLog = (afInfoLog + 73) % 128;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        unregisterClient(new Object[]{this}, -1234839013, 1234839013, System.identityHashCode(this));
    }
}
