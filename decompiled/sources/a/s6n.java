package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s6n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31712a;
    public final long b;
    public final zcl c;

    public s6n(float f, long j, zcl zclVar) {
        this.f31712a = f;
        this.b = j;
        this.c = zclVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6n)) {
            return false;
        }
        s6n s6nVar = (s6n) obj;
        if (!ycl.b(this.f31712a, s6nVar.f31712a)) {
            return false;
        }
        long j = s6nVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && this.c.equals(s6nVar.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f31712a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(this.c.f44172a) + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Square(logoSize=", ycl.c(this.f31712a), ", placeholderColor=", y3d.i(this.b), ", cornerSize=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
