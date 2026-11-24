package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class kq20 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18700a;
    public final ArrayList b;

    public kq20(int i, ArrayList arrayList) {
        this.f18700a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq20)) {
            return false;
        }
        kq20 kq20Var = (kq20) obj;
        return this.f18700a == kq20Var.f18700a && this.b.equals(kq20Var.b);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof kq20) && (p6t0Var2 instanceof kq20);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "MARBLE_GAMES_HEADER_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.b.hashCode() + twn.a(this.f18700a, rw2.b(-1553292557, 31, 1L), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof kq20) || !(p6t0Var2 instanceof kq20)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        kq20 kq20Var = (kq20) p6t0Var;
        kq20 kq20Var2 = (kq20) p6t0Var2;
        k9x.G(arrayList, new hq20(kq20Var.f18700a), new hq20(kq20Var2.f18700a));
        k9x.G(arrayList, new iq20(kq20Var.b), new iq20(kq20Var2.b));
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        return b1j.k("MarbleGamesHeaderUiModel(key=MARBLE_GAMES_HEADER_KEY, id=1, background=", ua80.e(this.f18700a, "Background(value=", Separators.RPAREN), ", roundList=", hne.o("RoundList(value=", Separators.RPAREN, this.b), Separators.RPAREN);
    }
}
