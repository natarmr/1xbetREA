package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35591a;
    public final long b;
    public final lho c;
    public final ufp0 d;
    public final ufp0 e;
    public final znq0 f;

    public uft0(String str, long j, lho lhoVar, ufp0 ufp0Var, ufp0 ufp0Var2, znq0 znq0Var) {
        this.f35591a = str;
        this.b = j;
        this.c = lhoVar;
        this.d = ufp0Var;
        this.e = ufp0Var2;
        this.f = znq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uft0)) {
            return false;
        }
        uft0 uft0Var = (uft0) obj;
        return this.f35591a.equals(uft0Var.f35591a) && this.b == uft0Var.b && this.c == uft0Var.c && this.d.equals(uft0Var.d) && this.e.equals(uft0Var.e) && this.f.equals(uft0Var.f);
    }

    public final int hashCode() {
        return Long.hashCode(this.f.f44687a) + twn.f(this.e, twn.f(this.d, (this.c.hashCode() + rw2.b(this.f35591a.hashCode() * 31, 31, this.b)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "UpcomingEventModel(statisticGameId=", this.f35591a, ", feedGameId=");
        sbO.append(", statusType=");
        sbO.append(this.c);
        sbO.append(", teamOne=");
        sbO.append(this.d);
        sbO.append(", teamTwo=");
        sbO.append(this.e);
        sbO.append(", dateStart=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
