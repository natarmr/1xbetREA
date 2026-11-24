package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.tennis.impl.summary.presentation.filters.TennisSummaryFiltersFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class nzp0 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final vzg0 o;
    public final String p;
    public final i1w0 q;
    public final duj r;
    public final mne s;
    public final x4u t;
    public final psu u;
    public final osc v;
    public final psu w;
    public final b8u x;
    public bby y;

    public nzp0(vzg0 vzg0Var, String str, i1w0 i1w0Var, m1e m1eVar, duj dujVar, ocl oclVar, ctf0 ctf0Var, mne mneVar, x4u x4uVar, psu psuVar, lsn lsnVar, osc oscVar, psu psuVar2, b8u b8uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        mhp0 mhp0Var = new mhp0((byte) 29);
        gpb0 gpb0Var = new gpb0(oclVar, ctf0Var, (byte) 15);
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        super(null, mhp0Var, gpb0Var, cvm0.p(vs10Var, mneVar.f22085a), null);
        this.o = vzg0Var;
        this.p = str;
        this.q = i1w0Var;
        this.r = dujVar;
        this.s = mneVar;
        this.t = x4uVar;
        this.u = psuVar;
        this.v = oscVar;
        this.w = psuVar2;
        this.x = b8uVar;
        yje yjeVar = null;
        if (!Intrinsics.d(vzg0Var.a("KAKOI_KEY"), Boolean.TRUE)) {
            qjj.W(jiu0.a(this), null, null, new mzp0(this, yjeVar, (byte) 1), 3);
        }
        sac.T(new fnq(((xyp0) lsnVar.f20589a).c.b, new ssl0((Object) this, yjeVar, (byte) 20), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new p23(2, null, (byte) 13));
        sac.T(new fnq(m1eVar.b(), new mzp0(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), dvjVar), foe.h);
    }

    public final void M() {
        Object value;
        bby bbyVar = this.y;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, fzp0.a((fzp0) value, true, false, false, null, false, null, 120)));
            this.y = sac.V(jiu0.a(this), new nop0(this, (byte) 8), null, this.s.b, new mzp0(this, null, (byte) 2), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        txp0 txp0Var = (txp0) obj;
        txp0Var.getClass();
        boolean zEquals = txp0Var.equals(qxp0.f29497a);
        i1w0 i1w0Var = this.q;
        if (zEquals) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!txp0Var.equals(rxp0.f31276a)) {
                if (txp0Var.equals(sxp0.f32989a)) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            this.o.e("KAKOI_KEY", Boolean.TRUE);
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            FragmentScreen tennisSummaryFiltersFragmentScreen = new TennisSummaryFiltersFragmentScreen(this.p);
            if (tennisSummaryFiltersFragmentScreen instanceof DialogScreen) {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) tennisSummaryFiltersFragmentScreen)));
            } else {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(tennisSummaryFiltersFragmentScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
