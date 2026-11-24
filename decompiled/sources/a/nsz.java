package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nsz implements usz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24072a;

    public final boolean equals(Object obj) {
        if (obj instanceof nsz) {
            return Intrinsics.d(this.f24072a, ((nsz) obj).f24072a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24072a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnLimitValueChange(newValue=", this.f24072a, Separators.RPAREN);
    }
}
