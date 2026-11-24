package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wia0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f39206a;

    public wia0(a4x a4xVar) {
        a4xVar.getClass();
        this.f39206a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wia0) && Intrinsics.d(this.f39206a, ((wia0) obj).f39206a);
    }

    public final int hashCode() {
        return this.f39206a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f39206a, "PlayersStatisticInfoBottomSheetUiState(playersStatisticInfoUiModelList=", Separators.RPAREN);
    }
}
