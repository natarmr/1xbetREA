package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38210a;

    public vxo0(i4 i4Var) {
        i4Var.getClass();
        this.f38210a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxo0) && Intrinsics.d(this.f38210a, ((vxo0) obj).f38210a);
    }

    public final int hashCode() {
        return this.f38210a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f38210a, "TeamActionUiState(items=", Separators.RPAREN);
    }
}
