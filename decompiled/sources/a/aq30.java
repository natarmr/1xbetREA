package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class aq30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1279a;
    public final long b;
    public final zp30 c;
    public final zp30 d;
    public final fe30 e;

    public aq30(String str, long j, zp30 zp30Var, zp30 zp30Var2, fe30 fe30Var) {
        this.f1279a = str;
        this.b = j;
        this.c = zp30Var;
        this.d = zp30Var2;
        this.e = fe30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq30)) {
            return false;
        }
        aq30 aq30Var = (aq30) obj;
        return this.f1279a.equals(aq30Var.f1279a) && znq0.e(this.b, aq30Var.b) && this.c.equals(aq30Var.c) && this.d.equals(aq30Var.d) && this.e.equals(aq30Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f1279a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MeetingStatisticModel(statGameId=", this.f1279a, ", date=", znq0.h(this.b), ", teamOne=");
        sbN.append(this.c);
        sbN.append(", teamTwo=");
        sbN.append(this.d);
        sbN.append(", matchResultModel=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
