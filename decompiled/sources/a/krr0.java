package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class krr0 {
    public static final krr0 n = new krr0("", -1, 0, "", 0, 0, true, "0", 0.0d, new Date(), 0.0d, 0.0d, iun.f15405a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18782a;
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    public final boolean g;
    public final String h;
    public final double i;
    public final Date j;
    public final double k;
    public final double l;
    public final List m;

    public krr0(String str, long j, long j2, String str2, long j3, long j4, boolean z, String str3, double d, Date date, double d2, double d3, List list) {
        str3.getClass();
        list.getClass();
        this.f18782a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = j3;
        this.f = j4;
        this.g = z;
        this.h = str3;
        this.i = d;
        this.j = date;
        this.k = d2;
        this.l = d3;
        this.m = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krr0)) {
            return false;
        }
        krr0 krr0Var = (krr0) obj;
        return this.f18782a.equals(krr0Var.f18782a) && this.b == krr0Var.b && this.c == krr0Var.c && this.d.equals(krr0Var.d) && this.e == krr0Var.e && this.f == krr0Var.f && this.g == krr0Var.g && Intrinsics.d(this.h, krr0Var.h) && Double.compare(this.i, krr0Var.i) == 0 && this.j.equals(krr0Var.j) && Double.compare(this.k, krr0Var.k) == 0 && Double.compare(this.l, krr0Var.l) == 0 && Intrinsics.d(this.m, krr0Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + brm0.d(this.l, brm0.d(this.k, brm0.i(this.j, brm0.d(this.i, ua80.b(brm0.e(rw2.b(rw2.b(ua80.b(rw2.b(rw2.b(this.f18782a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "TotoJackpotTiragModel(currency=", this.f18782a, ", balanceId=");
        kng0.A(sbO, ", tiragNumber=", this.c, ", maxJackpotBanner=");
        defpackage.c.i(sbO, this.e, this.d, ", dateTermination=");
        kng0.A(sbO, ", endTiragDate=", this.f, ", use24HourFormat=");
        f140.s(", pool=", this.h, ", maxPool=", sbO, this.g);
        sbO.append(this.i);
        sbO.append(", dateUpdate=");
        sbO.append(this.j);
        ohs0.A(sbO, this.k, ", minBetSum=", ", maxBetSum=");
        sbO.append(this.l);
        sbO.append(", championshipsList=");
        sbO.append(this.m);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
