package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27957a;

    public final boolean equals(Object obj) {
        if (obj instanceof q1k) {
            return Intrinsics.d(this.f27957a, ((q1k) obj).f27957a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27957a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSubscribeBetInfoPush(betId=", this.f27957a, Separators.RPAREN);
    }
}
