package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class q33 implements vhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f28030a;
    public final String b;
    public final pz40 c = androidx.compose.runtime.e.e(pfx.e);
    public final pz40 d = androidx.compose.runtime.e.e(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public q33(int i, String str) {
        this.f28030a = i;
        this.b = str;
    }

    @Override // a.vhv0
    public final int a(w6k w6kVar, k6z k6zVar) {
        return e().f26926a;
    }

    @Override // a.vhv0
    public final int b(w6k w6kVar) {
        return e().d;
    }

    @Override // a.vhv0
    public final int c(w6k w6kVar, k6z k6zVar) {
        return e().c;
    }

    @Override // a.vhv0
    public final int d(w6k w6kVar) {
        return e().b;
    }

    public final pfx e() {
        return (pfx) ((hgk0) this.c).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q33) {
            return this.f28030a == ((q33) obj).f28030a;
        }
        return false;
    }

    public final void f(boolean z) {
        ((hgk0) this.d).setValue(Boolean.valueOf(z));
    }

    public final void g(xiv0 xiv0Var, int i) {
        short s = this.f28030a;
        if (i == 0 || (i & s) != 0) {
            ((hgk0) this.c).setValue(xiv0Var.f40966a.i(s));
            f(xiv0Var.f40966a.u(s));
        }
    }

    public final int hashCode() {
        return this.f28030a;
    }

    public final String toString() {
        int i = e().f26926a;
        int i2 = e().b;
        int i3 = e().c;
        int i4 = e().d;
        StringBuilder sb = new StringBuilder(this.b);
        sb.append(Separators.LPAREN);
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        rw2.s(i3, i4, ", ", ", ", sb);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
