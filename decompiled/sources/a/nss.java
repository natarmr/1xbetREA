package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nss implements qss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f24063a;

    public final boolean equals(Object obj) {
        if (obj instanceof nss) {
            return this.f24063a.equals(((nss) obj).f24063a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24063a.hashCode();
    }

    public final String toString() {
        return b1j.j("Loading(lottieConfig=", this.f24063a, Separators.RPAREN);
    }
}
