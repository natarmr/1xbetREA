package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26440a;

    public final boolean equals(Object obj) {
        if (obj instanceof p67) {
            return Intrinsics.d(this.f26440a, ((p67) obj).f26440a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26440a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCouponDialog(betId=", this.f26440a, Separators.RPAREN);
    }
}
