package defpackage;

import a.lm40;
import a.um40;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld;", "La/um40;", "Lf;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
final /* data */ class d extends um40 {
    public final boolean b;

    public d(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.b == ((d) obj).b && Float.compare(1.08f, 1.08f) == 0;
    }

    @Override // a.um40
    public final lm40 f() {
        f fVar = new f();
        fVar.o = this.b;
        fVar.p = 1.08f;
        fVar.q = (short) 300;
        return fVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        f fVar = (f) lm40Var;
        fVar.getClass();
        boolean z = fVar.o;
        boolean z2 = this.b;
        boolean z3 = (z == z2 && fVar.p == 1.08f && fVar.q == 300) ? false : true;
        fVar.o = z2;
        fVar.p = 1.08f;
        fVar.q = (short) 300;
        if (z3 && fVar.n) {
            fVar.Z0();
        }
    }

    public final int hashCode() {
        return Integer.hashCode(300) + c.a(Boolean.hashCode(this.b) * 31, 1.08f, 31);
    }

    public final String toString() {
        return c.d("HeartbeatElement(isBeating=", ", maxScale=1.08, durationMillis=300)", this.b);
    }
}
