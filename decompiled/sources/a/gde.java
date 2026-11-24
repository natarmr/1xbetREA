package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gde implements mde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f11102a;

    public gde(a4x a4xVar) {
        a4xVar.getClass();
        this.f11102a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gde) && Intrinsics.d(this.f11102a, ((gde) obj).f11102a);
    }

    public final int hashCode() {
        return this.f11102a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f11102a, "Shimmers(items=", Separators.RPAREN);
    }
}
