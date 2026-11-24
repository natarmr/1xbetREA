package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cop0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4714a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public cop0(String str, String str2, String str3, String str4, String str5) {
        this.f4714a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cop0)) {
            return false;
        }
        cop0 cop0Var = (cop0) obj;
        return this.f4714a.equals(cop0Var.f4714a) && this.b.equals(cop0Var.b) && this.c.equals(cop0Var.c) && this.d.equals(cop0Var.d) && this.e.equals(cop0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f4714a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamsAndBulkPercentageUiModel(firstTeamName=", this.f4714a, ", secondTeamName=", this.b, ", p1BulkPercentage=");
        f140.v(sbN, this.c, ", xBulkPercentage=", this.d, ", p2BulkPercentage=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
