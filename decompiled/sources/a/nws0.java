package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24251a;
    public final j83 b;
    public final j83 c;
    public final d280 d;
    public final d280 e;
    public final String f;
    public final String g;

    public nws0(String str, j83 j83Var, j83 j83Var2, d280 d280Var, d280 d280Var2, String str2, String str3) {
        this.f24251a = str;
        this.b = j83Var;
        this.c = j83Var2;
        this.d = d280Var;
        this.e = d280Var2;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nws0)) {
            return false;
        }
        nws0 nws0Var = (nws0) obj;
        return this.f24251a.equals(nws0Var.f24251a) && this.b.equals(nws0Var.b) && this.c.equals(nws0Var.c) && this.d.equals(nws0Var.d) && this.e.equals(nws0Var.e) && this.f.equals(nws0Var.f) && this.g.equals(nws0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(twn.e(this.e, twn.e(this.d, brm0.f(this.c, brm0.f(this.b, this.f24251a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponentsCompactLiveEventCardModel(opponentOneName=");
        sb.append(this.f24251a);
        sb.append(", opponentOneScore=");
        sb.append((Object) this.b);
        sb.append(", opponentTwoScore=");
        sb.append((Object) this.c);
        sb.append(", opponentOneLogo=");
        sb.append(this.d);
        sb.append(", opponentTwoLogo=");
        sb.append(this.e);
        sb.append(", opponentTwoName=");
        sb.append(this.f);
        sb.append(", infoLabel=");
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
