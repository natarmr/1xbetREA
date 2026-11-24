package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rpn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30895a;
    public final List b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;

    public rpn0(int i, List list, boolean z, int i2, int i3, int i4, float f) {
        list.getClass();
        this.f30895a = i;
        this.b = list;
        this.c = z;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
    }

    public static rpn0 a(rpn0 rpn0Var, int i, List list, int i2, int i3, int i4, float f, int i5) {
        if ((i5 & 1) != 0) {
            i = rpn0Var.f30895a;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            list = rpn0Var.b;
        }
        List list2 = list;
        boolean z = (i5 & 4) != 0 ? rpn0Var.c : false;
        if ((i5 & 8) != 0) {
            i2 = rpn0Var.d;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = rpn0Var.e;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = rpn0Var.f;
        }
        int i9 = i4;
        if ((i5 & 64) != 0) {
            f = rpn0Var.g;
        }
        rpn0Var.getClass();
        list2.getClass();
        return new rpn0(i6, list2, z, i7, i8, i9, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpn0)) {
            return false;
        }
        rpn0 rpn0Var = (rpn0) obj;
        return this.f30895a == rpn0Var.f30895a && Intrinsics.d(this.b, rpn0Var.b) && this.c == rpn0Var.c && this.d == rpn0Var.d && this.e == rpn0Var.e && this.f == rpn0Var.f && Float.compare(this.g, rpn0Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + twn.a(this.f, twn.a(this.e, twn.a(this.d, brm0.e(dw9.a(Integer.hashCode(this.f30895a) * 31, 31, this.b), 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(btnNextTitle=");
        sb.append(this.f30895a);
        sb.append(", previews=");
        sb.append(this.b);
        sb.append(", skipBtnVisible=");
        ua80.q(this.d, ", currentPage=", ", title=", sb, this.c);
        axq.r(this.e, this.f, ", description=", ", widthRatio=", sb);
        return kng0.o(sb, this.g, Separators.RPAREN);
    }
}
