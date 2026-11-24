package a;

import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class y560 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final mne o;
    public final bmu p;
    public final duj q;
    public final i1w0 r;
    public final ilp0 s;
    public final ntu t;
    public final i7u0 u;
    public final q7u0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y560(mne mneVar, bmu bmuVar, duj dujVar, j1q0 j1q0Var, i1w0 i1w0Var, ilp0 ilp0Var, ntu ntuVar, i7u0 i7u0Var, q7u0 q7u0Var) {
        super(null, new yd10(j1q0Var, (byte) 2), new mb50((byte) 24), cvm0.p(mneVar.c, mneVar.f22085a), null);
        bmuVar.getClass();
        j1q0Var.getClass();
        this.o = mneVar;
        this.p = bmuVar;
        this.q = dujVar;
        this.r = i1w0Var;
        this.s = ilp0Var;
        this.t = ntuVar;
        this.u = i7u0Var;
        this.v = q7u0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        i560 i560Var = (i560) obj;
        i560Var.getClass();
        byte b = 0;
        if (i560Var.equals(a560.f255a)) {
            sac.V(jiu0.a(this), new x560(this, b), null, this.o.b, new w620((Object) this, (yje) null, (byte) 25), 10);
            return;
        }
        boolean z = i560Var instanceof c560;
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.r;
        if (z) {
            boolean z2 = ((c560) i560Var).f3756a;
            i7u0 i7u0Var = this.u;
            q7u0 q7u0Var = this.v;
            if (z2) {
                b1j.v("system", q7u0Var.f28268a, 12377L);
                i8i.D("action", "system", i7u0Var.f14311a, "verification_back_click");
            } else {
                b1j.v("arrow", q7u0Var.f28268a, 12377L);
                i8i.D("action", "arrow", i7u0Var.f14311a, "verification_back_click");
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (i560Var.equals(b560.f1987a)) {
                E();
                return;
            }
            if (i560Var.equals(f560.f8945a)) {
                String strA = this.t.a();
                bmu bmuVar = this.p;
                bmuVar.getClass();
                strA.getClass();
                k560 k560Var = bmuVar.f2854a;
                String strConcat = strA.concat("/nomapay/office/identification?skip-lang-redirect=1&set-base-url=v3-api");
                Pair pair = new Pair("X-Auth", k560Var.f17704a.a());
                Pair pair2 = new Pair("mf-render-mode", "html");
                Pair pair3 = new Pair("X-Language", k560Var.c.a());
                k560Var.b.getClass();
                Map mapF = xp20.f(pair, pair2, pair3, new Pair("X-Mobile-Project-Id", String.valueOf(1357)));
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, p560.a((p560) value, false, strConcat, mapF, 18)));
                return;
            }
            if (i560Var.equals(e560.f7217a)) {
                G(n560.f22928a);
                return;
            }
            if (i560Var.equals(g560.f10703a)) {
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (!i560Var.equals(d560.f5490a)) {
                    if (i560Var instanceof h560) {
                        G(new l560(((h560) i560Var).f12465a));
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
            }
        }
    }
}
