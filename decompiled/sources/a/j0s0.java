package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j0s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15696a;
    public final String b;
    public final String c;
    public final n0s0 d;

    public j0s0(String str, String str2, String str3, n0s0 n0s0Var) {
        this.f15696a = str;
        this.b = str2;
        this.c = str3;
        this.d = n0s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0s0)) {
            return false;
        }
        j0s0 j0s0Var = (j0s0) obj;
        return this.f15696a.equals(j0s0Var.f15696a) && this.b.equals(j0s0Var.b) && this.c.equals(j0s0Var.c) && this.d.equals(j0s0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f15696a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TournamentCsFeedStatisticTopPlayerModel(name=", this.f15696a, ", image=", this.b, ", imageS3=");
        sbN.append(this.c);
        sbN.append(", score=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
