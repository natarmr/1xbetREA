package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lnm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20352a;
    public final String b;
    public final int c;
    public final String d;
    public final s0m e;
    public final String f;

    public lnm(String str, String str2, int i, String str3, s0m s0mVar, String str4) {
        this.f20352a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = s0mVar;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnm)) {
            return false;
        }
        lnm lnmVar = (lnm) obj;
        return this.f20352a.equals(lnmVar.f20352a) && this.b.equals(lnmVar.b) && this.c == lnmVar.c && this.d.equals(lnmVar.d) && this.e.equals(lnmVar.e) && this.f.equals(lnmVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(twn.a(this.c, ua80.b(this.f20352a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DsPlayerModel(id=", this.f20352a, ", name=", this.b, ", translationId=");
        kng0.w(this.c, ", shortName=", this.d, ", country=", sbN);
        sbN.append(this.e);
        sbN.append(", image=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
