package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kkb0 implements okb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lcb0 f18428a;

    public final boolean equals(Object obj) {
        if (obj instanceof kkb0) {
            return Intrinsics.d(this.f18428a, ((kkb0) obj).f18428a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18428a.hashCode();
    }

    public final String toString() {
        return "OnPopularHeaderClick(item=" + this.f18428a + Separators.RPAREN;
    }
}
