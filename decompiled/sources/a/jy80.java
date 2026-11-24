package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jy80 implements ly80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17347a;

    public jy80(String str) {
        this.f17347a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jy80) && this.f17347a.equals(((jy80) obj).f17347a);
    }

    public final int hashCode() {
        return this.f17347a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPartnerClick(partnerName=", this.f17347a, Separators.RPAREN);
    }
}
