package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class tjp0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34060a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public tjp0(int i, String str, String str2, boolean z, boolean z2) {
        this.f34060a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjp0)) {
            return false;
        }
        tjp0 tjp0Var = (tjp0) obj;
        return this.f34060a == tjp0Var.f34060a && this.b.equals(tjp0Var.b) && this.c.equals(tjp0Var.c) && this.d == tjp0Var.d && this.e == tjp0Var.e;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof tjp0) && (p6t0Var2 instanceof tjp0) && ((tjp0) p6t0Var).f34060a == ((tjp0) p6t0Var2).f34060a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(twn.a(R.drawable.no_photo_new, ua80.b(ua80.b(Integer.hashCode(this.f34060a) * 31, 31, this.b), 31, this.c), 31), 31, this.d);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof tjp0) && (p6t0Var2 instanceof tjp0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            tjp0 tjp0Var = (tjp0) p6t0Var;
            tjp0 tjp0Var2 = (tjp0) p6t0Var2;
            k9x.G(linkedHashSet, new rjp0(tjp0Var.d), new rjp0(tjp0Var2.d));
            k9x.G(linkedHashSet, new qjp0(tjp0Var.e), new qjp0(tjp0Var2.e));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strD = defpackage.c.d("SelectedState(value=", Separators.RPAREN, this.d);
        String strD2 = defpackage.c.d("ActiveSelectorState(value=", Separators.RPAREN, this.e);
        StringBuilder sbR = vqd.r(this.f34060a, "TeamSelectorUiModel(clId=", ", title=", this.b, ", image=");
        twn.w(R.drawable.no_photo_new, this.c, ", placeholder=", ", selected=", sbR);
        return ua80.m(sbR, strD, ", selectorActive=", strD2, Separators.RPAREN);
    }
}
