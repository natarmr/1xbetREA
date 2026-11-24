package a;

import org.xbet.client1.R;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;

/* JADX INFO: loaded from: classes4.dex */
public final class rsh extends w46 {
    public final ocl b;
    public final hru c;
    public final g2v d;
    public final ctf0 e;
    public final n2u f;
    public final hzg g;
    public final CyberChampParams h;
    public final gvt i;
    public final b8u j;
    public final p7m0 k;
    public final ol60 l;
    public final p7m0 m;
    public final p7m0 n;
    public final p7m0 o;
    public final c4m0 p;
    public esh q;
    public bby r;
    public da10 s;

    public rsh(ocl oclVar, hru hruVar, m1e m1eVar, g2v g2vVar, ctf0 ctf0Var, n2u n2uVar, hzg hzgVar, CyberChampParams cyberChampParams, gvt gvtVar, b8u b8uVar, ih5 ih5Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = oclVar;
        this.c = hruVar;
        this.d = g2vVar;
        this.e = ctf0Var;
        this.f = n2uVar;
        this.g = hzgVar;
        this.h = cyberChampParams;
        this.i = gvtVar;
        this.j = b8uVar;
        this.k = q7m0.a(nch.f23293a);
        this.l = new ol60(3);
        Boolean bool = Boolean.TRUE;
        this.m = q7m0.a(bool);
        this.n = q7m0.a(bool);
        this.o = q7m0.a(bool);
        this.s = da10.DEFAULT_ERROR;
        c4m0 c4m0Var = this.p;
        byte b = 1;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.p = sac.T(new fnq(m1eVar.b(), new nsh(this, yjeVar, (byte) 0), (byte) 4), jiu0.a(this), osh.h);
        }
        sac.V(jiu0.a(this), new msh(this, (byte) 1), null, null, new nsh(this, yjeVar, b), 14);
        ih5Var.l(40L, cyberChampParams.c, r1g.CYBERSPORT_WORLD_CUP, null, null);
    }

    public final void w() {
        bby bbyVar = this.r;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.r = sac.V(jiu0.a(this), new msh(this, (byte) 0), null, null, new ya(this, null, (byte) 21), 14);
        }
    }

    public final void x() {
        mch mchVar = new mch(g2v.d(this.d, ozb.J(this.h.c, pb10.v), null, null, R.string.data_retrieval_error, R.string.try_again_text, null, 350), this.s.f5727a);
        p7m0 p7m0Var = this.k;
        p7m0Var.getClass();
        p7m0Var.o(null, mchVar);
    }

    public final void y(da10 da10Var) {
        Object value;
        this.s = da10Var;
        p7m0 p7m0Var = this.k;
        Object value2 = p7m0Var.getValue();
        mch mchVar = value2 instanceof mch ? (mch) value2 : null;
        if (mchVar != null) {
            mch mchVar2 = new mch(mchVar.f21551a, this.s.f5727a);
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, mchVar2));
        }
    }
}
