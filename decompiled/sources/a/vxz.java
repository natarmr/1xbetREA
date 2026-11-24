package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vxz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38223a;

    public final boolean equals(Object obj) {
        if (obj instanceof vxz) {
            return Intrinsics.d(this.f38223a, ((vxz) obj).f38223a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38223a.hashCode();
    }

    public final String toString() {
        return kng0.l("ExitAndUpdateMoneyLimit(newLimitValue=", this.f38223a, Separators.RPAREN);
    }
}
