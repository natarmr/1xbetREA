package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bgx implements hh80 {
    public final vhv0 b;
    public final w6k c;

    public bgx(vhv0 vhv0Var, w6k w6kVar) {
        this.b = vhv0Var;
        this.c = w6kVar;
    }

    @Override // a.hh80
    public final float a() {
        vhv0 vhv0Var = this.b;
        w6k w6kVar = this.c;
        return w6kVar.r0(vhv0Var.b(w6kVar));
    }

    @Override // a.hh80
    public final float b(k6z k6zVar) {
        vhv0 vhv0Var = this.b;
        w6k w6kVar = this.c;
        return w6kVar.r0(vhv0Var.a(w6kVar, k6zVar));
    }

    @Override // a.hh80
    public final float c(k6z k6zVar) {
        vhv0 vhv0Var = this.b;
        w6k w6kVar = this.c;
        return w6kVar.r0(vhv0Var.c(w6kVar, k6zVar));
    }

    @Override // a.hh80
    public final float d() {
        vhv0 vhv0Var = this.b;
        w6k w6kVar = this.c;
        return w6kVar.r0(vhv0Var.d(w6kVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgx)) {
            return false;
        }
        bgx bgxVar = (bgx) obj;
        return Intrinsics.d(this.b, bgxVar.b) && Intrinsics.d(this.c, bgxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.b + ", density=" + this.c + Separators.RPAREN;
    }
}
