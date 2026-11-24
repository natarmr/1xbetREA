package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/r7a;", "La/um40;", "La/q7a;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final /* data */ class r7a extends um40 {
    public final x7a b;

    public r7a(x7a x7aVar) {
        x7aVar.getClass();
        this.b = x7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7a) && Intrinsics.d(this.b, ((r7a) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        return new q7a(this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        q7a q7aVar = (q7a) lm40Var;
        q7aVar.getClass();
        x7a x7aVar = this.b;
        x7aVar.getClass();
        p7m0 p7m0Var = q7aVar.o;
        p7m0Var.getClass();
        p7m0Var.o(null, x7aVar);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CapturableModifierNodeElement(controller=" + this.b + Separators.RPAREN;
    }
}
