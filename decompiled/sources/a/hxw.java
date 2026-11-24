package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class hxw {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote(Separators.SLASH);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p50 f13832a;
    public final Context b;
    public final String c;
    public final dgq d;
    public final qaj e;
    public b45 f;

    public hxw(Context context, String str, dgq dgqVar, qaj qajVar) {
        if (context == null) {
            jf4.o("appContext must not be null");
            throw null;
        }
        if (str == null) {
            jf4.o("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = dgqVar;
        this.e = qajVar;
        this.f13832a = new p50();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final zfq b(boolean z) {
        String str;
        String str2 = null;
        if (!((Boolean) new oye(0, cu.e, baf.class, "isNotMainThread", "isNotMainThread()Z", 0, (byte) 11).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dgq dgqVar = this.d;
        if (z) {
            try {
                str = ((d45) Tasks.await(((cgq) dgqVar).d(), 10000L, timeUnit)).f5438a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.await(((cgq) dgqVar).c(), 10000L, timeUnit);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new zfq(str2, str);
    }

    public final synchronized b45 c() {
        String str;
        b45 b45Var = this.f;
        if (b45Var != null && (b45Var.b != null || !this.e.e())) {
            return this.f;
        }
        rv00 rv00Var = rv00.s;
        rv00Var.D("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        rv00Var.D("Cached Firebase Installation ID: " + string);
        if (this.e.e()) {
            zfq zfqVarB = b(false);
            rv00Var.D("Fetched Firebase Installation ID: " + zfqVarB.f44312a);
            if (zfqVarB.f44312a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                zfqVarB = new zfq(str, null);
            }
            if (Objects.equals(zfqVarB.f44312a, string)) {
                this.f = new b45(sharedPreferences.getString("crashlytics.installation.id", null), zfqVarB.f44312a, zfqVarB.b);
            } else {
                this.f = new b45(a(sharedPreferences, zfqVarB.f44312a), zfqVarB.f44312a, zfqVarB.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new b45(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new b45(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        rv00Var.D("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        p50 p50Var = this.f13832a;
        Context context = this.b;
        synchronized (p50Var) {
            try {
                String str2 = p50Var.b;
                if (str2 == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    str2 = installerPackageName;
                    p50Var.b = str2;
                }
                str = "".equals(str2) ? null : p50Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
