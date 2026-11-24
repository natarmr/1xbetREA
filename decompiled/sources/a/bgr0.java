package a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class bgr0 implements Runnable {
    public static final Object g = new Object();
    public static Boolean h;
    public static Boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2570a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public bgr0(zfr0 zfr0Var, Context context, fd40 fd40Var, long j) {
        this.f2570a = (byte) 0;
        this.f = zfr0Var;
        this.c = context;
        this.b = j;
        this.d = fd40Var;
        this.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (g) {
            try {
                Boolean bool = i;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                i = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (g) {
            try {
                Boolean bool = h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.c).getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        byte b = this.f2570a;
        long j = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                zfr0 zfr0Var = (zfr0) obj3;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                Context context = (Context) obj4;
                if (c(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    zfr0Var.a(true);
                    if (!((fd40) obj2).e()) {
                        zfr0Var.a(false);
                        if (!zC) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (zfr0Var.b()) {
                            zfr0Var.a(false);
                        } else {
                            zfr0Var.c(j);
                        }
                        if (!zC) {
                            return;
                        }
                    } else {
                        new agr0(this, this).a();
                        if (!zC) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    zfr0Var.a(false);
                    if (!zC) {
                        return;
                    }
                } finally {
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                        break;
                    }
                }
                try {
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            case 1:
                String str = (String) obj2;
                m6x0 m6x0Var = ((oyw0) obj3).f26078a;
                String str2 = (String) obj4;
                if (str2 == null) {
                    m6x0Var.J().m1();
                    String str3 = m6x0Var.h1;
                    if (str3 == null || str3.equals(str)) {
                        m6x0Var.h1 = str;
                        m6x0Var.g1 = null;
                        return;
                    }
                    return;
                }
                r1x0 r1x0Var = new r1x0((String) obj, str2, j);
                m6x0Var.J().m1();
                String str4 = m6x0Var.h1;
                if (str4 != null) {
                    str4.equals(str);
                }
                m6x0Var.h1 = str;
                m6x0Var.g1 = r1x0Var;
                return;
            case 2:
                ((b1x0) obj3).w1(this.b, this.e, (String) obj4, (String) obj2);
                return;
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                c2x0 c2x0Var = (c2x0) obj3;
                x6x0 x6x0Var = ((kxw0) c2x0Var.b).i;
                kxw0.e(x6x0Var);
                c2x0Var.r1((r1x0) obj2, (r1x0) obj, this.b, true, x6x0Var.w1("screen_view", bundle, null, false));
                return;
        }
    }

    public bgr0(c2x0 c2x0Var, Bundle bundle, r1x0 r1x0Var, r1x0 r1x0Var2, long j) {
        this.f2570a = (byte) 3;
        this.c = bundle;
        this.d = r1x0Var;
        this.e = r1x0Var2;
        this.b = j;
        Objects.requireNonNull(c2x0Var);
        this.f = c2x0Var;
    }

    public /* synthetic */ bgr0(Object obj, String str, String str2, Object obj2, long j, byte b) {
        this.f2570a = b;
        this.c = str;
        this.d = str2;
        this.e = obj2;
        this.b = j;
        this.f = obj;
    }
}
