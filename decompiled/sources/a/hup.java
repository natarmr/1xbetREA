package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f13692a;
    public final j9m0 b;
    public final utp c;
    public final boolean d;

    public hup(zdm0 zdm0Var, j9m0 j9m0Var, utp utpVar, boolean z) {
        this.f13692a = zdm0Var;
        this.b = j9m0Var;
        this.c = utpVar;
        this.d = z;
    }

    public static hup a(hup hupVar, zdm0 zdm0Var, j9m0 j9m0Var, utp utpVar, int i) {
        if ((i & 1) != 0) {
            zdm0Var = hupVar.f13692a;
        }
        if ((i & 2) != 0) {
            j9m0Var = hupVar.b;
        }
        if ((i & 4) != 0) {
            utpVar = hupVar.c;
        }
        boolean z = hupVar.d;
        hupVar.getClass();
        return new hup(zdm0Var, j9m0Var, utpVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hup)) {
            return false;
        }
        hup hupVar = (hup) obj;
        return this.f13692a.equals(hupVar.f13692a) && this.b.equals(hupVar.b) && this.c.equals(hupVar.c) && this.d == hupVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + w6x.h(this.b, this.f13692a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "FightStatisticState(statisticHeaderUiModel=" + this.f13692a + ", backgroundUiModel=" + this.b + ", fightStatisticContentState=" + this.c + ", rtlSupport=" + this.d + Separators.RPAREN;
    }
}
