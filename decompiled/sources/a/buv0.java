package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class buv0 {
    public static final zsf m = ihn.f14788a;
    public static final float n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkt0 f3254a;
    public final glt0 b;
    public final duv0 c;
    public vne d;
    public c4m0 e;
    public c4m0 f;
    public boolean g;
    public lxv0 h = jxv0.f17330a;
    public final pz40 i = androidx.compose.runtime.e.e(Boolean.FALSE);
    public final t33 j = xf0.c(1.0f);
    public cuv0 k = new cuv0(null, iun.f15405a);
    public final zbk l = jgk0.b(new utv0(this, 0));

    static {
        zcl zclVar = qmk.f28987a;
        n = 48.0f;
    }

    public buv0(mkt0 mkt0Var, glt0 glt0Var, duv0 duv0Var) {
        this.f3254a = mkt0Var;
        this.b = glt0Var;
        this.c = duv0Var;
    }

    public final void a(cuv0 cuv0Var, float f, boolean z) {
        vne vneVar = this.d;
        if (vneVar == null) {
            return;
        }
        c4m0 c4m0Var = this.f;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.k = cuv0Var;
        this.g = z;
        glt0 glt0Var = this.b;
        this.h = glt0Var.d();
        float fFloatValue = ((Number) ((t33) glt0Var.c).d()).floatValue();
        int size = cuv0Var.f5004a.size();
        int iB = size > 1 ? twn.b(size, 1, 60, 220) : 220;
        ((hgk0) this.i).setValue(Boolean.TRUE);
        this.f = qjj.W(vneVar, null, null, new xtv0(z, this, f, iB, fFloatValue, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        auv0 auv0Var;
        if (zjeVar instanceof auv0) {
            auv0Var = (auv0) zjeVar;
            int i = auv0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                auv0Var.k = i - Integer.MIN_VALUE;
            } else {
                auv0Var = new auv0(this, zjeVar);
            }
        } else {
            auv0Var = new auv0(this, zjeVar);
        }
        Object obj = auv0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = auv0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            c4m0 c4m0Var = this.f;
            if (c4m0Var == null) {
                return Unit.f46060a;
            }
            k6s0 k6s0Var = new k6s0(c4m0Var, yjeVar, (byte) 29);
            auv0Var.k = 1;
            if (msm0.u(1000L, k6s0Var, auv0Var) == wneVar) {
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

    public final void c() {
        pz40 pz40Var = this.i;
        if (((Boolean) ((hgk0) pz40Var).getValue()).booleanValue()) {
            c4m0 c4m0Var = this.f;
            yje yjeVar = null;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.f = null;
            ((hgk0) pz40Var).setValue(Boolean.FALSE);
            vne vneVar = this.d;
            if (vneVar != null) {
                qjj.W(vneVar, null, null, new vmq0(this, yjeVar, (byte) 7), 3);
            }
        }
    }
}
