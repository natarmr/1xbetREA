package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23376a;
    public final String b;
    public final String c;
    public final boolean d;
    public final hea e;

    public nea(String str, String str2, String str3, boolean z, hea heaVar) {
        this.f23376a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = heaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nea)) {
            return false;
        }
        nea neaVar = (nea) obj;
        return this.f23376a.equals(neaVar.f23376a) && this.b.equals(neaVar.b) && this.c.equals(neaVar.c) && this.d == neaVar.d && this.e == neaVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(ua80.b(ua80.b(this.f23376a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardCricketGamePlayersInfoUiModel(gatesImage=", this.f23376a, ", beatsOpponent=", this.b, ", throwOpponent=");
        brm0.C(this.c, ", gameIsFinish=", ", animationState=", sbN, this.d);
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
