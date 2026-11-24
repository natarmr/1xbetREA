package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29684a;

    public final boolean equals(Object obj) {
        if (obj instanceof r1k) {
            return Intrinsics.d(this.f29684a, ((r1k) obj).f29684a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29684a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnUnsubscribeBetInfoPush(betId=", this.f29684a, Separators.RPAREN);
    }
}
