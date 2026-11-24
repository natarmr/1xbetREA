package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class al7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1054a;

    public final boolean equals(Object obj) {
        if (obj instanceof al7) {
            return Intrinsics.d(this.f1054a, ((al7) obj).f1054a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1054a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCouponDialog(betId=", this.f1054a, Separators.RPAREN);
    }
}
