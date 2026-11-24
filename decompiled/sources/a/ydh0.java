package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ydh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42438a;

    public final boolean equals(Object obj) {
        if (obj instanceof ydh0) {
            return this.f42438a.equals(((ydh0) obj).f42438a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42438a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerOneScore(value=", this.f42438a, Separators.RPAREN);
    }
}
