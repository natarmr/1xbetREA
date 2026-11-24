package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u9p0 implements v9p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35295a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final float h;
    public final float i;
    public final float j;

    public u9p0(long j, String str, String str2, String str3, String str4, String str5, long j2, float f, float f2, float f3) {
        this.f35295a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = j2;
        this.h = f;
        this.i = f2;
        this.j = f3;
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
        if (!(obj instanceof u9p0)) {
            return false;
        }
        u9p0 u9p0Var = (u9p0) obj;
        return this.f35295a == u9p0Var.f35295a && this.b.equals(u9p0Var.b) && this.c.equals(u9p0Var.c) && this.d.equals(u9p0Var.d) && this.e.equals(u9p0Var.e) && this.f.equals(u9p0Var.f) && this.g == u9p0Var.g && Float.compare(this.h, u9p0Var.h) == 0 && Float.compare(this.i, u9p0Var.i) == 0 && Float.compare(this.j, u9p0Var.j) == 0;
    }

    @Override // a.v9p0
    public final long getId() {
        return this.f35295a;
    }

    public final int hashCode() {
        return Float.hashCode(this.j) + defpackage.c.a(defpackage.c.a(rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f35295a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), this.h, 31), this.i, 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f35295a, "Valorant(id=", ", nickname=", this.b);
        f140.v(sbO, ", realName=", this.c, ", image=", this.d);
        f140.v(sbO, ", country=", this.e, ", countryImageS3=", this.f);
        kng0.A(sbO, ", ageTimeStamp=", this.g, ", avgCombatScore=");
        vqd.v(sbO, this.h, ", avgKills=", this.i, ", avgDeaths=");
        return kng0.o(sbO, this.j, Separators.RPAREN);
    }
}
