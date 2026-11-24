package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/dyj0;", "La/um40;", "La/eyj0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class dyj0 extends um40 {
    public final ugg0 b;
    public final kjj0 c;

    public dyj0(ugg0 ugg0Var, kjj0 kjj0Var) {
        this.b = ugg0Var;
        this.c = kjj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyj0)) {
            return false;
        }
        dyj0 dyj0Var = (dyj0) obj;
        return this.b.equals(dyj0Var.b) && this.c.equals(dyj0Var.c);
    }

    @Override // a.um40
    public final lm40 f() {
        eyj0 eyj0Var = new eyj0();
        eyj0Var.o = this.b;
        eyj0Var.p = this.c;
        return eyj0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        eyj0 eyj0Var = (eyj0) lm40Var;
        ugg0 ugg0Var = eyj0Var.o;
        ugg0 ugg0Var2 = this.b;
        boolean zD = Intrinsics.d(ugg0Var, ugg0Var2);
        kjj0 kjj0Var = this.c;
        if (!zD || !Intrinsics.d(eyj0Var.p, kjj0Var)) {
            eyj0Var.q = null;
        }
        eyj0Var.o = ugg0Var2;
        eyj0Var.p = kjj0Var;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.b + ", shadow=" + this.c + Separators.RPAREN;
    }
}
