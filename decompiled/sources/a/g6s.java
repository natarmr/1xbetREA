package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class g6s implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10783a;
    public final boolean b;

    public g6s(int i, boolean z) {
        this.f10783a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6s)) {
            return false;
        }
        g6s g6sVar = (g6s) obj;
        return this.f10783a == g6sVar.f10783a && this.b == g6sVar.b;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof g6s) && (p6t0Var2 instanceof g6s) && ((g6s) p6t0Var).f10783a == ((g6s) p6t0Var2).f10783a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f10783a) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof g6s) && (p6t0Var2 instanceof g6s)) {
            ArrayList arrayList = new ArrayList();
            g6s g6sVar = (g6s) p6t0Var;
            g6s g6sVar2 = (g6s) p6t0Var2;
            k9x.G(arrayList, new d6s(g6sVar.f10783a), new d6s(g6sVar2.f10783a));
            k9x.G(arrayList, new e6s(g6sVar.b), new e6s(g6sVar2.b));
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    public final String toString() {
        return b1j.k("GameCountItemUiModel(count=", ua80.e(this.f10783a, "Count(value=", Separators.RPAREN), ", selected=", defpackage.c.d("Selected(value=", Separators.RPAREN, this.b), Separators.RPAREN);
    }
}
