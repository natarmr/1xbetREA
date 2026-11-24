package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c9c0 implements j9c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3955a;

    public c9c0(String str) {
        this.f3955a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9c0) && this.f3955a.equals(((c9c0) obj).f3955a);
    }

    public final int hashCode() {
        return this.f3955a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnCheckClick(promoCode=", this.f3955a, Separators.RPAREN);
    }
}
