package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/crm;", "La/um40;", "La/brm;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class crm extends um40 {
    public final fqj0 b;

    public crm(fqj0 fqj0Var) {
        fqj0Var.getClass();
        this.b = fqj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crm) && Intrinsics.d(this.b, ((crm) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        return new brm(this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        brm brmVar = (brm) lm40Var;
        brmVar.getClass();
        fqj0 fqj0Var = this.b;
        fqj0Var.getClass();
        fqj0 fqj0Var2 = brmVar.o;
        brmVar.o = fqj0Var;
        if (!Intrinsics.d(fqj0Var2, fqj0Var)) {
            c4m0 c4m0Var = brmVar.q;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            brmVar.q = null;
            if (brmVar.r) {
                brmVar.Z0();
            }
        }
        vfc.J(brmVar);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DsShimmerEffectItemNodeElement(config=" + this.b + Separators.RPAREN;
    }
}
