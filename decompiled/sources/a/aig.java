package a;

import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
public final class aig extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final hzg o;
    public final CyberChampsMainParams p;
    public final gr00 q;
    public final soi0 r;
    public final soi0 s;
    public final nsu t;
    public final bqc u;
    public bby v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aig(hzg hzgVar, mne mneVar, ctf0 ctf0Var, CyberChampsMainParams cyberChampsMainParams, gr00 gr00Var, soi0 soi0Var, soi0 soi0Var2, nsu nsuVar, bqc bqcVar, vzg0 vzg0Var) {
        super(vzg0Var, new hfg(cyberChampsMainParams, (byte) 4), cvm0.p(mneVar.c, mneVar.f22085a), new ep4(ctf0Var, (byte) 23));
        ctf0Var.getClass();
        this.o = hzgVar;
        this.p = cyberChampsMainParams;
        this.q = gr00Var;
        this.r = soi0Var;
        this.s = soi0Var2;
        this.t = nsuVar;
        this.u = bqcVar;
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void x(shg shgVar) {
        Object value;
        Object value2;
        Object value3;
        whg whgVar;
        Object value4;
        hhq0 hhq0Var;
        shgVar.getClass();
        super.x(shgVar);
        byte b = 0;
        byte b2 = 3;
        yje yjeVar = null;
        if (!(shgVar instanceof rhg)) {
            if (!(shgVar instanceof hhg)) {
                t9f.b();
                return;
            }
            hhg hhgVar = (hhg) shgVar;
            if (hhgVar.equals(ghg.f11296a)) {
                bby bbyVar = this.v;
                if (bbyVar != null) {
                    e3c.n(bbyVar);
                }
                this.v = i3t0.K(this, null, null, new yhg(this, yjeVar, b), 3);
                return;
            }
            if (hhgVar.equals(fhg.f9539a)) {
                bby bbyVar2 = this.v;
                if (bbyVar2 != null) {
                    e3c.n(bbyVar2);
                    return;
                }
                return;
            }
            if (hhgVar.equals(ehg.f7807a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        rhg rhgVar = (rhg) shgVar;
        boolean zEquals = rhgVar.equals(ihg.f14778a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals) {
            if (((whg) D()).h) {
                N();
                return;
            }
            hhq0 hhq0Var2 = new hhq0(ygq0.NOT, -1L, -1L);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                hhq0Var = hhq0Var2;
                oyg0Var.getClass();
                hhq0Var2 = hhq0Var;
            } while (!p7m0Var.m(value4, whg.a((whg) value4, null, false, hhq0Var, false, 223)));
            i3t0.K(this, null, null, new zhg(this, hhq0Var2, yjeVar, b), 3);
            ((uzg) this.o).a();
            return;
        }
        if (rhgVar.equals(mhg.f21791a)) {
            N();
            return;
        }
        if (rhgVar instanceof lhg) {
            i3t0.K(this, null, null, new ffd(this, ((lhg) rhgVar).f20054a, yjeVar, b2), 3);
            return;
        }
        if (rhgVar.equals(jhg.f16524a)) {
            G(thg.f33960a);
            return;
        }
        byte b3 = 1;
        if (rhgVar.equals(ohg.f25263a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                whgVar = (whg) value3;
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, whg.a(whgVar, null, !whgVar.d, null, false, 247)));
            i3t0.K(this, null, null, new yhg(this, yjeVar, b2), 3);
            return;
        }
        if (rhgVar.equals(phg.f26995a)) {
            G(new uhg(((whg) D()).f));
            return;
        }
        if (rhgVar instanceof qhg) {
            hhq0 hhq0Var3 = ((qhg) rhgVar).f28737a;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, whg.a((whg) value2, null, false, hhq0Var3, false, 223)));
            i3t0.K(this, null, null, new zhg(this, hhq0Var3, yjeVar, b3), 3);
            return;
        }
        if (rhgVar.equals(khg.f18290a)) {
            i3t0.K(this, null, null, new yhg(this, yjeVar, b3), 3);
            return;
        }
        if (!(rhgVar instanceof nhg)) {
            t9f.b();
            return;
        }
        cnb cnbVar = ((nhg) rhgVar).f23531a;
        this.w = true;
        p7m0 p7m0Var4 = ocjVar.f25029a;
        do {
            value = p7m0Var4.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var4.m(value, whg.a((whg) value, cnbVar, false, null, false, 253)));
    }

    public final void N() {
        Object value;
        Object value2;
        boolean z = ((whg) D()).h;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (!z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, whg.a((whg) value, null, false, null, true, 127)));
            return;
        }
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value2, whg.a((whg) value2, null, false, null, false, 123)));
        i3t0.K(this, null, null, new yhg(this, null, (byte) 2), 3);
    }
}
