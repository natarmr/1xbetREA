package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fgd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9486a;
    public final long b;
    public final long c;
    public final long d;
    public final jge0 e;
    public final jge0 f;
    public final float g;
    public final boolean h;

    public fgd(long j, long j2, long j3, long j4, jge0 jge0Var, jge0 jge0Var2, float f, boolean z) {
        this.f9486a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = jge0Var;
        this.f = jge0Var2;
        this.g = f;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgd)) {
            return false;
        }
        fgd fgdVar = (fgd) obj;
        return qkx.a(this.f9486a, fgdVar.f9486a) && ne60.c(this.b, fgdVar.b) && ne60.c(this.c, fgdVar.c) && ne60.c(this.d, fgdVar.d) && this.e.equals(fgdVar.e) && this.f.equals(fgdVar.f) && ycl.b(this.g, fgdVar.g) && this.h == fgdVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + defpackage.c.a((this.f.hashCode() + ((this.e.hashCode() + rw2.b(rw2.b(rw2.b(Long.hashCode(this.f9486a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, this.g, 31);
    }

    public final String toString() {
        String strB = qkx.b(this.f9486a);
        String strH = ne60.h(this.b);
        String strH2 = ne60.h(this.c);
        String strH3 = ne60.h(this.d);
        String strC = ycl.c(this.g);
        StringBuilder sbN = b1j.n("ComponentCoordinatesUiModel(size=", strB, ", positionInParent=", strH, ", positionInRoot=");
        f140.v(sbN, strH2, ", positionInWindow=", strH3, ", boundsInRoot=");
        sbN.append(this.e);
        sbN.append(", boundsInWindow=");
        sbN.append(this.f);
        sbN.append(", radiusDp=");
        return defpackage.c.c(strC, ", isAttached=", Separators.RPAREN, sbN, this.h);
    }
}
