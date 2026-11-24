package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/zfx;", "La/um40;", "La/agx;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class zfx extends um40 {
    public final vhv0 b;

    public zfx(vhv0 vhv0Var) {
        this.b = vhv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zfx) {
            return Intrinsics.d(((zfx) obj).b, this.b);
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        return new agx(this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        agx agxVar = (agx) lm40Var;
        vhv0 vhv0Var = agxVar.q;
        vhv0 vhv0Var2 = this.b;
        if (Intrinsics.d(vhv0Var2, vhv0Var)) {
            return;
        }
        agxVar.q = vhv0Var2;
        agxVar.a1();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
