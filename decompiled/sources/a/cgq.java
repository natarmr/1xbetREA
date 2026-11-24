package a;

import android.gov.nist.core.Separators;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class cgq implements dgq {
    public static final Object l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfq f4326a;
    public final agq b;
    public final g090 c;
    public final fut0 d;
    public final b8z e;
    public final Object f;
    public final ExecutorService g;
    public final qgi0 h;
    public String i;
    public final HashSet j;
    public final ArrayList k;

    static {
        new AtomicInteger(1);
    }

    public cgq(nfq nfqVar, p5d0 p5d0Var, ExecutorService executorService, qgi0 qgi0Var) {
        nfqVar.a();
        agq agqVar = new agq(nfqVar.f23449a, p5d0Var);
        g090 g090Var = new g090();
        g090Var.b = nfqVar;
        y2m0 y2m0Var = y2m0.b;
        if (y2m0Var == null) {
            y2m0Var = new y2m0((byte) 10);
            y2m0.b = y2m0Var;
        }
        fut0 fut0Var = fut0.b;
        if (fut0Var == null) {
            fut0Var = new fut0(y2m0Var);
            fut0.b = fut0Var;
        }
        b8z b8zVar = new b8z(new igd(nfqVar, (byte) 2));
        this.f = new Object();
        this.j = new HashSet();
        this.k = new ArrayList();
        this.f4326a = nfqVar;
        this.b = agqVar;
        this.c = g090Var;
        this.d = fut0Var;
        this.e = b8zVar;
        this.g = executorService;
        this.h = qgi0Var;
    }

    public final void a() {
        q45 q45VarV;
        byte b;
        synchronized (l) {
            try {
                nfq nfqVar = this.f4326a;
                nfqVar.a();
                chf0 chf0VarK = chf0.k(nfqVar.f23449a);
                try {
                    q45VarV = this.c.v();
                    int i = q45VarV.b;
                    b = 2;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strF = f(q45VarV);
                        g090 g090Var = this.c;
                        p45 p45VarA = q45VarV.a();
                        p45VarA.f26334a = strF;
                        p45VarA.b = 3;
                        q45VarV = p45VarA.a();
                        g090Var.n(q45VarV);
                    }
                    if (chf0VarK != null) {
                        chf0VarK.d0();
                    }
                } catch (Throwable th) {
                    if (chf0VarK != null) {
                        chf0VarK.d0();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(q45VarV);
        this.h.execute(new bgq(this, b));
    }

    public final q45 b(q45 q45Var) throws egq {
        int i;
        p55 p55Var;
        p55 p55VarF;
        agq agqVar = this.b;
        nfq nfqVar = this.f4326a;
        nfqVar.a();
        String str = nfqVar.c.f21755a;
        String str2 = q45Var.f28082a;
        nfq nfqVar2 = this.f4326a;
        nfqVar2.a();
        String str3 = nfqVar2.c.h;
        String str4 = q45Var.d;
        ejx ejxVar = agqVar.c;
        if (!ejxVar.a()) {
            throw new egq("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = agq.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new egq("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = agqVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    agq.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    ejxVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        p55VarF = agq.f(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    agq.b(httpURLConnectionC, null, str, str3);
                    i = i2;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            p55Var = new p55(null, 0L, 3);
                        } else {
                            if (responseCode == 429) {
                                throw new egq("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                p55Var = new p55(null, 0L, 2);
                            }
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2 = i + 1;
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        p55VarF = p55Var;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
                i = i2;
            }
        }
        int iE = hne.E(p55VarF.c);
        if (iE == 0) {
            String str5 = p55VarF.f26388a;
            long j = p55VarF.b;
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            p45 p45VarA = q45Var.a();
            p45VarA.c = str5;
            p45VarA.e = j;
            byte b = (byte) (p45VarA.h | 1);
            p45VarA.f = jCurrentTimeMillis;
            p45VarA.h = (byte) (b | 2);
            return p45VarA.a();
        }
        if (iE == 1) {
            p45 p45VarA2 = q45Var.a();
            p45VarA2.g = "BAD CONFIG";
            p45VarA2.b = 5;
            return p45VarA2.a();
        }
        if (iE != 2) {
            throw new egq("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.i = null;
        }
        p45 p45VarA3 = q45Var.a();
        p45VarA3.b = 2;
        return p45VarA3.a();
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.i;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zfu zfuVar = new zfu(taskCompletionSource);
        synchronized (this.f) {
            this.k.add(zfuVar);
        }
        Task task = taskCompletionSource.getTask();
        this.g.execute(new bgq(this, (byte) 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hqt hqtVar = new hqt(this.d, taskCompletionSource);
        synchronized (this.f) {
            this.k.add(hqtVar);
        }
        Task task = taskCompletionSource.getTask();
        this.g.execute(new bgq(this, (byte) 1));
        return task;
    }

    public final void e() {
        nfq nfqVar = this.f4326a;
        nfqVar.a();
        s0x.F(nfqVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        nfqVar.a();
        s0x.F(nfqVar.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        nfqVar.a();
        s0x.F(nfqVar.c.f21755a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        nfqVar.a();
        String str = nfqVar.c.b;
        Pattern pattern = fut0.f10182a;
        s0x.B("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(Separators.COLON));
        nfqVar.a();
        s0x.B("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", fut0.f10182a.matcher(nfqVar.c.f21755a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final String f(q45 q45Var) {
        s8y s8yVar;
        String strEncodeToString;
        String str;
        String str2;
        PublicKey publicKeyGeneratePublic;
        nfq nfqVar = this.f4326a;
        nfqVar.a();
        String str3 = nfqVar.b;
        if (!str3.equals("CHIME_ANDROID_SDK")) {
            nfqVar.a();
            if ("[DEFAULT]".equals(str3)) {
                if (q45Var.b == 1) {
                    s8yVar = ((zxw) this.e.get()).f45178a;
                    strEncodeToString = null;
                    str = (String) s8yVar.b(zxw.d, null);
                    if (str != null) {
                        strEncodeToString = str;
                    } else {
                        str2 = (String) s8yVar.b(zxw.c, null);
                        if (str2 != null) {
                            try {
                                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                                Log.w("ContentValues", "Invalid key stored " + e);
                                publicKeyGeneratePublic = null;
                            }
                            if (publicKeyGeneratePublic != null) {
                                try {
                                    byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                                    bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                                    strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
                                } catch (NoSuchAlgorithmException unused) {
                                    Log.w("ContentValues", "Unexpected error, device missing required algorithms");
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(strEncodeToString)) {
                        return h1e0.a();
                    }
                    return strEncodeToString;
                }
            }
        } else if (q45Var.b == 1) {
            s8yVar = ((zxw) this.e.get()).f45178a;
            strEncodeToString = null;
            str = (String) s8yVar.b(zxw.d, null);
            if (str != null) {
                strEncodeToString = str;
            } else {
                str2 = (String) s8yVar.b(zxw.c, null);
                if (str2 != null) {
                    publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                    if (publicKeyGeneratePublic != null) {
                        byte[] bArrDigest2 = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                        bArrDigest2[0] = (byte) (((bArrDigest2[0] & 15) + 112) & 255);
                        strEncodeToString = Base64.encodeToString(bArrDigest2, 0, 8, 11);
                    }
                }
            }
            if (TextUtils.isEmpty(strEncodeToString)) {
                return h1e0.a();
            }
            return strEncodeToString;
        }
        return h1e0.a();
    }

    public final q45 g(q45 q45Var) throws egq {
        c45 c45VarE;
        String str = q45Var.f28082a;
        String string = null;
        if (str != null && str.length() == 11) {
            zxw zxwVar = (zxw) this.e.get();
            zxwVar.getClass();
            for (String str2 : zxw.e) {
                String str3 = (String) zxwVar.f45178a.b(new zsb0(ua80.i("|T|", zxwVar.b, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, str2)), null);
                if (str3 != null && !str3.isEmpty()) {
                    if (!str3.startsWith("{")) {
                        string = str3;
                        break;
                    }
                    try {
                        string = new JSONObject(str3).getString("token");
                        break;
                    } catch (JSONException unused) {
                        break;
                    }
                }
            }
        }
        nfq nfqVar = this.f4326a;
        nfqVar.a();
        String str4 = nfqVar.c.f21755a;
        nfqVar.a();
        String str5 = nfqVar.c.h;
        nfqVar.a();
        String str6 = nfqVar.c.b;
        agq agqVar = this.b;
        ejx ejxVar = agqVar.c;
        if (!ejxVar.a()) {
            throw new egq("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = agq.a("projects/" + str5 + "/installations");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new egq("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = agqVar.c(urlA, str4);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    agq.g(httpURLConnectionC, str, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    ejxVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c45VarE = agq.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    agq.b(httpURLConnectionC, str6, str4, str5);
                    if (responseCode == 429) {
                        throw new egq("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        c45 c45Var = new c45(null, null, null, null, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c45VarE = c45Var;
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (IOException | AssertionError unused2) {
                }
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        int iE = hne.E(c45VarE.e);
        if (iE != 0) {
            if (iE != 1) {
                throw new egq("Firebase Installations Service is unavailable. Please try again later.");
            }
            p45 p45VarA = q45Var.a();
            p45VarA.g = "BAD CONFIG";
            p45VarA.b = 5;
            return p45VarA.a();
        }
        String str7 = c45VarE.b;
        String str8 = c45VarE.c;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        p55 p55Var = c45VarE.d;
        String str9 = p55Var.f26388a;
        long j = p55Var.b;
        p45 p45VarA2 = q45Var.a();
        p45VarA2.f26334a = str7;
        p45VarA2.b = 4;
        p45VarA2.c = str9;
        p45VarA2.d = str8;
        p45VarA2.e = j;
        byte b = (byte) (p45VarA2.h | 1);
        p45VarA2.f = jCurrentTimeMillis;
        p45VarA2.h = (byte) (b | 2);
        return p45VarA2.a();
    }

    public final void h(Exception exc) {
        synchronized (this.f) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (((y7m0) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(q45 q45Var) {
        synchronized (this.f) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (((y7m0) it.next()).a(q45Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
