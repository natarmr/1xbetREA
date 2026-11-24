package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t2j implements w2j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j f33217a;

    public t2j(d3j d3jVar) {
        this.f33217a = d3jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2j) && this.f33217a.equals(((t2j) obj).f33217a);
    }

    public final int hashCode() {
        return this.f33217a.hashCode();
    }

    public final String toString() {
        return "Content(dailyTaskWidgetModel=" + this.f33217a + Separators.RPAREN;
    }
}
