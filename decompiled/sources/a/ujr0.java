package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ujr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35797a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final List o;
    public final double p;

    public ujr0(int i, long j, long j2, String str, String str2, String str3, int i2, String str4, String str5, long j3, int i3, String str6, String str7, String str8, List list, double d) {
        list.getClass();
        this.f35797a = i;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i2;
        this.h = str4;
        this.i = str5;
        this.j = j3;
        this.k = i3;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = list;
        this.p = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujr0)) {
            return false;
        }
        ujr0 ujr0Var = (ujr0) obj;
        return this.f35797a == ujr0Var.f35797a && this.b == ujr0Var.b && this.c == ujr0Var.c && this.d.equals(ujr0Var.d) && this.e.equals(ujr0Var.e) && this.f.equals(ujr0Var.f) && this.g == ujr0Var.g && this.h.equals(ujr0Var.h) && this.i.equals(ujr0Var.i) && this.j == ujr0Var.j && this.k == ujr0Var.k && this.l.equals(ujr0Var.l) && this.m.equals(ujr0Var.m) && this.n.equals(ujr0Var.n) && Intrinsics.d(this.o, ujr0Var.o) && Double.compare(this.p, ujr0Var.p) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.p) + dw9.a(ua80.b(ua80.b(ua80.b(twn.a(this.k, rw2.b(ua80.b(ua80.b(twn.a(this.g, ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(Integer.hashCode(this.f35797a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f35797a, this.b, "TotoBetGameModel(gameNumber=", ", startDate=");
        kng0.A(sbQ, ", champId=", this.c, ", champName=");
        f140.v(sbQ, this.d, ", countryImage=", this.e, ", champImage=");
        twn.w(this.g, this.f, ", countryId=", ", gameName=", sbQ);
        f140.v(sbQ, this.h, ", score=", this.i, ", sportId=");
        ua80.v(sbQ, this.j, ", bukGameId=", this.k);
        f140.v(sbQ, ", opponent1Name=", this.l, ", opponent2Name=", this.m);
        ua80.t(", period=", this.n, ", betsPercents=", sbQ, this.o);
        return brm0.m(sbQ, this.p, ", total=", Separators.RPAREN);
    }
}
