package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class okr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25419a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final double h;
    public final double i;
    public final List j;

    public okr0(String str, String str2, long j, long j2, String str3, String str4, long j3, double d, double d2, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f25419a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
        this.f = str4;
        this.g = j3;
        this.h = d;
        this.i = d2;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okr0)) {
            return false;
        }
        okr0 okr0Var = (okr0) obj;
        return Intrinsics.d(this.f25419a, okr0Var.f25419a) && Intrinsics.d(this.b, okr0Var.b) && this.c == okr0Var.c && this.d == okr0Var.d && this.e.equals(okr0Var.e) && this.f.equals(okr0Var.f) && this.g == okr0Var.g && Double.compare(this.h, okr0Var.h) == 0 && Double.compare(this.i, okr0Var.i) == 0 && Intrinsics.d(this.j, okr0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + brm0.d(this.i, brm0.d(this.h, rw2.b(ua80.b(ua80.b(rw2.b(rw2.b(ua80.b(this.f25419a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TotoBetModel(currencyIso=", this.f25419a, ", currency=", this.b, ", tirageNumber=");
        sbN.append(this.c);
        kng0.A(sbN, ", dateTermination=", this.d, ", pool=");
        f140.v(sbN, this.e, ", jackpot=", this.f, ", dateUpdate=");
        sbN.append(this.g);
        ohs0.A(sbN, this.h, ", minBetSum=", ", maxBetSum=");
        sbN.append(this.i);
        sbN.append(", totoChampionshipModelsList=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
