package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ue90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35514a;
    public final String b;
    public final String c;

    public ue90(String str, String str2, String str3) {
        this.f35514a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue90)) {
            return false;
        }
        ue90 ue90Var = (ue90) obj;
        return this.f35514a.equals(ue90Var.f35514a) && this.b.equals(ue90Var.b) && this.c.equals(ue90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f35514a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("PeriodScoreModel(periodName=", this.f35514a, ", teamOneScore=", this.b, ", teamTwoScore="), this.c, Separators.RPAREN);
    }
}
