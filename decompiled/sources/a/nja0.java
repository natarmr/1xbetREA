package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f23626a;

    public nja0(a4x a4xVar) {
        a4xVar.getClass();
        this.f23626a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nja0) && Intrinsics.d(this.f23626a, ((nja0) obj).f23626a);
    }

    public final int hashCode() {
        return this.f23626a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f23626a, "PlayersStatisticSelectorsBottomSheetUiState(filtersList=", Separators.RPAREN);
    }
}
