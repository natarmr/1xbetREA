package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class vkv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37595a;
    public final int b;
    public final boolean c;
    public final rkv d;
    public final boolean e;

    public vkv(String str, int i, boolean z, rkv rkvVar, boolean z2) {
        this.f37595a = str;
        this.b = i;
        this.c = z;
        this.d = rkvVar;
        this.e = z2;
    }

    public static vkv c(vkv vkvVar, boolean z, boolean z2, int i) {
        String str = vkvVar.f37595a;
        int i2 = vkvVar.b;
        if ((i & 4) != 0) {
            z = vkvVar.c;
        }
        boolean z3 = z;
        rkv rkvVar = vkvVar.d;
        if ((i & 16) != 0) {
            z2 = vkvVar.e;
        }
        vkvVar.getClass();
        return new vkv(str, i2, z3, rkvVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkv)) {
            return false;
        }
        vkv vkvVar = (vkv) obj;
        return this.f37595a.equals(vkvVar.f37595a) && this.b == vkvVar.b && this.c == vkvVar.c && this.d == vkvVar.d && this.e == vkvVar.e;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + brm0.e(twn.a(this.b, this.f37595a.hashCode() * 31, 31), 31, this.c)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof vkv) && (p6t0Var2 instanceof vkv)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            vkv vkvVar = (vkv) p6t0Var;
            vkv vkvVar2 = (vkv) p6t0Var2;
            k9x.G(linkedHashSet, new skv(vkvVar.c), new skv(vkvVar2.c));
            k9x.G(linkedHashSet, new tkv(vkvVar.e), new tkv(vkvVar2.e));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strD = defpackage.c.d("Enable(value=", Separators.RPAREN, this.c);
        String strD2 = defpackage.c.d("Selected(value=", Separators.RPAREN, this.e);
        StringBuilder sbP = kng0.p(this.b, "HandShakeSettingsScreenUiModel(name=", this.f37595a, ", iconRes=", ", handShakeEnable=");
        sbP.append(strD);
        sbP.append(", shakeSettingsScreenType=");
        sbP.append(this.d);
        sbP.append(", selected=");
        return axq.n(sbP, strD2, Separators.RPAREN);
    }
}
