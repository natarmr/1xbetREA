package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8798a;

    public final boolean equals(Object obj) {
        if (obj instanceof f27) {
            return Intrinsics.d(this.f8798a, ((f27) obj).f8798a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8798a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnMoreClick(betId=", this.f8798a, Separators.RPAREN);
    }
}
