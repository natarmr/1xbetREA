package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3610a;

    public final boolean equals(Object obj) {
        if (obj instanceof c27) {
            return Intrinsics.d(this.f3610a, ((c27) obj).f3610a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3610a.hashCode();
    }

    public final String toString() {
        return kng0.l("DeleteOrder(betId=", this.f3610a, Separators.RPAREN);
    }
}
