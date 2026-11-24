package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class a3s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189a;
    public final String b;
    public final n0x c;
    public final String d;

    public a3s0(n0x n0xVar, String str, String str2, String str3) {
        this.f189a = str;
        this.b = str2;
        this.c = n0xVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3s0)) {
            return false;
        }
        a3s0 a3s0Var = (a3s0) obj;
        return this.f189a.equals(a3s0Var.f189a) && this.b.equals(a3s0Var.b) && this.c.equals(a3s0Var.c) && this.d.equals(a3s0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f140.f(this.c, ua80.b(this.f189a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TournamentPositionInternalModel(name=", this.f189a, ", position=", this.b, ", image=");
        sbN.append(this.c);
        sbN.append(", prize=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
