package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kql0 extends lql0 {
    public final vql0 b;

    public kql0(vql0 vql0Var) {
        super(ae9.c);
        this.b = vql0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kql0) && this.b.equals(((kql0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Sport(model=" + this.b + Separators.RPAREN;
    }
}
