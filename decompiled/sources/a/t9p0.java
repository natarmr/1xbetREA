package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t9p0 implements v9p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33578a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public t9p0(long j, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4) {
        this.f33578a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
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
        if (!(obj instanceof t9p0)) {
            return false;
        }
        t9p0 t9p0Var = (t9p0) obj;
        return this.f33578a == t9p0Var.f33578a && this.b.equals(t9p0Var.b) && this.c.equals(t9p0Var.c) && this.d.equals(t9p0Var.d) && this.e.equals(t9p0Var.e) && this.f.equals(t9p0Var.f) && this.g == t9p0Var.g && this.h == t9p0Var.h && this.i == t9p0Var.i && this.j == t9p0Var.j;
    }

    @Override // a.v9p0
    public final long getId() {
        return this.f33578a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + twn.a(this.i, twn.a(this.h, twn.a(this.g, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f33578a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f33578a, "RainbowSix(id=", ", nickname=", this.b);
        f140.v(sbO, ", realName=", this.c, ", image=", this.d);
        f140.v(sbO, ", country=", this.e, ", countryImageS3=", this.f);
        rw2.s(this.g, this.h, ", kills=", ", deaths=", sbO);
        rw2.s(this.i, this.j, ", maps=", ", eps=", sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
