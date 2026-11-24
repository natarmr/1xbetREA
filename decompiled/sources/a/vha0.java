package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f37420a;

    public vha0(a4x a4xVar) {
        a4xVar.getClass();
        this.f37420a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vha0) && Intrinsics.d(this.f37420a, ((vha0) obj).f37420a);
    }

    public final int hashCode() {
        return this.f37420a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f37420a, "PlayersStatisticCricketInfoBottomSheetUiState(playersStatisticInfoUiModelList=", Separators.RPAREN);
    }
}
