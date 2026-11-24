package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class bm2 extends i3t0 {
    public final vzg0 o;
    public final gg5 p;
    public final pru q;
    public final s31 r;

    /* JADX WARN: Illegal instructions before constructor call */
    public bm2(vzg0 vzg0Var, mne mneVar, ctf0 ctf0Var, gg5 gg5Var, pru pruVar, s31 s31Var) {
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new t32((byte) 11), g090VarP, new uc(ctf0Var, (byte) 26), (yzn0) null);
        this.o = vzg0Var;
        this.p = gg5Var;
        this.q = pruVar;
        this.r = s31Var;
        i3t0.K(this, null, null, new m91(this, null, (byte) 3), 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        Object value;
        yl2 yl2Var = (yl2) obj;
        yl2Var.getClass();
        super.x(yl2Var);
        if (yl2Var.equals(vl2.f37602a)) {
            E();
            return;
        }
        if (yl2Var instanceof wl2) {
            long j = ((wl2) yl2Var).f39335a;
            Iterator it = ih2.h.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ih2) next).f14760a != j);
            ih2 ih2Var = (ih2) next;
            if (ih2Var == null) {
                return;
            }
            this.o.e("CURRENT_SPORT_TAB_KEY", ih2Var);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, zl2.a((zl2) value, null, ih2Var, 1)));
            return;
        }
        if (!(yl2Var instanceof xl2)) {
            t9f.b();
            return;
        }
        ih2 ih2Var2 = ((zl2) D()).b;
        vcp vcpVar = vcp.Classic;
        int iOrdinal = ih2Var2.ordinal();
        gg5 gg5Var = this.p;
        s31 s31Var = this.r;
        if (iOrdinal == 0) {
            s31Var.J("categoryImageHeader", qfp.EVENTS);
            gg5Var.u("categoryImageHeader", nfp.EVENTS);
            return;
        }
        if (iOrdinal == 1) {
            s31Var.J("categoryImageHeader", qfp.TEAMS);
            gg5Var.u("categoryImageHeader", nfp.TEAMS);
        } else if (iOrdinal == 2) {
            s31Var.J("categoryImageHeader", qfp.CHAMPIONSHIP);
            gg5Var.u("categoryImageHeader", nfp.CHAMPIONSHIP);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            s31Var.J("categoryImageHeader", qfp.WATCHED);
            gg5Var.u("categoryImageHeader", nfp.WATCHED);
        }
    }
}
