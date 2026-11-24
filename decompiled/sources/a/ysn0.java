package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ysn0 implements atn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43177a;

    public final boolean equals(Object obj) {
        if (obj instanceof ysn0) {
            return this.f43177a.equals(((ysn0) obj).f43177a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43177a.hashCode();
    }

    public final String toString() {
        return kng0.l("Score(value=", this.f43177a, Separators.RPAREN);
    }
}
