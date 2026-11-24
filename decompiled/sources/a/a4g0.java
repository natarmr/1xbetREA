package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a4g0 implements b4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f223a;
    public final boolean b;
    public final wmf0 c;

    public a4g0(boolean z, boolean z2, wmf0 wmf0Var) {
        this.f223a = z;
        this.b = z2;
        this.c = wmf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4g0)) {
            return false;
        }
        a4g0 a4g0Var = (a4g0) obj;
        return this.f223a == a4g0Var.f223a && this.b == a4g0Var.b && this.c.equals(a4g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f223a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ShowHints(refresh=", ", supportRtl=", ", hintState=", this.f223a, this.b);
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
