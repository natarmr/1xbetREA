package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28815a;
    public final int b;
    public final double c;
    public final String d;
    public final boolean e;
    public final double f;

    public qj00(int i, int i2, double d, String str, boolean z, double d2) {
        this.f28815a = i;
        this.b = i2;
        this.c = d;
        this.d = str;
        this.e = z;
        this.f = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj00)) {
            return false;
        }
        qj00 qj00Var = (qj00) obj;
        return this.f28815a == qj00Var.f28815a && this.b == qj00Var.b && Double.compare(this.c, qj00Var.c) == 0 && this.d.equals(qj00Var.d) && this.e == qj00Var.e && Double.compare(this.f, qj00Var.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + brm0.e(ua80.b(brm0.d(this.c, twn.a(this.b, Integer.hashCode(this.f28815a) * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("LiveGameEventModel(type=", this.f28815a, ", playerId=", ", cf=", this.b);
        hne.w(sbT, this.c, ", cfView=", this.d);
        rz4.A(sbT, ", isCenter=", this.e, ", parameter=");
        return axq.l(sbT, this.f, Separators.RPAREN);
    }
}
