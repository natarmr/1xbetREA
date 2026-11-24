package a;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class i3p extends i3t0 {
    public static final /* synthetic */ int F = 0;
    public final m1e A;
    public final luu B;
    public bby C;
    public bby D;
    public c4m0 E;
    public final mne o;
    public final i1w0 p;
    public final hzg q;
    public final z8u r;
    public final yzn0 s;
    public final j3c t;
    public final duj u;
    public final ctf0 v;
    public final ifp w;
    public final msu x;
    public final khf0 y;
    public final ivn z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3p(vzg0 vzg0Var, mne mneVar, i1w0 i1w0Var, hzg hzgVar, z8u z8uVar, yzn0 yzn0Var, j3c j3cVar, g2v g2vVar, duj dujVar, ctf0 ctf0Var, pru pruVar, vqc vqcVar, ifp ifpVar, msu msuVar, khf0 khf0Var, vqc vqcVar2, ivn ivnVar, m1e m1eVar, luu luuVar) {
        super(null, new c3p(g2vVar, (byte) 0), new bcn(ctf0Var, (byte) 7), cvm0.p(mneVar.c, mneVar.f22085a), null);
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = mneVar;
        this.p = i1w0Var;
        this.q = hzgVar;
        this.r = z8uVar;
        this.s = yzn0Var;
        this.t = j3cVar;
        this.u = dujVar;
        this.v = ctf0Var;
        this.w = ifpVar;
        this.x = msuVar;
        this.y = khf0Var;
        this.z = ivnVar;
        this.A = m1eVar;
        this.B = luuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(zje zjeVar) {
        d3p d3pVar;
        Object value;
        if (zjeVar instanceof d3p) {
            d3pVar = (d3p) zjeVar;
            int i = d3pVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                d3pVar.k = i - Integer.MIN_VALUE;
            } else {
                d3pVar = new d3p(this, zjeVar);
            }
        } else {
            d3pVar = new d3p(this, zjeVar);
        }
        Object objC = d3pVar.i;
        wne wneVar = wne.f39444a;
        int i2 = d3pVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            d3pVar.k = 1;
            objC = this.t.c(d3pVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        wcb wcbVar = (wcb) objC;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, w2p.a((w2p) value, false, false, false, null, wcbVar, 63)));
        return Unit.f46060a;
    }

    public final void N() {
        v3c.N(this.D);
        bvc bvcVarA = jiu0.a(this);
        Class<i3p> cls = i3p.class;
        hin hinVar = new hin(1, this, cls, "handleLoadingError", "handleLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 28);
        mne mneVar = this.o;
        yje yjeVar = null;
        this.D = sac.V(bvcVarA, hinVar, null, mneVar.f22085a, new g3p(this, yjeVar, (byte) 2), 10);
        v3c.N(this.C);
        this.C = sac.V(jiu0.a(this), new hin(1, this, cls, "handleLoadingError", "handleLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, mneVar.f22085a, new e3p(this, yjeVar, (byte) 0), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        q2p q2pVar = (q2p) obj;
        q2pVar.getClass();
        super.x(q2pVar);
        boolean z = q2pVar instanceof k2p;
        byte b = 0;
        yje yjeVar = null;
        mne mneVar = this.o;
        if (z) {
            k2p k2pVar = (k2p) q2pVar;
            if (k2pVar.equals(i2p.f14061a)) {
                c4m0 c4m0Var = this.E;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.E = slb.U(new dnq(new fnq(this.A.b(), new g3p(this, yjeVar, b), (byte) 4), new rj((Object) this, yjeVar, (byte) 22), (byte) 1), d5c.S(jiu0.a(this), mneVar.b));
                    return;
                }
                return;
            }
            if (k2pVar.equals(j2p.f15792a)) {
                v3c.N(this.C);
                v3c.N(this.D);
                v3c.N(this.E);
                return;
            } else if (k2pVar.equals(h2p.f12345a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!(q2pVar instanceof p2p)) {
            t9f.b();
            return;
        }
        p2p p2pVar = (p2p) q2pVar;
        boolean z2 = p2pVar instanceof m2p;
        i1w0 i1w0Var = this.p;
        if (z2) {
            x2p x2pVar = ((m2p) p2pVar).f21073a;
            if (!(x2pVar.e instanceof qgb)) {
                i1w0Var.d(new qzn(this, x2pVar, (byte) 28));
                return;
            }
            Iterator it = this.B.f20692a.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                lok0 lok0Var = (lok0) next;
                if (lok0Var.f20396a == ((int) x2pVar.f) && lok0Var.t.contains(1)) {
                    break;
                }
            }
            lok0 lok0Var2 = (lok0) next;
            if (lok0Var2 == null) {
                sac.V(jiu0.a(this), new mmn((byte) 27), null, mneVar.f22085a, new f3p(x2pVar, this, null), 10);
                return;
            }
            ((uzg) this.q).o(lok0Var2.f20396a, lok0Var2.b);
            return;
        }
        if (p2pVar instanceof o2p) {
            sac.V(jiu0.a(this), new hin(1, this, i3p.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, mneVar.b, new j0l((Object) this, (Object) ((o2p) p2pVar).f24541a, yjeVar, (byte) 15), 10);
            return;
        }
        if (p2pVar.equals(n2p.f22813a)) {
            N();
            return;
        }
        if (!p2pVar.equals(l2p.f19322a)) {
            t9f.b();
            return;
        }
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
