package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uj8 implements xj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f35765a;

    public uj8(ra10 ra10Var) {
        ra10Var.getClass();
        this.f35765a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uj8) && Intrinsics.d(this.f35765a, ((uj8) obj).f35765a);
    }

    public final int hashCode() {
        return this.f35765a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(config=", this.f35765a, Separators.RPAREN);
    }
}
