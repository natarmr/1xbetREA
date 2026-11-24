package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kwn0 implements lwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19010a;
    public final unq0 b;
    public final l7n c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public kwn0(int i, long j, l7n l7nVar, unq0 unq0Var, boolean z, boolean z2) {
        this.f19010a = j;
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
        if (!(obj instanceof kwn0)) {
            return false;
        }
        kwn0 kwn0Var = (kwn0) obj;
        return this.f19010a == kwn0Var.f19010a && this.b == kwn0Var.b && this.c == kwn0Var.c && this.d == kwn0Var.d && this.e == kwn0Var.e && this.f == kwn0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f19010a) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timer(timeMillis=");
        sb.append(this.f19010a);
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
