package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class urc0 implements vrc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36158a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final int h;
    public final xg8 i;
    public final String j;
    public final long k;
    public final hds l;

    public urc0(long j, long j2, String str, String str2, String str3, int i, String str4, int i2, xg8 xg8Var, String str5, long j3, hds hdsVar) {
        this.f36158a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = str4;
        this.h = i2;
        this.i = xg8Var;
        this.j = str5;
        this.k = j3;
        this.l = hdsVar;
    }

    public static urc0 a(urc0 urc0Var, String str, hds hdsVar, int i) {
        long j = urc0Var.f36158a;
        long j2 = urc0Var.b;
        String str2 = urc0Var.c;
        String str3 = urc0Var.d;
        String str4 = urc0Var.e;
        int i2 = urc0Var.f;
        String str5 = (i & 64) != 0 ? urc0Var.g : str;
        int i3 = urc0Var.h;
        xg8 xg8Var = urc0Var.i;
        String str6 = urc0Var.j;
        long j3 = urc0Var.k;
        hds hdsVar2 = (i & 2048) != 0 ? urc0Var.l : hdsVar;
        urc0Var.getClass();
        hdsVar2.getClass();
        return new urc0(j, j2, str2, str3, str4, i2, str5, i3, xg8Var, str6, j3, hdsVar2);
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
        if (!(obj instanceof urc0)) {
            return false;
        }
        urc0 urc0Var = (urc0) obj;
        return this.f36158a == urc0Var.f36158a && this.b == urc0Var.b && this.c.equals(urc0Var.c) && this.d.equals(urc0Var.d) && this.e.equals(urc0Var.e) && this.f == urc0Var.f && this.g.equals(urc0Var.g) && this.h == urc0Var.h && this.i == urc0Var.i && Intrinsics.d(this.j, urc0Var.j) && this.k == urc0Var.k && this.l.equals(urc0Var.l);
    }

    @Override // a.vrc0
    public final long getId() {
        return this.f36158a;
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
        int iHashCode = (this.i.hashCode() + twn.a(this.h, ua80.b(twn.a(this.f, ua80.b(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f36158a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31)) * 31;
        String str = this.j;
        return this.l.hashCode() + rw2.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.k);
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
        StringBuilder sbQ = kng0.q(this.f36158a, "OneXGame(id=", ", categoryId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        f140.v(sbQ, ", desc=", this.d, ", slogan=", this.e);
        w6x.w(this.f, ", minBet=", ", analyticsParamName=", this.g, sbQ);
        sbQ.append(", numFS=");
        sbQ.append(this.h);
        sbQ.append(", type=");
        sbQ.append(this.i);
        hne.B(sbQ, ", compositeKey=", this.j, ", gameId=");
        sbQ.append(this.k);
        sbQ.append(", imageInfo=");
        sbQ.append(this.l);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
