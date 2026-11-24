package a;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class z0v0 implements y0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final huo f43587a;
    public final ncs0 b;
    public final b1v0 c;
    public final androidx.media3.common.b d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public z0v0(huo huoVar, ncs0 ncs0Var, b1v0 b1v0Var, String str, int i) throws kq80 {
        this.f43587a = huoVar;
        this.b = ncs0Var;
        this.c = b1v0Var;
        int i2 = b1v0Var.f1826a;
        int i3 = b1v0Var.b;
        int i4 = (b1v0Var.d * i2) / 8;
        int i5 = b1v0Var.c;
        if (i5 != i4) {
            throw kq80.a("Expected block size: " + i4 + "; got: " + i5, null);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.e = iMax;
        awq awqVar = new awq();
        awqVar.n = mg40.n("audio/wav");
        awqVar.o = mg40.n(str);
        awqVar.i = i7;
        awqVar.j = i7;
        awqVar.p = iMax;
        awqVar.I = i2;
        int i8 = b1v0Var.f;
        awqVar.J = i8 == 0 ? -1 : i8 << 2;
        awqVar.K = i3;
        awqVar.L = i;
        this.d = new androidx.media3.common.b(awqVar);
    }

    @Override // a.y0v0
    public final void a(int i, long j) {
        c1v0 c1v0Var = new c1v0(this.c, 1, i, j);
        this.f43587a.f(c1v0Var);
        androidx.media3.common.b bVar = this.d;
        ncs0 ncs0Var = this.b;
        ncs0Var.c(bVar);
        ncs0Var.f(c1v0Var.e);
    }

    @Override // a.y0v0
    public final boolean b(guo guoVar, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iE = this.b.e(guoVar, (int) Math.min(i2 - i, j2), true);
            if (iE == -1) {
                j2 = 0;
            } else {
                this.g += iE;
                j2 -= (long) iE;
            }
        }
        b1v0 b1v0Var = this.c;
        int i3 = b1v0Var.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = b1v0Var.b;
            String str = vtt0.f38024a;
            long jT = j3 + vtt0.T(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.b(jT, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // a.y0v0
    public final void c(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }
}
