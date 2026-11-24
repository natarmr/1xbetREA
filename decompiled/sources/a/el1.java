package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class el1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7977a;
    public final String b;
    public final o0x c;

    public el1(String str, String str2, o0x o0xVar) {
        this.f7977a = str;
        this.b = str2;
        this.c = o0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el1)) {
            return false;
        }
        el1 el1Var = (el1) obj;
        return this.f7977a.equals(el1Var.f7977a) && this.b.equals(el1Var.b) && this.c.equals(el1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f7977a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorRegistrationCRMTournamentUiState(title=", this.f7977a, ", rules=", this.b, ", image=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
