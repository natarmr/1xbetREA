package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ydz implements hbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mez f42463a;
    public final xdz b;
    public final androidx.compose.foundation.lazy.layout.c c;

    public ydz(mez mezVar, xdz xdzVar, androidx.compose.foundation.lazy.layout.c cVar) {
        this.f42463a = mezVar;
        this.b = xdzVar;
        this.c = cVar;
    }

    @Override // a.hbz
    public final Object a(int i) {
        return this.b.a(i);
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
        fetVar.g0(89098518);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2 | (fetVar.i(obj) ? 32 : 16) | (fetVar.g(this) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            x9x.g(obj, i, this.f42463a.s, u1c.M(608834466, new o6o(this, i, (byte) 22), fetVar), fetVar, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(this, i, obj, i2, (byte) 10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydz)) {
            return false;
        }
        return Intrinsics.d(this.b, ((ydz) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
