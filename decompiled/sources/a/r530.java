package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r530 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29866a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final List i;
    public final List j;

    public r530(long j, long j2, long j3, boolean z, boolean z2, int i, boolean z3, int i2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f29866a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = z3;
        this.h = i2;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r530)) {
            return false;
        }
        r530 r530Var = (r530) obj;
        return this.f29866a == r530Var.f29866a && this.b == r530Var.b && this.c == r530Var.c && this.d == r530Var.d && this.e == r530Var.e && this.f == r530Var.f && this.g == r530Var.g && this.h == r530Var.h && Intrinsics.d(this.i, r530Var.i) && Intrinsics.d(this.j, r530Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + dw9.a(twn.a(this.h, brm0.e(twn.a(this.f, brm0.e(brm0.e(rw2.b(rw2.b(Long.hashCode(this.f29866a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f29866a, "MarketsRequestModel(sportId=", ", subGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", userId=", this.c, ", cutCoef=");
        ua80.u(", live=", ", country=", sbQ, this.d, this.e);
        brm0.w(this.f, ", fCountry=", ", coefTypeId=", sbQ, this.g);
        ohs0.v(this.h, ", team1Ids=", ", team2Ids=", sbQ, this.i);
        return dw9.r(sbQ, this.j, Separators.RPAREN);
    }
}
