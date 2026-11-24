package a;

import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e09 extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final oeg0 o;
    public final mne p;
    public final xoc q;
    public final gut r;
    public final gut s;

    /* JADX WARN: Illegal instructions before constructor call */
    public e09(vzg0 vzg0Var, oeg0 oeg0Var, ctf0 ctf0Var, mne mneVar, xoc xocVar, gut gutVar, gut gutVar2) {
        oeg0Var.getClass();
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        super(new ej8((byte) 7), g090VarP, new ep4(ctf0Var, (byte) 9), (yzn0) null);
        this.o = oeg0Var;
        this.p = mneVar;
        this.q = xocVar;
        this.r = gutVar;
        this.s = gutVar2;
        sac.V(jiu0.a(this), null, null, mneVar.b, new oa((Object) this, (yje) null, (byte) 29), 11);
    }

    public final void M() {
        Object value;
        xun xunVar;
        sac.V(jiu0.a(this), null, null, this.p.b, new qv3(this, null, (byte) 20), 11);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            oyg0 oyg0Var = this.f;
            oyg0Var.getClass();
            xunVar = xun.f41520a;
            q7x.F(oyg0Var, xunVar, "SELECTED_LANGUAGES_KEY");
        } while (!p7m0Var.m(value, zz8.a((zz8) value, null, xunVar, 1)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        qz8 qz8Var = (qz8) obj;
        qz8Var.getClass();
        super.x(qz8Var);
        if (qz8Var.equals(kz8.f19142a)) {
            E();
            return;
        }
        boolean zEquals = qz8Var.equals(nz8.f24360a);
        byte b = 0;
        p0w0 p0w0Var = p0w0.f26173a;
        oeg0 oeg0Var = this.o;
        if (zEquals) {
            i1w0 i1w0VarC = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0VarC, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!qz8Var.equals(mz8.f22640a)) {
                if (qz8Var.equals(pz8.f27832a)) {
                    M();
                    return;
                }
                if (qz8Var.equals(lz8.f20893a)) {
                    M();
                    return;
                }
                if (!(qz8Var instanceof oz8)) {
                    t9f.b();
                    return;
                }
                int i = ((oz8) qz8Var).f26093a;
                Set set = ((zz8) D()).b;
                LinkedHashSet linkedHashSetE = set.contains(Integer.valueOf(i)) ? eui0.e(set, Integer.valueOf(i)) : eui0.h(set, Integer.valueOf(i));
                sac.V(jiu0.a(this), null, null, this.p.b, new d09(this, linkedHashSetE, (yje) null, b), 11);
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0 oyg0Var = this.f;
                    oyg0Var.getClass();
                    q7x.F(oyg0Var, linkedHashSetE, "SELECTED_LANGUAGES_KEY");
                } while (!p7m0Var.m(value, zz8.a((zz8) value, null, linkedHashSetE, 1)));
                return;
            }
            i1w0 i1w0VarC2 = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0VarC2, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
