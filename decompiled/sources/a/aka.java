package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class aka implements cja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf30 f1012a;
    public final bo8 b;

    public aka(zf30 zf30Var, bo8 bo8Var) {
        dja djaVar = dja.PENALTY;
        this.f1012a = zf30Var;
        this.b = bo8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aka)) {
            return false;
        }
        aka akaVar = (aka) obj;
        dja djaVar = dja.PENALTY;
        return this.f1012a.equals(akaVar.f1012a) && this.b.equals(akaVar.b);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.LIVE_EVENTS;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f1012a.hashCode() + (dja.LIVE_EVENTS.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardMatchReviewUiModel(type=" + dja.LIVE_EVENTS + ", matchReviewUiModel=" + this.f1012a + ", bottomInfoUiModel=" + this.b + Separators.RPAREN;
    }
}
