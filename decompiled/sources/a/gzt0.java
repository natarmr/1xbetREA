package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gzt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12199a;
    public final long b;
    public final boolean c;
    public final long d;
    public final boolean e;
    public final o4i0 f;
    public final long g;
    public final long h;
    public final long i;
    public final s02 j;

    public gzt0(int i, long j, boolean z, long j2, boolean z2, o4i0 o4i0Var, long j3, long j4, long j5, s02 s02Var) {
        this.f12199a = i;
        this.b = j;
        this.c = z;
        this.d = j2;
        this.e = z2;
        this.f = o4i0Var;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = s02Var;
    }

    public static gzt0 a(gzt0 gzt0Var, int i, long j, boolean z, long j2, boolean z2, o4i0 o4i0Var, long j3, long j4, long j5, s02 s02Var, int i2) {
        int i3 = (i2 & 1) != 0 ? gzt0Var.f12199a : i;
        long j6 = (i2 & 2) != 0 ? gzt0Var.b : j;
        boolean z3 = (i2 & 4) != 0 ? gzt0Var.c : z;
        long j7 = (i2 & 8) != 0 ? gzt0Var.d : j2;
        boolean z4 = (i2 & 16) != 0 ? gzt0Var.e : z2;
        o4i0 o4i0Var2 = (i2 & 32) != 0 ? gzt0Var.f : o4i0Var;
        long j8 = (i2 & 64) != 0 ? gzt0Var.g : j3;
        long j9 = (i2 & 128) != 0 ? gzt0Var.h : j4;
        long j10 = (i2 & 256) != 0 ? gzt0Var.i : j5;
        s02 s02Var2 = (i2 & 512) != 0 ? gzt0Var.j : s02Var;
        gzt0Var.getClass();
        return new gzt0(i3, j6, z3, j7, z4, o4i0Var2, j8, j9, j10, s02Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzt0)) {
            return false;
        }
        gzt0 gzt0Var = (gzt0) obj;
        return this.f12199a == gzt0Var.f12199a && this.b == gzt0Var.b && this.c == gzt0Var.c && this.d == gzt0Var.d && this.e == gzt0Var.e && this.f.equals(gzt0Var.f) && this.g == gzt0Var.g && this.h == gzt0Var.h && this.i == gzt0Var.i && this.j.equals(gzt0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + rw2.b(rw2.b(rw2.b((this.f.hashCode() + brm0.e(rw2.b(brm0.e(rw2.b(Integer.hashCode(this.f12199a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f12199a, this.b, "ValorantPostGameSelectedStateModel(selectedTabMatchIndex=", ", futureGamesSelectedTabId=");
        rz4.A(sbQ, ", futureGamesFooterCollapsed=", this.c, ", selectedLastMatchesTabId=");
        hne.t(this.d, ", lastMatchesFooterCollapsed=", sbQ, this.e);
        sbQ.append(", selectedPlayers=");
        sbQ.append(this.f);
        sbQ.append(", tournamentTableSelectedTabId=");
        sbQ.append(this.g);
        kng0.A(sbQ, ", statisticTableSelectedTabId=", this.h, ", aimPlayersSelectedTabId=");
        sbQ.append(this.i);
        sbQ.append(", aimPlayersSelectedPlayers=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
