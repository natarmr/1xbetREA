package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hde implements nde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f12865a;

    public hde(a4x a4xVar) {
        a4xVar.getClass();
        this.f12865a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hde) && Intrinsics.d(this.f12865a, ((hde) obj).f12865a);
    }

    public final int hashCode() {
        return this.f12865a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f12865a, "Shimmers(items=", Separators.RPAREN);
    }
}
