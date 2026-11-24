package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xnd0 implements ynd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41167a;

    public final boolean equals(Object obj) {
        if (obj instanceof xnd0) {
            return Intrinsics.d(this.f41167a, ((xnd0) obj).f41167a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41167a.hashCode();
    }

    public final String toString() {
        return kng0.l("Third(value=", this.f41167a, Separators.RPAREN);
    }
}
