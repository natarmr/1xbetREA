package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l0h extends n0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19201a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public l0h(int i, int i2, int i3, int i4, int i5, long j, long j2, String str, String str2) {
        this.f19201a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    @Override // a.n0h
    public final long a() {
        return this.b;
    }

    @Override // a.n0h
    public final long b() {
        return this.f19201a;
    }

    @Override // a.n0h
    public final String c() {
        return this.d;
    }

    @Override // a.n0h
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0h)) {
            return false;
        }
        l0h l0hVar = (l0h) obj;
        return this.f19201a == l0hVar.f19201a && this.b == l0hVar.b && this.c.equals(l0hVar.c) && this.d.equals(l0hVar.d) && this.e == l0hVar.e && this.f == l0hVar.f && this.g == l0hVar.g && this.h == l0hVar.h && this.i == l0hVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, ua80.b(ua80.b(rw2.b(Long.hashCode(this.f19201a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f19201a, "Dota(id=", ", feedId=");
        kng0.z(sbQ, this.b, ", teamName=", this.c);
        axq.s(this.e, ", teamIconUrl=", this.d, ", wins=", sbQ);
        rw2.s(this.f, this.g, ", loses=", ", draws=", sbQ);
        rw2.s(this.h, this.i, ", points=", ", position=", sbQ);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
