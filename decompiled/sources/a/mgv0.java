package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class mgv0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final mne o;
    public final owp0 p;
    public final lbu q;
    public final i1w0 r;
    public c4m0 s;
    public final bby t;
    public final p7m0 u;
    public final p7m0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgv0(mne mneVar, owp0 owp0Var, lbu lbuVar, ctf0 ctf0Var, ocl oclVar, i1w0 i1w0Var) {
        super(null, new avs0(0, dgv0.e, cgv0.class, "default", "default()Lorg/xplatform/wild_free_bet/impl/presentation/select_game/models/WildFreeBetSelectGameState;", 0, (byte) 11), new gpb0(ctf0Var, oclVar, (byte) 21), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        i1w0Var.getClass();
        this.o = mneVar;
        this.p = owp0Var;
        this.q = lbuVar;
        this.r = i1w0Var;
        this.u = q7m0.a(iun.f15405a);
        this.v = q7m0.a("");
        bby bbyVar = this.t;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.t = sac.V(jiu0.a(this), hgv0.f13032a, null, mneVar.b, new k6s0(this, yjeVar, (byte) 26), 10);
    }

    public final void M() {
        Object value;
        if (((dgv0) D()).c) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, dgv0.a((dgv0) value, false, null, false, null, 11)));
            p7m0 p7m0Var2 = this.v;
            p7m0Var2.getClass();
            p7m0Var2.o(null, "");
            return;
        }
        i1w0 i1w0Var = this.r;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        yfv0 yfv0Var = (yfv0) obj;
        yfv0Var.getClass();
        super.x(yfv0Var);
        byte b = 0;
        byte b2 = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (!(yfv0Var instanceof qfv0)) {
            if (yfv0Var instanceof sfv0) {
                M();
                return;
            }
            if (yfv0Var instanceof tfv0) {
                c4m0 c4m0Var = this.s;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                    return;
                }
                return;
            }
            boolean z = yfv0Var instanceof ufv0;
            p7m0 p7m0Var = this.v;
            if (z) {
                c4m0 c4m0Var2 = this.s;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                this.s = sac.T(new dnq(new fnq(new rf0(new fnq(new fnq(new p6d(this.u, p7m0Var, kgv0.h, (byte) 1), new wup0(this, objArr4 == true ? 1 : 0, (byte) 20), (byte) 4), new lgv0(this, objArr3 == true ? 1 : 0, b), (byte) 4), (byte) 13), new lgv0(this, objArr2 == true ? 1 : 0, b2), (byte) 4), new pyn0(3, objArr == true ? 1 : 0, (byte) 8), (byte) 1), d5c.S(jiu0.a(this), this.o.b), foe.h);
                return;
            }
            if (yfv0Var instanceof rfv0) {
                E();
                return;
            }
            if (yfv0Var instanceof wfv0) {
                p7m0Var.getClass();
                p7m0Var.o(null, "");
                p7m0 p7m0Var2 = this.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var2.m(value, dgv0.a((dgv0) value, false, null, true, null, 11)));
                return;
            }
            if (yfv0Var instanceof vfv0) {
                M();
                return;
            } else {
                if (!(yfv0Var instanceof xfv0)) {
                    t9f.b();
                    return;
                }
                String str = ((xfv0) yfv0Var).f40813a;
                p7m0Var.getClass();
                p7m0Var.o(null, str);
                return;
            }
        }
        m9n m9nVar = ((qfv0) yfv0Var).f28657a;
        for (Object obj3 : ((dgv0) D()).d) {
            if (m9nVar.getId() == ((pbv) obj3).f26728a) {
                obj2 = obj3;
                break;
            }
        }
        pbv pbvVar = (pbv) obj2;
        if (pbvVar != null && pbvVar.p) {
            return;
        }
        ((pfv0) ((ikt0) this.p.b).f14945a).f26923a.g(Long.valueOf(m9nVar.getId()));
        i1w0 i1w0Var = this.r;
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
