package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fde implements pde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f9354a;

    public fde(a4x a4xVar) {
        a4xVar.getClass();
        this.f9354a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fde) && Intrinsics.d(this.f9354a, ((fde) obj).f9354a);
    }

    public final int hashCode() {
        return this.f9354a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f9354a, "Loading(items=", Separators.RPAREN);
    }
}
