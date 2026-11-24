package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i2f implements k2f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14044a;

    public i2f(String str) {
        str.getClass();
        this.f14044a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2f) && Intrinsics.d(this.f14044a, ((i2f) obj).f14044a);
    }

    public final int hashCode() {
        return this.f14044a.hashCode();
    }

    public final String toString() {
        return kng0.l("Bet(segmentTitle=", this.f14044a, Separators.RPAREN);
    }
}
