package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class lkq0 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final i1w0 o;
    public final ctf0 p;
    public final duj q;
    public final uvt r;
    public final mhu s;
    public final wgu t;
    public final pru u;
    public final hti0 v;
    public final mne w;
    public bby x;
    public final c4m0 y;

    public lkq0(vzg0 vzg0Var, i1w0 i1w0Var, ctf0 ctf0Var, duj dujVar, uvt uvtVar, mhu mhuVar, wgu wguVar, pru pruVar, hti0 hti0Var, ocl oclVar, m1e m1eVar, mne mneVar, int i) {
        ctf0Var.getClass();
        uvtVar.getClass();
        mhuVar.getClass();
        wguVar.getClass();
        hti0Var.getClass();
        m1eVar.getClass();
        uli0 uli0Var = new uli0(i, (byte) 6);
        gpb0 gpb0Var = new gpb0(ctf0Var, oclVar, (byte) 17);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, uli0Var, gpb0Var, cvm0.p(vs10Var, rwjVar));
        this.o = i1w0Var;
        this.p = ctf0Var;
        this.q = dujVar;
        this.r = uvtVar;
        this.s = mhuVar;
        this.t = wguVar;
        this.u = pruVar;
        this.v = hti0Var;
        this.w = mneVar;
        c4m0 c4m0Var = this.y;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.y = sac.T(new fnq(m1eVar.b(), new z2n0(this, yjeVar, (byte) 19), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new ssl0((Object) this, yjeVar, (byte) 25));
        }
        M();
    }

    public final void M() {
        xrz xrzVar = ((ikq0) D()).h;
        tbe0 tbe0Var = tbe0.f33660a;
        yje yjeVar = null;
        mne mneVar = this.w;
        if (xrzVar == tbe0Var) {
            I(mneVar.b, new kkq0(this, (byte) 2), new hhb0(this, yjeVar, (byte) 24));
            return;
        }
        byte b = 1;
        sac.V(jiu0.a(this), new kkq0(this, b), null, mneVar.b, new wup0(this, yjeVar, b), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        wjq0 wjq0Var = (wjq0) obj;
        wjq0Var.getClass();
        super.x(wjq0Var);
        boolean zEquals = wjq0Var.equals(qjq0.f28852a);
        byte b = 0;
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.o;
        if (zEquals) {
            bby bbyVar = this.x;
            if (bbyVar != null && bbyVar.isActive()) {
                return;
            }
            if ((((ikq0) D()).h instanceof tbe0) && !((ikq0) D()).c && !((ikq0) D()).d) {
                G(dkq0.f6246a);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (wjq0Var instanceof tjq0) {
                int i = ((tjq0) wjq0Var).f34061a;
                siq0 siq0Var = ((ikq0) D()).e;
                if (siq0Var != null && i >= 0 && i < siq0Var.k.size()) {
                    p7m0 p7m0Var = this.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        oyg0 oyg0Var = this.f;
                        oyg0Var.getClass();
                        q7x.F(oyg0Var, Integer.valueOf(i), "SELECTED_VALUE_INDEX_KEY");
                    } while (!p7m0Var.m(value, ikq0.a((ikq0) value, false, false, false, false, null, 0, i, 191)));
                    return;
                }
                return;
            }
            if (wjq0Var.equals(pjq0.f27102a)) {
                G(ekq0.f7965a);
                return;
            }
            boolean zEquals2 = wjq0Var.equals(rjq0.f30608a);
            byte b2 = 2;
            mne mneVar = this.w;
            yje yjeVar = null;
            if (zEquals2) {
                siq0 siq0Var2 = ((ikq0) D()).e;
                if (siq0Var2 == null) {
                    return;
                }
                a95 a95Var = (a95) CollectionsKt.W(((ikq0) D()).g, siq0Var2.k);
                if (a95Var == null) {
                    return;
                }
                this.x = I(mneVar.b, new kkq0(this, b), new fwk0(this, a95Var, yjeVar, b2));
                return;
            }
            if (!wjq0Var.equals(sjq0.f32314a) && !wjq0Var.equals(ujq0.f35795a)) {
                if (wjq0Var.equals(vjq0.f37543a)) {
                    I(mneVar.b, new kkq0(this, b2), new hhb0(this, yjeVar, (byte) 24));
                    return;
                } else if (wjq0Var.equals(ojq0.f25372a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
