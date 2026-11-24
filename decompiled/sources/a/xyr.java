package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xyr implements zyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41718a;
    public final zmk0 b;
    public final String c;
    public final String d;
    public final boolean e;

    public xyr(long j, zmk0 zmk0Var, String str, String str2, boolean z) {
        this.f41718a = j;
        this.b = zmk0Var;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyr)) {
            return false;
        }
        xyr xyrVar = (xyr) obj;
        return this.f41718a == xyrVar.f41718a && this.b.equals(xyrVar.b) && this.c.equals(xyrVar.c) && this.d.equals(xyrVar.d) && this.e == xyrVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(axq.b(this.b, Long.hashCode(this.f41718a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamSecond(id=");
        sb.append(this.f41718a);
        sb.append(", name=");
        sb.append(this.b);
        f140.v(sb, ", firstPlayer=", this.c, ", secondPlayer=", this.d);
        return f140.n(sb, ", secondPlayerVisible=", this.e, Separators.RPAREN);
    }
}
