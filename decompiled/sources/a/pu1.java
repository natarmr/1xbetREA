package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krl f27590a;

    public pu1(krl krlVar) {
        hrl hrlVar = hrl.f13536a;
        this.f27590a = krlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu1)) {
            return false;
        }
        hrl hrlVar = hrl.f13536a;
        return this.f27590a.equals(((pu1) obj).f27590a);
    }

    public final int hashCode() {
        return this.f27590a.hashCode() + (hrl.f13536a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorTournamentFullInfoRuleUiModel(style=" + hrl.f13536a + ", uiModel=" + this.f27590a + Separators.RPAREN;
    }
}
