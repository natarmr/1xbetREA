package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hj7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13147a;

    public final boolean equals(Object obj) {
        if (obj instanceof hj7) {
            return Intrinsics.d(this.f13147a, ((hj7) obj).f13147a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13147a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSellClick(betId=", this.f13147a, Separators.RPAREN);
    }
}
