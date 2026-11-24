package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class was implements ivw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38845a;

    public was(i4 i4Var) {
        i4Var.getClass();
        this.f38845a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof was) && Intrinsics.d(this.f38845a, ((was) obj).f38845a);
    }

    public final int hashCode() {
        return this.f38845a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f38845a, "GameEventUiModel(dsGameEventAdapterListUiModel=", Separators.RPAREN);
    }
}
