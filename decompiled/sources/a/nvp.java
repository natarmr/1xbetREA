package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nvp implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fyl f24198a;

    public nvp(fyl fylVar) {
        this.f24198a = fylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvp) && this.f24198a.equals(((nvp) obj).f24198a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CHIPS_STATISTIC";
    }

    public final int hashCode() {
        return this.f24198a.hashCode() + 382798472;
    }

    public final String toString() {
        return "FighterChipsUiModel(key=CHIPS_STATISTIC, chips=" + this.f24198a + Separators.RPAREN;
    }
}
