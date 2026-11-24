package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tfg implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cpm f33863a;

    public tfg(cpm cpmVar) {
        this.f33863a = cpmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfg) && this.f33863a.equals(((tfg) obj).f33863a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CALENDAR";
    }

    public final int hashCode() {
        return this.f33863a.hashCode() + 1553497218;
    }

    public final String toString() {
        return "CyberChampionshipResultsCalendarUiModel(key=CALENDAR, uiModel=" + this.f33863a + Separators.RPAREN;
    }
}
