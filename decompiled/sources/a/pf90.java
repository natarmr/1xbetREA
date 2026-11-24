package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pf90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26890a;
    public final String b;
    public final String c;

    public pf90(String str, String str2, String str3) {
        this.f26890a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf90)) {
            return false;
        }
        pf90 pf90Var = (pf90) obj;
        return this.f26890a.equals(pf90Var.f26890a) && this.b.equals(pf90Var.b) && this.c.equals(pf90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f26890a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("PeriodStatisticModel(title=", this.f26890a, ", score1=", this.b, ", score2="), this.c, Separators.RPAREN);
    }
}
