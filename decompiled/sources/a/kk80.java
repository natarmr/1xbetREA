package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kk80 implements hbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xk80 f18424a;
    public final androidx.compose.foundation.lazy.layout.b b;
    public final androidx.compose.foundation.lazy.layout.c c;

    public kk80(xk80 xk80Var, jk80 jk80Var, androidx.compose.foundation.lazy.layout.c cVar) {
        this.f18424a = xk80Var;
        this.b = jk80Var;
        this.c = cVar;
    }

    @Override // a.hbz
    public final int b() {
        return this.b.b().f45232a;
    }

    @Override // a.hbz
    public final int c(Object obj) {
        return this.c.a(obj);
    }

    @Override // a.hbz
    public final Object d(int i) {
        Object objB = this.c.b(i);
        return objB == null ? this.b.c(i) : objB;
    }

    @Override // a.hbz
    public final void e(int i, Object obj, fet fetVar, int i2) {
        int i3;
        Object obj2;
        fet fetVar2;
        fetVar.g0(-1201380429);
        int i4 = (fetVar.e(i) ? 4 : 2) | i2 | (fetVar.i(obj) ? 32 : 16) | (fetVar.g(this) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            fetVar2 = fetVar;
            x9x.g(obj2, i3, this.f18424a.A, u1c.M(1142237095, new nb50(this, i, (byte) 5), fetVar), fetVar2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680(this, i3, obj2, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk80)) {
            return false;
        }
        return Intrinsics.d(this.b, ((kk80) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
