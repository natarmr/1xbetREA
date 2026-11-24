package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lhw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sip f20077a;

    public lhw(sip sipVar) {
        this.f20077a = sipVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhw) && this.f20077a == ((lhw) obj).f20077a;
    }

    public final int hashCode() {
        return this.f20077a.hashCode();
    }

    public final String toString() {
        return "OnLiveSwitchClick(feedKind=" + this.f20077a + Separators.RPAREN;
    }
}
