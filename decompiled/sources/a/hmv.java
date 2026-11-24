package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hmv extends vs10 implements vzj {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final hmv f;

    public hmv(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new hmv(handler, str, true);
    }

    @Override // a.vzj
    public final void a(long j, n5a n5aVar) {
        llo lloVar = new llo(n5aVar, this, (byte) 5);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(lloVar, j)) {
            n5aVar.t(new f3s(this, lloVar, (byte) 18));
        } else {
            y(n5aVar.e, lloVar);
        }
    }

    @Override // a.vzj
    public final nwk c(long j, Runnable runnable, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new gmv(this, runnable, (byte) 0);
        }
        y(coroutineContext, runnable);
        return a660.f303a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hmv)) {
            return false;
        }
        hmv hmvVar = (hmv) obj;
        return hmvVar.c == this.c && hmvVar.e == this.e;
    }

    public final int hashCode() {
        return (this.e ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        y(coroutineContext, runnable);
    }

    @Override // a.vs10, a.lne
    public final String toString() {
        vs10 vs10VarX;
        String string;
        rwj rwjVar = tvk.f34603a;
        vs10 vs10Var = ys10.f43147a;
        if (this == vs10Var) {
            string = "Dispatchers.Main";
        } else {
            try {
                vs10VarX = vs10Var.x();
            } catch (UnsupportedOperationException unused) {
                vs10VarX = null;
            }
            string = this == vs10VarX ? "Dispatchers.Main.immediate" : null;
        }
        if (string == null) {
            string = this.d;
            if (string == null) {
                string = this.c.toString();
            }
            if (this.e) {
                return ohs0.n(string, ".immediate");
            }
        }
        return string;
    }

    @Override // a.lne
    public final boolean v(CoroutineContext coroutineContext) {
        return (this.e && Intrinsics.d(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    @Override // a.vs10
    public final vs10 x() {
        return this.f;
    }

    public final void y(CoroutineContext coroutineContext, Runnable runnable) {
        zvw.F(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        rwj rwjVar = tvk.f34603a;
        dvj.c.q(coroutineContext, runnable);
    }

    public hmv(Handler handler) {
        this(handler, null, false);
    }
}
