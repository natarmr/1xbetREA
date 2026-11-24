package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i3j implements l3j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j f14099a;

    public i3j(d3j d3jVar) {
        this.f14099a = d3jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3j) && this.f14099a.equals(((i3j) obj).f14099a);
    }

    public final int hashCode() {
        return this.f14099a.hashCode();
    }

    public final String toString() {
        return "Content(dailyTaskWidgetModel=" + this.f14099a + Separators.RPAREN;
    }
}
