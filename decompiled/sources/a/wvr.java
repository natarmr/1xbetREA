package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wvr implements ewr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39852a;

    public final boolean equals(Object obj) {
        if (obj instanceof wvr) {
            return this.f39852a.equals(((wvr) obj).f39852a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39852a.hashCode();
    }

    public final String toString() {
        return kng0.l("BottomInfo(value=", this.f39852a, Separators.RPAREN);
    }
}
