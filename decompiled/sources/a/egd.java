package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class egd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rkx f7758a;
    public final long b;
    public final long c;
    public final long d;
    public final pge0 e;
    public final pge0 f;
    public final short g;
    public final boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public egd(rkx rkxVar, long j, long j2, long j3, pge0 pge0Var, pge0 pge0Var2, int i, boolean z) {
        this.f7758a = rkxVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = pge0Var;
        this.f = pge0Var2;
        this.g = i;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof egd) {
            egd egdVar = (egd) obj;
            if (this.f7758a.equals(egdVar.f7758a) && this.b == egdVar.b && this.c == egdVar.c && this.d == egdVar.d && this.e.equals(egdVar.e) && this.f.equals(egdVar.f) && this.g == egdVar.g && this.h == egdVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + twn.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + rw2.b(rw2.b(rw2.b(this.f7758a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31);
    }

    public final String toString() {
        String strU = t9x.U(this.b);
        String strU2 = t9x.U(this.c);
        String strU3 = t9x.U(this.d);
        StringBuilder sb = new StringBuilder("ComponentCoordinatesModel(size=");
        sb.append(this.f7758a);
        sb.append(", positionInParent=");
        sb.append(strU);
        sb.append(", positionInRoot=");
        f140.v(sb, strU2, ", positionInWindow=", strU3, ", boundsInRoot=");
        sb.append(this.e);
        sb.append(", boundsInWindow=");
        sb.append(this.f);
        sb.append(", radiusDp=");
        return ohs0.k(this.g, ", isAttached=", Separators.RPAREN, sb, this.h);
    }
}
