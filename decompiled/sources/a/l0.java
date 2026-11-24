package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19173a;
    public final String b;
    public final String c;
    public final String d;
    public final k0 e;

    public l0(String str, String str2, String str3, String str4, k0 k0Var) {
        this.f19173a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f19173a.equals(l0Var.f19173a) && this.b.equals(l0Var.b) && this.c.equals(l0Var.c) && this.d.equals(l0Var.d) && this.e.equals(l0Var.e);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return l0.class;
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f19173a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AboutTournamentCardUiModel(prizePool=", this.f19173a, ", date=", this.b, ", type=");
        f140.v(sbN, this.c, ", location=", this.d, ", description=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
