package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class rtl0 implements xg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31085a;
    public final int b;
    public final int c;

    public rtl0(int i, int i2, boolean z) {
        this.f31085a = z;
        this.b = i;
        this.c = i2;
    }

    public static rtl0 c(rtl0 rtl0Var, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = rtl0Var.f31085a;
        }
        if ((i2 & 2) != 0) {
            i = rtl0Var.b;
        }
        int i3 = rtl0Var.c;
        rtl0Var.getClass();
        return new rtl0(i, i3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtl0)) {
            return false;
        }
        rtl0 rtl0Var = (rtl0) obj;
        return this.f31085a == rtl0Var.f31085a && this.b == rtl0Var.b && this.c == rtl0Var.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof rtl0) && (p6t0Var2 instanceof rtl0)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof rtl0) && (p6t0Var2 instanceof rtl0)) {
            return p6t0Var.equals(p6t0Var2);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Boolean.hashCode(this.f31085a) * 31, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof rtl0) && (p6t0Var2 instanceof rtl0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            rtl0 rtl0Var = (rtl0) p6t0Var;
            rtl0 rtl0Var2 = (rtl0) p6t0Var2;
            k9x.G(linkedHashSet, new ntl0(rtl0Var.f31085a), new ntl0(rtl0Var2.f31085a));
            k9x.G(linkedHashSet, new ptl0(rtl0Var.b), new ptl0(rtl0Var2.b));
            k9x.G(linkedHashSet, new otl0(rtl0Var.c), new otl0(rtl0Var2.c));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strD = defpackage.c.d("AnimationEnable(value=", Separators.RPAREN, this.f31085a);
        String strE = ua80.e(this.b, "ImageTintAttr(value=", Separators.RPAREN);
        return axq.n(b1j.n("SportsmanUiModel(animationEnable=", strD, ", imageTintAttr=", strE, ", imageRes="), ua80.e(this.c, "ImageRes(value=", Separators.RPAREN), Separators.RPAREN);
    }
}
