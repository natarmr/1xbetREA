package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class cax implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4035a;
    public final int b;
    public final int c;
    public final l9x d;

    public cax(int i, int i2, int i3, l9x l9xVar) {
        this.f4035a = i;
        this.b = i2;
        this.c = i3;
        this.d = l9xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cax)) {
            return false;
        }
        cax caxVar = (cax) obj;
        return this.f4035a == caxVar.f4035a && this.b == caxVar.b && this.c == caxVar.c && this.d == caxVar.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof cax) && (p6t0Var2 instanceof cax) && ((cax) p6t0Var).f4035a == ((cax) p6t0Var2).f4035a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f4035a) * 31, 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof cax) && (p6t0Var2 instanceof cax)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            cax caxVar = (cax) p6t0Var;
            cax caxVar2 = (cax) p6t0Var2;
            k9x.G(linkedHashSet, new aax(caxVar.b), new aax(caxVar2.b));
            k9x.G(linkedHashSet, new z9x(caxVar.c), new z9x(caxVar2.c));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strE = ua80.e(this.b, "NameResId(value=", Separators.RPAREN);
        String strE2 = ua80.e(this.c, "IconResId(value=", Separators.RPAREN);
        StringBuilder sbR = vqd.r(this.f4035a, "InfoTypeUiModel(id=", ", nameResid=", strE, ", iconResId=");
        sbR.append(strE2);
        sbR.append(", style=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
