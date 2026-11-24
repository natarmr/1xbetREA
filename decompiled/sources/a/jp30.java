package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jp30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t820 f16883a;
    public final vwh0 b;
    public final ff6 c;
    public final awj0 d;
    public final a7c0 e;
    public final qx4 f;
    public final xw00 g;
    public final float h;
    public final wul i;

    public jp30(t820 t820Var, vwh0 vwh0Var, ff6 ff6Var, awj0 awj0Var, a7c0 a7c0Var, qx4 qx4Var, xw00 xw00Var, float f, wul wulVar) {
        t820Var.getClass();
        vwh0Var.getClass();
        ff6Var.getClass();
        awj0Var.getClass();
        this.f16883a = t820Var;
        this.b = vwh0Var;
        this.c = ff6Var;
        this.d = awj0Var;
        this.e = a7c0Var;
        this.f = qx4Var;
        this.g = xw00Var;
        this.h = f;
        this.i = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp30)) {
            return false;
        }
        jp30 jp30Var = (jp30) obj;
        return Intrinsics.d(this.f16883a, jp30Var.f16883a) && Intrinsics.d(this.b, jp30Var.b) && Intrinsics.d(this.c, jp30Var.c) && Intrinsics.d(this.d, jp30Var.d) && Intrinsics.d(this.e, jp30Var.e) && Intrinsics.d(this.f, jp30Var.f) && Intrinsics.d(this.g, jp30Var.g) && Float.compare(this.h, jp30Var.h) == 0 && Intrinsics.d(this.i, jp30Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f16883a.hashCode() * 31)) * 31)) * 31)) * 31;
        a7c0 a7c0Var = this.e;
        int iHashCode2 = (iHashCode + (a7c0Var == null ? 0 : a7c0Var.hashCode())) * 31;
        qx4 qx4Var = this.f;
        int iHashCode3 = (iHashCode2 + (qx4Var == null ? 0 : qx4Var.hashCode())) * 31;
        xw00 xw00Var = this.g;
        int iA = defpackage.c.a((iHashCode3 + (xw00Var == null ? 0 : xw00Var.hashCode())) * 31, this.h, 31);
        wul wulVar = this.i;
        return iA + (wulVar != null ? wulVar.hashCode() : 0);
    }

    public final String toString() {
        return "MediumCustomBackgroundMakeBetContentUiState(featureType=" + this.f16883a + ", segmentUiState=" + this.b + ", balanceUiState=" + this.c + ", simpleBetTabUiState=" + this.d + ", promoBetTabUiState=" + this.e + ", autoBetTabUiState=" + this.f + ", loginUiState=" + this.g + ", bottomSheetOffset=" + this.h + ", collapsedMakeBetButtonUiModel=" + this.i + Separators.RPAREN;
    }
}
