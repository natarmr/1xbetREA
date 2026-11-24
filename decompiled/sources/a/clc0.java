package a;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class clc0 extends w46 {
    public final i1w0 b;
    public final s470 c;
    public final uf3 d;
    public final oif0 e;
    public final ieu f;
    public final pyu g;
    public final lef0 h;
    public final mne i;
    public final wsf0 j;
    public final tpx k;
    public final boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final q99 p;
    public final p7m0 q;
    public Map r;

    public clc0(i1w0 i1w0Var, tpx tpxVar, s470 s470Var, uf3 uf3Var, oif0 oif0Var, ieu ieuVar, pyu pyuVar, lef0 lef0Var, mne mneVar, wsf0 wsf0Var, tpx tpxVar2, boolean z, m1e m1eVar) {
        i1w0Var.getClass();
        this.b = i1w0Var;
        this.c = s470Var;
        this.d = uf3Var;
        this.e = oif0Var;
        this.f = ieuVar;
        this.g = pyuVar;
        this.h = lef0Var;
        this.i = mneVar;
        this.j = wsf0Var;
        this.k = tpxVar2;
        this.l = z;
        this.o = m1eVar.c();
        yje yjeVar = null;
        this.p = vtb.d(0, null, null, 7);
        this.q = q7m0.a(new zkc0("", true, this.o));
        sac.V(jiu0.a(this), new ljc0((byte) 2), null, null, new o690((Object) tpxVar, (Object) this, yjeVar, (byte) 22), 14);
        sac.V(jiu0.a(this), new ljc0((byte) 3), null, null, new vkc0(this, yjeVar, (byte) 0), 14);
    }

    public final void w(i16 i16Var) {
        sac.V(jiu0.a(this), alc0.f1062a, null, this.i.f22085a, new o690((Object) this, (Object) i16Var, (yje) null, (byte) 23), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(zje zjeVar) {
        blc0 blc0Var;
        if (zjeVar instanceof blc0) {
            blc0Var = (blc0) zjeVar;
            int i = blc0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                blc0Var.k = i - Integer.MIN_VALUE;
            } else {
                blc0Var = new blc0(this, zjeVar);
            }
        } else {
            blc0Var = new blc0(this, zjeVar);
        }
        Object objW = blc0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = blc0Var.k;
        if (i2 == 0) {
            z1x.P(objW);
            long jA = this.c.a();
            blc0Var.k = 1;
            objW = this.e.w(jA, blc0Var);
            if (objW == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW);
        }
        p7m0 p7m0Var = this.q;
        zkc0 zkc0VarA = zkc0.a((zkc0) p7m0Var.getValue(), (String) objW, false, false, 6);
        p7m0Var.getClass();
        p7m0Var.o(null, zkc0VarA);
        return Unit.f46060a;
    }

    public final void y() {
        this.b.d(new oac0(this, this.c.b(), (byte) 4));
        w(c16.f3559a);
    }

    public final void z(boolean z, boolean z2) {
        p7m0 p7m0Var = this.q;
        zkc0 zkc0VarA = zkc0.a((zkc0) p7m0Var.getValue(), null, z, z2, 1);
        p7m0Var.getClass();
        p7m0Var.o(null, zkc0VarA);
    }
}
