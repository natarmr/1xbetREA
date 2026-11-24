package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw1 f44988a;
    public final gx1 b;
    public final vql c;
    public final gw1 d;
    public final l5i e;
    public final hrl f;

    public zu1(cw1 cw1Var, gx1 gx1Var, vql vqlVar, gw1 gw1Var, l5i l5iVar, hrl hrlVar) {
        this.f44988a = cw1Var;
        this.b = gx1Var;
        this.c = vqlVar;
        this.d = gw1Var;
        this.e = l5iVar;
        this.f = hrlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) obj;
        return this.f44988a == zu1Var.f44988a && this.b == zu1Var.b && this.c == zu1Var.c && this.d == zu1Var.d && this.e == zu1Var.e && this.f == zu1Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f44988a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AggregatorTournamentFullInfoStyleConfig(prizePoolStyle=" + this.f44988a + ", timerStyle=" + this.b + ", progressStyle=" + this.c + ", prizeStyle=" + this.d + ", stagesCellStyle=" + this.e + ", rulesStyle=" + this.f + Separators.RPAREN;
    }
}
