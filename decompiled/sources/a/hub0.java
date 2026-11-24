package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class hub0 implements w6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w6k f13672a;
    public boolean b;
    public boolean c;
    public final k050 d = new k050();

    public hub0(w6k w6kVar) {
        this.f13672a = w6kVar;
    }

    @Override // a.w6k
    public final long B(float f) {
        return this.f13672a.B(f);
    }

    @Override // a.w6k
    public final int B0(long j) {
        return this.f13672a.B0(j);
    }

    @Override // a.w6k
    public final long G0(long j) {
        return this.f13672a.G0(j);
    }

    @Override // a.w6k
    public final int T(float f) {
        return this.f13672a.T(f);
    }

    @Override // a.w6k
    public final float X(long j) {
        return this.f13672a.X(j);
    }

    public final void a() {
        this.c = true;
        k050 k050Var = this.d;
        if (k050Var.a()) {
            k050Var.c(null);
        }
    }

    public final void b() {
        this.b = true;
        k050 k050Var = this.d;
        if (k050Var.a()) {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zje zjeVar) {
        fub0 fub0Var;
        if (zjeVar instanceof fub0) {
            fub0Var = (fub0) zjeVar;
            int i = fub0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fub0Var.k = i - Integer.MIN_VALUE;
            } else {
                fub0Var = new fub0(this, zjeVar);
            }
        } else {
            fub0Var = new fub0(this, zjeVar);
        }
        Object obj = fub0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fub0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            fub0Var.k = 1;
            if (this.d.d(fub0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        this.b = false;
        this.c = false;
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zje zjeVar) {
        gub0 gub0Var;
        if (zjeVar instanceof gub0) {
            gub0Var = (gub0) zjeVar;
            int i = gub0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gub0Var.k = i - Integer.MIN_VALUE;
            } else {
                gub0Var = new gub0(this, zjeVar);
            }
        } else {
            gub0Var = new gub0(this, zjeVar);
        }
        Object obj = gub0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gub0Var.k;
        k050 k050Var = this.d;
        if (i2 == 0) {
            z1x.P(obj);
            if (!this.b && !this.c) {
                gub0Var.k = 1;
                if (k050Var.d(gub0Var) == wneVar) {
                    return wneVar;
                }
            }
            return Boolean.valueOf(this.b);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        k050Var.c(null);
        return Boolean.valueOf(this.b);
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.f13672a.getDensity();
    }

    @Override // a.w6k
    public final long o(float f) {
        return this.f13672a.o(f);
    }

    @Override // a.w6k
    public final long p(long j) {
        return this.f13672a.p(j);
    }

    @Override // a.w6k
    public final float r0(int i) {
        return this.f13672a.r0(i);
    }

    @Override // a.w6k
    public final float s(long j) {
        return this.f13672a.s(j);
    }

    @Override // a.w6k
    public final float s0(float f) {
        return this.f13672a.s0(f);
    }

    @Override // a.w6k
    public final float v0() {
        return this.f13672a.v0();
    }

    @Override // a.w6k
    public final float w0(float f) {
        return this.f13672a.w0(f);
    }

    @Override // a.w6k
    public final long z(int i) {
        return this.f13672a.z(i);
    }
}
