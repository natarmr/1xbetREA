package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ti7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33995a;

    public final boolean equals(Object obj) {
        if (obj instanceof ti7) {
            return Intrinsics.d(this.f33995a, ((ti7) obj).f33995a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33995a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnHideHistoryApplied(betId=", this.f33995a, Separators.RPAREN);
    }
}
