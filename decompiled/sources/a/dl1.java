package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6257a;
    public final String b;
    public final o0x c;

    public dl1(String str, String str2, o0x o0xVar) {
        this.f6257a = str;
        this.b = str2;
        this.c = o0xVar;
    }

    public static dl1 a(dl1 dl1Var, String str, String str2) {
        o0x o0xVar = dl1Var.c;
        dl1Var.getClass();
        return new dl1(str, str2, o0xVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl1)) {
            return false;
        }
        dl1 dl1Var = (dl1) obj;
        return this.f6257a.equals(dl1Var.f6257a) && this.b.equals(dl1Var.b) && this.c.equals(dl1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f6257a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorRegistrationCRMTournamentState(name=", this.f6257a, ", rules=", this.b, ", image=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
