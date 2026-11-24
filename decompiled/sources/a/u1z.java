package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class u1z extends i3t0 {
    public static final List C = q3d.j(n3q.f22862a, n3q.c, n3q.b);
    public bby A;
    public bby B;
    public final String o;
    public final long p;
    public final ctf0 q;
    public final mne r;
    public final i1w0 s;
    public final m1e t;
    public final jwu u;
    public final fhj v;
    public final bzu w;
    public final xfu x;
    public final yfm0 y;
    public c4m0 z;

    public u1z(final String str, final long j, final int i, final n3q n3qVar, final ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, ocl oclVar, m1e m1eVar, jwu jwuVar, f7u f7uVar, final weu weuVar, final qzt qztVar, final fhj fhjVar, uyu uyuVar, final wyu wyuVar, bzu bzuVar, xfu xfuVar, vjp vjpVar, yfm0 yfm0Var, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        Function0 function0 = new Function0() { // from class: a.o1z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                weu weuVar2 = weuVar;
                String str2 = str;
                return new d1z(true, false, i, aem0.x(weuVar2.a(str2), qztVar.a(), ctf0Var), fhjVar.s(str2, j, wyuVar.a(), 0L), n3qVar, iun.f15405a, null, true);
            }
        };
        p1z p1zVar = new p1z(vjpVar, r9uVar, ctf0Var, oclVar, j);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, function0, p1zVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = ctf0Var;
        this.r = mneVar;
        this.s = i1w0Var;
        this.t = m1eVar;
        this.u = jwuVar;
        this.v = fhjVar;
        this.w = bzuVar;
        this.x = xfuVar;
        this.y = yfm0Var;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new kaw(this, yjeVar, (byte) 16), (byte) 4), d5c.S(jiu0.a(this), rwjVar), t1z.h);
        sac.T(new fnq(f7uVar.n(str), new khx((Object) this, (Object) qztVar.a(), yjeVar, (byte) 3), (byte) 4), jiu0.a(this), s1z.h);
    }

    public final void M(boolean z) {
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            byte b = 24;
            this.B = sac.V(jiu0.a(this), new adw(this, b), null, this.r.b, new u88(z, this, (yje) null, b), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        d1z d1zVar;
        Object value2;
        Object value3;
        l0z l0zVar = (l0z) obj;
        l0zVar.getClass();
        boolean z = l0zVar instanceof f0z;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            n3q n3qVar = ((f0z) l0zVar).f8739a;
            hxs0 hxs0VarC = this.x.c(n3qVar);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, d1z.a((d1z) value3, false, false, 0, null, null, n3qVar, null, hxs0VarC, false, 344)));
            return;
        }
        if (l0zVar instanceof j0z) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, d1z.a((d1z) value2, false, false, ((j0z) l0zVar).f15704a, null, null, null, null, null, false, 507)));
            return;
        }
        boolean zEquals = l0zVar.equals(e0z.f7014a);
        i1w0 i1w0Var = this.s;
        if (zEquals) {
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
        } else {
            yje yjeVar = null;
            if (l0zVar.equals(c0z.f3547a)) {
                c4m0 c4m0Var = this.z;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.z = sac.T(new fnq(this.t.b(), new cin(this, yjeVar, (byte) 25), (byte) 4), d5c.S(jiu0.a(this), this.r.f22085a), q1z.h);
                    return;
                }
                return;
            }
            if (l0zVar.equals(d0z.f5287a)) {
                c4m0 c4m0Var2 = this.z;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                bby bbyVar = this.A;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                bby bbyVar2 = this.B;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                    return;
                }
                return;
            }
            if (l0zVar.equals(k0z.f17492a)) {
                G(new c1z(((d1z) D()).f, ((d1z) D()).g));
                return;
            }
            if (l0zVar.equals(b0z.f1782a)) {
                E();
                return;
            }
            if (!(l0zVar instanceof g0z)) {
                if (!l0zVar.equals(i0z.f13970a)) {
                    if (l0zVar.equals(h0z.f12255a)) {
                        M(true);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    d1zVar = (d1z) value;
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value, d1z.a(d1zVar, false, false, 0, null, null, null, null, null, !d1zVar.i, 255)));
                return;
            }
            FragmentScreen fragmentScreenA = ((zfm0) this.y).a(this.p, ((g0z) l0zVar).f10483a);
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            if (fragmentScreenA instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
