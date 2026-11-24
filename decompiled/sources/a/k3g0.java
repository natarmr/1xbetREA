package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k3g0 implements q3g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw40 f17617a;

    public final boolean equals(Object obj) {
        if (obj instanceof k3g0) {
            return Intrinsics.d(this.f17617a, ((k3g0) obj).f17617a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17617a.hashCode();
    }

    public final String toString() {
        return "OnHintClick(item=" + this.f17617a + Separators.RPAREN;
    }
}
