package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3707a;

    public c440(String str) {
        str.getClass();
        this.f3707a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c440) && Intrinsics.d(this.f3707a, ((c440) obj).f3707a);
    }

    public final int hashCode() {
        return this.f3707a.hashCode();
    }

    public final String toString() {
        return kng0.l("AggregatorPromoCode(promoCode=", this.f3707a, Separators.RPAREN);
    }
}
