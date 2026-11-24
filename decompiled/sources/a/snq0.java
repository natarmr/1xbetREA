package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class snq0 {
    public static final snq0 c = new snq0(c8h0.c, new xmq0(0, 0, 0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8h0 f32507a;
    public final xmq0 b;

    public snq0(c8h0 c8h0Var, xmq0 xmq0Var) {
        this.f32507a = c8h0Var;
        this.b = xmq0Var;
    }

    public static snq0 a(snq0 snq0Var, c8h0 c8h0Var, xmq0 xmq0Var, int i) {
        if ((i & 1) != 0) {
            c8h0Var = snq0Var.f32507a;
        }
        if ((i & 2) != 0) {
            xmq0Var = snq0Var.b;
        }
        snq0Var.getClass();
        c8h0Var.getClass();
        return new snq0(c8h0Var, xmq0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snq0)) {
            return false;
        }
        snq0 snq0Var = (snq0) obj;
        return this.f32507a == snq0Var.f32507a && this.b.equals(snq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32507a.hashCode() * 31);
    }

    public final String toString() {
        return "TimerState(screenSource=" + this.f32507a + ", timer=" + this.b + Separators.RPAREN;
    }
}
