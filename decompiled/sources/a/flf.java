package a;

import android.gov.nist.core.Separators;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class flf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f9734a;
    public final String b;
    public final ank0 c;

    public flf(ank0 ank0Var, ank0 ank0Var2, String str) {
        this.f9734a = ank0Var;
        this.b = str;
        this.c = ank0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flf)) {
            return false;
        }
        flf flfVar = (flf) obj;
        return this.f9734a.equals(flfVar.f9734a) && this.b.equals(flfVar.b) && this.c.equals(flfVar.c);
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
        return this.c.f1159a.hashCode() + ua80.b(this.f9734a.f1159a.hashCode() * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        return "Cs2GameLogBombUiModel(player=" + this.f9734a + ", bombIcon=" + this.b + ", bombText=" + this.c + Separators.RPAREN;
    }
}
