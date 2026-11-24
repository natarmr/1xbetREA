package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class db1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5778a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;

    public db1(long j, String str, long j2, long j3, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, String str2) {
        str.getClass();
        str2.getClass();
        this.f5778a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = i;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db1)) {
            return false;
        }
        db1 db1Var = (db1) obj;
        return this.f5778a == db1Var.f5778a && Intrinsics.d(this.b, db1Var.b) && this.c == db1Var.c && this.d == db1Var.d && this.e == db1Var.e && this.f == db1Var.f && this.g == db1Var.g && this.h == db1Var.h && this.i == db1Var.i && this.j == db1Var.j && this.k == db1Var.k && Intrinsics.d(this.l, db1Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + brm0.e(brm0.e(brm0.e(twn.a(this.h, brm0.e(brm0.e(brm0.e(rw2.b(rw2.b(ua80.b(Long.hashCode(this.f5778a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f5778a, "AggregatorPreloadGameModel(gameId=", ", gameName=", this.b);
        kng0.A(sbO, ", providerId=", this.c, ", productId=");
        hne.t(this.d, ", noLoyalty=", sbO, this.e);
        w6x.A(", needTransfer=", ", fromMainScreen=", sbO, this.f, this.g);
        dw9.v(this.h, ", subcategoryId=", ", demoAvailable=", sbO, this.i);
        w6x.A(", bonusGame=", ", checkGame=", sbO, this.j, this.k);
        return rw2.o(sbO, ", gameMetricsUid=", this.l, Separators.RPAREN);
    }
}
