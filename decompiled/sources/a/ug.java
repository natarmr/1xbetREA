package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class ug implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35599a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public ug(long j, boolean z, boolean z2, int i, int i2) {
        this.f35599a = j;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug)) {
            return false;
        }
        ug ugVar = (ug) obj;
        return this.f35599a == ugVar.f35599a && this.b == ugVar.b && this.c == ugVar.c && this.d == ugVar.d && this.e == ugVar.e;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof ug) && (p6t0Var2 instanceof ug) && ((ug) p6t0Var).f35599a == ((ug) p6t0Var2).f35599a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, brm0.e(brm0.e(Long.hashCode(this.f35599a) * 31, 31, this.b), 31, this.c), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof ug) && (p6t0Var2 instanceof ug)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ug ugVar = (ug) p6t0Var;
            ug ugVar2 = (ug) p6t0Var2;
            k9x.G(linkedHashSet, new sg(ugVar.d), new sg(ugVar2.d));
            k9x.G(linkedHashSet, new rg(ugVar.e), new rg(ugVar2.e));
            k9x.G(linkedHashSet, new qg(ugVar.c), new qg(ugVar2.c));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strD = defpackage.c.d("Checked(value=", Separators.RPAREN, this.c);
        String strE = ua80.e(this.d, "TitleColorRes(value=", Separators.RPAREN);
        String strE2 = ua80.e(this.e, "IconColorRes(value=", Separators.RPAREN);
        StringBuilder sbR = kng0.r(this.f35599a, "AccountUiModel(accountId=", ", lastItem=", this.b);
        f140.v(sbR, ", checked=", strD, ", titleColorRes=", strE);
        return rw2.o(sbR, ", iconColorRes=", strE2, Separators.RPAREN);
    }
}
