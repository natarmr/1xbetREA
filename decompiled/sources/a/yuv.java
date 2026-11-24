package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/yuv;", "La/um40;", "La/avv;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class yuv extends um40 {
    public final y9q0 b;
    public final boolean c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public yuv(y9q0 y9q0Var, int i, int i2) {
        this.b = y9q0Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuv)) {
            return false;
        }
        yuv yuvVar = (yuv) obj;
        return Intrinsics.d(this.b, yuvVar.b) && this.c == yuvVar.c && this.d == yuvVar.d;
    }

    @Override // a.um40
    public final lm40 f() {
        avv avvVar = new avv();
        avvVar.o = this.b;
        avvVar.p = this.c;
        avvVar.q = this.d;
        avvVar.s = -1;
        avvVar.t = -1;
        return avvVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        avv avvVar = (avv) lm40Var;
        y9q0 y9q0Var = avvVar.o;
        y9q0 y9q0Var2 = this.b;
        boolean zD = Intrinsics.d(y9q0Var, y9q0Var2);
        boolean z = this.c;
        int i = this.d;
        if (zD && avvVar.p == z && avvVar.q == i) {
            return;
        }
        avvVar.o = y9q0Var2;
        avvVar.p = z;
        avvVar.q = i;
        avvVar.u = afn0.A(y9q0Var2, vcc.Z(avvVar).A);
        avvVar.r = true;
        n7x.I(avvVar);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + this.d;
    }
}
