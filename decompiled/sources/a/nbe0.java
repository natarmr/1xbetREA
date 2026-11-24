package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class nbe0 implements s7k0 {
    public final f7k0 b;

    public nbe0(f7k0 f7k0Var) {
        this.b = f7k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbe0) && this.b.equals(((nbe0) obj).b);
    }

    @Override // a.s7k0
    public final Object f(yje yjeVar) {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.b + Separators.RPAREN;
    }
}
