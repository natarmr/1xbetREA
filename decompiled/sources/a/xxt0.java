package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41675a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;

    public xxt0(int i, int i2, int i3, int i4, String str, String str2) {
        this.f41675a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxt0)) {
            return false;
        }
        xxt0 xxt0Var = (xxt0) obj;
        return this.f41675a.equals(xxt0Var.f41675a) && this.b == xxt0Var.b && this.c == xxt0Var.c && this.d == xxt0Var.d && this.e == xxt0Var.e && this.f.equals(xxt0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f41675a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "ValorantMatchInfoModel(mapName=", this.f41675a, ", mapNumber=", ", firstTeamScore=");
        axq.r(this.c, this.d, ", secondTeamScore=", ", mapWinner=", sbP);
        return rw2.k(this.e, ", mapBackground=", this.f, Separators.RPAREN, sbP);
    }
}
