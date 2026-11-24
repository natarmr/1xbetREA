package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q9p0 implements v9p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28362a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final float g;
    public final int h;
    public final float i;
    public final float j;
    public final float k;
    public final int l;

    public q9p0(long j, String str, String str2, String str3, String str4, String str5, float f, int i, float f2, float f3, float f4, int i2) {
        this.f28362a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = f;
        this.h = i;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        this.l = i2;
    }

    @Override // a.v9p0
    public final String a() {
        return this.c;
    }

    @Override // a.v9p0
    public final String b() {
        return this.d;
    }

    @Override // a.v9p0
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9p0)) {
            return false;
        }
        q9p0 q9p0Var = (q9p0) obj;
        return this.f28362a == q9p0Var.f28362a && this.b.equals(q9p0Var.b) && this.c.equals(q9p0Var.c) && this.d.equals(q9p0Var.d) && this.e.equals(q9p0Var.e) && this.f.equals(q9p0Var.f) && Float.compare(this.g, q9p0Var.g) == 0 && this.h == q9p0Var.h && Float.compare(this.i, q9p0Var.i) == 0 && Float.compare(this.j, q9p0Var.j) == 0 && Float.compare(this.k, q9p0Var.k) == 0 && this.l == q9p0Var.l;
    }

    @Override // a.v9p0
    public final long getId() {
        return this.f28362a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + defpackage.c.a(defpackage.c.a(defpackage.c.a(twn.a(this.h, defpackage.c.a(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f28362a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), this.g, 31), 31), this.i, 31), this.j, 31), this.k, 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f28362a, "Cs2(id=", ", nickname=", this.b);
        f140.v(sbO, ", realName=", this.c, ", image=", this.d);
        f140.v(sbO, ", country=", this.e, ", countryImageS3=", this.f);
        sbO.append(", rating=");
        sbO.append(this.g);
        sbO.append(", age=");
        sbO.append(this.h);
        sbO.append(", adr=");
        sbO.append(this.i);
        sbO.append(", kpr=");
        sbO.append(this.j);
        sbO.append(", dpr=");
        sbO.append(this.k);
        sbO.append(", prizeMoney=");
        sbO.append(this.l);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
