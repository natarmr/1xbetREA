package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bmn implements gmn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2843a;

    public bmn(a4x a4xVar) {
        a4xVar.getClass();
        this.f2843a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bmn) && Intrinsics.d(this.f2843a, ((bmn) obj).f2843a);
    }

    public final int hashCode() {
        return this.f2843a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f2843a, "Content(editCouponEventUiModelsList=", Separators.RPAREN);
    }
}
