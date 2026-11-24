package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mia0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f21835a;

    public mia0(a4x a4xVar) {
        a4xVar.getClass();
        this.f21835a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mia0) && Intrinsics.d(this.f21835a, ((mia0) obj).f21835a);
    }

    public final int hashCode() {
        return this.f21835a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f21835a, "PlayersStatisticCricketSelectorsBottomSheetUiState(filtersList=", Separators.RPAREN);
    }
}
