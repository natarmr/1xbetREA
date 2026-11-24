package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xplatform.feed.navigation.FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;
import org.xplatform.search.impl.navigation.SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class q4p0 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public final rrc A;
    public bby B;
    public bby C;
    public final ctf0 o;
    public final i1w0 p;
    public final ehf0 q;
    public final phf0 r;
    public final n4u s;
    public final ivn t;
    public final m1e u;
    public final ifp v;
    public final eke0 w;
    public final yzn0 x;
    public final mne y;
    public final vqc z;

    public q4p0(vzg0 vzg0Var, ctf0 ctf0Var, i1w0 i1w0Var, ehf0 ehf0Var, phf0 phf0Var, n4u n4uVar, ivn ivnVar, m1e m1eVar, ifp ifpVar, eke0 eke0Var, g2v g2vVar, yzn0 yzn0Var, mne mneVar, vqc vqcVar, rrc rrcVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        c3p c3pVar = new c3p(g2vVar, (byte) 1);
        h0j0 h0j0Var = new h0j0(ctf0Var, (byte) 15);
        rwj rwjVar = mneVar.f22085a;
        super(null, c3pVar, h0j0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = ctf0Var;
        this.p = i1w0Var;
        this.q = ehf0Var;
        this.r = phf0Var;
        this.s = n4uVar;
        this.t = ivnVar;
        this.u = m1eVar;
        this.v = ifpVar;
        this.w = eke0Var;
        this.x = yzn0Var;
        this.y = mneVar;
        this.z = vqcVar;
        this.A = rrcVar;
    }

    public final void M() {
        e3c.n(this.C);
        this.C = sac.V(jiu0.a(this), new m4p0(this, (byte) 1), null, this.y.b, new z8b0(this, null, (byte) 28), 10);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0123 A[ORIG_RETURN, RETURN] */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object obj2;
        b4p0 b4p0Var = (b4p0) obj;
        b4p0Var.getClass();
        super.x(b4p0Var);
        boolean z = b4p0Var instanceof a4p0;
        byte b = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        mne mneVar = this.y;
        if (!z) {
            if (!(b4p0Var instanceof r3p0)) {
                t9f.b();
                return;
            }
            r3p0 r3p0Var = (r3p0) b4p0Var;
            if (r3p0Var.equals(o3p0.f24597a)) {
                E();
                return;
            }
            if (r3p0Var.equals(p3p0.f26310a)) {
                e3c.n(this.B);
                this.B = sac.V(jiu0.a(this), new meo0((byte) 16), null, mneVar.b, new p4p0(this, z2 ? 1 : 0, b), 10);
                return;
            } else if (!r3p0Var.equals(q3p0.f28063a)) {
                t9f.b();
                return;
            } else {
                e3c.n(this.B);
                e3c.n(this.C);
                return;
            }
        }
        a4p0 a4p0Var = (a4p0) b4p0Var;
        boolean zEquals = a4p0Var.equals(t3p0.f33280a);
        i1w0 i1w0Var = this.p;
        byte b2 = 0;
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
            if (a4p0Var.equals(y3p0.f41964a)) {
                sac.V(jiu0.a(this), new g0p0(1, this, q4p0.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, mneVar.b, new p4p0(this, z4 ? 1 : 0, b2), 10);
                return;
            }
            if (a4p0Var instanceof u3p0) {
                int i = ((u3p0) a4p0Var).f35009a;
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    G(j4p0.f15896a);
                    return;
                }
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                bhh0 bhh0Var = bhh0.c;
                this.w.getClass();
                k0w0VarI.h(new SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1(bhh0Var));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (a4p0Var instanceof v3p0) {
                    xcp xcpVar = ((v3p0) a4p0Var).f36741a;
                    sac.V(jiu0.a(this), new g0p0(1, this, q4p0.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, mneVar.b, new lcl0(this, xcpVar, z3 ? 1 : 0, (byte) 21), 10);
                    return;
                }
                if (a4p0Var instanceof z3p0) {
                    xcp xcpVar2 = ((z3p0) a4p0Var).f43733a;
                    tnp0 tnp0Var = xcpVar2.b;
                    rnp0 rnp0Var = tnp0Var instanceof rnp0 ? (rnp0) tnp0Var : null;
                    byte b3 = 19;
                    if (rnp0Var != null) {
                        Integer num = rnp0Var.d;
                        if (num != null && num.intValue() == 0) {
                            i1w0Var.d(new n4p0(this, rnp0Var, xcpVar2));
                        } else {
                            if (num != null && num.intValue() == 1) {
                                i1w0Var.d(new n4p0(this, xcpVar2, rnp0Var));
                            } else {
                                i1w0Var.d(new itn0(this, xcpVar2, b3));
                                obj2 = Unit.f46060a;
                            }
                            if (obj2 != null) {
                                return;
                            }
                        }
                        obj2 = i1w0Var;
                        if (obj2 != null) {
                            return;
                        }
                    }
                    i1w0Var.d(new itn0(this, xcpVar2, b3));
                    return;
                }
                if (a4p0Var.equals(x3p0.f40231a)) {
                    M();
                    return;
                }
                if (a4p0Var.equals(w3p0.f38513a)) {
                    p7m0 p7m0Var = this.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        this.f.getClass();
                    } while (!p7m0Var.m(value, h4p0.a((h4p0) value, true, false, null, 29)));
                    M();
                    return;
                }
                if (!a4p0Var.equals(s3p0.f31570a)) {
                    t9f.b();
                    return;
                }
                k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                m7r0 m7r0Var = m7r0.f21334a;
                rrc rrcVar = this.A;
                rrcVar.getClass();
                k0w0VarI2.h(new FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1(rrcVar, m7r0Var));
                ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO2;
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
