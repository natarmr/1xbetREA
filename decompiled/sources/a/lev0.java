package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lev0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f19924a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public lev0(int i, int i2, String str, boolean z, boolean z2) {
        str.getClass();
        this.f19924a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public static lev0 c(lev0 lev0Var, boolean z, boolean z2) {
        byte b = lev0Var.f19924a;
        String str = lev0Var.b;
        int i = lev0Var.c;
        lev0Var.getClass();
        str.getClass();
        return new lev0(b, i, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lev0)) {
            return false;
        }
        lev0 lev0Var = (lev0) obj;
        return this.f19924a == lev0Var.f19924a && Intrinsics.d(this.b, lev0Var.b) && this.c == lev0Var.c && this.d == lev0Var.d && this.e == lev0Var.e;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(twn.a(this.c, ua80.b(Integer.hashCode(this.f19924a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f19924a, "WidgetSectionUiModel(type=", ", title=", this.b, ", image=");
        brm0.w(this.c, ", isFirst=", ", isLast=", sbR, this.d);
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }
}
