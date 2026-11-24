package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ahw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sip f895a;
    public final long b;

    public ahw(long j, sip sipVar) {
        this.f895a = sipVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahw)) {
            return false;
        }
        ahw ahwVar = (ahw) obj;
        return this.f895a == ahwVar.f895a && this.b == ahwVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f895a.hashCode() * 31);
    }

    public final String toString() {
        return "OnDisciplineFilterChipsClick(feedKind=" + this.f895a + ", disciplineId=" + this.b + Separators.RPAREN;
    }
}
