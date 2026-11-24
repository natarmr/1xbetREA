package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class trc0 implements vrc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34417a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final int h;
    public final xg8 i;
    public final String j;
    public final String k;
    public final String l;

    public trc0(long j, long j2, String str, String str2, String str3, int i, String str4, int i2, xg8 xg8Var, String str5, String str6, String str7) {
        this.f34417a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = str4;
        this.h = i2;
        this.i = xg8Var;
        this.j = str5;
        this.k = str6;
        this.l = str7;
    }

    public static trc0 a(trc0 trc0Var, String str, String str2, String str3, int i) {
        return new trc0(trc0Var.f34417a, trc0Var.b, trc0Var.c, trc0Var.d, trc0Var.e, trc0Var.f, (i & 64) != 0 ? trc0Var.g : str, trc0Var.h, trc0Var.i, trc0Var.j, (i & 1024) != 0 ? trc0Var.k : str2, (i & 2048) != 0 ? trc0Var.l : str3);
    }

    @Override // a.vrc0
    public final String A() {
        return this.d;
    }

    @Override // a.vrc0
    public final long B() {
        return this.b;
    }

    @Override // a.vrc0
    public final String C() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trc0)) {
            return false;
        }
        trc0 trc0Var = (trc0) obj;
        return this.f34417a == trc0Var.f34417a && this.b == trc0Var.b && this.c.equals(trc0Var.c) && this.d.equals(trc0Var.d) && this.e.equals(trc0Var.e) && this.f == trc0Var.f && this.g.equals(trc0Var.g) && this.h == trc0Var.h && this.i == trc0Var.i && Intrinsics.d(this.j, trc0Var.j) && this.k.equals(trc0Var.k) && this.l.equals(trc0Var.l);
    }

    @Override // a.vrc0
    public final long getId() {
        return this.f34417a;
    }

    @Override // a.vrc0
    public final String getName() {
        return this.c;
    }

    @Override // a.vrc0
    public final xg8 getType() {
        return this.i;
    }

    @Override // a.vrc0
    public final int h0() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + twn.a(this.h, ua80.b(twn.a(this.f, ua80.b(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f34417a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31)) * 31;
        String str = this.j;
        return this.l.hashCode() + ua80.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.k);
    }

    @Override // a.vrc0
    public final int m0() {
        return this.h;
    }

    @Override // a.vrc0
    public final String t0() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34417a, "Default(id=", ", categoryId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        f140.v(sbQ, ", desc=", this.d, ", slogan=", this.e);
        w6x.w(this.f, ", minBet=", ", analyticsParamName=", this.g, sbQ);
        sbQ.append(", numFS=");
        sbQ.append(this.h);
        sbQ.append(", type=");
        sbQ.append(this.i);
        f140.v(sbQ, ", compositeKey=", this.j, ", imageUrl=", this.k);
        return rw2.o(sbQ, ", detailImageUrl=", this.l, Separators.RPAREN);
    }
}
