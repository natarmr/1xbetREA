package a;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class czj implements pfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ueu0 f5226a;
    public final veu0 b;
    public final afu0 c;
    public final ArrayDeque d;
    public final fiq e;
    public Surface f;
    public androidx.media3.common.b g;
    public long h;
    public nfu0 i;
    public Executor j;
    public seu0 k;

    public czj(ueu0 ueu0Var, veu0 veu0Var, l9o0 l9o0Var) {
        this.f5226a = ueu0Var;
        this.b = veu0Var;
        ueu0Var.k = l9o0Var;
        fiq fiqVar = new fiq(new z9f(ueu0Var, (byte) 12));
        this.e = fiqVar;
        fhj fhjVar = new fhj();
        fhjVar.b = this;
        this.c = new afu0(fhjVar, ueu0Var, veu0Var, fiqVar);
        this.d = new ArrayDeque();
        this.g = new androidx.media3.common.b(new awq());
        this.h = -9223372036854775807L;
        this.i = nfu0.f23455a;
        this.j = new ew3((byte) 2);
        this.k = new azj();
    }

    @Override // a.pfu0
    public final boolean a() {
        afu0 afu0Var = this.c;
        long j = afu0Var.k;
        return j != -9223372036854775807L && afu0Var.j == j;
    }

    @Override // a.pfu0
    public final boolean b() {
        return true;
    }

    @Override // a.pfu0
    public final boolean c(long j, tm30 tm30Var) {
        this.d.add(tm30Var);
        afu0 afu0Var = this.c;
        z55 z55Var = afu0Var.f;
        int i = z55Var.d;
        long[] jArr = (long[]) z55Var.f;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                v4i0.e();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = z55Var.b;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) z55Var.f, 0, jArr2, i3, i2);
            z55Var.b = 0;
            int i4 = z55Var.d;
            z55Var.c = i4 - 1;
            z55Var.f = jArr2;
            z55Var.e = length - 1;
            i = i4;
            jArr = jArr2;
        }
        int i5 = (z55Var.c + 1) & z55Var.e;
        z55Var.c = i5;
        jArr[i5] = j;
        z55Var.d = i + 1;
        afu0Var.i = j;
        afu0Var.k = -9223372036854775807L;
        this.j.execute(new ccf(this, (byte) 11));
        return true;
    }

    @Override // a.pfu0
    public final void d(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // a.pfu0
    public final void e() {
        afu0 afu0Var = this.c;
        long j = afu0Var.i;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            afu0Var.i = Long.MIN_VALUE;
            afu0Var.j = Long.MIN_VALUE;
        }
        afu0Var.k = j;
    }

    @Override // a.pfu0
    public final void f(androidx.media3.common.b bVar, long j, int i, List list) {
        x0x.K(list.isEmpty());
        int i2 = bVar.w;
        int i3 = bVar.x;
        androidx.media3.common.b bVar2 = this.g;
        int i4 = bVar2.w;
        afu0 afu0Var = this.c;
        if (i2 != i4 || i3 != bVar2.x) {
            tyc tycVar = afu0Var.d;
            long j2 = afu0Var.i;
            tycVar.f(new qfu0(i2, i3), j2 == -9223372036854775807L ? 0L : j2 + 1);
        }
        float f = bVar.B;
        if (f != this.g.B) {
            fiq fiqVar = this.e;
            fiqVar.f = f;
            fiqVar.f9601a.c();
            fiqVar.b.c();
            fiqVar.c = false;
            fiqVar.d = -9223372036854775807L;
            fiqVar.e = 0;
            fiqVar.c();
        }
        this.g = bVar;
        if (j != this.h) {
            if (afu0Var.f.d == 0) {
                afu0Var.b.e(i);
                afu0Var.m = j;
            } else {
                tyc tycVar2 = afu0Var.e;
                long j3 = afu0Var.i;
                tycVar2.f(Long.valueOf(j), j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1);
            }
            this.h = j;
        }
    }

    @Override // a.pfu0
    public final void g(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // a.pfu0
    public final Surface getInputSurface() {
        Surface surface = this.f;
        surface.getClass();
        return surface;
    }

    @Override // a.pfu0
    public final boolean h(boolean z) {
        return this.f5226a.b(z);
    }

    @Override // a.pfu0
    public final void i(sm30 sm30Var) {
        this.i = sm30Var;
        this.j = ank.f1158a;
    }

    @Override // a.pfu0
    public final void j() {
        throw new UnsupportedOperationException();
    }

    @Override // a.pfu0
    public final boolean k(androidx.media3.common.b bVar) {
        return true;
    }

    @Override // a.pfu0
    public final void l(Surface surface, e7k0 e7k0Var) {
        this.f = surface;
        this.f5226a.f(surface);
    }

    @Override // a.pfu0
    public final void m() {
        ueu0 ueu0Var = this.f5226a;
        if (ueu0Var.e == 0) {
            ueu0Var.e = 1;
        }
    }

    @Override // a.pfu0
    public final void n() {
        this.b.b();
        ueu0 ueu0Var = this.f5226a;
        ueu0Var.d = false;
        ueu0Var.h = -9223372036854775807L;
        zeu0 zeu0Var = ueu0Var.b;
        zeu0Var.d = false;
        weu0 weu0Var = zeu0Var.c;
        if (weu0Var != null) {
            weu0Var.b();
        }
        zeu0Var.a();
    }

    @Override // a.pfu0
    public final void o() {
        this.b.b();
        this.f5226a.d();
    }

    @Override // a.pfu0
    public final void p(int i) {
        zeu0 zeu0Var = this.f5226a.b;
        if (zeu0Var.i == i) {
            return;
        }
        zeu0Var.i = i;
        zeu0Var.c(true);
    }

    @Override // a.pfu0
    public final void q(float f) {
        this.f5226a.g(f);
    }

    @Override // a.pfu0
    public final void r() {
        this.f = null;
        this.f5226a.f(null);
    }

    @Override // a.pfu0
    public final void s(boolean z) {
        if (z) {
            ueu0 ueu0Var = this.f5226a;
            ueu0Var.b.b();
            ueu0Var.f = -9223372036854775807L;
            ueu0Var.e = Math.min(ueu0Var.e, 1);
            ueu0Var.h = -9223372036854775807L;
            ueu0Var.m = false;
        }
        this.b.b();
        afu0 afu0Var = this.c;
        tyc tycVar = afu0Var.d;
        z55 z55Var = afu0Var.f;
        z55Var.b = 0;
        z55Var.c = -1;
        z55Var.d = 0;
        afu0Var.i = -9223372036854775807L;
        afu0Var.j = -9223372036854775807L;
        afu0Var.k = -9223372036854775807L;
        tyc tycVar2 = afu0Var.e;
        if (tycVar2.f0() > 0) {
            x0x.A(tycVar2.f0() > 0);
            while (tycVar2.f0() > 1) {
                tycVar2.X();
            }
            Object objX = tycVar2.X();
            objX.getClass();
            afu0Var.m = ((Long) objX).longValue();
        }
        if (tycVar.f0() > 0) {
            x0x.A(tycVar.f0() > 0);
            while (tycVar.f0() > 1) {
                tycVar.X();
            }
            Object objX2 = tycVar.X();
            objX2.getClass();
            tycVar.f((qfu0) objX2, 0L);
        }
        this.d.clear();
    }

    @Override // a.pfu0
    public final void t(long j, long j2) throws ofu0 {
        try {
            this.c.a(j, j2);
        } catch (dlo e) {
            throw new ofu0(e, this.g);
        }
    }

    @Override // a.pfu0
    public final void u(seu0 seu0Var) {
        this.k = seu0Var;
    }

    @Override // a.pfu0
    public final void v(boolean z) {
        this.f5226a.c(z);
    }

    @Override // a.pfu0
    public final void release() {
    }
}
