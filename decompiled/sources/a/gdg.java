package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class gdg extends w3k implements lc3 {
    public final vzg0 c;
    public final CyberChampParams d;
    public final cxt e;
    public final j3c f;
    public final lsn g;
    public final fvt h;
    public final qc3 i;
    public final m1e j;
    public final mne k;
    public final duj l;
    public final arc m;
    public final ctf0 n;
    public final u58 o;
    public final zr1 p;
    public final List q;
    public final boolean r;
    public String s;
    public final xae0 t;
    public final p7m0 u;
    public c4m0 v;
    public bby w;
    public c4m0 x;
    public final ise0 y;
    public final ise0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdg(vzg0 vzg0Var, CyberChampParams cyberChampParams, ywq0 ywq0Var, cxt cxtVar, yuu yuuVar, j3c j3cVar, lsn lsnVar, fvt fvtVar, qc3 qc3Var, m1e m1eVar, mne mneVar, duj dujVar, svu svuVar, pru pruVar, arc arcVar, ctf0 ctf0Var, u58 u58Var, zr1 zr1Var) {
        super(vzg0Var, kotlin.collections.a.c(qc3Var));
        m1eVar.getClass();
        ctf0Var.getClass();
        this.c = vzg0Var;
        this.d = cyberChampParams;
        this.e = cxtVar;
        this.f = j3cVar;
        this.g = lsnVar;
        this.h = fvtVar;
        this.i = qc3Var;
        this.j = m1eVar;
        this.k = mneVar;
        this.l = dujVar;
        this.m = arcVar;
        this.n = ctf0Var;
        this.o = u58Var;
        this.p = zr1Var;
        this.q = pruVar.a().c.j;
        this.r = svuVar.l();
        this.s = cyberChampParams.b;
        this.t = vzg0Var.c(beg.f2448a, "SELECTED_SEGMENT_KEY");
        this.u = q7m0.a(new cfb(iun.f15405a, ucx.X(pruVar.a()), 0));
        vsg0 vsg0Var = new vsg0(new jc1(yuuVar, cyberChampParams.f46549a, (yje) null));
        bvc bvcVarA = jiu0.a(this);
        rwj rwjVar = mneVar.f22085a;
        this.y = piz.N(vsg0Var, d5c.S(bvcVarA, rwjVar), new o6m0(Long.MAX_VALUE));
        long j = cyberChampParams.f46549a;
        CyberGamesPage cyberGamesPageD = org.xplatform.cyber.section.api.domain.entity.d.d(cyberChampParams.d);
        long j2 = cyberChampParams.c;
        this.z = piz.N(new p6d(ywq0Var.i(j2, j, sip.c, cyberGamesPageD), ywq0Var.i(j2, j, sip.b, cyberGamesPageD), new el00(ywq0Var, j, null), (byte) 1), d5c.S(jiu0.a(this), rwjVar), new o6m0(Long.MAX_VALUE));
    }

    @Override // a.lc3
    public final void a() {
        this.i.a();
    }

    @Override // a.lc3
    public final void f() {
        this.i.f();
        w();
    }

    @Override // a.w3k, a.diu0
    public final void v() {
        tcg tcgVar = this.m.f1338a.b;
        LinkedHashMap linkedHashMap = tcgVar.g;
        tcgVar.e.clear();
        tcgVar.d.clear();
        ((mz40) tcgVar.c.getValue()).i();
        LinkedHashMap linkedHashMap2 = tcgVar.f;
        Iterator it = linkedHashMap2.values().iterator();
        while (it.hasNext()) {
            ((mz40) it.next()).i();
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((mz40) it2.next()).i();
        }
        linkedHashMap2.clear();
        linkedHashMap.clear();
        tcgVar.h.i();
        super.v();
    }

    public final void w() {
        bby bbyVar = this.w;
        if (bbyVar == null || !bbyVar.isActive()) {
            bby bbyVar2 = this.w;
            yje yjeVar = null;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            this.w = sac.V(jiu0.a(this), new x6f(1, this, gdg.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, null, new ex1((w46) this, yjeVar, (byte) 27), 14);
        }
    }

    public final ArrayList x() {
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(Integer.valueOf(R.string.champ_events));
        lc00VarB.add(Integer.valueOf(R.string.champ_results));
        if (this.q.contains(Long.valueOf(this.d.f46549a))) {
            lc00VarB.add(Integer.valueOf(R.string.casino_tournaments_descriptions));
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        ArrayList arrayList = new ArrayList(r3d.q(lc00VarA, 10));
        ListIterator listIterator = lc00VarA.listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(this.n.b.a(((Number) pawVar.next()).intValue(), Arrays.copyOf(new Object[0], 0)));
        }
    }
}
