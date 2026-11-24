package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g37 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10598a;

    public g37(String str) {
        str.getClass();
        this.f10598a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g37) && Intrinsics.d(this.f10598a, ((g37) obj).f10598a);
    }

    public final int hashCode() {
        return this.f10598a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnUpdateCouponResult(betId=", this.f10598a, Separators.RPAREN);
    }
}
