package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10898a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public g960(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f10898a = str;
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
        if (!(obj instanceof g960)) {
            return false;
        }
        g960 g960Var = (g960) obj;
        return this.f10898a.equals(g960Var.f10898a) && this.b.equals(g960Var.b) && this.c.equals(g960Var.c) && this.d.equals(g960Var.d) && this.e.equals(g960Var.e) && this.f.equals(g960Var.f) && this.g.equals(g960Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f10898a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NumbersImagesUiModel(gameTable=", this.f10898a, ", roundScoreboard=", this.b, ", wholeCookie=");
        f140.v(sbN, this.c, ", cookieLeftPart=", this.d, ", cookieRightPart=");
        f140.v(sbN, this.e, ", largeNote=", this.f, ", smallNote=");
        return axq.n(sbN, this.g, Separators.RPAREN);
    }
}
