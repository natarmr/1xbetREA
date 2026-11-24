package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class lpb0 extends i3t0 {
    public static final /* synthetic */ int G = 0;
    public final b8u A;
    public final z7u B;
    public final duj C;
    public final i1w0 D;
    public c4m0 E;
    public bby F;
    public final String o;
    public final long p;
    public final ywu q;
    public final ctf0 r;
    public final mne s;
    public final nrt t;
    public final m1e u;
    public final pru v;
    public final g320 w;
    public final k7u x;
    public final pmi0 y;
    public final x1u z;

    /* JADX WARN: Illegal instructions before constructor call */
    public lpb0(String str, long j, vzg0 vzg0Var, ywu ywuVar, ctf0 ctf0Var, ocl oclVar, mne mneVar, nrt nrtVar, m1e m1eVar, ryu ryuVar, pru pruVar, g320 g320Var, k7u k7uVar, pmi0 pmi0Var, x1u x1uVar, ntu ntuVar, yiu yiuVar, b8u b8uVar, luu luuVar, z7u z7uVar, duj dujVar, i1w0 i1w0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        k7uVar.getClass();
        byte b = 0;
        super(vzg0Var, new bg0(luuVar, yiuVar, pruVar, ntuVar, ryuVar, str, (byte) 14), cvm0.p(mneVar.c, mneVar.f22085a), new gpb0(ctf0Var, oclVar, b));
        this.o = str;
        this.p = j;
        this.q = ywuVar;
        this.r = ctf0Var;
        this.s = mneVar;
        this.t = nrtVar;
        this.u = m1eVar;
        this.v = pruVar;
        this.w = g320Var;
        this.x = k7uVar;
        this.y = pmi0Var;
        this.z = x1uVar;
        this.A = b8uVar;
        this.B = z7uVar;
        this.C = dujVar;
        this.D = i1w0Var;
        sac.V(jiu0.a(this), new hpb0(this, b), null, mneVar.f22085a, new kpb0(this, null, b), 10);
    }

    public final void M() {
        v3c.N(this.F);
        this.F = sac.Z(jiu0.a(this), ibc.w0(8L, bfn.SECONDS), this.s.b, new hpb0(this, (byte) 2), new z8b0(this, null, (byte) 1));
    }

    public final void N() {
        v3c.N(this.E);
        yje yjeVar = null;
        byte b = 1;
        this.E = sac.T(new fnq(i120.W(new dnq(this.u.b(), new jgb0(this, yjeVar, b), (byte) 1)), new ipb0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.s.f22085a), jpb0.h);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        fob0 fob0Var = (fob0) obj;
        fob0Var.getClass();
        super.x(fob0Var);
        byte b = 0;
        if (!fob0Var.equals(znb0.f44669a)) {
            boolean zEquals = fob0Var.equals(aob0.f1193a);
            yje yjeVar = null;
            mne mneVar = this.s;
            if (zEquals) {
                sac.V(jiu0.a(this), new hpb0(this, b), null, mneVar.f22085a, new kpb0(this, yjeVar, b), 10);
                N();
                return;
            }
            if (fob0Var.equals(eob0.f8131a)) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, zob0.a((zob0) value, false, false, null, null, null, null, null, null, 32511)));
                return;
            }
            if (fob0Var.equals(bob0.f2927a)) {
                v3c.N(this.E);
                return;
            }
            if (fob0Var.equals(cob0.f4692a)) {
                sac.V(jiu0.a(this), new hpb0(this, (byte) 1), null, mneVar.b, new ipb0(this, yjeVar, b), 10);
                return;
            } else if (fob0Var.equals(dob0.f6407a)) {
                N();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0Var = this.D;
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
