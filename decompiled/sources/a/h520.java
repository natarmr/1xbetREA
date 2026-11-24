package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h520 implements k520 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12460a;
    public final String b;
    public final long c;
    public final String d;
    public final double e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public h520(boolean z, String str, long j, String str2, double d, String str3, String str4, String str5, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f12460a = z;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = d;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h520)) {
            return false;
        }
        h520 h520Var = (h520) obj;
        return this.f12460a == h520Var.f12460a && Intrinsics.d(this.b, h520Var.b) && this.c == h520Var.c && Intrinsics.d(this.d, h520Var.d) && Double.compare(this.e, h520Var.e) == 0 && this.f.equals(h520Var.f) && this.g.equals(h520Var.g) && this.h.equals(h520Var.h) && this.i == h520Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b(ua80.b(ua80.b(brm0.d(this.e, ua80.b(rw2.b(ua80.b(Boolean.hashCode(this.f12460a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("ShowSuccessBet(isPromo=", ", betNumber=", this.b, this.f12460a, ", balanceId=");
        kng0.z(sbQ, this.c, ", symbol=", this.d);
        ohs0.A(sbQ, this.e, ", betSum=", ", betCoefficient=");
        f140.v(sbQ, this.f, ", possibleWinSum=", this.g, ", possibleWinTitle=");
        return defpackage.c.c(this.h, ", isAvailablePossibleWinTax=", Separators.RPAREN, sbQ, this.i);
    }
}
