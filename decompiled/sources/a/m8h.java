package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m8h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21369a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public m8h(int i, String str, String str2, boolean z, boolean z2) {
        this.f21369a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8h)) {
            return false;
        }
        m8h m8hVar = (m8h) obj;
        return this.f21369a.equals(m8hVar.f21369a) && this.b.equals(m8hVar.b) && this.c == m8hVar.c && this.d == m8hVar.d && this.e == m8hVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + brm0.e(brm0.e(ua80.b(this.f21369a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberMatchesStatisticBanPickModel(heroName=", this.f21369a, ", heroImage=", this.b, ", isPick=");
        ua80.u(", isRadiant=", ", order=", sbN, this.c, this.d);
        return rz4.j(this.e, Separators.RPAREN, sbN);
    }
}
