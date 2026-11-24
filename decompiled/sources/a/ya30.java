package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ya30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42275a;
    public final boolean b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final boolean i;

    public ya30(boolean z, boolean z2, long j, long j2, String str, String str2, long j3, long j4, boolean z3) {
        str.getClass();
        str2.getClass();
        this.f42275a = z;
        this.b = z2;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = str2;
        this.g = j3;
        this.h = j4;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya30)) {
            return false;
        }
        ya30 ya30Var = (ya30) obj;
        return this.f42275a == ya30Var.f42275a && this.b == ya30Var.b && this.c == ya30Var.c && this.d == ya30Var.d && Intrinsics.d(this.e, ya30Var.e) && Intrinsics.d(this.f, ya30Var.f) && this.g == ya30Var.g && this.h == ya30Var.h && this.i == ya30Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + rw2.b(rw2.b(ua80.b(ua80.b(rw2.b(rw2.b(brm0.e(Boolean.hashCode(this.f42275a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("MatchInfoState(firstTeamFavorite=", ", secondTeamFavorite=", ", firstTeamId=", this.f42275a, this.b);
        sbQ.append(this.c);
        kng0.A(sbQ, ", secondTeamId=", this.d, ", firstTeamName=");
        f140.v(sbQ, this.e, ", secondTeamName=", this.f, ", sportId=");
        sbQ.append(this.g);
        kng0.A(sbQ, ", subSportId=", this.h, ", live=");
        return rw2.p(sbQ, this.i, Separators.RPAREN);
    }
}
