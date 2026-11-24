package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class f3d {
    public static final v0h0 j = new v0h0(new y2d(0), new sfc(12));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk0 f8856a = androidx.compose.runtime.e.a(0.0f);
    public final pz40 b = androidx.compose.runtime.e.e(Boolean.FALSE);
    public final zbk c = jgk0.b(new s82(this, 4));
    public final agk0 d = androidx.compose.runtime.e.a(Float.MAX_VALUE);
    public final ywj e = new ywj(new y1d(this, 3));
    public boolean f = true;
    public final a8z g;
    public final a8z h;
    public int i;

    public f3d() {
        s82 s82Var = new s82(this, (byte) 5);
        wez wezVar = wez.b;
        this.g = maz.a(wezVar, s82Var);
        this.h = maz.a(wezVar, new s82(this, (byte) 6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        z2d z2dVar;
        if (zjeVar instanceof z2d) {
            z2dVar = (z2d) zjeVar;
            int i = z2dVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z2dVar.k = i - Integer.MIN_VALUE;
            } else {
                z2dVar = new z2d(this, zjeVar);
            }
        } else {
            z2dVar = new z2d(this, zjeVar);
        }
        Object obj = z2dVar.i;
        wne wneVar = wne.f39444a;
        int i2 = z2dVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            float fL = this.f8856a.l() - this.d.l();
            nul0 nul0VarG0 = ro4.g0(0.0f, 280.0f, null, 5);
            z2dVar.k = 1;
            if (bww.x(this.e, fL, nul0VarG0, z2dVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        a3d a3dVar;
        if (zjeVar instanceof a3d) {
            a3dVar = (a3d) zjeVar;
            int i = a3dVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a3dVar.k = i - Integer.MIN_VALUE;
            } else {
                a3dVar = new a3d(this, zjeVar);
            }
        } else {
            a3dVar = new a3d(this, zjeVar);
        }
        Object obj = a3dVar.i;
        wne wneVar = wne.f39444a;
        int i2 = a3dVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            float fL = this.f8856a.l();
            nul0 nul0VarG0 = ro4.g0(0.0f, 280.0f, null, 5);
            a3dVar.k = 1;
            if (bww.x(this.e, fL, nul0VarG0, a3dVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public final long c(long j2) {
        return ne60.a(j2, 0.0f, this.e.e(Float.intBitsToFloat((int) (4294967295L & j2))), 1);
    }

    public final float d() {
        return ((Number) this.c.getValue()).floatValue();
    }

    public final Object e(zje zjeVar) {
        if (this.d.l() <= 0.0f) {
            return Unit.f46060a;
        }
        if (d() <= 0.0f || d() >= 1.0f) {
            return Unit.f46060a;
        }
        if (d() >= 0.5f) {
            Object objA = a(zjeVar);
            return objA == wne.f39444a ? objA : Unit.f46060a;
        }
        Object objB = b(zjeVar);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    public final void f(float f) {
        nz40 nz40VarC;
        agk0 agk0Var = this.f8856a;
        if (f == 0.0f) {
            return;
        }
        rfk0 rfk0VarH = xfk0.h();
        nz40 nz40Var = rfk0VarH instanceof nz40 ? (nz40) rfk0VarH : null;
        if (nz40Var == null || (nz40VarC = nz40Var.C(null, null)) == null) {
            jf4.n("Cannot create a mutable snapshot of an read-only snapshot");
            return;
        }
        try {
            rfk0 rfk0VarJ = nz40VarC.j();
            try {
                this.d.m(f);
                float fL = agk0Var.l();
                pz40 pz40Var = this.b;
                if (fL >= f) {
                    agk0Var.m(f);
                    ((hgk0) pz40Var).setValue(Boolean.TRUE);
                } else if (((Boolean) ((hgk0) pz40Var).getValue()).booleanValue()) {
                    agk0Var.m(f);
                    ((hgk0) pz40Var).setValue(Boolean.TRUE);
                }
                rfk0.q(rfk0VarJ);
                nz40VarC.w().L();
                nz40VarC.c();
            } catch (Throwable th) {
                rfk0.q(rfk0VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nz40VarC.c();
                throw th3;
            }
        }
    }
}
