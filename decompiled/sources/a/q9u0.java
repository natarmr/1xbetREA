package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.verification.base.impl.navigation.BaseVerificationScreens$BaseVerificationFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class q9u0 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final i1w0 o;
    public final u8u p;
    public final bbw0 q;
    public final ilp0 r;
    public final mne s;
    public final i7u0 t;
    public final q7u0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9u0(vzg0 vzg0Var, int i, i1w0 i1w0Var, u8u u8uVar, bbw0 bbw0Var, ilp0 ilp0Var, mne mneVar, g2v g2vVar, ctf0 ctf0Var, i7u0 i7u0Var, q7u0 q7u0Var) {
        super(null, new y02(i, (byte) 10), new cls0(ctf0Var, g2vVar, (byte) 6), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = i1w0Var;
        this.p = u8uVar;
        this.q = bbw0Var;
        this.r = ilp0Var;
        this.s = mneVar;
        this.t = i7u0Var;
        this.u = q7u0Var;
        mbu0.b.getClass();
        mbu0 mbu0VarA = svs0.a(i);
        if (mbu0VarA != mbu0.UNKNOWN) {
            i1w0Var.d(new p9u0(this, mbu0VarA, (byte) 0));
        }
        sac.V(jiu0.a(this), new npt0(this, (byte) 7), null, mneVar.f22085a, new k6s0(this, null, (byte) 17), 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        l8u0 l8u0Var = (l8u0) obj;
        l8u0Var.getClass();
        boolean z = l8u0Var instanceof h8u0;
        i1w0 i1w0Var = this.o;
        q7u0 q7u0Var = this.u;
        i7u0 i7u0Var = this.t;
        if (z) {
            if (((h8u0) l8u0Var).f12647a) {
                b1j.v("system", q7u0Var.f28268a, 12377L);
                i8i.D("action", "system", i7u0Var.f14311a, "verification_back_click");
            } else {
                b1j.v("arrow", q7u0Var.f28268a, 12377L);
                i8i.D("action", "arrow", i7u0Var.f14311a, "verification_back_click");
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
        } else {
            Object obj2 = null;
            Object[] objArr = 0;
            if (!(l8u0Var instanceof j8u0)) {
                if (!l8u0Var.equals(k8u0.f17889a)) {
                    if (l8u0Var.equals(i8u0.f14359a)) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                bvc bvcVarA = jiu0.a(this);
                rwj rwjVar = this.s.f22085a;
                sac.V(bvcVarA, new npt0(this, (byte) 7), null, rwjVar, new k6s0(this, objArr == true ? 1 : 0, (byte) 17), 10);
                return;
            }
            int i = ((j8u0) l8u0Var).f16105a;
            i7u0Var.f14311a.c("verification_method_click");
            q7u0Var.f28268a.a(xun.f41520a, 12375L);
            mbu0.b.getClass();
            mbu0 mbu0VarA = svs0.a(i);
            for (Object obj3 : ((n9u0) D()).f23158a) {
                if (((c8u0) obj3).f3933a == mbu0VarA) {
                    obj2 = obj3;
                    break;
                }
            }
            c8u0 c8u0Var = (c8u0) obj2;
            if (c8u0Var == null) {
                return;
            }
            String str = c8u0Var.f;
            int iOrdinal = c8u0Var.f3933a.ordinal();
            if (iOrdinal != 0 && iOrdinal != 2) {
                i1w0Var.d(new p9u0(this, mbu0VarA, (byte) 1));
                return;
            }
            if (str.length() > 0) {
                G(new m9u0(str));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            BaseVerificationScreens$BaseVerificationFragmentScreen baseVerificationScreens$BaseVerificationFragmentScreenA = ((clc) this.q.b).d().a();
            if (baseVerificationScreens$BaseVerificationFragmentScreenA instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) baseVerificationScreens$BaseVerificationFragmentScreenA)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(baseVerificationScreens$BaseVerificationFragmentScreenA)));
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
