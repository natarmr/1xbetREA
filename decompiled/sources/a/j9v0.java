package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class j9v0 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final rou o;
    public final ytt p;
    public final m4v q;
    public final gsb r;
    public final i1w0 s;
    public final duj t;
    public final mne u;

    public j9v0(rou rouVar, ytt yttVar, m4v m4vVar, gsb gsbVar, i1w0 i1w0Var, duj dujVar, mne mneVar, ctf0 ctf0Var) {
        m4vVar.getClass();
        ctf0Var.getClass();
        o1u0 o1u0Var = new o1u0((byte) 29);
        uwu0 uwu0Var = new uwu0(ctf0Var, (byte) 2);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, o1u0Var, uwu0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = rouVar;
        this.p = yttVar;
        this.q = m4vVar;
        this.r = gsbVar;
        this.s = i1w0Var;
        this.t = dujVar;
        this.u = mneVar;
        sac.V(jiu0.a(this), new g9v0(this, (byte) 0), new h9v0(this, (byte) 0), rwjVar, new h18(this, null), 8);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        o8v0 o8v0Var = (o8v0) obj;
        o8v0Var.getClass();
        if (!o8v0Var.equals(m8v0.f21388a)) {
            if (!(o8v0Var instanceof n8v0)) {
                if (o8v0Var.equals(l8v0.f19622a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            int i = ((n8v0) o8v0Var).f23109a;
            if (((e9v0) D()).b) {
                G(b9v0.f2229a);
                return;
            }
            if (i == ((e9v0) D()).d) {
                return;
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, e9v0.a((e9v0) value, true, false, null, 0, 14)));
            sac.V(jiu0.a(this), new g9v0(this, (byte) 1), new h9v0(this, (byte) 1), this.u.f22085a, new bqs0(this, i, null, (byte) 1), 8);
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
