package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class l73 implements l7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxs0 f19537a;
    public final pz40 b;
    public t73 c;
    public long d;
    public long e;
    public boolean f;

    public l73(lxs0 lxs0Var, Object obj, t73 t73Var, long j, long j2, boolean z) {
        t73 t73VarL;
        this.f19537a = lxs0Var;
        this.b = androidx.compose.runtime.e.e(obj);
        if (t73Var != null) {
            t73VarL = fre0.L(t73Var);
        } else {
            t73VarL = (t73) lxs0Var.f20832a.invoke(obj);
            t73VarL.d();
        }
        this.c = t73VarL;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final Object b() {
        return this.f19537a.b.invoke(this.c);
    }

    @Override // a.l7m0
    public final Object getValue() {
        return ((hgk0) this.b).getValue();
    }

    public final String toString() {
        Object value = ((hgk0) this.b).getValue();
        Object objB = b();
        boolean z = this.f;
        long j = this.d;
        long j2 = this.e;
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(value);
        sb.append(", velocity=");
        sb.append(objB);
        sb.append(", isRunning=");
        rw2.v(j, ", lastFrameTimeNanos=", sb, z);
        return rw2.n(sb, j2, ", finishedTimeNanos=", Separators.RPAREN);
    }

    public /* synthetic */ l73(lxs0 lxs0Var, Object obj, t73 t73Var, int i) {
        this(lxs0Var, obj, (i & 4) != 0 ? null : t73Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
