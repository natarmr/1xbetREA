package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u9q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f35296a;

    public u9q(i4 i4Var) {
        i4Var.getClass();
        this.f35296a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u9q) && Intrinsics.d(this.f35296a, ((u9q) obj).f35296a);
    }

    public final int hashCode() {
        return this.f35296a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f35296a, "FinBetsInstrumentsDialogUiState(instruments=", Separators.RPAREN);
    }
}
