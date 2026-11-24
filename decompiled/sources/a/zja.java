package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zja implements bja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf30 f44473a;
    public final ao8 b;

    public zja(xf30 xf30Var, ao8 ao8Var) {
        dja djaVar = dja.PENALTY;
        this.f44473a = xf30Var;
        this.b = ao8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zja)) {
            return false;
        }
        zja zjaVar = (zja) obj;
        dja djaVar = dja.PENALTY;
        return this.f44473a.equals(zjaVar.f44473a) && this.b.equals(zjaVar.b);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.LIVE_EVENTS;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f44473a.hashCode() + (dja.LIVE_EVENTS.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardMatchReviewUiModel(type=" + dja.LIVE_EVENTS + ", matchReviewUiModel=" + this.f44473a + ", bottomInfoUiModel=" + this.b + Separators.RPAREN;
    }
}
