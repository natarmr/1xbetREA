package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nts0 implements pts0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f24116a;
    public final mts0 b;
    public final nss0 c;
    public final hyl d;
    public final uss0 e;

    public nts0(imm immVar, mts0 mts0Var, nss0 nss0Var, hyl hylVar, uss0 uss0Var) {
        vxl vxlVar = vxl.f38204a;
        immVar.getClass();
        mts0Var.getClass();
        nss0Var.getClass();
        hylVar.getClass();
        uss0Var.getClass();
        this.f24116a = immVar;
        this.b = mts0Var;
        this.c = nss0Var;
        this.d = hylVar;
        this.e = uss0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nts0)) {
            return false;
        }
        nts0 nts0Var = (nts0) obj;
        if (!Intrinsics.d(this.f24116a, nts0Var.f24116a) || !Intrinsics.d(this.b, nts0Var.b) || !Intrinsics.d(this.c, nts0Var.c) || !Intrinsics.d(this.d, nts0Var.d) || !Intrinsics.d(this.e, nts0Var.e)) {
            return false;
        }
        vxl vxlVar = vxl.f38204a;
        return true;
    }

    public final int hashCode() {
        return vxl.b.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f24116a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Content(navigationBar=" + this.f24116a + ", tableUiModel=" + this.b + ", bannerUiModel=" + this.c + ", chips=" + this.d + ", labelUiModel=" + this.e + ", dsChipStyle=" + vxl.b + Separators.RPAREN;
    }
}
