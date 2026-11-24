package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class iis implements sis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o49 f14842a;

    public final boolean equals(Object obj) {
        if (obj instanceof iis) {
            return this.f14842a == ((iis) obj).f14842a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14842a.hashCode();
    }

    public final String toString() {
        return "BroadcastingTabClick(type=" + this.f14842a + Separators.RPAREN;
    }
}
