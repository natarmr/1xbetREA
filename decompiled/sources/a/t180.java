package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t180 implements u180 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33159a;
    public final c280 b;
    public final c280 c;
    public final String d;
    public final c280 e;
    public final c280 f;
    public final mpm g;

    public t180(String str, c280 c280Var, c280 c280Var2, String str2, c280 c280Var3, c280 c280Var4, mpm mpmVar) {
        this.f33159a = str;
        this.b = c280Var;
        this.c = c280Var2;
        this.d = str2;
        this.e = c280Var3;
        this.f = c280Var4;
        this.g = mpmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t180)) {
            return false;
        }
        t180 t180Var = (t180) obj;
        return this.f33159a.equals(t180Var.f33159a) && this.b.equals(t180Var.b) && this.c.equals(t180Var.c) && this.d.equals(t180Var.d) && this.e.equals(t180Var.e) && this.f.equals(t180Var.f) && this.g.equals(t180Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + hne.g(this.f, hne.g(this.e, ua80.b(hne.g(this.c, hne.g(this.b, this.f33159a.hashCode() * 31, 31), 31), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "TwoPairs(opponentLeftTitle=", this.f33159a, ", opponentLeftTopImage=", ", opponentLeftBottomImage=");
        sbP.append(this.c);
        sbP.append(", opponentRightTitle=");
        sbP.append(this.d);
        sbP.append(", opponentRightTopImage=");
        f140.u(sbP, this.e, ", opponentRightBottomImage=", this.f, ", dsScoreModel=");
        sbP.append(this.g);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
