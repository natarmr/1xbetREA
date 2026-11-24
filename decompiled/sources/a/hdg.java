package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12868a;
    public final int b;
    public final ldg c;

    public hdg(String str, int i, ldg ldgVar) {
        this.f12868a = str;
        this.b = i;
        this.c = ldgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdg)) {
            return false;
        }
        hdg hdgVar = (hdg) obj;
        return this.f12868a.equals(hdgVar.f12868a) && this.b == hdgVar.b && this.c.equals(hdgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f12868a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "CyberChampPrizeDistributionModel(place=", this.f12868a, ", prize=", ", team=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
