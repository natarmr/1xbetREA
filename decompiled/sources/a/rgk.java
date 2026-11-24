package a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class rgk {
    public static final f03 c = f03.d();
    public static rgk d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SharedPreferences f30441a;
    public final ExecutorService b;

    public rgk(ExecutorService executorService) {
        this.b = executorService;
    }

    public static Context a() {
        try {
            nfq.d();
            nfq nfqVarD = nfq.d();
            nfqVarD.a();
            return nfqVarD.f23449a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized rgk b() {
        rgk rgkVar;
        rgkVar = d;
        if (rgkVar == null) {
            rgkVar = new rgk(Executors.newSingleThreadExecutor());
            d = rgkVar;
        }
        return rgkVar;
    }

    public final synchronized void c(Context context) {
        if (this.f30441a == null && context != null) {
            this.b.execute(new a4e(this, context, (byte) 24));
        }
    }

    public final void d(long j, String str) {
        if (this.f30441a == null) {
            c(a());
            if (this.f30441a == null) {
                return;
            }
        }
        this.f30441a.edit().putLong(str, j).apply();
    }

    public final void e(String str, double d2) {
        if (this.f30441a == null) {
            c(a());
            if (this.f30441a == null) {
                return;
            }
        }
        this.f30441a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
    }

    public final void f(String str, String str2) {
        if (this.f30441a == null) {
            c(a());
            if (this.f30441a == null) {
                return;
            }
        }
        SharedPreferences sharedPreferences = this.f30441a;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z) {
        if (this.f30441a == null) {
            c(a());
            if (this.f30441a == null) {
                return;
            }
        }
        this.f30441a.edit().putBoolean(str, z).apply();
    }
}
