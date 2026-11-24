package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class pia0 extends i3t0 {
    public static final /* synthetic */ int q = 0;
    public final gxu o;
    public final gxu p;

    public pia0(gxu gxuVar, cu cuVar, gxu gxuVar2, mne mneVar) {
        l3a0 l3a0Var = new l3a0(cuVar, (byte) 18);
        oia0 oia0Var = oia0.f25301a;
        rwj rwjVar = mneVar.f22085a;
        super(null, l3a0Var, oia0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = gxuVar;
        this.p = gxuVar2;
        i3t0.K(this, null, new er90((byte) 26), new m91(this, null, (byte) 14), 1);
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void x(jia0 jia0Var) {
        kjo0 kjo0Var;
        jia0Var.getClass();
        super.x(jia0Var);
        j6m0 j6m0Var = kjo0.b;
        int i = jia0Var.f16565a.f32203a;
        j6m0Var.getClass();
        kjo0[] kjo0VarArrValues = kjo0.values();
        int length = kjo0VarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                kjo0Var = null;
                break;
            }
            kjo0Var = kjo0VarArrValues[i2];
            if (kjo0Var.f18397a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (kjo0Var == null) {
            kjo0Var = kjo0.UNKNOWN;
        }
        gxu gxuVar = this.p;
        gxuVar.getClass();
        String strB = ((mrc) gxuVar.f12096a).b();
        t1u t1uVar = (t1u) gxuVar.c;
        int iA = ((mrc) gxuVar.b).a(strB);
        eia0 eia0Var = (eia0) t1uVar.f33185a.b;
        eia0Var.getClass();
        eia0Var.c.put(strB + iA, kjo0Var);
        eia0Var.d.f(Unit.f46060a);
    }
}
