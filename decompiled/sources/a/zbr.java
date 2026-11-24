package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zbr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f44129a;
    public final u820 b;
    public final wwh0 c;
    public final gf6 d;
    public final bwj0 e;
    public final b7c0 f;
    public final rx4 g;
    public final mtl h;
    public final boolean i;
    public final float j;
    public final wul k;

    public zbr(y00 y00Var, u820 u820Var, wwh0 wwh0Var, gf6 gf6Var, bwj0 bwj0Var, b7c0 b7c0Var, rx4 rx4Var, mtl mtlVar, boolean z, float f, wul wulVar) {
        u820Var.getClass();
        wwh0Var.getClass();
        gf6Var.getClass();
        bwj0Var.getClass();
        mtlVar.getClass();
        this.f44129a = y00Var;
        this.b = u820Var;
        this.c = wwh0Var;
        this.d = gf6Var;
        this.e = bwj0Var;
        this.f = b7c0Var;
        this.g = rx4Var;
        this.h = mtlVar;
        this.i = z;
        this.j = f;
        this.k = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbr)) {
            return false;
        }
        zbr zbrVar = (zbr) obj;
        return Intrinsics.d(this.f44129a, zbrVar.f44129a) && Intrinsics.d(this.b, zbrVar.b) && Intrinsics.d(this.c, zbrVar.c) && Intrinsics.d(this.d, zbrVar.d) && Intrinsics.d(this.e, zbrVar.e) && Intrinsics.d(this.f, zbrVar.f) && Intrinsics.d(this.g, zbrVar.g) && Intrinsics.d(this.h, zbrVar.h) && this.i == zbrVar.i && Float.compare(this.j, zbrVar.j) == 0 && Intrinsics.d(this.k, zbrVar.k);
    }

    public final int hashCode() {
        y00 y00Var = this.f44129a;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((y00Var == null ? 0 : y00Var.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31;
        b7c0 b7c0Var = this.f;
        int iHashCode2 = (iHashCode + (b7c0Var == null ? 0 : b7c0Var.hashCode())) * 31;
        rx4 rx4Var = this.g;
        int iA = defpackage.c.a(brm0.e(cs0.b(this.h.f22376a, (iHashCode2 + (rx4Var == null ? 0 : rx4Var.hashCode())) * 31, 31), 31, this.i), this.j, 31);
        wul wulVar = this.k;
        return iA + (wulVar != null ? wulVar.hashCode() : 0);
    }

    public final String toString() {
        return "FullScreenSliderMakeBetContentUiState(additionalTopUiState=" + this.f44129a + ", featureType=" + this.b + ", segmentUiState=" + this.c + ", balanceUiState=" + this.d + ", simpleBetTabUiState=" + this.e + ", promoBetTabUiState=" + this.f + ", autoBetTabUiState=" + this.g + ", bottomBarModel=" + this.h + ", isAuthorized=" + this.i + ", bottomSheetOffset=" + this.j + ", collapsedMakeBetButtonUiModel=" + this.k + Separators.RPAREN;
    }

    public /* synthetic */ zbr(y00 y00Var, u820 u820Var, wwh0 wwh0Var, gf6 gf6Var, bwj0 bwj0Var, b7c0 b7c0Var, rx4 rx4Var, mtl mtlVar, boolean z) {
        this(y00Var, u820Var, wwh0Var, gf6Var, bwj0Var, b7c0Var, rx4Var, mtlVar, z, 1.0f, null);
    }
}
