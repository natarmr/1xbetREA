package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s180 implements u180 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31443a;
    public final c280 b;
    public final String c;
    public final c280 d;
    public final mpm e;

    public s180(String str, c280 c280Var, String str2, c280 c280Var2, mpm mpmVar) {
        this.f31443a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = c280Var2;
        this.e = mpmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s180)) {
            return false;
        }
        s180 s180Var = (s180) obj;
        return this.f31443a.equals(s180Var.f31443a) && this.b.equals(s180Var.b) && this.c.equals(s180Var.c) && this.d.equals(s180Var.d) && this.e.equals(s180Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + hne.g(this.d, ua80.b(hne.g(this.b, this.f31443a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "TwoOpponent(opponentLeftTitle=", this.f31443a, ", opponentLeftImage=", ", opponentRightTitle=");
        sbP.append(this.c);
        sbP.append(", opponentRightImage=");
        sbP.append(this.d);
        sbP.append(", dsScoreModel=");
        sbP.append(this.e);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
