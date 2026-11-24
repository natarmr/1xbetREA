package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qtn0 implements rtn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29306a;
    public final l7n b;
    public final boolean c;
    public final unq0 d;
    public final boolean e;
    public final int f;

    public qtn0(int i, long j, l7n l7nVar, unq0 unq0Var, boolean z, boolean z2) {
        this.f29306a = j;
        this.b = l7nVar;
        this.c = z;
        this.d = unq0Var;
        this.e = z2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtn0)) {
            return false;
        }
        qtn0 qtn0Var = (qtn0) obj;
        return this.f29306a == qtn0Var.f29306a && this.b == qtn0Var.b && this.c == qtn0Var.c && this.d == qtn0Var.d && this.e == qtn0Var.e && this.f == qtn0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + brm0.e((this.d.hashCode() + brm0.e((this.b.hashCode() + (Long.hashCode(this.f29306a) * 31)) * 31, 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timer(timeMillis=");
        sb.append(this.f29306a);
        sb.append(", timeDirection=");
        sb.append(this.b);
        sb.append(", visible=");
        sb.append(this.c);
        sb.append(", timerType=");
        sb.append(this.d);
        cs0.v(this.f, ", timerRun=", ", caption=", sb, this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
