package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class kr1 extends lr1 {
    public final uc0 c;

    public kr1() {
        long id = nw80.t.getId();
        gz8 gz8Var = gz8.f12169a;
        uc0 uc0Var = new uc0(0, id, Long.MIN_VALUE, "", null, "", iun.f15405a, false, false);
        super(mr1.c, new km1(uc0Var));
        this.c = uc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr1) && this.c.equals(((kr1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Providers(brandItemModel=" + this.c + Separators.RPAREN;
    }
}
