package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y6o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cpm f42108a;

    public y6o0(cpm cpmVar) {
        this.f42108a = cpmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6o0) && this.f42108a.equals(((y6o0) obj).f42108a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CALENDAR";
    }

    public final int hashCode() {
        return this.f42108a.hashCode() + 1553497218;
    }

    public final String toString() {
        return "SyntheticResultsCalendarUiModel(key=CALENDAR, uiModel=" + this.f42108a + Separators.RPAREN;
    }
}
