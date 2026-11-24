package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rjg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aah f30591a;
    public final aah b;
    public final String c;

    public rjg(aah aahVar, aah aahVar2, String str) {
        this.f30591a = aahVar;
        this.b = aahVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjg)) {
            return false;
        }
        rjg rjgVar = (rjg) obj;
        return this.f30591a.equals(rjgVar.f30591a) && this.b.equals(rjgVar.b) && this.c.equals(rjgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f30591a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberCompactLiveEventCardModel(opponentOne=");
        sb.append(this.f30591a);
        sb.append(", opponentTwo=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
