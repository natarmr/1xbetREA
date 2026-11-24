package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class npr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23927a;
    public final String b;
    public final double c;

    public npr0(double d, String str, String str2) {
        this.f23927a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npr0)) {
            return false;
        }
        npr0 npr0Var = (npr0) obj;
        return this.f23927a.equals(npr0Var.f23927a) && this.b.equals(npr0Var.b) && Double.compare(this.c, npr0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ua80.b(this.f23927a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.l(b1j.n("TotoJackpotBetModel(message=", this.f23927a, ", totoTicket=", this.b, ", balance="), this.c, Separators.RPAREN);
    }
}
