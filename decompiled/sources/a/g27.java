package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10549a;

    public final boolean equals(Object obj) {
        if (obj instanceof g27) {
            return Intrinsics.d(this.f10549a, ((g27) obj).f10549a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10549a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnNavigateToSellClick(betId=", this.f10549a, Separators.RPAREN);
    }
}
