package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vqo implements p6t0 {
    public static final gil0 e = new gil0(0, null, null, new zgl0(), 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37864a;
    public final int b;
    public final String c;
    public final uqo d;

    public vqo(boolean z, int i, String str, uqo uqoVar) {
        this.f37864a = z;
        this.b = i;
        this.c = str;
        this.d = uqoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqo)) {
            return false;
        }
        vqo vqoVar = (vqo) obj;
        return this.f37864a == vqoVar.f37864a && this.b == vqoVar.b && this.c.equals(vqoVar.c) && this.d.equals(vqoVar.d);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof vqo) || !(p6t0Var2 instanceof vqo)) {
            return false;
        }
        vqo vqoVar = (vqo) p6t0Var;
        vqo vqoVar2 = (vqo) p6t0Var2;
        return Intrinsics.d(vqoVar.d.f36128a.b, vqoVar2.d.f36128a.b) && vqoVar.f37864a == vqoVar2.f37864a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.d.f36128a.hashCode() + ua80.b(twn.a(this.b, Boolean.hashCode(this.f37864a) * 31, 31), 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof vqo) || !(p6t0Var2 instanceof vqo)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k9x.G(linkedHashSet, ((vqo) p6t0Var).d, ((vqo) p6t0Var2).d);
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "ExpressFooterItem(isLive=", ", expressPosition=", ", title=", this.f37864a);
        sbT.append(this.c);
        sbT.append(", sportMarketDsModel=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
