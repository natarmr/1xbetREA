package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zsn0 implements atn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44913a;
    public final unq0 b;
    public final l7n c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public zsn0(int i, long j, l7n l7nVar, unq0 unq0Var, boolean z, boolean z2) {
        this.f44913a = j;
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
        if (!(obj instanceof zsn0)) {
            return false;
        }
        zsn0 zsn0Var = (zsn0) obj;
        return this.f44913a == zsn0Var.f44913a && this.b == zsn0Var.b && this.c == zsn0Var.c && this.d == zsn0Var.d && this.e == zsn0Var.e && this.f == zsn0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f44913a) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timer(timeMillis=");
        sb.append(this.f44913a);
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
