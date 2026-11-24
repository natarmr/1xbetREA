package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"La/qel;", TokenNames.T, "La/um40;", "La/rel;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class qel<T> extends um40 {
    public final qv2 b;
    public final Function2 c;

    public qel(qv2 qv2Var, Function2 function2) {
        ma80 ma80Var = ma80.f21447a;
        this.b = qv2Var;
        this.c = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qel)) {
            return false;
        }
        qel qelVar = (qel) obj;
        if (!Intrinsics.d(this.b, qelVar.b) || this.c != qelVar.c) {
            return false;
        }
        ma80 ma80Var = ma80.f21447a;
        return true;
    }

    @Override // a.um40
    public final lm40 f() {
        ma80 ma80Var = ma80.f21447a;
        rel relVar = new rel();
        relVar.o = this.b;
        relVar.p = this.c;
        relVar.q = ma80Var;
        return relVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        rel relVar = (rel) lm40Var;
        relVar.o = this.b;
        relVar.p = this.c;
        relVar.q = ma80.f21447a;
    }

    public final int hashCode() {
        return ma80.f21447a.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
