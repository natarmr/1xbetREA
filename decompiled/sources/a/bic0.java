package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bic0 {
    public static final zhc0 Companion = new zhc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ric0 f2653a;
    public final ric0 b;
    public final u7c0 c;

    static {
        s7c0 s7c0Var = u7c0.Companion;
    }

    public /* synthetic */ bic0(int i, ric0 ric0Var, ric0 ric0Var2, u7c0 u7c0Var) {
        if ((i & 1) == 0) {
            this.f2653a = null;
        } else {
            this.f2653a = ric0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ric0Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = u7c0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bic0)) {
            return false;
        }
        bic0 bic0Var = (bic0) obj;
        return Intrinsics.d(this.f2653a, bic0Var.f2653a) && Intrinsics.d(this.b, bic0Var.b) && Intrinsics.d(this.c, bic0Var.c);
    }

    public final int hashCode() {
        ric0 ric0Var = this.f2653a;
        int iHashCode = (ric0Var == null ? 0 : ric0Var.hashCode()) * 31;
        ric0 ric0Var2 = this.b;
        int iHashCode2 = (iHashCode + (ric0Var2 == null ? 0 : ric0Var2.hashCode())) * 31;
        u7c0 u7c0Var = this.c;
        return iHashCode2 + (u7c0Var != null ? u7c0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PromoEntitiesResponse(promoSlotGame=" + this.f2653a + ", promoLiveAggregatorGame=" + this.b + ", promoBrand=" + this.c + Separators.RPAREN;
    }
}
