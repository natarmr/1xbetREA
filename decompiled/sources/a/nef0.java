package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nef0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ldf0 f23383a;

    public nef0(ldf0 ldf0Var) {
        this.f23383a = ldf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nef0) && Intrinsics.d(this.f23383a, ((nef0) obj).f23383a);
    }

    public final int hashCode() {
        ldf0 ldf0Var = this.f23383a;
        if (ldf0Var == null) {
            return 0;
        }
        return ldf0Var.hashCode();
    }

    public final String toString() {
        return "RelatedGamesStateModel(currentRelatedGameStateModel=" + this.f23383a + Separators.RPAREN;
    }
}
