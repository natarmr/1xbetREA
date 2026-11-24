package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f28139a;

    public q580(i4 i4Var) {
        i4Var.getClass();
        this.f28139a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q580) && Intrinsics.d(this.f28139a, ((q580) obj).f28139a);
    }

    public final int hashCode() {
        return this.f28139a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f28139a, "OpponentsUiState(content=", Separators.RPAREN);
    }
}
