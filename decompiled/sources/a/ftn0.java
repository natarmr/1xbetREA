package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ftn0 implements gtn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10122a;
    public final unq0 b;
    public final l7n c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public ftn0(int i, long j, l7n l7nVar, unq0 unq0Var, boolean z, boolean z2) {
        this.f10122a = j;
        this.b = unq0Var;
        this.c = l7nVar;
        this.d = z;
        this.e = z2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftn0)) {
            return false;
        }
        ftn0 ftn0Var = (ftn0) obj;
        return this.f10122a == ftn0Var.f10122a && this.b == ftn0Var.b && this.c == ftn0Var.c && this.d == ftn0Var.d && this.e == ftn0Var.e && this.f == ftn0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f10122a) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timer(timeMillis=");
        sb.append(this.f10122a);
        sb.append(", timerType=");
        sb.append(this.b);
        sb.append(", timeDirection=");
        sb.append(this.c);
        sb.append(", visible=");
        sb.append(this.d);
        cs0.v(this.f, ", timerRun=", ", caption=", sb, this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
