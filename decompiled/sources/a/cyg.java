package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cyg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5172a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public cyg(String str, String str2, String str3, String str4, String str5) {
        this.f5172a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyg)) {
            return false;
        }
        cyg cygVar = (cyg) obj;
        return this.f5172a.equals(cygVar.f5172a) && this.b.equals(cygVar.b) && this.c.equals(cygVar.c) && this.d.equals(cygVar.d) && this.e.equals(cygVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f5172a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberGamesCSRankingChampLeaderBoardModel(name=", this.f5172a, ", image=", this.b, ", place=");
        f140.v(sbN, this.c, ", lineup=", this.d, ", relevance=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
