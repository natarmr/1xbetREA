package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yzt0 implements a0u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43532a;

    public final boolean equals(Object obj) {
        if (obj instanceof yzt0) {
            return this.f43532a.equals(((yzt0) obj).f43532a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43532a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f43532a, Separators.RPAREN);
    }
}
