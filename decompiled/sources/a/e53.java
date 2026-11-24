package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"La/e53;", TokenNames.S, "La/um40;", "La/h53;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e53<S> extends um40 {
    public final vls0 b;
    public final pz40 c;
    public final i53 d;

    public e53(vls0 vls0Var, pz40 pz40Var, i53 i53Var) {
        this.b = vls0Var;
        this.c = pz40Var;
        this.d = i53Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e53)) {
            return false;
        }
        e53 e53Var = (e53) obj;
        return Intrinsics.d(e53Var.b, this.b) && e53Var.c.equals(this.c);
    }

    @Override // a.um40
    public final lm40 f() {
        return new h53(this.b, this.c, this.d);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        h53 h53Var = (h53) lm40Var;
        h53Var.p = this.b;
        h53Var.q = this.c;
        h53Var.r = this.d;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        vls0 vls0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (vls0Var != null ? vls0Var.hashCode() : 0)) * 31);
    }
}
