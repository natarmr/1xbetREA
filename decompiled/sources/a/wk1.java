package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wk1 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final rl1 o;
    public final duj p;
    public final vw3 q;
    public final oeg0 r;
    public final ctf0 s;
    public final mne t;
    public final dgu u;
    public fk80 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public wk1(rl1 rl1Var, duj dujVar, vw3 vw3Var, oeg0 oeg0Var, ctf0 ctf0Var, m1e m1eVar, mne mneVar, uyu uyuVar, bzt bztVar, r9u r9uVar, dgu dguVar) {
        oeg0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new sk1(bztVar, (byte) 0), g090VarP, new uc(ctf0Var, (byte) 14), (yzn0) null);
        this.o = rl1Var;
        this.p = dujVar;
        this.q = vw3Var;
        this.r = oeg0Var;
        this.s = ctf0Var;
        this.t = mneVar;
        this.u = dguVar;
        M();
        fnq fnqVar = new fnq(dtb.z(m1eVar.b(), 1), new pa((Object) this, yjeVar, (byte) 18), (byte) 4);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        sac.T(fnqVar, d5c.S(bvcVarA, dvjVar), uk1.h);
        sac.T(new fnq(dtb.z(new fnq(uyuVar.f36509a.h(), new tk1(this, yjeVar, (byte) 1), (byte) 4), 1), new wa(this, yjeVar, (byte) 4), (byte) 4), d5c.S(jiu0.a(this), dvjVar), vk1.h);
    }

    public final void M() {
        sac.V(jiu0.a(this), null, null, this.t.b, new l1(this, null, (byte) 27), 11);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        gk1 gk1Var = (gk1) obj;
        gk1Var.getClass();
        super.x(gk1Var);
        if (!gk1Var.equals(ck1.f4485a)) {
            if (gk1Var.equals(dk1.f6212a)) {
                fk80 fk80Var = this.v;
                if (fk80Var != null) {
                    fk80Var.a(false);
                    return;
                }
                return;
            }
            if (gk1Var instanceof ek1) {
                this.r.c().d(new df1(this, ((ek1) gk1Var).f7933a, (byte) 2));
                return;
            } else if (gk1Var.equals(fk1.f9669a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        rl1 rl1Var = this.o;
        rl1Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(new c8d(y7d.f42146a, p0w0.f26173a));
        ListIterator listIterator = rl1Var.c().d(copyOnWriteArrayList).listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return;
            } else {
                rl1Var.a((oe50) pawVar.next());
            }
        }
    }
}
