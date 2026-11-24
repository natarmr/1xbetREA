package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n4t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22914a;
    public final long b;
    public final m4t0 c;
    public final m4t0 d;
    public final g4t0 e;
    public final String f;

    public n4t0(String str, long j, m4t0 m4t0Var, m4t0 m4t0Var2, g4t0 g4t0Var, String str2) {
        this.f22914a = str;
        this.b = j;
        this.c = m4t0Var;
        this.d = m4t0Var2;
        this.e = g4t0Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4t0)) {
            return false;
        }
        n4t0 n4t0Var = (n4t0) obj;
        return this.f22914a.equals(n4t0Var.f22914a) && znq0.e(this.b, n4t0Var.b) && this.c.equals(n4t0Var.c) && this.d.equals(n4t0Var.d) && this.e.equals(n4t0Var.e) && this.f.equals(n4t0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f22914a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("UfcMeetingStatisticModel(statGameId=", this.f22914a, ", date=", znq0.h(this.b), ", teamOne=");
        sbN.append(this.c);
        sbN.append(", teamTwo=");
        sbN.append(this.d);
        sbN.append(", matchResultModel=");
        sbN.append(this.e);
        sbN.append(", tournamentTitle=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
