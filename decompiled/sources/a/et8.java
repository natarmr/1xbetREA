package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class et8 {
    public zr8 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t33 f8365a = xf0.c(0.0f);
    public final pz40 c = androidx.compose.runtime.e.e(iun.f15405a);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(float f, boolean z, zje zjeVar) {
        ct8 ct8Var;
        if (zjeVar instanceof ct8) {
            ct8Var = (ct8) zjeVar;
            int i = ct8Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ct8Var.k = i - Integer.MIN_VALUE;
            } else {
                ct8Var = new ct8(this, zjeVar);
            }
        } else {
            ct8Var = new ct8(this, zjeVar);
        }
        Object obj = ct8Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ct8Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            jie0 jie0Var = new jie0();
            t33 t33Var = this.f8365a;
            jie0Var.f16571a = ((Number) t33Var.d()).floatValue();
            Float f2 = new Float(f);
            sjj sjjVarY = uzb.Y(2);
            r91 r91Var = new r91((Object) jie0Var, (Object) this, z, (byte) 5);
            ct8Var.k = 1;
            Object objD = t33Var.d();
            lxs0 lxs0Var = hp4.j;
            if (h050.a(t33Var.f, new r33(t33Var, f2, new rjj(sjjVarY, lxs0Var, objD, (t73) lxs0Var.f20832a.invoke(f2)), t33Var.c.d, r91Var, null), ct8Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        zr8 zr8Var = this.b;
        if (zr8Var != null) {
            zr8Var.c();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object b(int i, boolean z, boolean z2, zje zjeVar) {
        dt8 dt8Var;
        if (zjeVar instanceof dt8) {
            dt8Var = (dt8) zjeVar;
            int i2 = dt8Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dt8Var.k = i2 - Integer.MIN_VALUE;
            } else {
                dt8Var = new dt8(this, zjeVar);
            }
        } else {
            dt8Var = new dt8(this, zjeVar);
        }
        dt8 dt8Var2 = dt8Var;
        Object obj = dt8Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = dt8Var2.k;
        if (i3 == 0) {
            z1x.P(obj);
            t33 t33Var = this.f8365a;
            float fFloatValue = ((Number) t33Var.d()).floatValue();
            float f = i + fFloatValue;
            uts0 uts0VarM0 = ro4.m0(500, 0, null, 6);
            jie0 jie0Var = new jie0();
            jie0Var.f16571a = fFloatValue;
            Float f2 = new Float(f);
            bt8 bt8Var = new bt8(jie0Var, this, f, z, z2);
            dt8Var2.k = 1;
            if (t33.a(t33Var, f2, uts0VarM0, null, bt8Var, dt8Var2, 4) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        zr8 zr8Var = this.b;
        if (zr8Var != null) {
            zr8Var.c();
        }
        return Unit.f46060a;
    }
}
