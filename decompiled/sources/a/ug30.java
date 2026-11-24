package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ug30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f35605a;

    public ug30(i4 i4Var) {
        i4Var.getClass();
        this.f35605a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug30) && Intrinsics.d(this.f35605a, ((ug30) obj).f35605a);
    }

    public final int hashCode() {
        return this.f35605a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f35605a, "MatchTypesUiState(matchTypes=", Separators.RPAREN);
    }
}
