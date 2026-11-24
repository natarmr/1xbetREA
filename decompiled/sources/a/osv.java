package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class osv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f25800a;
    public final String b;
    public final int c;

    /* JADX WARN: Type inference failed for: r3v1, types: [byte, int] */
    public osv(String str, int i, long j) {
        this.f25800a = (int) j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osv)) {
            return false;
        }
        osv osvVar = (osv) obj;
        return ((long) this.f25800a) == ((long) osvVar.f25800a) && this.b.equals(osvVar.b) && this.c == osvVar.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof osv) && (p6t0Var2 instanceof osv) && ((long) ((osv) p6t0Var).f25800a) == ((long) ((osv) p6t0Var2).f25800a);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(brm0.e(Long.hashCode(this.f25800a) * 31, 31, false), 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof osv) || !(p6t0Var2 instanceof osv)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        osv osvVar = (osv) p6t0Var;
        osv osvVar2 = (osv) p6t0Var2;
        k9x.G(arrayList, new isv(osvVar.b), new isv(osvVar2.b));
        k9x.G(arrayList, new jsv(osvVar.c), new jsv(osvVar2.c));
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        return rw2.o(axq.o(this.f25800a, "HeaderUiModel(id=", ", needGreedManager=false, name=", kng0.l("Name(value=", this.b, Separators.RPAREN)), ", textColor=", ua80.e(this.c, "TextColor(value=", Separators.RPAREN), Separators.RPAREN);
    }
}
