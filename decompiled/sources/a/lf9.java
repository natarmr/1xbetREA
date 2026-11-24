package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lf9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19942a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public lf9(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f19942a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf9)) {
            return false;
        }
        lf9 lf9Var = (lf9) obj;
        return this.f19942a.equals(lf9Var.f19942a) && this.b.equals(lf9Var.b) && this.c.equals(lf9Var.c) && this.d.equals(lf9Var.d) && this.e.equals(lf9Var.e) && this.f.equals(lf9Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f19942a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ButtonsModel(excludedButton=", this.f19942a, ", participateButton=", this.b, ", participateThroughProviderButton=");
        f140.v(sbN, this.c, ", rulesButton=", this.d, ", youAlreadyParticipatingButton=");
        return ua80.m(sbN, this.e, ", detailsButton=", this.f, Separators.RPAREN);
    }
}
