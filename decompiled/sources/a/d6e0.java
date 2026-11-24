package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d6e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5545a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public d6e0(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4) {
        str3.getClass();
        this.f5545a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6e0)) {
            return false;
        }
        d6e0 d6e0Var = (d6e0) obj;
        return this.f5545a.equals(d6e0Var.f5545a) && this.b.equals(d6e0Var.b) && Intrinsics.d(this.c, d6e0Var.c) && this.d.equals(d6e0Var.d) && this.e.equals(d6e0Var.e) && this.f.equals(d6e0Var.f) && this.g.equals(d6e0Var.g) && this.h == d6e0Var.h && this.i == d6e0Var.i && this.j == d6e0Var.j && this.k == d6e0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f5545a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RatingModel(rank=", this.f5545a, ", year=", this.b, ", month=");
        f140.v(sbN, this.c, ", bestRanking=", this.d, ", worstRanking=");
        f140.v(sbN, this.e, ", bestMove=", this.f, ", worstMove=");
        brm0.C(this.g, ", isWorstRanking=", ", isBestRanking=", sbN, this.h);
        ua80.u(", isWorstMover=", ", isBestMover=", sbN, this.i, this.j);
        return rw2.p(sbN, this.k, Separators.RPAREN);
    }
}
