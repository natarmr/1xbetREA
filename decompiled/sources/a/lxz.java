package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class lxz implements mxz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20839a;

    public final boolean equals(Object obj) {
        if (obj instanceof lxz) {
            return this.f20839a == ((lxz) obj).f20839a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20839a);
    }

    public final String toString() {
        return ua80.e(this.f20839a, "OnTabSelect(currentTab=", Separators.RPAREN);
    }
}
