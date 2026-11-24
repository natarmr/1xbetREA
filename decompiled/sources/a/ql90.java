package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ql90 implements ul90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28922a;

    public final boolean equals(Object obj) {
        if (obj instanceof ql90) {
            return this.f28922a.equals(((ql90) obj).f28922a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28922a.hashCode();
    }

    public final String toString() {
        return kng0.l("Mask(value=", this.f28922a, Separators.RPAREN);
    }
}
