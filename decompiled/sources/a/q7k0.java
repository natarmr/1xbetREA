package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q7k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final urv f28254a;
    public final sw20 b;
    public final i0d c;

    public q7k0(urv urvVar, sw20 sw20Var, i0d i0dVar) {
        this.f28254a = urvVar;
        this.b = sw20Var;
        this.c = i0dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7k0)) {
            return false;
        }
        q7k0 q7k0Var = (q7k0) obj;
        return this.f28254a == q7k0Var.f28254a && this.b == q7k0Var.b && this.c == q7k0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f28254a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SizePresetModel(headerSize=" + this.f28254a + ", marketSize=" + this.b + ", coefficientSize=" + this.c + Separators.RPAREN;
    }
}
