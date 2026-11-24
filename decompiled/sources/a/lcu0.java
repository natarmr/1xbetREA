package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lcu0 implements t6z {
    public final d7q0 b;
    public final int c;
    public final nls0 d;
    public final Function0 e;

    public lcu0(d7q0 d7q0Var, int i, nls0 nls0Var, Function0 function0) {
        this.b = d7q0Var;
        this.c = i;
        this.d = nls0Var;
        this.e = function0;
    }

    @Override // a.t6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pu90 pu90VarS = pj30Var.S(p4e.b(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(pu90VarS.b, p4e.h(j));
        return vj30.x(vj30Var, pu90VarS.f27604a, iMin, new g18(this, pu90VarS, iMin, (byte) 22));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lcu0) {
            lcu0 lcu0Var = (lcu0) obj;
            if (this.b == lcu0Var.b && this.c == lcu0Var.c && this.d.equals(lcu0Var.d) && Intrinsics.d(this.e, lcu0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + twn.a(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + Separators.RPAREN;
    }
}
