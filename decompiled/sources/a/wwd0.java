package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wwd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39882a;
    public final long b;
    public final long c;
    public final boolean d;
    public final o4i0 e;
    public final long f;
    public final boolean g;
    public final long h;

    public wwd0(int i, long j, long j2, boolean z, o4i0 o4i0Var, long j3, boolean z2, long j4) {
        this.f39882a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = o4i0Var;
        this.f = j3;
        this.g = z2;
        this.h = j4;
    }

    public static wwd0 a(wwd0 wwd0Var, int i, long j, long j2, boolean z, o4i0 o4i0Var, long j3, boolean z2, long j4, int i2) {
        if ((i2 & 1) != 0) {
            i = wwd0Var.f39882a;
        }
        int i3 = i;
        long j5 = (i2 & 2) != 0 ? wwd0Var.b : j;
        long j6 = (i2 & 4) != 0 ? wwd0Var.c : j2;
        boolean z3 = (i2 & 8) != 0 ? wwd0Var.d : z;
        o4i0 o4i0Var2 = (i2 & 16) != 0 ? wwd0Var.e : o4i0Var;
        long j7 = (i2 & 32) != 0 ? wwd0Var.f : j3;
        boolean z4 = (i2 & 64) != 0 ? wwd0Var.g : z2;
        long j8 = (i2 & 128) != 0 ? wwd0Var.h : j4;
        wwd0Var.getClass();
        return new wwd0(i3, j5, j6, z3, o4i0Var2, j7, z4, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwd0)) {
            return false;
        }
        wwd0 wwd0Var = (wwd0) obj;
        return this.f39882a == wwd0Var.f39882a && this.b == wwd0Var.b && this.c == wwd0Var.c && this.d == wwd0Var.d && this.e.equals(wwd0Var.e) && this.f == wwd0Var.f && this.g == wwd0Var.g && this.h == wwd0Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + brm0.e(rw2.b((this.e.hashCode() + brm0.e(rw2.b(rw2.b(Integer.hashCode(this.f39882a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f39882a, this.b, "RainbowPostGameSelectedStateModel(selectedTabMatchIndex=", ", selectedBanStatisticsTabId=");
        kng0.A(sbQ, ", futureGamesSelectedTabId=", this.c, ", futureGamesFooterCollapsed=");
        sbQ.append(this.d);
        sbQ.append(", selectedPlayers=");
        sbQ.append(this.e);
        sbQ.append(", selectedLastMatchesTabId=");
        hne.t(this.f, ", lastMatchesFooterCollapsed=", sbQ, this.g);
        return rw2.n(sbQ, this.h, ", selectedBanTabId=", Separators.RPAREN);
    }
}
