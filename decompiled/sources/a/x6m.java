package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c280 f40370a;
    public final c280 b;

    public x6m(c280 c280Var, c280 c280Var2) {
        this.f40370a = c280Var;
        this.b = c280Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6m)) {
            return false;
        }
        x6m x6mVar = (x6m) obj;
        return this.f40370a.equals(x6mVar.f40370a) && this.b.equals(x6mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40370a.hashCode() * 31);
    }

    public final String toString() {
        return "DsCyberGamePickBanPanelTeamUiModel(opponentOne=" + this.f40370a + ", opponentTwo=" + this.b + Separators.RPAREN;
    }
}
