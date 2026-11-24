package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i37 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14083a;

    public final boolean equals(Object obj) {
        if (obj instanceof i37) {
            return Intrinsics.d(this.f14083a, ((i37) obj).f14083a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14083a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnWinBackBannerClicked(winBackAnalytics=", this.f14083a, Separators.RPAREN);
    }
}
