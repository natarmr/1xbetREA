package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class jj60 extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final au0 o;
    public final zg p;
    public final mne q;
    public final pmi0 r;
    public final i1w0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj60(au0 au0Var, zg zgVar, mne mneVar, ctf0 ctf0Var, pmi0 pmi0Var, i1w0 i1w0Var, f7u f7uVar, lbu lbuVar) {
        super(null, new a540((Object) f7uVar, (Object) lbuVar, (byte) 17), new v510(ctf0Var, (byte) 21), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = au0Var;
        this.p = zgVar;
        this.q = mneVar;
        this.r = pmi0Var;
        this.s = i1w0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        zi60 zi60Var = (zi60) obj;
        zi60Var.getClass();
        if (!(zi60Var instanceof xi60)) {
            if (!(zi60Var instanceof yi60)) {
                if (zi60Var instanceof wi60) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            lk60 lk60Var = ((yi60) zi60Var).f42672a;
            uuz uuzVar = fk60.b;
            byte b = lk60Var.f20185a;
            uuzVar.getClass();
            String strG = uuz.g(b);
            if (strG.length() > 0) {
                i8i.D("point", strG, this.p.f44322a, "acc_app_intro_menu_call");
                b1j.v(strG, this.o.f1455a, 3066L);
            }
            ((t91) this.r.f27236a).f33539a.b = true;
            sac.V(jiu0.a(this), ij60.f14858a, null, this.q.f22085a, new nf60(this, lk60Var, null, (byte) 1), 10);
            return;
        }
        i1w0 i1w0Var = this.s;
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
