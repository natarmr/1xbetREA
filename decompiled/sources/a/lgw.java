package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lgw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sip f20025a;

    public lgw(sip sipVar) {
        this.f20025a = sipVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgw) && this.f20025a == ((lgw) obj).f20025a;
    }

    public final int hashCode() {
        return this.f20025a.hashCode();
    }

    public final String toString() {
        return "OnAllTopEventsClick(feedKind=" + this.f20025a + Separators.RPAREN;
    }
}
