package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ql5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28916a;
    public final double b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final txs0 i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;

    public ql5(long j, double d, boolean z, boolean z2, long j2, String str, String str2, int i, txs0 txs0Var, String str3, String str4, boolean z3, String str5) {
        cs0.x(str, str2, str3, str5);
        this.f28916a = j;
        this.b = d;
        this.c = z;
        this.d = z2;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i;
        this.i = txs0Var;
        this.j = str3;
        this.k = str4;
        this.l = z3;
        this.m = str5;
    }

    public static ql5 a(ql5 ql5Var, double d, String str, int i, int i2) {
        long j = (i2 & 1) != 0 ? ql5Var.f28916a : -2L;
        double d2 = (i2 & 2) != 0 ? ql5Var.b : d;
        boolean z = ql5Var.c;
        boolean z2 = ql5Var.d;
        long j2 = ql5Var.e;
        String str2 = (i2 & 32) != 0 ? ql5Var.f : str;
        String str3 = (i2 & 64) != 0 ? ql5Var.g : "EUR";
        int i3 = (i2 & 128) != 0 ? ql5Var.h : i;
        txs0 txs0Var = ql5Var.i;
        String str4 = ql5Var.j;
        String str5 = ql5Var.k;
        boolean z3 = ql5Var.l;
        String str6 = ql5Var.m;
        ql5Var.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        return new ql5(j, d2, z, z2, j2, str2, str3, i3, txs0Var, str4, str5, z3, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql5)) {
            return false;
        }
        ql5 ql5Var = (ql5) obj;
        return this.f28916a == ql5Var.f28916a && Double.compare(this.b, ql5Var.b) == 0 && this.c == ql5Var.c && this.d == ql5Var.d && this.e == ql5Var.e && Intrinsics.d(this.f, ql5Var.f) && Intrinsics.d(this.g, ql5Var.g) && this.h == ql5Var.h && this.i == ql5Var.i && Intrinsics.d(this.j, ql5Var.j) && this.k.equals(ql5Var.k) && this.l == ql5Var.l && Intrinsics.d(this.m, ql5Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + brm0.e(ua80.b(ua80.b((this.i.hashCode() + twn.a(this.h, ua80.b(ua80.b(rw2.b(brm0.e(brm0.e(brm0.d(this.b, Long.hashCode(this.f28916a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31)) * 31, 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f28916a, "BalanceModel(id=", ", money=");
        rz4.x(sbQ, this.b, ", hasLineRestrict=", this.c);
        rz4.A(sbQ, ", hasLiveRestrict=", this.d, ", currencyId=");
        kng0.z(sbQ, this.e, ", currencySymbol=", this.f);
        axq.s(this.h, ", currencyIsoCode=", this.g, ", points=", sbQ);
        sbQ.append(", typeAccount=");
        sbQ.append(this.i);
        sbQ.append(", alias=");
        sbQ.append(this.j);
        w6x.z(", accountName=", this.k, ", openBonusExists=", sbQ, this.l);
        return rw2.o(sbQ, ", name=", this.m, Separators.RPAREN);
    }
}
