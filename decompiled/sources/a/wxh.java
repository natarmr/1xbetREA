package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.cycling.impl.cycling_player.presentation.screen.CyclingPlayerStatisticsFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class wxh extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final vzg0 o;
    public final ivn p;
    public final m1e q;
    public final mne r;
    public final i1w0 s;
    public final duj t;
    public final String u;

    public wxh(m1e m1eVar, mne mneVar, duj dujVar, ocl oclVar, ivn ivnVar, ctf0 ctf0Var, vzg0 vzg0Var, i1w0 i1w0Var, String str) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wg2 wg2Var = new wg2(vzg0Var, (byte) 5);
        cz czVar = new cz(oclVar, ctf0Var, (byte) 11);
        rwj rwjVar = mneVar.f22085a;
        super(null, wg2Var, czVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = vzg0Var;
        this.p = ivnVar;
        this.q = m1eVar;
        this.r = mneVar;
        this.s = i1w0Var;
        this.t = dujVar;
        this.u = str;
        sac.V(jiu0.a(this), new txh(this, (byte) 0), null, mneVar.b, new vxh(this, null, (byte) 0), 10);
    }

    public final void M() {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, oxh.a((oxh) value, true, false, false, null, 0L, 24)));
        sac.V(jiu0.a(this), new txh(this, (byte) 1), null, this.r.b, new vxh(this, null, (byte) 1), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        ixh ixhVar = (ixh) obj;
        ixhVar.getClass();
        super.x(ixhVar);
        boolean zEquals = ixhVar.equals(exh.f8576a);
        i1w0 i1w0Var = this.s;
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
            if (!(ixhVar instanceof gxh)) {
                if (!(ixhVar instanceof fxh)) {
                    if (ixhVar.equals(hxh.f13814a)) {
                        M();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                long j = ((fxh) ixhVar).f10309a;
                this.o.e("SELECTED_CHIP", Long.valueOf(j));
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, oxh.a((oxh) value, false, false, false, null, j, 15)));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            FragmentScreen cyclingPlayerStatisticsFragmentScreen = new CyclingPlayerStatisticsFragmentScreen(((gxh) ixhVar).f12077a);
            if (cyclingPlayerStatisticsFragmentScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) cyclingPlayerStatisticsFragmentScreen)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(cyclingPlayerStatisticsFragmentScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
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
