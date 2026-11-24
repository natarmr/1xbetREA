package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class nd9 implements f83 {
    public static final long d = idm0.v(1.0f, 8589934592L);
    public static final nd9 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23328a;
    public final long b;
    public final long c;

    static {
        long jV = idm0.v(0.25f, 8589934592L);
        e = new nd9(jV, jV, idm0.v(0.25f, 8589934592L));
    }

    public nd9(long j, long j2, long j3) {
        this.f23328a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nd9)) {
            return false;
        }
        nd9 nd9Var = (nd9) obj;
        if (!daq0.a(this.f23328a, nd9Var.f23328a) || !daq0.a(this.b, nd9Var.b)) {
            return false;
        }
        daq0.a(this.c, nd9Var.c);
        return false;
    }

    public final int hashCode() {
        int iHashCode = ljc.b.hashCode() * 31;
        eaq0[] eaq0VarArr = daq0.b;
        return l0q.f19214a.hashCode() + defpackage.c.a(rw2.b(rw2.b(rw2.b(iHashCode, 31, this.f23328a), 31, this.b), 961, this.c), Float.NaN, 31);
    }

    public final String toString() {
        ljc ljcVar = ljc.b;
        String strF = daq0.f(this.f23328a);
        String strF2 = daq0.f(this.b);
        String strF3 = daq0.f(this.c);
        StringBuilder sb = new StringBuilder("Bullet(shape=");
        sb.append(ljcVar);
        sb.append(", size=(");
        sb.append(strF);
        sb.append(", ");
        f140.v(sb, strF2, "), padding=", strF3, ", brush=null, alpha=NaN, drawStyle=");
        sb.append(l0q.f19214a);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
