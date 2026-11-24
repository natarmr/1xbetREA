package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ylw implements t6z {
    public final d7q0 b;
    public final int c;
    public final nls0 d;
    public final Function0 e;

    public ylw(d7q0 d7q0Var, int i, nls0 nls0Var, Function0 function0) {
        this.b = d7q0Var;
        this.c = i;
        this.d = nls0Var;
        this.e = function0;
    }

    @Override // a.t6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        long j2;
        if (pj30Var.P(p4e.h(j)) < p4e.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = p4e.b(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        pu90 pu90VarS = pj30Var.S(j);
        int iMin = Math.min(pu90VarS.f27604a, p4e.i(j2));
        return vj30.x(vj30Var, iMin, pu90VarS.b, new ec3(this, vj30Var, pu90VarS, iMin, (byte) 9));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ylw) {
            ylw ylwVar = (ylw) obj;
            if (this.b == ylwVar.b && this.c == ylwVar.c && this.d.equals(ylwVar.d) && Intrinsics.d(this.e, ylwVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + twn.a(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + Separators.RPAREN;
    }
}
