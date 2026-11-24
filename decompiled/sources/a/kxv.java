package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kxv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19077a;
    public final long b;
    public final String c;
    public final String d;
    public final boh e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public kxv(long j, long j2, String str, String str2, boh bohVar, boolean z, String str3, String str4, boolean z2, boolean z3) {
        this.f19077a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = bohVar;
        this.f = z;
        this.g = str3;
        this.h = str4;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxv)) {
            return false;
        }
        kxv kxvVar = (kxv) obj;
        return this.f19077a == kxvVar.f19077a && this.b == kxvVar.b && this.c.equals(kxvVar.c) && this.d.equals(kxvVar.d) && this.e == kxvVar.e && this.f == kxvVar.f && this.g.equals(kxvVar.g) && this.h.equals(kxvVar.h) && this.i == kxvVar.i && this.j == kxvVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + brm0.e(ua80.b(ua80.b(brm0.e((this.e.hashCode() + ua80.b(ua80.b(rw2.b(Long.hashCode(this.f19077a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f19077a, "HighRatedChampModel(id=", ", sportId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        sbQ.append(", image=");
        sbQ.append(this.d);
        sbQ.append(", cyberType=");
        sbQ.append(this.e);
        hne.u(", isDuelChamp=", ", nameEng=", this.g, sbQ, this.f);
        w6x.z(", countryImage=", this.h, ", live=", sbQ, this.i);
        return f140.n(sbQ, ", favorite=", this.j, Separators.RPAREN);
    }
}
