package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a4s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f238a;
    public final String b;
    public final String c;
    public final s7s0 d;
    public final boolean e;
    public final g3s0 f;
    public final dxh0 g;
    public final gqt0 h;
    public final int i;
    public final boolean j;

    public a4s0(long j, String str, String str2, s7s0 s7s0Var, boolean z, g3s0 g3s0Var, dxh0 dxh0Var, gqt0 gqt0Var, int i, boolean z2) {
        this.f238a = j;
        this.b = str;
        this.c = str2;
        this.d = s7s0Var;
        this.e = z;
        this.f = g3s0Var;
        this.g = dxh0Var;
        this.h = gqt0Var;
        this.i = i;
        this.j = z2;
    }

    public static a4s0 a(a4s0 a4s0Var, String str, String str2, q7s0 q7s0Var, boolean z, g3s0 g3s0Var, gqt0 gqt0Var, boolean z2, int i) {
        long j = a4s0Var.f238a;
        a4s0Var.getClass();
        if ((i & 4) != 0) {
            str = a4s0Var.b;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = a4s0Var.c;
        }
        String str4 = str2;
        s7s0 s7s0Var = (i & 16) != 0 ? a4s0Var.d : q7s0Var;
        boolean z3 = (i & 32) != 0 ? a4s0Var.e : z;
        g3s0 g3s0Var2 = (i & 64) != 0 ? a4s0Var.f : g3s0Var;
        dxh0 dxh0Var = a4s0Var.g;
        gqt0 gqt0Var2 = (i & 256) != 0 ? a4s0Var.h : gqt0Var;
        int i2 = a4s0Var.i;
        boolean z4 = (i & 1024) != 0 ? a4s0Var.j : z2;
        a4s0Var.getClass();
        str3.getClass();
        str4.getClass();
        g3s0Var2.getClass();
        gqt0Var2.getClass();
        return new a4s0(j, str3, str4, s7s0Var, z3, g3s0Var2, dxh0Var, gqt0Var2, i2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4s0)) {
            return false;
        }
        a4s0 a4s0Var = (a4s0) obj;
        return this.f238a == a4s0Var.f238a && this.b.equals(a4s0Var.b) && this.c.equals(a4s0Var.c) && this.d.equals(a4s0Var.d) && this.e == a4s0Var.e && this.f == a4s0Var.f && this.g.equals(a4s0Var.g) && this.h == a4s0Var.h && this.i == a4s0Var.i && this.j == a4s0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + twn.a(this.i, (this.h.hashCode() + hne.h(this.g, (this.f.hashCode() + brm0.e((this.d.hashCode() + ua80.b(ua80.b(rw2.b(Long.hashCode(this.f238a) * 31, 31, 0L), 31, this.b), 31, this.c)) * 31, 31, this.e)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f238a, "TournamentPrizesState(tournamentId=", ", stageTournamentID=0, tournamentTitle=", this.b);
        sbO.append(", currencySymbol=");
        sbO.append(this.c);
        sbO.append(", tournamentState=");
        sbO.append(this.d);
        sbO.append(", hasBlockingError=");
        sbO.append(this.e);
        sbO.append(", pageType=");
        sbO.append(this.f);
        sbO.append(", segmentControlStyle=");
        sbO.append(this.g);
        sbO.append(", userActionButtonType=");
        sbO.append(this.h);
        dw9.v(this.i, ", lottieAnimationTypeId=", ", isLoading=", sbO, this.j);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
