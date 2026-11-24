package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class olw extends rkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tsm f25477a;

    public olw(tsm tsmVar) {
        this.f25477a = tsmVar;
    }

    @Override // a.rkb0
    public final String c() {
        return "SPORT_FILTER";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olw) && this.f25477a.equals(((olw) obj).f25477a);
    }

    public final int hashCode() {
        return this.f25477a.hashCode() + 418935197;
    }

    public final String toString() {
        return "HorizontalPopularSportTabDSUiItem(id=SPORT_FILTER, model=" + this.f25477a + Separators.RPAREN;
    }
}
