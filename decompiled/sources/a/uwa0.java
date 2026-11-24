package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class uwa0 extends i3t0 {
    public final i1w0 o;
    public final duj p;
    public final oeg0 q;
    public final peg0 r;
    public final vqc s;
    public final erc t;
    public final xri0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public uwa0(i1w0 i1w0Var, duj dujVar, ctf0 ctf0Var, oeg0 oeg0Var, mne mneVar, peg0 peg0Var, vqc vqcVar, erc ercVar, xri0 xri0Var, ntu ntuVar, g5k g5kVar) {
        ctf0Var.getClass();
        oeg0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        super(new qw80((Object) g5kVar, (Object) ntuVar, (byte) 24), g090VarP, new iv80(ctf0Var, (byte) 2), (yzn0) null);
        this.o = i1w0Var;
        this.p = dujVar;
        this.q = oeg0Var;
        this.r = peg0Var;
        this.s = vqcVar;
        this.t = ercVar;
        this.u = xri0Var;
        sac.V(jiu0.a(this), new yr80(this, (byte) 20), null, mneVar.b, new c670(this, null, (byte) 17), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        i1w0 i1w0Var;
        fwa0 fwa0Var = (fwa0) obj;
        fwa0Var.getClass();
        super.x(fwa0Var);
        if (fwa0Var.equals(cwa0.f5072a)) {
            E();
            return;
        }
        boolean zEquals = fwa0Var.equals(dwa0.f6788a);
        rwa0 rwa0Var = rwa0.f31210a;
        if (zEquals) {
            G(rwa0Var);
            return;
        }
        if (!fwa0Var.equals(ewa0.f8513a)) {
            t9f.b();
            return;
        }
        ((h840) this.u.f41372a.f27863a).getClass();
        this.t.a(false);
        FragmentScreen fragmentScreenQ = this.r.q(new jr1(new cvc0(d7v.c)));
        G(rwa0Var);
        chg0 chg0Var = (chg0) this.q.f25121a.get(ehg0.f7808a);
        if (chg0Var == null || (i1w0Var = chg0Var.f4359a) == null) {
            i1w0Var = p1w0.h;
        }
        i1w0 i1w0Var2 = p1w0.h;
        i1w0 i1w0Var3 = this.o;
        if (i1w0Var != i1w0Var2) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var3);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new d1w0(fragmentScreenQ)), i1w0Var3, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var3.a((oe50) pawVar.next());
                }
            }
        } else {
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var3);
            if (fragmentScreenQ instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenQ)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenQ)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var3, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var3.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
