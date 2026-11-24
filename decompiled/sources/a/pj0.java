package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pj0 implements jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uhc0 f27064a;

    public pj0(uhc0 uhc0Var) {
        this.f27064a = uhc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj0) && Intrinsics.d(this.f27064a, ((pj0) obj).f27064a);
    }

    public final int hashCode() {
        uhc0 uhc0Var = this.f27064a;
        if (uhc0Var == null) {
            return 0;
        }
        return uhc0Var.hashCode();
    }

    public final String toString() {
        return "UpdatePromoGames(games=" + this.f27064a + Separators.RPAREN;
    }
}
