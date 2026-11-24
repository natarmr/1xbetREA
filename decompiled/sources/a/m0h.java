package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m0h extends n0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20953a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final double g;

    public m0h(long j, long j2, String str, String str2, int i, int i2, double d) {
        this.f20953a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
        this.g = d;
    }

    @Override // a.n0h
    public final long a() {
        return this.b;
    }

    @Override // a.n0h
    public final long b() {
        return this.f20953a;
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
        if (!(obj instanceof m0h)) {
            return false;
        }
        m0h m0hVar = (m0h) obj;
        return this.f20953a == m0hVar.f20953a && this.b == m0hVar.b && this.c.equals(m0hVar.c) && this.d.equals(m0hVar.d) && this.e == m0hVar.e && this.f == m0hVar.f && Double.compare(this.g, m0hVar.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + twn.a(this.f, twn.a(this.e, ua80.b(ua80.b(rw2.b(Long.hashCode(this.f20953a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f20953a, "LoL(id=", ", feedId=");
        kng0.z(sbQ, this.b, ", teamName=", this.c);
        axq.s(this.e, ", teamIconUrl=", this.d, ", wins=", sbQ);
        rw2.x(sbQ, ", loses=", this.f, ", winRate=");
        return axq.l(sbQ, this.g, Separators.RPAREN);
    }
}
