package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q3h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28052a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final int f;

    public q3h(String str, String str2, String str3, double d, double d2, int i) {
        this.f28052a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = d2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3h)) {
            return false;
        }
        q3h q3hVar = (q3h) obj;
        return this.f28052a.equals(q3hVar.f28052a) && this.b.equals(q3hVar.b) && this.c.equals(q3hVar.c) && Double.compare(this.d, q3hVar.d) == 0 && Double.compare(this.e, q3hVar.e) == 0 && this.f == q3hVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + brm0.d(this.e, brm0.d(this.d, ua80.b(ua80.b(this.f28052a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberLolHeroModel(id=", this.f28052a, ", heroName=", this.b, ", image=");
        hne.A(sbN, this.c, ", winRate=", this.d);
        ohs0.A(sbN, this.e, ", kda=", ", matchesCount=");
        return rz4.j(this.f, Separators.RPAREN, sbN);
    }
}
