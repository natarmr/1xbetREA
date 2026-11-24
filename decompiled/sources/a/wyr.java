package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wyr implements zyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39987a;
    public final zmk0 b;
    public final String c;
    public final String d;
    public final boolean e;

    public wyr(long j, zmk0 zmk0Var, String str, String str2, boolean z) {
        this.f39987a = j;
        this.b = zmk0Var;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyr)) {
            return false;
        }
        wyr wyrVar = (wyr) obj;
        return this.f39987a == wyrVar.f39987a && this.b.equals(wyrVar.b) && this.c.equals(wyrVar.c) && this.d.equals(wyrVar.d) && this.e == wyrVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(axq.b(this.b, Long.hashCode(this.f39987a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamFirst(id=");
        sb.append(this.f39987a);
        sb.append(", name=");
        sb.append(this.b);
        f140.v(sb, ", firstPlayer=", this.c, ", secondPlayer=", this.d);
        return f140.n(sb, ", secondPlayerVisible=", this.e, Separators.RPAREN);
    }
}
