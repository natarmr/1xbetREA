package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pxd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27749a;
    public final String b;
    public final String c;
    public final String d;
    public final qxd0 e;

    public pxd0(String str, String str2, String str3, String str4, qxd0 qxd0Var) {
        this.f27749a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = qxd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxd0)) {
            return false;
        }
        pxd0 pxd0Var = (pxd0) obj;
        return this.f27749a.equals(pxd0Var.f27749a) && this.b.equals(pxd0Var.b) && this.c.equals(pxd0Var.c) && this.d.equals(pxd0Var.d) && this.e.equals(pxd0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f27749a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RainbowSixPlayerModel(playerId=", this.f27749a, ", playerName=", this.b, ", realName=");
        f140.v(sbN, this.c, ", playerImage=", this.d, ", playerStat=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
