package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f524a;
    public final String b;
    public final int c;
    public final int d;
    public final j83 e;

    public aah(d280 d280Var, String str, int i, int i2, j83 j83Var) {
        this.f524a = d280Var;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aah)) {
            return false;
        }
        aah aahVar = (aah) obj;
        return this.f524a.equals(aahVar.f524a) && this.b.equals(aahVar.b) && this.c == aahVar.c && this.d == aahVar.d && this.e.equals(aahVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, ua80.b(this.f524a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberOpponentModel(opponentLogo=");
        sb.append(this.f524a);
        sb.append(", opponentName=");
        sb.append(this.b);
        sb.append(", totalCount=");
        axq.r(this.c, this.d, ", winCount=", ", scoreResult=", sb);
        sb.append((Object) this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
