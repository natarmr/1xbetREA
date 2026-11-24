package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class aic0 {
    public static final yhc0 Companion = new yhc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qic0 f918a;
    public final qic0 b;
    public final joc0 c;
    public final t7c0 d;

    static {
        r7c0 r7c0Var = t7c0.Companion;
    }

    public /* synthetic */ aic0(int i, qic0 qic0Var, qic0 qic0Var2, joc0 joc0Var, t7c0 t7c0Var) {
        if ((i & 1) == 0) {
            this.f918a = null;
        } else {
            this.f918a = qic0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = qic0Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = joc0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = t7c0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aic0)) {
            return false;
        }
        aic0 aic0Var = (aic0) obj;
        return Intrinsics.d(this.f918a, aic0Var.f918a) && Intrinsics.d(this.b, aic0Var.b) && Intrinsics.d(this.c, aic0Var.c) && Intrinsics.d(this.d, aic0Var.d);
    }

    public final int hashCode() {
        qic0 qic0Var = this.f918a;
        int iHashCode = (qic0Var == null ? 0 : qic0Var.hashCode()) * 31;
        qic0 qic0Var2 = this.b;
        int iHashCode2 = (iHashCode + (qic0Var2 == null ? 0 : qic0Var2.hashCode())) * 31;
        joc0 joc0Var = this.c;
        int iHashCode3 = (iHashCode2 + (joc0Var == null ? 0 : joc0Var.hashCode())) * 31;
        t7c0 t7c0Var = this.d;
        return iHashCode3 + (t7c0Var != null ? t7c0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PromoEntitiesResponse(promoSlotGame=" + this.f918a + ", promoLiveAggregatorGame=" + this.b + ", promoProduct=" + this.c + ", promoBrand=" + this.d + Separators.RPAREN;
    }
}
