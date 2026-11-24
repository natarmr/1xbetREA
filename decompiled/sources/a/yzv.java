package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yzv implements a0w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvw f43534a;

    public final boolean equals(Object obj) {
        if (obj instanceof yzv) {
            return Intrinsics.d(this.f43534a, ((yzv) obj).f43534a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43534a.hashCode();
    }

    public final String toString() {
        return "OnHistoryStatusClick(historyCouponStatusModel=" + this.f43534a + Separators.RPAREN;
    }
}
