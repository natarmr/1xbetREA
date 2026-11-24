package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/dqq;", "La/um40;", "La/fqq;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class dqq extends um40 {
    public final cqq b;

    public dqq(cqq cqqVar) {
        this.b = cqqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqq) && Intrinsics.d(this.b, ((dqq) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        fqq fqqVar = new fqq();
        fqqVar.o = this.b;
        return fqqVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        fqq fqqVar = (fqq) lm40Var;
        fqqVar.o.f4808a.j(fqqVar);
        cqq cqqVar = this.b;
        fqqVar.o = cqqVar;
        cqqVar.f4808a.b(fqqVar);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.b + Separators.RPAREN;
    }
}
