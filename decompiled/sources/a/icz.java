package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class icz implements hbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xcz f14558a;
    public final hcz b;
    public final g9z c;
    public final androidx.compose.foundation.lazy.layout.c d;

    public icz(xcz xczVar, hcz hczVar, g9z g9zVar, androidx.compose.foundation.lazy.layout.c cVar) {
        this.f14558a = xczVar;
        this.b = hczVar;
        this.c = g9zVar;
        this.d = cVar;
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
        return this.d.a(obj);
    }

    @Override // a.hbz
    public final Object d(int i) {
        Object objB = this.d.b(i);
        return objB == null ? this.b.c(i) : objB;
    }

    @Override // a.hbz
    public final void e(int i, Object obj, fet fetVar, int i2) {
        fetVar.g0(-462424778);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2 | (fetVar.i(obj) ? 32 : 16) | (fetVar.g(this) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            x9x.g(obj, i, this.f14558a.s, u1c.M(-824725566, new o6o(this, i, (byte) 21), fetVar), fetVar, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(this, i, obj, i2, (byte) 9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icz)) {
            return false;
        }
        return Intrinsics.d(this.b, ((icz) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
