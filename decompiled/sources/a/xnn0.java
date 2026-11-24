package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xnn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f41178a;

    public xnn0(a4x a4xVar) {
        a4xVar.getClass();
        this.f41178a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xnn0) && Intrinsics.d(this.f41178a, ((xnn0) obj).f41178a);
    }

    public final int hashCode() {
        return this.f41178a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f41178a, "SwapPlayersTeamUiState(items=", Separators.RPAREN);
    }
}
