package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gjp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f11412a;

    public gjp0(a4x a4xVar) {
        a4xVar.getClass();
        this.f11412a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjp0) && Intrinsics.d(this.f11412a, ((gjp0) obj).f11412a);
    }

    public final int hashCode() {
        return this.f11412a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f11412a, "TeamSelectorBottomSheetUiState(items=", Separators.RPAREN);
    }
}
