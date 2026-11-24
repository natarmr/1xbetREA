package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class yjn0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42749a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final rjn0 f;

    public yjn0(int i, int i2, int i3, int i4, int i5, rjn0 rjn0Var) {
        this.f42749a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = rjn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjn0)) {
            return false;
        }
        yjn0 yjn0Var = (yjn0) obj;
        return this.f42749a == yjn0Var.f42749a && this.b == yjn0Var.b && this.c == yjn0Var.c && this.d == yjn0Var.d && this.e == yjn0Var.e && this.f == yjn0Var.f;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof yjn0) && (p6t0Var2 instanceof yjn0) && ((yjn0) p6t0Var).f42749a == ((yjn0) p6t0Var2).f42749a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f42749a) * 31, 31), 31), 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof yjn0) && (p6t0Var2 instanceof yjn0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            yjn0 yjn0Var = (yjn0) p6t0Var;
            yjn0 yjn0Var2 = (yjn0) p6t0Var2;
            k9x.G(linkedHashSet, new wjn0(yjn0Var.b), new wjn0(yjn0Var2.b));
            k9x.G(linkedHashSet, new vjn0(yjn0Var.c), new vjn0(yjn0Var2.c));
            k9x.G(linkedHashSet, new tjn0(yjn0Var.d), new tjn0(yjn0Var2.d));
            k9x.G(linkedHashSet, new ujn0(yjn0Var.e), new ujn0(yjn0Var2.e));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strE = ua80.e(this.b, "TitleResId(value=", Separators.RPAREN);
        String strE2 = ua80.e(this.c, "SubTitleResId(value=", Separators.RPAREN);
        String strE3 = ua80.e(this.d, "IconResId(value=", Separators.RPAREN);
        String strE4 = ua80.e(this.e, "NewMessageCount(value=", Separators.RPAREN);
        StringBuilder sbR = vqd.r(this.f42749a, "SupportMenuUiModel(id=", ", titleResId=", strE, ", subTitleResId=");
        f140.v(sbR, strE2, ", iconResId=", strE3, ", newMessageCount=");
        sbR.append(strE4);
        sbR.append(", style=");
        sbR.append(this.f);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
