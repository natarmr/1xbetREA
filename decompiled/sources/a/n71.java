package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23019a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final Long g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public n71(long j, boolean z, boolean z2, boolean z3, String str, String str2, Long l, boolean z4, boolean z5, String str3) {
        str2.getClass();
        str3.getClass();
        this.f23019a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = str2;
        this.g = l;
        this.h = z4;
        this.i = z5;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n71)) {
            return false;
        }
        n71 n71Var = (n71) obj;
        return this.f23019a == n71Var.f23019a && this.b == n71Var.b && this.c == n71Var.c && this.d == n71Var.d && this.e.equals(n71Var.e) && Intrinsics.d(this.f, n71Var.f) && this.g.equals(n71Var.g) && this.h == n71Var.h && this.i == n71Var.i && Intrinsics.d(this.j, n71Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + brm0.e(brm0.e((this.g.hashCode() + ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(Long.hashCode(this.f23019a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f23019a, "AggregatorMultiModeGameModel(gameId=", ", fromMainScreen=", this.b);
        w6x.A(", demoAvailable=", ", isDemo=", sbR, this.c, this.d);
        f140.v(sbR, ", gameUrl=", this.e, ", lobbyUrl=", this.f);
        sbR.append(", balanceId=");
        sbR.append(this.g);
        sbR.append(", bonusGame=");
        sbR.append(this.h);
        hne.u(", unavailableLoyalty=", ", gameMetricsUid=", this.j, sbR, this.i);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
