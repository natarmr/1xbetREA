package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a570 f24472a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final hds e;
    public final boolean f;

    public o1b(a570 a570Var, boolean z, boolean z2, String str, hds hdsVar, boolean z3) {
        this.f24472a = a570Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = hdsVar;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1b)) {
            return false;
        }
        o1b o1bVar = (o1b) obj;
        return this.f24472a.equals(o1bVar.f24472a) && this.b == o1bVar.b && this.c == o1bVar.c && this.d.equals(o1bVar.d) && this.e.equals(o1bVar.e) && this.f == o1bVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ua80.b(brm0.e(brm0.e(this.f24472a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashbackGameUiModel(oneXGamesType=");
        sb.append(this.f24472a);
        sb.append(", upperCashBack=");
        sb.append(this.b);
        sb.append(", gameIsAvailable=");
        f140.s(", gameName=", this.d, ", imageInfo=", sb, this.c);
        sb.append(this.e);
        sb.append(", underMaintenance=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
