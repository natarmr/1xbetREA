package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tc7 f16724a;
    public final a4x b;
    public final wul c;
    public final wul d;

    public jln(tc7 tc7Var, a4x a4xVar, wul wulVar, wul wulVar2) {
        a4xVar.getClass();
        this.f16724a = tc7Var;
        this.b = a4xVar;
        this.c = wulVar;
        this.d = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jln)) {
            return false;
        }
        jln jlnVar = (jln) obj;
        return this.f16724a.equals(jlnVar.f16724a) && Intrinsics.d(this.b, jlnVar.b) && this.c.equals(jlnVar.c) && this.d.equals(jlnVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + i8i.a(this.c, cs0.b(this.b, this.f16724a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "EditCouponBottomSheetUiState(betInfoUiState=" + this.f16724a + ", editCouponBottomSheetContentUiItemsList=" + this.b + ", addEventButtonUiModel=" + this.c + ", saveCouponButtonUiModel=" + this.d + Separators.RPAREN;
    }
}
