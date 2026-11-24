package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28407a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ope h;

    public qao0(long j, long j2, long j3, long j4, long j5, long j6, long j7, ope opeVar) {
        this.f28407a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = opeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qao0)) {
            return false;
        }
        qao0 qao0Var = (qao0) obj;
        long j = qao0Var.f28407a;
        int i = y3d.h;
        return h2t0.a(this.f28407a, j) && h2t0.a(this.b, qao0Var.b) && h2t0.a(this.c, qao0Var.c) && h2t0.a(this.d, qao0Var.d) && h2t0.a(this.e, qao0Var.e) && h2t0.a(this.f, qao0Var.f) && h2t0.a(this.g, qao0Var.g) && Intrinsics.d(this.h, qao0Var.h);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f28407a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        ope opeVar = this.h;
        return iB + (opeVar == null ? 0 : opeVar.hashCode());
    }

    public final String toString() {
        String strI = y3d.i(this.f28407a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        String strI6 = y3d.i(this.f);
        String strI7 = y3d.i(this.g);
        StringBuilder sbN = b1j.n("TabColorsWithDefaults(activeLabel=", strI, ", inactiveLabel=", strI2, ", activeIcon=");
        f140.v(sbN, strI3, ", inactiveIcon=", strI4, ", activeBackground=");
        f140.v(sbN, strI5, ", separatorColor=", strI6, ", containerColor=");
        sbN.append(strI7);
        sbN.append(", counterStyle=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
