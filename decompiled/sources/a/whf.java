package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class whf implements yhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39165a;

    public final boolean equals(Object obj) {
        if (obj instanceof whf) {
            return this.f39165a.equals(((whf) obj).f39165a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39165a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerTwoResult(value=", this.f39165a, Separators.RPAREN);
    }
}
