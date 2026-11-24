package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class j16 implements x8a0 {
    public final byte b;
    public tjf0 d;
    public int e;
    public a4a0 f;
    public l9o0 g;
    public byte h;
    public ixg0 i;
    public androidx.media3.common.b[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public vn30 q;
    public syj s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15717a = new Object();
    public final hsj c = new hsj();
    public long m = Long.MIN_VALUE;
    public bmq0 p = bmq0.f2849a;
    public long r = -9223372036854775807L;

    /* JADX WARN: Multi-variable type inference failed */
    public j16(int i) {
        this.b = i;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static boolean n(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public final void A(androidx.media3.common.b[] bVarArr, ixg0 ixg0Var, long j, long j2, vn30 vn30Var) {
        x0x.K(!this.n);
        this.i = ixg0Var;
        this.q = vn30Var;
        G();
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = bVarArr;
        this.k = j2;
        w(bVarArr, j, j2, vn30Var);
    }

    public final void B(long j, boolean z, boolean z2) {
        this.n = false;
        this.l = j;
        this.m = j;
        if (!z2) {
            ixg0 ixg0Var = this.i;
            ixg0Var.getClass();
            z2 = ixg0Var.d(j - this.k) != 0;
        }
        r(j, z, z2);
    }

    public int D(androidx.media3.common.b bVar) {
        return "application/x-camera-motion".equals(bVar.p) ? f(4, 0, 0, 0) : f(0, 0, 0, 0);
    }

    public int E() {
        return 0;
    }

    public boolean F(long j) {
        return false;
    }

    public final void G() {
        vn30 vn30Var;
        if (this.p.p() || (vn30Var = this.q) == null) {
            this.r = -9223372036854775807L;
            return;
        }
        int iB = this.p.b(vn30Var.f37698a);
        if (iB == -1) {
            this.r = -9223372036854775807L;
            return;
        }
        this.r = this.p.f(iB, new amq0(), false).d;
        int i = vn30Var.b;
        if (i != -1) {
            this.r = uo.c.a(i).e[vn30Var.c];
            return;
        }
        int i2 = vn30Var.e;
        if (i2 != -1) {
            uo.c.a(i2).getClass();
            this.r = 0L;
        }
    }

    public final dlo g(Exception exc, androidx.media3.common.b bVar, boolean z, int i) {
        int iD;
        if (bVar == null || this.o) {
            iD = 4;
        } else {
            this.o = true;
            try {
                iD = D(bVar) & 7;
                this.o = false;
            } catch (dlo unused) {
                this.o = false;
                iD = 4;
            } catch (Throwable th) {
                this.o = false;
                throw th;
            }
        }
        return new dlo(1, exc, i, k(), this.e, bVar, bVar == null ? 4 : iD, this.q, z);
    }

    public long i(long j, long j2) {
        if (this.h == 1) {
            return (o() || m()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public bm30 j() {
        return null;
    }

    public String k() {
        return "CameraMotionRenderer";
    }

    public final boolean l() {
        return this.m == Long.MIN_VALUE;
    }

    public boolean m() {
        return l();
    }

    public boolean o() {
        return true;
    }

    public abstract void p();

    public abstract void r(long j, boolean z, boolean z2);

    public final int y(hsj hsjVar, wkj wkjVar, int i) {
        boolean z = (i & 1) != 0;
        ixg0 ixg0Var = this.i;
        ixg0Var.getClass();
        int iB = ixg0Var.b(hsjVar, wkjVar, i);
        if (iB == -4) {
            if (wkjVar.m(4)) {
                if (!z) {
                    this.m = Long.MIN_VALUE;
                }
                return this.n ? -4 : -3;
            }
            long j = wkjVar.i + this.k;
            wkjVar.i = j;
            if (!z) {
                this.m = Math.max(this.m, j);
                return iB;
            }
        } else if (iB == -5) {
            androidx.media3.common.b bVar = (androidx.media3.common.b) hsjVar.b;
            bVar.getClass();
            long j2 = bVar.u;
            if (j2 != Long.MAX_VALUE) {
                awq awqVarA = bVar.a();
                awqVarA.t = j2 + this.k;
                hsjVar.b = new androidx.media3.common.b(awqVarA);
            }
        }
        return iB;
    }

    public abstract void z(long j, long j2);

    public void h() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void C(float f, float f2) {
    }

    @Override // a.x8a0
    public void c(int i, Object obj) {
    }

    public void q(boolean z, boolean z2) {
    }

    public void w(androidx.media3.common.b[] bVarArr, long j, long j2, vn30 vn30Var) {
    }
}
