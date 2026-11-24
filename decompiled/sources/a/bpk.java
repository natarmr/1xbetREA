package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bpk implements hpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sip f2988a;

    public bpk(sip sipVar) {
        this.f2988a = sipVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpk) && this.f2988a == ((bpk) obj).f2988a;
    }

    public final int hashCode() {
        return this.f2988a.hashCode();
    }

    public final String toString() {
        return "OnLiveSwitchClick(feedKind=" + this.f2988a + Separators.RPAREN;
    }
}
