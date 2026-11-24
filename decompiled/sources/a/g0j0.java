package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g0j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f10462a;

    public g0j0(a4x a4xVar) {
        a4xVar.getClass();
        this.f10462a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0j0) && Intrinsics.d(this.f10462a, ((g0j0) obj).f10462a);
    }

    public final int hashCode() {
        return this.f10462a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f10462a, "SettingsCoefTypeUiState(items=", Separators.RPAREN);
    }
}
