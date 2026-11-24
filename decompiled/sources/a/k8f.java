package a;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class k8f {
    public static final kwd c = new kwd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y680 f17869a;
    public final AtomicReference b = new AtomicReference(null);

    public k8f(y680 y680Var) {
        this.f17869a = y680Var;
        y680Var.a(new gne(this, (byte) 28));
    }

    public final kwd a() {
        k8f k8fVar = (k8f) this.b.get();
        return k8fVar == null ? c : k8fVar.a();
    }

    public final boolean b() {
        k8f k8fVar = (k8f) this.b.get();
        return k8fVar != null && k8fVar.b();
    }

    public final boolean c() {
        k8f k8fVar = (k8f) this.b.get();
        return k8fVar != null && k8fVar.c();
    }

    public final void d(String str, long j, d55 d55Var) {
        String strK = kng0.k("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strK, null);
        }
        this.f17869a.a(new ord(str, j, d55Var));
    }
}
