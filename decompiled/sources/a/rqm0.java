package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class rqm0 extends w46 {
    public final CyberGamesPage b;
    public final hzg c;
    public final n2u d;
    public final duj e;
    public final ih5 f;
    public final zr1 g;
    public final g2v h;
    public final m1e i;
    public final mne j;
    public final lrc k;
    public final rpt l;
    public final hvt m;
    public final poq0 n;
    public final q8u o;
    public final cyg0 p;
    public final pru q;
    public final p7m0 r;
    public da10 s;
    public ArrayList t;
    public bby u;
    public c4m0 v;
    public final ol60 w;

    public rqm0(CyberGamesPage cyberGamesPage, hzg hzgVar, n2u n2uVar, duj dujVar, ih5 ih5Var, zr1 zr1Var, g2v g2vVar, m1e m1eVar, mne mneVar, lrc lrcVar, rpt rptVar, hvt hvtVar, poq0 poq0Var, q8u q8uVar, cyg0 cyg0Var, pru pruVar) {
        m1eVar.getClass();
        this.b = cyberGamesPage;
        this.c = hzgVar;
        this.d = n2uVar;
        this.e = dujVar;
        this.f = ih5Var;
        this.g = zr1Var;
        this.h = g2vVar;
        this.i = m1eVar;
        this.j = mneVar;
        this.k = lrcVar;
        this.l = rptVar;
        this.m = hvtVar;
        this.n = poq0Var;
        this.o = q8uVar;
        this.p = cyg0Var;
        this.q = pruVar;
        this.r = q7m0.a(kqm0.f18731a);
        this.s = da10.TIMER_ERROR;
        this.w = new ol60(1, i99.b);
    }

    @Override // a.diu0
    public final void v() {
        List list = this.t;
        if (list == null) {
            list = iun.f15405a;
        }
        this.k.y(list);
    }

    public final void w() {
        c4m0 c4m0Var = this.v;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.v = slb.U(new fnq(this.i.b(), new pqm0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), this.j.f22085a));
    }

    public final void x() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.r;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new iqm0(g2v.d(this.h, ozb.J(-1L, pb10.v), null, null, R.string.data_retrieval_error, R.string.try_again_text, null, 350), this.s.f5727a)));
        this.s = da10.DEFAULT_ERROR;
        bby bbyVar = this.u;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
    }

    public final void y(ArrayList arrayList) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.r;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new jqm0(arrayList)));
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((cqm0) it.next()).f4802a));
        }
        this.t = arrayList2;
    }

    public final void z(da10 da10Var) {
        Object value;
        this.s = da10Var;
        p7m0 p7m0Var = this.r;
        Object value2 = p7m0Var.getValue();
        iqm0 iqm0Var = value2 instanceof iqm0 ? (iqm0) value2 : null;
        if (iqm0Var != null) {
            iqm0 iqm0Var2 = new iqm0(iqm0Var.f15217a, this.s.f5727a);
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, iqm0Var2));
        }
    }
}
