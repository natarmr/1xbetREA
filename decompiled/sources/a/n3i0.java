package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n3i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f22852a;

    public n3i0(i4 i4Var) {
        i4Var.getClass();
        this.f22852a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3i0) && Intrinsics.d(this.f22852a, ((n3i0) obj).f22852a);
    }

    public final int hashCode() {
        return this.f22852a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f22852a, "SelectTimeFilterUiState(items=", Separators.RPAREN);
    }
}
