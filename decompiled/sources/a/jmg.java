package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jmg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16763a;
    public final String b;
    public final double c;
    public final int d;

    public jmg(double d, int i, String str, String str2) {
        this.f16763a = str;
        this.b = str2;
        this.c = d;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmg)) {
            return false;
        }
        jmg jmgVar = (jmg) obj;
        return this.f16763a.equals(jmgVar.f16763a) && this.b.equals(jmgVar.b) && Double.compare(this.c, jmgVar.c) == 0 && this.d == jmgVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.d(this.c, ua80.b(this.f16763a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberDotaHeroModel(heroName=", this.f16763a, ", image=", this.b, ", winRate=");
        rz4.w(sbN, this.c, ", matchesCount=", this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
