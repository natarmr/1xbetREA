package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g1p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10526a;
    public final int b;
    public final String c;
    public final long d;

    public g1p0(int i, long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f10526a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1p0)) {
            return false;
        }
        g1p0 g1p0Var = (g1p0) obj;
        if (!Intrinsics.d(this.f10526a, g1p0Var.f10526a) || this.b != g1p0Var.b || !Intrinsics.d(this.c, g1p0Var.c)) {
            return false;
        }
        long j = g1p0Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iB = ua80.b(twn.a(this.b, this.f10526a.hashCode() * 31, 31), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + iB;
    }

    public final String toString() {
        return ua80.m(kng0.p(this.b, "TeamBetPieChartSectorUiModel(label=", this.f10526a, ", value=", ", valueText="), this.c, ", color=", y3d.i(this.d), Separators.RPAREN);
    }
}
