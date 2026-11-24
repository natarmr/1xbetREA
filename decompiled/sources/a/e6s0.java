package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e6s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7303a;
    public final long b;
    public final String c;
    public final String d;
    public final s7s0 e;
    public final boolean f;
    public final gqt0 g;
    public final int h;
    public final boolean i;

    public e6s0(long j, long j2, String str, String str2, s7s0 s7s0Var, boolean z, gqt0 gqt0Var, int i, boolean z2) {
        str.getClass();
        this.f7303a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = s7s0Var;
        this.f = z;
        this.g = gqt0Var;
        this.h = i;
        this.i = z2;
    }

    public static e6s0 a(e6s0 e6s0Var, long j, String str, q7s0 q7s0Var, boolean z, gqt0 gqt0Var, boolean z2, int i) {
        long j2 = e6s0Var.f7303a;
        if ((i & 2) != 0) {
            j = e6s0Var.b;
        }
        long j3 = j;
        String str2 = e6s0Var.c;
        String str3 = (i & 8) != 0 ? e6s0Var.d : str;
        s7s0 s7s0Var = (i & 16) != 0 ? e6s0Var.e : q7s0Var;
        boolean z3 = (i & 32) != 0 ? e6s0Var.f : z;
        gqt0 gqt0Var2 = (i & 64) != 0 ? e6s0Var.g : gqt0Var;
        int i2 = e6s0Var.h;
        boolean z4 = (i & 256) != 0 ? e6s0Var.i : z2;
        e6s0Var.getClass();
        str2.getClass();
        str3.getClass();
        gqt0Var2.getClass();
        return new e6s0(j2, j3, str2, str3, s7s0Var, z3, gqt0Var2, i2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6s0)) {
            return false;
        }
        e6s0 e6s0Var = (e6s0) obj;
        return this.f7303a == e6s0Var.f7303a && this.b == e6s0Var.b && Intrinsics.d(this.c, e6s0Var.c) && this.d.equals(e6s0Var.d) && this.e.equals(e6s0Var.e) && this.f == e6s0Var.f && this.g == e6s0Var.g && this.h == e6s0Var.h && this.i == e6s0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + twn.a(this.h, (this.g.hashCode() + brm0.e((this.e.hashCode() + ua80.b(ua80.b(rw2.b(Long.hashCode(this.f7303a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f7303a, "TournamentStagePrizesState(tournamentId=", ", stageTournamentID=");
        kng0.z(sbQ, this.b, ", tournamentTitle=", this.c);
        sbQ.append(", currencySymbol=");
        sbQ.append(this.d);
        sbQ.append(", tournamentState=");
        sbQ.append(this.e);
        sbQ.append(", hasBlockingError=");
        sbQ.append(this.f);
        sbQ.append(", userActionButtonType=");
        sbQ.append(this.g);
        dw9.v(this.h, ", lottieAnimationTypeId=", ", isLoading=", sbQ, this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
