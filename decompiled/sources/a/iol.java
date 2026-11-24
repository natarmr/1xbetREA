package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class iol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15122a;
    public final long b;
    public final long c;
    public final bi90 d;
    public final jol e;

    public iol(long j, long j2, long j3, bi90 bi90Var, jol jolVar) {
        jolVar.getClass();
        this.f15122a = j;
        this.b = j2;
        this.c = j3;
        this.d = bi90Var;
        this.e = jolVar;
        if (bi90Var.b() > 1) {
            return;
        }
        c99.s(twn.m(bi90Var.b(), "[displayMeasureTypes.size] must be > 1. But was "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iol)) {
            return false;
        }
        iol iolVar = (iol) obj;
        long j = iolVar.f15122a;
        int i = y3d.h;
        return h2t0.a(this.f15122a, j) && h2t0.a(this.b, iolVar.b) && h2t0.a(this.c, iolVar.c) && this.d.equals(iolVar.d) && this.e == iolVar.e;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.e.hashCode() + ((this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f15122a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        String strI = y3d.i(this.f15122a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        StringBuilder sbN = b1j.n("DsAggregatorSmallTimerConfig(timeTextsColor=", strI, ", measureLabelsColor=", strI2, ", separatorsColor=");
        sbN.append(strI3);
        sbN.append(", displayMeasureTypes=");
        sbN.append(this.d);
        sbN.append(", horizontalDaysDisplayType=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
