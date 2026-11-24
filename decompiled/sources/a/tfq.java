package a;

import android.util.Log;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class tfq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8f f33879a;

    public tfq(j8f j8fVar) {
        this.f33879a = j8fVar;
    }

    public static tfq a() {
        tfq tfqVar = (tfq) nfq.d().b(tfq.class);
        if (tfqVar != null) {
            return tfqVar;
        }
        hny.u("FirebaseCrashlytics component is not present.");
        return null;
    }

    public final void b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        j8f j8fVar = this.f33879a;
        ((aaf) j8fVar.o.b).b(new h8f(j8fVar, jCurrentTimeMillis - j8fVar.d, str));
    }

    public final void c(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        Map map = Collections.EMPTY_MAP;
        j8f j8fVar = this.f33879a;
        ((aaf) j8fVar.o.b).a(new b1(j8fVar, th));
    }

    public final void d(String str, String str2) {
        j8f j8fVar = this.f33879a;
        ((aaf) j8fVar.o.b).a(new b1(j8fVar, str, str2, (byte) 8));
    }
}
