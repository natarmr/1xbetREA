package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g9q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10928a;
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

    public g9q(long j, double d, boolean z, boolean z2, long j2, String str, String str2, int i, txs0 txs0Var, String str3, String str4, boolean z3, String str5) {
        cs0.x(str, str2, str3, str5);
        this.f10928a = j;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9q)) {
            return false;
        }
        g9q g9qVar = (g9q) obj;
        return this.f10928a == g9qVar.f10928a && Double.compare(this.b, g9qVar.b) == 0 && this.c == g9qVar.c && this.d == g9qVar.d && this.e == g9qVar.e && Intrinsics.d(this.f, g9qVar.f) && Intrinsics.d(this.g, g9qVar.g) && this.h == g9qVar.h && this.i == g9qVar.i && Intrinsics.d(this.j, g9qVar.j) && this.k.equals(g9qVar.k) && this.l == g9qVar.l && Intrinsics.d(this.m, g9qVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + brm0.e(ua80.b(ua80.b((this.i.hashCode() + twn.a(this.h, ua80.b(ua80.b(rw2.b(brm0.e(brm0.e(brm0.d(this.b, Long.hashCode(this.f10928a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31)) * 31, 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f10928a, "FinBetsBalanceModel(id=", ", money=");
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
