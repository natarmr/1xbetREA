package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26920a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public pfs(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f26920a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfs)) {
            return false;
        }
        pfs pfsVar = (pfs) obj;
        return this.f26920a.equals(pfsVar.f26920a) && this.b.equals(pfsVar.b) && this.c.equals(pfsVar.c) && this.d.equals(pfsVar.d) && this.e.equals(pfsVar.e) && this.f.equals(pfsVar.f) && this.g.equals(pfsVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f26920a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GameInfo(tournamentStage=", this.f26920a, ", location=", this.b, ", matchFormat=");
        f140.v(sbN, this.c, ", seedNum1=", this.d, ", seedNum2=");
        f140.v(sbN, this.e, ", surface=", this.f, ", stadiumId=");
        return axq.n(sbN, this.g, Separators.RPAREN);
    }
}
