package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31460a;

    public final boolean equals(Object obj) {
        if (obj instanceof s1k) {
            return Intrinsics.d(this.f31460a, ((s1k) obj).f31460a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31460a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnWinBackBannerClick(winBackAnalytics=", this.f31460a, Separators.RPAREN);
    }
}
