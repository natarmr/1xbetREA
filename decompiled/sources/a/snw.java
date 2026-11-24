package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.horse_menu.domain.model.HorseInfoModel;
import org.xplatform.statistic.horse_races_statistic.presentation.actual.HorseRacesStatisticScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class snw extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final HorseInfoModel o;
    public final p4u p;
    public final m1e q;
    public final mne r;
    public final i1w0 s;
    public c4m0 t;

    public snw(HorseInfoModel horseInfoModel, p4u p4uVar, uyu uyuVar, wyu wyuVar, ocl oclVar, ctf0 ctf0Var, m1e m1eVar, mne mneVar, i1w0 i1w0Var) {
        wyuVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        wqv wqvVar = new wqv(horseInfoModel, wyuVar, (byte) 10);
        k9v k9vVar = new k9v(horseInfoModel, ctf0Var, oclVar, (byte) 5);
        rwj rwjVar = mneVar.f22085a;
        super(null, wqvVar, k9vVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = horseInfoModel;
        this.p = p4uVar;
        this.q = m1eVar;
        this.r = mneVar;
        this.s = i1w0Var;
        sac.T(new fnq(uyuVar.f36509a.h(), new kaw(this, null, (byte) 5), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), rnw.h);
    }

    public final void M(boolean z) {
        mie0 mie0Var = new mie0();
        sac.V(jiu0.a(this), new okw(mie0Var, this, (byte) 4), null, this.r.b, new ys8((Object) mie0Var, (Object) this, z, (yje) null, (byte) 13), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        rmw rmwVar = (rmw) obj;
        rmwVar.getClass();
        boolean zEquals = rmwVar.equals(mmw.f22063a);
        byte b = 0;
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
            if (rmwVar.equals(omw.f25523a)) {
                M(true);
                return;
            }
            yje yjeVar = null;
            if (rmwVar.equals(pmw.f27259a)) {
                c4m0 c4m0Var = this.t;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.t = sac.T(new fnq(this.q.b(), new pnw(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.r.b), qnw.h);
                    return;
                }
                return;
            }
            if (!(rmwVar instanceof nmw)) {
                if (!rmwVar.equals(qmw.f29005a)) {
                    t9f.b();
                    return;
                }
                c4m0 c4m0Var2 = this.t;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                    return;
                }
                return;
            }
            jnw jnwVar = ((nmw) rmwVar).f23792a;
            if (!(jnwVar instanceof hnw)) {
                if (jnwVar.equals(inw.c)) {
                    return;
                }
                t9f.b();
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            FragmentScreen horseRacesStatisticScreen = new HorseRacesStatisticScreen(this.o.b);
            if (horseRacesStatisticScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) horseRacesStatisticScreen)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(horseRacesStatisticScreen)));
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
