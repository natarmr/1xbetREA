package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy1 f10339a;
    public final String b;

    public fy1(oy1 oy1Var, String str) {
        this.f10339a = oy1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy1)) {
            return false;
        }
        fy1 fy1Var = (fy1) obj;
        return Intrinsics.d(this.f10339a, fy1Var.f10339a) && Intrinsics.d(this.b, fy1Var.b);
    }

    public final int hashCode() {
        oy1 oy1Var = this.f10339a;
        int iHashCode = (oy1Var == null ? 0 : oy1Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AggregatorTournamentsCardsNativeButtonsUiModel(topButton=" + this.f10339a + ", bottomLabel=" + this.b + Separators.RPAREN;
    }
}
