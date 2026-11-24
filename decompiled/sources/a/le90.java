package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class le90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19891a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final zf90 h;

    public le90(String str, String str2, int i, int i2, String str3, String str4, String str5, zf90 zf90Var) {
        this.f19891a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = zf90Var;
    }

    public static le90 a(le90 le90Var, String str) {
        String str2 = le90Var.f19891a;
        String str3 = le90Var.b;
        int i = le90Var.c;
        int i2 = le90Var.d;
        String str4 = le90Var.e;
        String str5 = le90Var.f;
        zf90 zf90Var = le90Var.h;
        str.getClass();
        return new le90(str2, str3, i, i2, str4, str5, str, zf90Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le90)) {
            return false;
        }
        le90 le90Var = (le90) obj;
        return this.f19891a.equals(le90Var.f19891a) && this.b.equals(le90Var.b) && this.c == le90Var.c && this.d == le90Var.d && this.e.equals(le90Var.e) && this.f.equals(le90Var.f) && this.g.equals(le90Var.g) && this.h == le90Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(twn.a(this.d, twn.a(this.c, ua80.b(this.f19891a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PeriodModel(score1=", this.f19891a, ", score2=", this.b, ", subScore1=");
        axq.r(this.c, this.d, ", subScore2=", ", title=", sbN);
        f140.v(sbN, this.e, ", shortTitle=", this.f, ", mapName=");
        sbN.append(this.g);
        sbN.append(", periodWinnerModel=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
