package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fpa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9919a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public fpa0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.f9919a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpa0)) {
            return false;
        }
        fpa0 fpa0Var = (fpa0) obj;
        return b5x.I(this.f9919a, fpa0Var.f9919a) && this.b == fpa0Var.b && ne60.c(this.c, fpa0Var.c) && ne60.c(this.d, fpa0Var.d) && this.e == fpa0Var.e && Float.compare(this.f, fpa0Var.f) == 0 && this.g == fpa0Var.g && this.h == fpa0Var.h && this.i.equals(fpa0Var.i) && ne60.c(this.j, fpa0Var.j) && Float.compare(this.k, fpa0Var.k) == 0 && ne60.c(this.l, fpa0Var.l) && ne60.c(this.m, fpa0Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + rw2.b(defpackage.c.a(rw2.b(twn.g(this.i, brm0.e(twn.a(this.g, defpackage.c.a(brm0.e(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f9919a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), 31), 31, this.h), 31), 31, this.j), this.k, 31), 31, this.l);
    }

    public final String toString() {
        String strH0 = b5x.h0(this.f9919a);
        String strH = ne60.h(this.c);
        String strH2 = ne60.h(this.d);
        String strA = lpa0.a(this.g);
        String strH3 = ne60.h(this.j);
        String strH4 = ne60.h(this.l);
        String strH5 = ne60.h(this.m);
        StringBuilder sbO = f140.o(this.b, "PointerInputEventData(id=", strH0, ", uptime=");
        f140.v(sbO, ", positionOnScreen=", strH, ", position=", strH2);
        sbO.append(", down=");
        sbO.append(this.e);
        sbO.append(", pressure=");
        sbO.append(this.f);
        w6x.z(", type=", strA, ", activeHover=", sbO, this.h);
        sbO.append(", historical=");
        sbO.append(this.i);
        sbO.append(", scrollDelta=");
        sbO.append(strH3);
        sbO.append(", scaleGestureFactor=");
        sbO.append(this.k);
        sbO.append(", panGestureOffset=");
        sbO.append(strH4);
        return rw2.o(sbO, ", originalEventPosition=", strH5, Separators.RPAREN);
    }
}
