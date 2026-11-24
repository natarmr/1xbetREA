package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ke90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18144a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    public ke90(String str, String str2, int i, int i2, String str3, String str4, String str5) {
        this.f18144a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke90)) {
            return false;
        }
        ke90 ke90Var = (ke90) obj;
        return this.f18144a.equals(ke90Var.f18144a) && this.b.equals(ke90Var.b) && this.c == ke90Var.c && this.d == ke90Var.d && this.e.equals(ke90Var.e) && this.f.equals(ke90Var.f) && this.g.equals(ke90Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(twn.a(this.d, twn.a(this.c, ua80.b(this.f18144a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PeriodModel(score1=", this.f18144a, ", score2=", this.b, ", subScore1=");
        axq.r(this.c, this.d, ", subScore2=", ", title=", sbN);
        f140.v(sbN, this.e, ", shortTitle=", this.f, ", mapName=");
        return axq.n(sbN, this.g, Separators.RPAREN);
    }
}
