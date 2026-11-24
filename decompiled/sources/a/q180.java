package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class q180 implements u180 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27940a;
    public final String b;
    public final mpm c;

    public q180(String str, String str2, mpm mpmVar) {
        this.f27940a = str;
        this.b = str2;
        this.c = mpmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q180)) {
            return false;
        }
        q180 q180Var = (q180) obj;
        return this.f27940a.equals(q180Var.f27940a) && this.b.equals(q180Var.b) && this.c.equals(q180Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f27940a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MultiTeams(opponentLeftTitle=", this.f27940a, ", opponentRightTitle=", this.b, ", dsScoreModel=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
