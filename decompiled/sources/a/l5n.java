package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19466a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public l5n(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f19466a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5n)) {
            return false;
        }
        l5n l5nVar = (l5n) obj;
        long j = l5nVar.f19466a;
        int i = y3d.h;
        return h2t0.a(this.f19466a, j) && h2t0.a(this.b, l5nVar.b) && h2t0.a(this.c, l5nVar.c) && h2t0.a(this.d, l5nVar.d) && h2t0.a(this.e, l5nVar.e) && h2t0.a(this.f, l5nVar.f) && h2t0.a(this.g, l5nVar.g) && h2t0.a(this.h, l5nVar.h);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.h) + rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f19466a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strI = y3d.i(this.f19466a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        String strI6 = y3d.i(this.f);
        String strI7 = y3d.i(this.g);
        String strI8 = y3d.i(this.h);
        StringBuilder sbN = b1j.n("DsSwitchColors(checkedTrackColor=", strI, ", uncheckedTrackColor=", strI2, ", checkedHandleColor=");
        f140.v(sbN, strI3, ", uncheckedHandleColor=", strI4, ", disabledCheckedTrackColor=");
        f140.v(sbN, strI5, ", disabledUncheckedTrackColor=", strI6, ", disabledCheckedHandleColor=");
        return ua80.m(sbN, strI7, ", disabledUncheckedHandleColor=", strI8, Separators.RPAREN);
    }
}
