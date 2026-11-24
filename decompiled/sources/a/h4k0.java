package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h4k0 implements l4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12437a;

    public final boolean equals(Object obj) {
        if (obj instanceof h4k0) {
            return this.f12437a == ((h4k0) obj).f12437a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12437a);
    }

    public final String toString() {
        return ua80.e(this.f12437a, "ScoreBackground(value=", Separators.RPAREN);
    }
}
