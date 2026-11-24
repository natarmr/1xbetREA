package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14034a;

    public final boolean equals(Object obj) {
        if (obj instanceof i27) {
            return Intrinsics.d(this.f14034a, ((i27) obj).f14034a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14034a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSellClick(betId=", this.f14034a, Separators.RPAREN);
    }
}
