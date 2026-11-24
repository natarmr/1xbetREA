package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kgt implements vgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18257a;

    public final boolean equals(Object obj) {
        if (obj instanceof kgt) {
            return Intrinsics.d(this.f18257a, ((kgt) obj).f18257a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18257a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnBetSumChange(betSum=", this.f18257a, Separators.RPAREN);
    }
}
