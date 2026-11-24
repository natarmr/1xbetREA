package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gh00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s820 f11275a;
    public final uwh0 b;
    public final ef6 c;
    public final zvj0 d;
    public final z6c0 e;
    public final px4 f;
    public final yw00 g;
    public final float h;
    public final wul i;
    public final qn8 j;
    public final lnd0 k;

    public gh00(s820 s820Var, uwh0 uwh0Var, ef6 ef6Var, zvj0 zvj0Var, z6c0 z6c0Var, px4 px4Var, yw00 yw00Var, float f, wul wulVar, qn8 qn8Var, lnd0 lnd0Var) {
        s820Var.getClass();
        uwh0Var.getClass();
        ef6Var.getClass();
        zvj0Var.getClass();
        qn8Var.getClass();
        this.f11275a = s820Var;
        this.b = uwh0Var;
        this.c = ef6Var;
        this.d = zvj0Var;
        this.e = z6c0Var;
        this.f = px4Var;
        this.g = yw00Var;
        this.h = f;
        this.i = wulVar;
        this.j = qn8Var;
        this.k = lnd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh00)) {
            return false;
        }
        gh00 gh00Var = (gh00) obj;
        return Intrinsics.d(this.f11275a, gh00Var.f11275a) && Intrinsics.d(this.b, gh00Var.b) && Intrinsics.d(this.c, gh00Var.c) && Intrinsics.d(this.d, gh00Var.d) && Intrinsics.d(this.e, gh00Var.e) && Intrinsics.d(this.f, gh00Var.f) && Intrinsics.d(this.g, gh00Var.g) && Float.compare(this.h, gh00Var.h) == 0 && Intrinsics.d(this.i, gh00Var.i) && Intrinsics.d(this.j, gh00Var.j) && Intrinsics.d(this.k, gh00Var.k);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f11275a.hashCode() * 31)) * 31)) * 31)) * 31;
        z6c0 z6c0Var = this.e;
        int iHashCode2 = (iHashCode + (z6c0Var == null ? 0 : z6c0Var.hashCode())) * 31;
        px4 px4Var = this.f;
        int iHashCode3 = (iHashCode2 + (px4Var == null ? 0 : px4Var.hashCode())) * 31;
        yw00 yw00Var = this.g;
        int iA = defpackage.c.a((iHashCode3 + (yw00Var == null ? 0 : yw00Var.hashCode())) * 31, this.h, 31);
        wul wulVar = this.i;
        int iHashCode4 = (this.j.hashCode() + ((iA + (wulVar == null ? 0 : wulVar.hashCode())) * 31)) * 31;
        lnd0 lnd0Var = this.k;
        return iHashCode4 + (lnd0Var != null ? lnd0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LiteNoTabsMakeBetContentUiState(featureType=" + this.f11275a + ", segmentUiState=" + this.b + ", balanceUiState=" + this.c + ", simpleBetTabUiState=" + this.d + ", promoBetTabUiState=" + this.e + ", autoBetTabUiState=" + this.f + ", loginUiState=" + this.g + ", bottomSheetOffset=" + this.h + ", collapsedMakeBetButtonUiModel=" + this.i + ", bottomContentUiModel=" + this.j + ", quickBetState=" + this.k + Separators.RPAREN;
    }
}
