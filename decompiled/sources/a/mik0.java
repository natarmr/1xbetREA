package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mik0 implements pik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f21851a;

    public final boolean equals(Object obj) {
        if (obj instanceof mik0) {
            return this.f21851a.equals(((mik0) obj).f21851a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21851a.hashCode();
    }

    public final String toString() {
        return h97.k("DisableNetwork(lottieConfig=", this.f21851a, Separators.RPAREN);
    }
}
