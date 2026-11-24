package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v480 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36764a;
    public final String b;
    public final long c;
    public final int d;
    public final i3m0 e;

    public v480(int i, String str, long j, int i2, i3m0 i3m0Var) {
        this.f36764a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = i3m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v480)) {
            return false;
        }
        v480 v480Var = (v480) obj;
        return this.f36764a == v480Var.f36764a && this.b.equals(v480Var.b) && this.c == v480Var.c && this.d == v480Var.d && this.e.equals(v480Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, rw2.b(ua80.b(Integer.hashCode(this.f36764a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f36764a, "OpponentsScreenParams(eventId=", ", group=", this.b, ", sportId=");
        ua80.v(sbR, this.c, ", champId=", this.d);
        sbR.append(", stageType=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
