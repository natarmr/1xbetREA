package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4010a;
    public final int b;
    public final int c;
    public final zf90 d;

    public cah(int i, int i2, int i3, zf90 zf90Var) {
        this.f4010a = i;
        this.b = i2;
        this.c = i3;
        this.d = zf90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cah)) {
            return false;
        }
        cah cahVar = (cah) obj;
        return this.f4010a == cahVar.f4010a && this.b == cahVar.b && this.c == cahVar.c && this.d == cahVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f4010a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CyberPeriodScoresModel(firstTeamScore=", this.f4010a, ", secondTeamScore=", ", numberOfMap=", this.b);
        sbT.append(this.c);
        sbT.append(", periodWinnerModel=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
