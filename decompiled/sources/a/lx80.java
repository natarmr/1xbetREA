package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lx80 implements mx80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20803a;

    public final boolean equals(Object obj) {
        if (obj instanceof lx80) {
            return this.f20803a.equals(((lx80) obj).f20803a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20803a.hashCode();
    }

    public final String toString() {
        return kng0.l("Url(value=", this.f20803a, Separators.RPAREN);
    }
}
