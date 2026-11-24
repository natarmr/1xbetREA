package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p2f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26247a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final List f;
    public final int g;
    public final dxh0 h;
    public final mtl i;
    public final c6q0 j;
    public final imm k;

    public p2f(String str, boolean z, boolean z2, boolean z3, String str2, List list, int i, dxh0 dxh0Var, mtl mtlVar, c6q0 c6q0Var, imm immVar) {
        str.getClass();
        list.getClass();
        dxh0Var.getClass();
        mtlVar.getClass();
        c6q0Var.getClass();
        immVar.getClass();
        this.f26247a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = list;
        this.g = i;
        this.h = dxh0Var;
        this.i = mtlVar;
        this.j = c6q0Var;
        this.k = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2f)) {
            return false;
        }
        p2f p2fVar = (p2f) obj;
        return Intrinsics.d(this.f26247a, p2fVar.f26247a) && this.b == p2fVar.b && this.c == p2fVar.c && this.d == p2fVar.d && Intrinsics.d(this.e, p2fVar.e) && Intrinsics.d(this.f, p2fVar.f) && this.g == p2fVar.g && Intrinsics.d(this.h, p2fVar.h) && Intrinsics.d(this.i, p2fVar.i) && Intrinsics.d(this.j, p2fVar.j) && Intrinsics.d(this.k, p2fVar.k);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(this.f26247a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.k.hashCode() + ((this.j.hashCode() + cs0.b(this.i.f22376a, hne.h(this.h, twn.a(this.g, dw9.a((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("CouponScannerUiState(couponId=", this.f26247a, ", isActionEnabled=", this.b, ", isScanButtonVisible=");
        ua80.u(", isLoading=", ", errorText=", sbU, this.c, this.d);
        cs0.y(this.e, ", segments=", ", selectedSegmentIndex=", sbU, this.f);
        sbU.append(this.g);
        sbU.append(", segmentedControlStyle=");
        sbU.append(this.h);
        sbU.append(", bottomBarModel=");
        sbU.append(this.i);
        sbU.append(", textFieldUiModel=");
        sbU.append(this.j);
        sbU.append(", navigationBarUiModel=");
        sbU.append(this.k);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
