package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class r0a0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final xfu o;
    public final iwt p;
    public final iwt q;
    public final u1u r;
    public final u1u s;
    public final qyu t;
    public final qyu u;
    public final String v;
    public final duj w;
    public final i1w0 x;
    public final mne y;
    public bby z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0a0(xfu xfuVar, iwt iwtVar, iwt iwtVar2, u1u u1uVar, u1u u1uVar2, qyu qyuVar, qyu qyuVar2, ocl oclVar, String str, duj dujVar, i1w0 i1w0Var, ctf0 ctf0Var, m1e m1eVar, mne mneVar) {
        super(null, new wm90((byte) 17), new cz(ctf0Var, oclVar, (byte) 24), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = xfuVar;
        this.p = iwtVar;
        this.q = iwtVar2;
        this.r = u1uVar;
        this.s = u1uVar2;
        this.t = qyuVar;
        this.u = qyuVar2;
        this.v = str;
        this.w = dujVar;
        this.x = i1w0Var;
        this.y = mneVar;
        yje yjeVar = null;
        sac.T(new fnq(m1eVar.a(), new q0a0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new s980(this, yjeVar, (byte) 14));
        N();
    }

    public final void M(int i) {
        Object next;
        this.s.f34917a.c.b = i;
        ArrayList arrayList = (ArrayList) this.t.f29552a.c.d;
        ArrayList arrayList2 = (ArrayList) this.u.f29552a.c.e;
        Iterator it = ((ArrayList) this.q.f15508a.c.c).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hva) next).f13717a != i);
        hva hvaVar = (hva) next;
        if (hvaVar == null) {
            hvaVar = hva.d;
        }
        hva hvaVar2 = hvaVar;
        ArrayList arrayList3 = (ArrayList) this.p.f15508a.c.c;
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            hvaVar2.getClass();
            int i2 = i;
            if (p7m0Var.m(value, new k0a0(false, false, false, i2, arrayList3, hvaVar2, arrayList, arrayList2))) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void N() {
        bby bbyVar = this.z;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.z = sac.V(jiu0.a(this), new yi90(1, this, r0a0.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 12), null, this.y.b, new q0a0(this, null, (byte) 0), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        d0a0 d0a0Var = (d0a0) obj;
        d0a0Var.getClass();
        super.x(d0a0Var);
        if (!d0a0Var.equals(a0a0.f17a)) {
            if (d0a0Var.equals(b0a0.f1758a)) {
                N();
                return;
            } else if (d0a0Var instanceof c0a0) {
                M(((c0a0) d0a0Var).f3515a);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0Var = this.x;
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
