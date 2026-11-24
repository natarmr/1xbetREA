package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ayd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1666a;
    public final int b;
    public final int c;
    public final eyd0 d;
    public final int e;

    public ayd0(String str, int i, int i2, eyd0 eyd0Var, int i3) {
        this.f1666a = str;
        this.b = i;
        this.c = i2;
        this.d = eyd0Var;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayd0)) {
            return false;
        }
        ayd0 ayd0Var = (ayd0) obj;
        return this.f1666a.equals(ayd0Var.f1666a) && this.b == ayd0Var.b && this.c == ayd0Var.c && this.d == ayd0Var.d && this.e == ayd0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f1666a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "RainbowSixStatisticMapDraftModel(name=", this.f1666a, ", chosenTeam=", ", number=");
        sbP.append(this.c);
        sbP.append(", draftType=");
        sbP.append(this.d);
        sbP.append(", mapWinner=");
        return rz4.j(this.e, Separators.RPAREN, sbP);
    }
}
