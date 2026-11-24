package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pom0 implements qom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f27336a;

    public pom0(Throwable th) {
        th.getClass();
        this.f27336a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pom0) && Intrinsics.d(this.f27336a, ((pom0) obj).f27336a);
    }

    public final int hashCode() {
        return this.f27336a.hashCode();
    }

    public final String toString() {
        return ohs0.q("CriticalError(error=", Separators.RPAREN, this.f27336a);
    }
}
