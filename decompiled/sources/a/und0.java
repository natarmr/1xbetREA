package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class und0 implements ynd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35955a;

    public final boolean equals(Object obj) {
        if (obj instanceof und0) {
            return Intrinsics.d(this.f35955a, ((und0) obj).f35955a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35955a.hashCode();
    }

    public final String toString() {
        return kng0.l("First(value=", this.f35955a, Separators.RPAREN);
    }
}
