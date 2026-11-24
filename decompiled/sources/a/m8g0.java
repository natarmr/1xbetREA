package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.stat_results.impl.results_grid.presentation.screen.ResultsGridInfoScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class m8g0 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final String o;
    public final long p;
    public final ctf0 q;
    public final mne r;
    public final i1w0 s;
    public final p4u t;
    public final duj u;
    public final fhj v;
    public bby w;

    public m8g0(String str, long j, ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, p4u p4uVar, duj dujVar, m1e m1eVar, weu weuVar, qzt qztVar, fhj fhjVar, f7u f7uVar, uyu uyuVar, r9u r9uVar, ocl oclVar) {
        str.getClass();
        ctf0Var.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        b29 b29Var = new b29((byte) 2, j, weuVar, str, qztVar, ctf0Var, fhjVar);
        tla0 tla0Var = new tla0(ctf0Var, r9uVar, oclVar);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, b29Var, tla0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = ctf0Var;
        this.r = mneVar;
        this.s = i1w0Var;
        this.t = p4uVar;
        this.u = dujVar;
        this.v = fhjVar;
        yje yjeVar = null;
        sac.T(new fnq(m1eVar.b(), new i8g0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), j8g0.h);
        sac.T(new fnq(uyuVar.f36509a.h(), new tye0(this, yjeVar, (byte) 12), (byte) 4), d5c.S(jiu0.a(this), rwjVar), l8g0.h);
        sac.T(new fnq(f7uVar.n(str), new qkb0(qztVar.a(), this, (yje) null, (byte) 7), (byte) 4), jiu0.a(this), k8g0.h);
    }

    public final void M() {
        Object value;
        bby bbyVar = this.w;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, w7g0.a((w7g0) value, true, false, false, null, null, null, 56)));
            this.w = sac.V(jiu0.a(this), new aif0(1, this, m8g0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, this.r.b, new i8g0(this, null, (byte) 0), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        h6g0 h6g0Var = (h6g0) obj;
        h6g0Var.getClass();
        boolean zEquals = h6g0Var.equals(c6g0.f3817a);
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
            if (h6g0Var.equals(e6g0.f7282a)) {
                M();
                return;
            }
            if (!h6g0Var.equals(d6g0.f5548a)) {
                if (h6g0Var instanceof g6g0) {
                    G(new v7g0(((g6g0) h6g0Var).f10763a));
                    return;
                } else if (h6g0Var.equals(f6g0.f9008a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            FragmentScreen resultsGridInfoScreen = new ResultsGridInfoScreen(this.o);
            if (resultsGridInfoScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) resultsGridInfoScreen)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(resultsGridInfoScreen)));
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
