package a;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hkr extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final yoi0 o;
    public final qdi0 p;
    public final wgu q;
    public final ctf0 r;
    public final i1w0 s;
    public final duj t;
    public final mne u;
    public bby v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkr(vzg0 vzg0Var, yoi0 yoi0Var, j8u j8uVar, qdi0 qdi0Var, wgu wguVar, ctf0 ctf0Var, i1w0 i1w0Var, duj dujVar, mne mneVar) {
        Object value;
        super(vzg0Var, new dcr((byte) 3), new bcn(ctf0Var, (byte) 15), cvm0.p(mneVar.c, mneVar.f22085a));
        yoi0Var.getClass();
        j8uVar.getClass();
        qdi0Var.getClass();
        wguVar.getClass();
        ctf0Var.getClass();
        this.o = yoi0Var;
        this.p = qdi0Var;
        this.q = wguVar;
        this.r = ctf0Var;
        this.s = i1w0Var;
        this.t = dujVar;
        this.u = mneVar;
        List list = j8uVar.f16104a.b.b;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, ekr.a((ekr) value, list, false, 2)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        sjr sjrVar = (sjr) obj;
        sjrVar.getClass();
        super.x(sjrVar);
        boolean z = sjrVar instanceof qjr;
        byte b = 0;
        yoi0 yoi0Var = this.o;
        if (z) {
            qjr qjrVar = (qjr) sjrVar;
            int i = qjrVar.f28853a;
            djr djrVar = qjrVar.b;
            List<ikr> list = ((ekr) D()).f7966a;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (ikr ikrVar : list) {
                int i2 = ikrVar.f14942a;
                if (i2 == i) {
                    ikrVar = new ikr(i2, ikrVar.b, djrVar);
                }
                arrayList.add(ikrVar);
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, ekr.a((ekr) value, arrayList, false, 2)));
            yoi0Var.a(arrayList);
            return;
        }
        if (sjrVar.equals(pjr.f27103a)) {
            bby bbyVar = this.v;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.v = sac.V(jiu0.a(this), new g7p((Object) this, (byte) 14), new yip(this, (byte) 20), this.u.b, new gkr(this, null, b), 8);
                return;
            }
            return;
        }
        if (sjrVar.equals(rjr.f30609a)) {
            yoi0Var.a(iun.f15405a);
            G(akr.f1035a);
            return;
        }
        if (!sjrVar.equals(ojr.f25373a)) {
            if (sjrVar.equals(njr.f23649a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        bby bbyVar2 = this.v;
        if (bbyVar2 != null && bbyVar2.isActive()) {
            return;
        }
        yoi0Var.a(iun.f15405a);
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
