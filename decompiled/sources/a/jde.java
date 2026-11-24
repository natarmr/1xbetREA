package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jde implements lde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f16325a;

    public jde(a4x a4xVar) {
        a4xVar.getClass();
        this.f16325a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jde) && Intrinsics.d(this.f16325a, ((jde) obj).f16325a);
    }

    public final int hashCode() {
        return this.f16325a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f16325a, "Shimmers(items=", Separators.RPAREN);
    }
}
