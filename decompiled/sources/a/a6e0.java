package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class a6e0 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final ctf0 o;
    public final mne p;
    public final i1w0 q;
    public final String r;
    public final p4u s;
    public final duj t;
    public bby u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6e0(ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, String str, p4u p4uVar, ocl oclVar, m1e m1eVar, duj dujVar) {
        super(null, new etd0((byte) 25), new gpb0(ctf0Var, oclVar, (byte) 2), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = ctf0Var;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = str;
        this.s = p4uVar;
        this.t = dujVar;
        sac.T(new fnq(m1eVar.a(), new coc0(this, null, (byte) 8), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), foe.h);
        M(false);
    }

    public final void M(boolean z) {
        bby bbyVar = this.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.u = sac.V(jiu0.a(this), new prc0(1, this, a6e0.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 28), null, this.p.b, new a220(z, (Object) this, (yje) null, (byte) 18), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        p5e0 p5e0Var = (p5e0) obj;
        p5e0Var.getClass();
        super.x(p5e0Var);
        if (p5e0Var.equals(o5e0.f24684a)) {
            E();
            return;
        }
        if (!p5e0Var.equals(l5e0.f19451a)) {
            if (p5e0Var.equals(n5e0.f22941a)) {
                M(true);
                return;
            }
            if (!p5e0Var.equals(m5e0.f21216a)) {
                t9f.b();
                return;
            }
            ctf0 ctf0Var = this.o;
            lsm0 lsm0Var = ctf0Var.b;
            lsm0 lsm0Var2 = ctf0Var.b;
            G(new u5e0(q3d.j(new dko0(R.color.static_red_40, lsm0Var.a(R.string.worst_ranking, Arrays.copyOf(new Object[0], 0))), new dko0(R.color.static_green_40, lsm0Var2.a(R.string.best_ranking, Arrays.copyOf(new Object[0], 0))), new dko0(R.color.static_orange_40, lsm0Var2.a(R.string.worst_move, Arrays.copyOf(new Object[0], 0))), new dko0(R.color.static_yellow_40, lsm0Var2.a(R.string.best_move, Arrays.copyOf(new Object[0], 0)))), lsm0Var2.a(R.string.color_markers, Arrays.copyOf(new Object[0], 0))));
            return;
        }
        i1w0 i1w0Var = this.q;
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
    }
}
