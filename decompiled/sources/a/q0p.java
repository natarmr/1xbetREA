package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q0p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27912a;
    public final int b;
    public final String c;
    public final a1p d;

    public q0p(int i, int i2, String str, a1p a1pVar) {
        this.f27912a = i;
        this.b = i2;
        this.c = str;
        this.d = a1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0p)) {
            return false;
        }
        q0p q0pVar = (q0p) obj;
        return this.f27912a == q0pVar.f27912a && this.b == q0pVar.b && this.c.equals(q0pVar.c) && this.d == q0pVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, Integer.hashCode(this.f27912a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("FatalFuryRoundModel(roundNumber=", this.f27912a, ", roundTime=", ", nameOfWinner=", this.b);
        sbT.append(this.c);
        sbT.append(", typeOfWin=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
